package trump;
/**
 * ジョーカーを表すクラス
 * Cardクラスを継承している
 * @author kei.aikawa
 *
 */

public class Joker extends Card
{
	/**
	 * コンストラクタ
	 */
	public Joker()
	{
		super(0,0);
	}

	/**
	 * 数を変更する
	 * @param number数
	 */
	public void setNumber(int number)
	{
		this.number_=number;
	}

	/**スートを変更
	 * @oaram suit スート
	 */
	public void setSuit(int suit)
	{
		this.suit_ =suit;
	}

	/**
	 * カードを文字列で表現する。
	 *
	 * @return カードの文字表現
	 *
	 *
	 * 	 */
	public String toString()
	{
		return "JK";
	}
}
