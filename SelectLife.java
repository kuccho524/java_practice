public class SelectLife {
  
  public static void main(String[] args) {
    // 変数numberをint型で宣言する
    int number = 1;

    switch(number) {
      case 1:
      System.out.println("行く");
      break;
      case 2:
      System.out.println("帰る");
      break;
      default:
      System.out.println("死ぬ");
      break;
    }
  }
}
