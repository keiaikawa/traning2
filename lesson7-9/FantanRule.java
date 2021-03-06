package fantan;

import trump.Card;
import trump.Hand;
import trump.Rule;
import trump.Table;

public class FantanRule implements Rule
{
	/**
	 * テーブルにおけるカードを探す
	 * @param hand 手札
	 * @param table テーブル
	 * @return 見つかったカードの組み合わせ。見つからなかった場合はnullを返す
	 */
	public Card[] findCandidate(Hand hand,Table table)
	{
		//テーブルにおけるカードの候補
		Card[] candidate = null;

		//手札にあるカードを1枚ずつチェックしてテーブルに置け得るか調べる
		int numberOfHand = hand.getNumberOfCards();
		for(int position=0;position<numberOfHand; position++)
		{
			//手札にあるカードを「見る
			Card lookingCard=hand.lookCard(position);
			int number = lookingCard.getNumber();
			int suit = lookingCard.getSuit();

			//今注目している手札の左か右にカードがあれば、カードを置ける
			int leftNumber = (number != 1) ? number- 1 :Card.CARD_NUM;
			int rightNumber = (number != Card.CARD_NUM) ? number + 1 :1;

			if((true == isThereCard(table, suit ,leftNumber))
					|| ( true == isThereCard(table,suit,rightNumber)))
			{
				//手札からカードを引いて候補とする
				candidate = new Card[1];
				candidate[0] = hand.pickCard(position);
				break;
			}
		}
		return candidate;
	}

	/**
	 * テーブルにカードが置かれているか調べる
	 *
	 * @param table テーブル
	 * @param suit  スート
	 * @param numbers 数
	 * @return カードがおかれている場合はtrue
	 */

	private boolean isThereCard(Table table,int suit,int number)
	{
		//テーブルにあるカードを調べ、カードがおかれているか調べる
		Card[][] cards = table.getCards();
		if(cards[suit-1][number-1] !=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
