package trump;
/**
 * テーブルを表すインターフェイス
 * @author kei.aikawa
 *
 */

public interface Table
{
	/**
	 * カードを置く。
	 * テーブルに置かれたカードをどのように扱うかは、サブクラスで実装する。
	 * @param card カード
	 */
	public void putCard(Card[] card);

	/**
	 * カードを見る。
	 *
	 * @return
	 */
	public Card[][] getCards();
}

