/**
 * プレイヤーを継承した山田さんクラス
 * @author kei.aikawa
 *
 */
public class Yamada extends Player
{
	/**
	 * コンストラクタ
	 * @param name 名前
	 */

	public Yamada(String name)
	{
		//スーパークラスのコンストラクタを呼び出す
		super(name);
	}

	/**
	 * ジャンケンの手を出す。
	 * スーパークラスの同名メソッドをオーバーライドしている。
	 *
	 * @return
	 */
	public int showHand()
	{
		//必ずパーを出す
		return PAPER;
	}
}
