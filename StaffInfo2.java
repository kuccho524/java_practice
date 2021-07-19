package jp.practice.java;

// Staffクラスを定義
class Staff2 {
	String name;
	int staffid;
	String email;
	
	// sayhelloメソッドを定義
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}

	// ソースメニューからフィールドを使用してコンストラクタを生成
	public Staff2(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	// ソースメニューからgetter及びsetterを生成を選択
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

/*
 *  ソースメニューのスーパークラスからコンストラクタを生成し、
 *  extendsを利用することでクラスの継承が可能になる
 */
class RemoteStaff2 extends Staff2 {
	public String location;

	public RemoteStaff2(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}

// StaffInfoクラスを定義
public class StaffInfo2 {
	
	// TODO 自動生成されたメソッド・スタブ
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff2 yamada = new Staff2("Taro Yamda", 12345, "yamada@abc.co.jp");
		// yamada.name = "Taro Yamda";
		RemoteStaff2 tanaka = new RemoteStaff2("Hanako Tanaka", 123456, "tanaka@abc.co.jp");
		
		// RemoteStaff2クラスのlocationを呼び出す。
		tanaka.location = "大阪";
		
		// 山田さんの情報を出力する。
		System.out.println("[社員情報]");
		
		// getterメソッドを使用して呼び出す。
		System.out.println("氏名：" + yamada.getName());
		System.out.println("社員番号：" + yamada.getStaffid());
		System.out.println("Email：" + yamada.getEmail());
		
		// 田中さんの情報を出力する。
		System.out.println("[社員情報]");
		System.out.println("氏名：" + tanaka.getName());
		System.out.println("社員番号：" + tanaka.getStaffid());
		System.out.println("Email：" + tanaka.getEmail());
		System.out.println("勤務地：" + tanaka.location);
	}

}
