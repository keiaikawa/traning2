package fantan;

import trump.Master;

/**
 * 7並べよう進行役クラス
 * @author kei.aikawa
 *
 */

public class FantanMaster extends Master{
	/**パス出来る制限回数*/
	public static final int PASS_LIMIT =3;

	/**
	 * パスを宣言する。
	 * @oaram player パスするプレイヤー
	 */
	public void pass(FantanPlayer player)
	{
		//パスを表示
		System.out.println(
				" " + player+"さんは"+player.getPass() + "回目のパスしました！");

		if(player.getPass() >PASS_LIMIT)
		{
			//パス回数が制限値を超えている場合は負け
			System.out.println(" " + player + "さんは負けです");
			deregisterPlayer(player);
		}

	}

}
