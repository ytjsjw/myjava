package oopEx1.threadEx;

import javax.swing.JOptionPane;

/*
 * Thread 2개를 각각 정의해서 하나는 카운트 수행, 하나는 값을 입력받도록 정의
 * 메인쓰레드는 두개의 쓰레드를 시작만 시키는 일을 함
 */

class UserINThread extends Thread{
	public void run() {
		System.out.println("10초안에 값입력");
		String input = JOptionPane.showInputDialog("아무값입력");
		ThreadCountClose.inputCheck = true;
		System.out.println("입력값 : "+ input);
	}
}

class Counter implements Runnable {
	public void run() {
		for(int i = 9; i>=0; i--) {
			if(ThreadCountClose.inputCheck) return;
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("10초 동안 값 입력이 없어 ㅍ로그램 종료");
		System.exit(0);
	}
}
public class ThreadCountClose {
	static boolean inputCheck = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserINThread ui	=	new	UserINThread();
		Thread conter = new Thread(new Counter());
		
		ui.start();
		conter.start();
	}

}
