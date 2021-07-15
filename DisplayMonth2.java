package jp.practice.java;

public class DisplayMonth2 {

	public static void main(String[] args) {
		// 各月を変数monthの配列に入れる
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		// 各月をfor文で出力する
		for (int i = 0; i < 12; i++) {
			 System.out.println(month[i]);
		}
	}

}
