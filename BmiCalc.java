public class BmiCalc {

/* BMI (体格)指数を計算するプログラム
 * BMI = 体重 / (身長 * 身長)
 * 体重 kg、身長 cm
 */
	
	public static void main(String[] args) {
		// BMIに必要な変数を用意する
		double weight, height, bmi;
		
		// 各変数に値を代入する
		weight = 62;
		height = 166;
		height /= 100;
		bmi = weight / (height * height);

		// BMIを出力する
		System.out.println(bmi);
		
		// if文で肥満/標準/痩せ型を分岐する
		if (bmi < 18.5) {
			System.out.println("痩せ型です。");
		} else if (bmi < 25) {
			System.out.println("標準です。");
		} else {
			System.out.println("肥満です。");
		}
	}

}
