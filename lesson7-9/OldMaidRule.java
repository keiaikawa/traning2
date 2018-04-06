package oldmaid;

import trump.Card;
import trump.Hand;
import trump.Rule;
import trump.Table;
/**
 * ババ抜き用ルールクラス。
 * @author kei.aikawa
 *
 */

public class OldMaidRule implements Rule
{
	/**
	 * 手札とテーブルから、テーブルに出し売りカードの組み合わせを探す。
	 * @param hand 手札
	 * @param table テーブル
	 * @return 見つかったカードの組み合わせ。見つからなかった場合はnullを返す。
	 */
	public Card[] findCandidate(Hand hand,Table table)
	{
		int numberOfHand=hand.getNumberOfCards();
		for(int position=numberOfHand -1;position >=0;position--)
		{
			Card firstCard = hand.lookCard(position);
			for(int comparePos = position-1; comparePos>=0; comparePos--)
			{
				Card secondCard = hand.lookCard(comparePos);

				//同じ値の組み合わせが見つかったらカードを引いて戻る
				if(firstCard.getNumber()== secondCard.getNumber())
				{
					Card[] candidate =new Card[2];
					candidate[0] = hand.pickCard(position);
					candidate[1] = hand.pickCard(comparePos);
					return candidate;
				}
			}
		}

		//同じ値が見つからなかった場合nullを返す
		return null;
	}
}

