/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題3 マカロンを作る
 *
 * シトロン、ショコラ、ピスターシュを30個ずつ作成します。
 * シトロン、ショコラ、ピスターシュの個数を格納する変数を
 * 宣言し、それぞれに30を代入してください。
 * [問題2]の表示を以下の実行例のように改変します。
 * （表示する個数はそれぞれの変数の値とします。）
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り30個
 * ショコラ      \280 ・・・ 残り30個
 * ピスターシュ  \320 ・・・ 残り30個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge03;

public class Patisserie {
	public static void main(String[] args) {
		// たいへんお待たせしましたを出力
		System.out.println("たいへんお待たせしました。");
		// 【ポエール・ネルメ】を出力
		System.out.println("【ポエール・ネルメ】");
		// ただいまより開店です！！を出力
		System.out.println("ただいまより開店です！！");

		// シトロンの残り個数を変数citronにて宣言
		int citronStock = 30;
		// ショコラの残り個数を変数chocolateにて宣言
		int chocolateStock = 30;
		// ピスターシュの残り個数を変数pistachioにて宣言
		int pistachioStock = 30;

		// 本日のおすすめ商品です。を出力し、改行を行う
		System.out.println("本日のおすすめ商品です。\n");
		// シトロン      \\250 ・・・ 残り（整数型 citronStockの値）個を出力
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		// ショコラ      \\250 ・・・ 残り（整数型 chocolateStockの値）個を出力
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolateStock + "個");
		// ピスターシュ  \\250 ・・・ 残り（整数型 pistachioStockの値）個を出力
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachioStock + "個");
	}
}
