/**
 * プレイヤーを継承した村田さんクラス。
 * @author kei.aikawa
 *
 */
public class Murata extends Player{
	/**
	 * コンストラクタ
	 *
	 * @param name 名前
	 */

	public Murata(String name)
	{
		//スーパークラスのコンストラクタを呼び出す
		super(name);
	}
	
	/**
	 * ジャンケンの手を出す。
	 * スーパークラスの同名メソッドをオーバーライドしている。
	 * @return
	 */
	
	public int showHand()
	{
		//必ずグーを出す
		return STONE;
	}
}

