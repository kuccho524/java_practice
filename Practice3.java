package jp.practice.java;

public class Practice3 {

	public static void main(String[] args) {
		// BMIの計算を実行する
		
		// 必要な変数を用意する
		double weight, height, bmi;
		weight = 46;
		height = 163;
		height /= 100;
		bmi = weight / (height * height);

		// 結果を出力する
		System.out.println(bmi);
	}

}
