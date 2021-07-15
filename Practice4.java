package jp.practice.java;

// 入力値を取得するScannerクラスを定義
import java.util.Scanner;

/*
 * BMIの計算式
 * BMI = weight / (height(m) * height(m))
 * ~18 やせ型、18 ~ 25 標準、25~ 肥満
 */

public class Practice4 {

	public static void main(String[] args) {
		// bmiに必要な変数を用意する
		double weight, height, bmi;
		
		// 各値の入力値を取得
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？（kg）：");
		weight = stdIn.nextDouble();
		System.out.println("身長は？（cm）：");
		height = stdIn.nextDouble();
		height /= 100;
		
		// bmiを計算
		bmi = weight / (height * height);
		
		// bmiを出力
		System.out.println("あなたのBMIは、" + bmi + " です。");
		
		// bmiの値でやせ型/標準/肥満を分岐
		if (bmi < 18) {
			System.out.println("やせ型です。");
		} else if (bmi < 25) {
			System.out.println("標準です。");
		} else {
			System.out.println("肥満です。");
		}
	}

}
