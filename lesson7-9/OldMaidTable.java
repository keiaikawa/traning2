package oldmaid;

import java.util.ArrayList;

import trump.Card;
import trump.Table;

/**
 * ババ抜きのテーブルを表すクラス。
 * @author kei.aikawa
 *
 */

public class OldMaidTable implements Table
{
	/**捨てられたカードを保持しておくためのリスト*/
	private ArrayList disposedCards_ = new ArrayList();

	/**
	 * カードを捨てる
	 * @param cards 捨てるカード
	 */

	public void putCard(Card[] cards)
	{
		for (int index = 0;index<cards.length; index++)
		{
			//捨てられたカードを表示する
			System.out.print(cards[index] + " ");

			//捨てられたカードはリストに追加して保存しておく
			disposedCards_.add(cards[index]);
		}
		System.out.println("を捨てました");
	}
	/**
	 * カードを見る
	 *
	 * @return テーブルに置かれたカードを表す配列
	 */
	public Card[][] getCards()
	{
		//ババ抜きではカードを見る必要はないため、nullを返す
		return null;
	}
}
