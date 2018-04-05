/**
 * オブジェクト指向によるジャンケンプログラム。
 * @author kei.aikawa
 *
 */
public class ObjectJanken {
	public static void main(String[] args)
	{
		Judge saito = new Judge();

		Player murata = new Murata("村田さん");

		Tactics murataTactics = new StoneOnlyTactics();
		murata.setTactics(murataTactics);

		Player yamada = new Yamada("山田さん");
		Tactics yamadaTactics = new RandomTactics();

		yamada.setTactics(yamadaTactics);

		saito.startJanken(murata,yamada);
	}

}
