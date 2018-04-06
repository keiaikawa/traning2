/**
 * 七ならべよう手札クラス。
 * ババ抜き用手札クラスを継承する。
 * @author kei.aikawa
 *
 */
public class FantanHand extends Hand
{
	/**
	 * カードを見る
	 */
	public void lookCard()
	{
		//実際の処理
	}
	/**
	 * カードを引く。
	 * スーパークラスのメソッドをオーバーライド
	 *
	 * @return 引いたカード
	 */

	public Card pickCard()
	{
		//もともとのHandクラスで行われていたpickCardの処理をここに記述する
		Card pickedCard = (Card) hand_.remove(0);
		return pickedCard;

	}
}
