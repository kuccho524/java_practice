// 入力値から月を英語に変換し、季節を表示するプログラムを作成する。

// Scannerクラスを宣言する。
import java.util.Scanner;

// Monthクラスを生成する
class Month {
  public static void main(String[] args) {
    // 変数monthをint型で宣言する。
    int month;

    // 1番目の引数に入力ストリームを指定します。標準入力を指定する。
    Scanner stdIn = new Scanner(System.in);
    System.out.println("1 ~ 12で好きな数字を入力してください。");
    month = stdIn.nextInt();

    // 変数monthの値をswitch文を利用して英語で出力
    switch(month) {
      case 1:
      System.out.println("January");
      break;
      case 2:
      System.out.println("February");
      break;
      case 3:
      System.out.println("March");
      break;
      case 4:
      System.out.println("April");
      break;
      case 5:
      System.out.println("May");
      break;
      case 6:
      System.out.println("June");
      break;
      case 7:
      System.out.println("July");
      break;
      case 8:
      System.out.println("August");
      break;
      case 9:
      System.out.println("September");
      break;
      case 10:
      System.out.println("October");
      break;
      case 11:
      System.out.println("November");
      break;
      case 12:
      System.out.println("December");
      break;
      default:
      break;
    }

    // 入力された数値によって季節を表示
    if (month == 12 || month == 1 || month == 2) {
      System.out.println(month + "月は冬です。");
    } else if (month > 2 && month < 6) {
      System.out.println(month + "月は春です。");
    } else if (month > 5 && month < 9) {
      System.out.println(month + "月は夏です。");
    } else if (month > 8 && month < 12) {
      System.out.println(month + "月は秋です");
    } else {
      System.out.println(month + "月はありません。");
    }
  }

}