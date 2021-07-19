package jp.practice.java;

// PCの情報を格納する
class Computer {
	public String os;
	public int memory;
	public int storage;
}

public class ComputerInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer desktop = new Computer();
		desktop.os = "Windows 10";
		desktop.memory = 4;
		desktop.storage = 256;
		
		System.out.println("OS：" + desktop.os);
		System.out.println("OS：" + desktop.memory + "GB");
		System.out.println("OS：" + desktop.storage + "GB");
		
		// 2第目のPCの情報を出力する際、1第目の情報を参照する。
		Computer desktop2 = desktop;
		desktop2.os = "Ubuntu";
		
		System.out.println("\nOS：" + desktop.os);
		System.out.println("OS：" + desktop.memory + "GB");
		System.out.println("OS：" + desktop.storage + "GB");
		
		// 最後にデスクトップの情報を出力する。
		System.out.println("\nOS：" + desktop.os);
		System.out.println("OS：" + desktop.memory + "GB");
		System.out.println("OS：" + desktop.storage + "GB");
		
		// 参照を利用することで、desktopの情報が書き変わっている
	}

}
