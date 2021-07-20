import java.util.Scanner;

public class Keisan {
  public static void main(String[] args) {
    int a, b, wa, sa, seki, sho, joyo;

    // 1番目の引数に入力ストリームを指定します。標準入力を指定する。
    Scanner stdIn = new Scanner(System.in);

    // 和、差、積、商、剰余を入力値から計算する
    System.out.println("数値を入力してください。");
    a = stdIn.nextInt();
    System.out.println("数値を入力してください。");
    b = stdIn.nextInt();

    // それぞれを計算する
    wa = a + b;
    sa = a - b;
    seki = a * b;
    sho = a / b;
    joyo = a % b;

    // それぞれの値を出力する
    System.out.println(a + "と" + b + "の和は" + wa + "です。");
    System.out.println(a + "と" + b + "の差は" + sa + "です。");
    System.out.println(a + "と" + b + "の積は" + seki + "です。");
    System.out.println(a + "と" + b + "の商は" + sho + "です。");
    System.out.println(a + "と" + b + "の剰余は" + joyo + "です。");
  }
}
