package oldmaid;

import trump.Card;
import trump.Master;
import trump.Player;
import trump.Rule;
import trump.Table;

/**
 * ババ抜きのプレイヤークラス
 * @author kei.aikawa
 *
 */

public class OldMaidPlayer extends Player {
	/**裏から見た手札を表すクラス*/
	private BackHand backHand_ = new BackHand(myHand_);

	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param master 進行役
	 * @param table テーブル
	 * @param rule ルール
	 */

	public OldMaidPlayer(String name,Master master,Table table,Rule rule)
	{
		super(name,master,table,rule);
	}

	/**
	 * カードを配る
	 * @param card 受け取ったカード
	 */

	public void receveCard(Card card)
	{
		//受け取ったカードを手札へ加える
		super.receiveCard(card);

		//ルールを使用してテーブルに出せるカードあるか探す
		Card[] candidate = rule_.findCandidate(myHand_, table_);

		//テーブルに出せるカードがある場合には場に出す
		if( candidate !=null)
		{
			System.out.print(this + " : ");
			table_.putCard(candidate);
		}
	}

	/**
	 * 順番を指名する
	 * @paramnextPlayer　次のプレイヤー
	 */

	public void play(Player nextPlayer)
	{
		//次のプレイヤーに手札を提示してもらう
		BackHand nextPlayersHand = ((OldMaidPlayer)nextPlayer).showHand();

		//相手の手札からカードを一枚引く
		int numberOfHands = nextPlayersHand.getNumberOfCards();
		Card pickedCard=
				nextPlayersHand.pickCard((int) (Math.random()*numberOfHands));

		//引いた結果表示
		System.out.println(this + ":" + nextPlayer + "さんから" + pickedCard + "を引きました");

		//引いたカードを自分の手札に加える
		myHand_.addCard(pickedCard);
		//テーブルに出せるカードの組み合わせがあるか探す
		Card[] sameCards = rule_.findCandidate(myHand_, table_);

		//同じカードの組み合わせが存在した場合
		if(sameCards !=null)
		{
			System.out.print(this + ":");
			table_.putCard(sameCards);

			//手札がゼロになったかどうか調べる
			if(myHand_.getNumberOfCards() == 0)
			{
				//進行役に上がりを宣言する
				master_.declareWin(this);
			}
		}

		//現在の手札を表示
		System.out.println(this + ":残りの手札は" + myHand_ + "です");
	}
	/**
	 * 手札に出す。
	 * 相手にカードを引いてもらうために、手札を見せる。
	 * @return 自分の手札
	 */
	public BackHand showHand()
	{
		//もしこの時点で手札が残り一枚ならば上がりとなるので宣言する
		if(myHand_.getNumberOfCards() == 1)
		{
			master_.declareWin(this);
		}

		//見せる前にシャッフルする
		myHand_.shuffle();
		//相手に手札を裏から見せるため、BackHandを返す
		return backHand_;
	}
}
