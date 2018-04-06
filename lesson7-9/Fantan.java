package fantan;

import trump.Card;
import trump.Hand;
import trump.Master;
import trump.Player;
import trump.Rule;
import trump.Table;

/**
 * 七並べプログラム
 * @author kei.aikawa
 *
 */
public class Fantan {
	public static void main(String args[])
	{
		//①
		Master master = new FantanMaster();
		// ②
		Table table = new FantanTable();
		//③
		Rule rule = new FantanRule();
		//④
		Player murata = new FantanPlayer("村田",master,table,rule);
		Player yamada = new FantanPlayer("山田",master,table,rule);
		Player saito = new FantanPlayer("斎藤",master,table,rule);
		//⑤
		master.registerPlayer(murata);
		master.registerPlayer(yamada);
		master.registerPlayer(saito);
		//⑥
		Hand trump =createTrump();
		//⑦
		master.prepareGame(trump);
		//⑧
		master.startGame();

	}
	/**
	 * ５２枚のトランプを生成する。
	 * @return トランプを格納したDeal
	 */

	private static Hand createTrump()
	{
		Hand trump = new Hand();

		//各スート５２枚のカードを生成する
		for (int number =1; number <= Card.CARD_NUM; number++)
		{
			trump.addCard(new Card(Card.SUIT_CLUB, number));
			trump.addCard(new Card(Card.SUIT_DIAMOND, number));
			trump.addCard(new Card(Card.SUIT_HEART, number));
			trump.addCard(new Card(Card.SUIT_SPADE, number));
		}
		return trump;

	}

}
