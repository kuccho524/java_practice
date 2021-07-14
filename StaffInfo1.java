// Staffクラスを定義
class Staff {
	String name;
	int staffid;
	String email;
	
	// sayhelloメソッドを定義
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}
}


// StaffInfoクラスを定義
public class StaffInfo1 {
	
	// TODO 自動生成されたメソッド・スタブ
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamda";
		yamada.sayhello();
		// System.out.println(yamada.name);
	}

}
