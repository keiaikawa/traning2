package trump;
/**
 * トランプルールインタフェース
 * 現在の手札とテーブルから、出しうるカードの組み合わせを見つける。
 * @author kei.aikawa
 *
 */

public interface Rule {
	/**
	 * テーブルにおけるカードを探す。
	 * 手札とテーブルから、テーブルに出しうるカードの組み合わせを探す。
	 * @param hane 手札
	 * @param table テーブル
	 * @return 見つかったカードの組み合わせ。見つからなかったばあはnullを返す。	 */
	public Card[] findCandidate(Hand hand,Table table);

}
