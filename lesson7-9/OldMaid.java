package oldmaid;

import trump.Card;
import trump.Hand;
import trump.Joker;
import trump.Master;
import trump.Player;
import trump.Rule;
import trump.Table;

public class OldMaid
{
	public static void main(String args[])
	{
		//進行役の生成
		Master master = new Master();
	    //テーブルの生成
		Table table = new OldMaidTable();
		//ルールの生成
		Rule rule = new OldMaidRule();

		//プレイヤーの生成
		Player murata =new OldMaidPlayer("村田",master,table,rule);
		Player yamada =new OldMaidPlayer("山田",master,table,rule);
		Player saito = new OldMaidPlayer("斎藤",master,table,rule);

		//プレイヤーを登録
		master.registerPlayer(murata);
		master.registerPlayer(yamada);
		master.registerPlayer(saito);

		//トランプを生成する
		Hand trump = createTrump();

		//ゲームの準備をする
		master.prepareGame(trump);
		//ゲームを開始する
		master.startGame();
	}

	/**
	 * 53枚のトランプを生成する。
	 * @return トランプを格納したDeal
	 */

	private static Hand createTrump()
	{
		Hand trump = new Hand();

		//各スート５３枚のカードを生成する
		for(int number =1; number<= Card.CARD_NUM; number++)
		{
			trump.addCard(new Card(Card.SUIT_CLUB,number));
			trump.addCard(new Card(Card.SUIT_DIAMOND,number));
			trump.addCard(new Card(Card.SUIT_HEART,number));
			trump.addCard(new Card(Card.SUIT_SPADE,number));
		}

		//ジョーカーの作成
		trump.addCard(new Joker());

		return trump;
	}
}
