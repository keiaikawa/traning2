/**ランダムに手を決める戦略クラス
 *
 * @author kei.aikawa
 *
 */
public class RandomTactics {

	/**戦略を読み、ジャンケンの手を得る。
	 * @return ジャンケンの手
	 */
	public int readTactics()
	{
		//プレイヤーの手
		int hand = 0;

		//0以上３未満の少数として乱数を得る
		double randomNum = Math.random() *3;
		if(randomNum<1)
		{
			//randomNumが0以上１未満の場合、グー
			hand = Player.STONE;
		}
		else if(randomNum<2)
		{
			//randomNumが1以上２未満の場合、チョキ
			hand= Player.SCISSORS;
		}
		else if(randomNum<3)
		{
			//randomNumが２以上、３未満の場合、パー
			hand = Player.PAPER;
		}
		//決定した手を戻り値として返す
		return hand;
	}

}
