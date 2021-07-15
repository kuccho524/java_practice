import java.util.Scanner;

public class BmiCalc2 {

/* BMI (体格)指数を計算するプログラム
 * BMI = 体重 / (身長 * 身長)
 * 体重 kg、身長 cm
 */
	
	public static void main(String[] args) {
		// BMIに必要な変数を用意する
		double weight, height, bmi;
		
		// 各変数に値を代入する
		// weight = 62;
		// height = 166;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？(kg)：");
		weight = stdIn.nextDouble();
		System.out.println("身長は？(cm)：");
		height = stdIn.nextDouble();
		height /= 100;
		bmi = weight / (height * height);

		// BMIを出力する
		System.out.println("BMI：" + bmi + " です。");
	}

}
