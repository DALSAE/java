package chapter13_Ex;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		//th1.setDaemon(true);
		System.out.println(th1.getPriority());
		th1.setPriority(10);
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է�");
		System.out.println("�Է��Ͻ� ���� "+input+ "�Դϴ�.");
	}

}
