import java.util.Scanner;

class Pokemon {
  public static void main(String[] args) {
    // 必要な変数データ型を用意する
    String pokemon;
    int hp, a, b, c, d, s, total;

    // 1番目の引数に入力ストリームを指定します。標準入力を指定する。
    Scanner stdIn = new Scanner(System.in);

    // 変数に各入力値を取得する
    System.out.println("ポケモンを入力してください。：");
    pokemon = stdIn.next();
    System.out.println("HPを入力してください。：");
    hp = stdIn.nextInt();
    System.out.println("Aを入力してください。：");
    a = stdIn.nextInt();
    System.out.println("Bを入力してください。：");
    b = stdIn.nextInt();
    System.out.println("Cを入力してください。：");
    c = stdIn.nextInt();
    System.out.println("Dを入力してください。：");
    d = stdIn.nextInt();
    System.out.println("Sを入力してください。：");
    s = stdIn.nextInt();

    // 合計種族値を計算する
    total = hp + a + b + + c + d + s;

    // 合計種族値を出力する
    System.out.println(pokemon + " の各種族値は");
    System.out.println("HP" + hp + "\n攻撃" + a + "\n防御" + b + "\n特攻" + c + "\n特防" + d + "\n素早" + s);
    System.out.println("合計種族値は " + total + " です。");
  }
}