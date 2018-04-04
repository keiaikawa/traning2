

public class Janken
{

	//ジャンケンの手を表す定数
	public static final int STONE =0;  //gu-
	public static final int SCISSORS = 1;  //choki
	public static final int PAPER =2; //pa-

	public static void main(String[] args)

	{

		int player1WinCount =0;
		int player2WinCount = 0;
		int player1Hand =0;
		int player2Hand =0;
		double randomNum=0;
		//■■■■■■■■■■■■■■■■■■■■
		//①プログラムが開始したことを表示する
		//■■■■■■■■■■■■■■■■■■■■
		//プログラム開始メッセージを表示する

		System.out.println("【ジャンケン開始】\n");


		//ジャンケンを散会実施する
		//■■■■■■■■■■■■■■■■■■■■
		//⑥勝負した回数を加算する
		//⑦３回勝負が終わったか
		//■■■■■■■■■■■■■■■■■■■■
		for(int cnt=0;cnt<3 ;cnt++)
		{
			System.out.println("【"+(cnt + 1) + "回戦目】");

			//■■■■■■■■■■■■■■■■■■■■
			//②プレイヤー１が何を出すか決める
			//■■■■■■■■■■■■■■■■■■■■

			//０以上３未満の少数として乱数を得る
			randomNum=Math.random()*3;
			if(randomNum<1)
			{
				//randomNumが0.0以上1.0未満の場合、グー
				player1Hand=STONE;
				System.out.print("グー");
			}
			else if(randomNum<2)
			{
				//randomNumが１．０以上２．０未満の場合、チョキ
				player1Hand = SCISSORS;

				//プレイヤー1の手を表示する
				System.out.print("チョキ");
			}
			else if ( randomNum < 3)
			{
				//randomNumが2.0以上3.0未満の場合、パー
				player1Hand = PAPER;

				//プレイヤー1の手を表示する
				System.out.print("パー");

			}
			//■■■■■■■■■■■■■■■■■■■■
			//③プレイヤー2が何を出すか決める
			//■■■■■■■■■■■■■■■■■■■■


			//0以上3未満の少数として乱数を得る
			randomNum=Math.random() *3;
			if(randomNum < 1)
			{
				//randomNumが0.0以上1.0未満の場合、グー
				player2Hand =STONE;

				//プレイヤー２の手を表示する
				System.out.print("グー");
			}
			else if(randomNum <2)
			{
				//randomNumが1.0以上2.0未満の場合、チョキ
				player2Hand = SCISSORS;
				//プレイヤー2の手を表示する
				System.out.print("チョキ");
			}
			else if(randomNum < 3)
			{
				//randomNumが2.0以上3.0未満の場合、パー
				player2Hand = PAPER;

				//プレイヤー2の手を表示する
				System.out.print("パー");
			}



			//■■■■■■■■■■■■■■■■■■■■
			//④どちらが勝ちかを判定し、結果を表示する。
			//■■■■■■■■■■■■■■■■■■■■
			//プレイヤー1が勝つ場合。

			if( (player1Hand == STONE && player2Hand ==SCISSORS)
				|| (player1Hand == SCISSORS && player2Hand == PAPER)
				|| (player1Hand == PAPER && player2Hand ==STONE))
			{	//■■■■■■■■■■■■■■■■■■■■
				//⑤プレイヤー1の勝った回数を加算する
				//■■■■■■■■■■■■■■■■■■■■
				player1WinCount++;

				//ジャンケンの結果を表示する
				System.out.println("\nプレイヤー1が勝ちました\n");
			}

			//引き分けの場合
			else
			{
				System.out.println("\n引き分けです\n");
			}


		}
		//■■■■■■■■■■■■■■■■■■■■
		//⑧最終的な勝者を判定し、画面に表示する
		//■■■■■■■■■■■■■■■■■■■■。
		System.out.println("【ジャンケン終了】\n");

			//プレイヤー1の勝ち数が多いとき
			if(player1WinCount > player2WinCount)
			{
				//プレイヤー1の勝ちを表示する
				System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー１の勝ちです！\n");

			}
			//プレイヤー2の勝ち数が多いとき
			else if (player1WinCount < player2WinCount)
			{
				//プレイヤー2の勝ちを表示する
				System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー２の勝ちです!\n");
			}
			//プレイヤー１と２の勝ち数が同じとき
			else if(player1WinCount == player2WinCount)
			{
				//引き分けを表示する
				System.out.println(player1WinCount+ "対" + player2WinCount +"で引き分けです!\n");
			}


	}
}
