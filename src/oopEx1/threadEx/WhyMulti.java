package oopEx1.threadEx;

import javax.swing.JOptionPane;

public class WhyMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//아래는 main 쓰레드가 위의 입력을 기다리는 동안 블락킹 상태가 되어 아무것도 못하는 것을 구현한 예제
		//이를 극복하기 위해 카운트하는 쓰레드를 정의해서 각각 실행해 봅니다.
		
//		for(int i = 10; i>0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//				
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		Thread countThread = new Thread() {
			public void run() {
				for(int i = 10; i>0; i--) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		}; 
	 countThread.start();
	String input = JOptionPane.showInputDialog("아무값입력");
	System.out.println("입력값은 "+ input + "입니다.");
	}
		
	

}
