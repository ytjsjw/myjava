package oopEx1.threadEx;

class ThreadEx1_1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			System.out.println("쓰레드이름 : " + i);
		}
	}
}
class ThreadEx1_2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("쓰레드이름 : " + getName());
		}
	}
}

//Runnable
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
		System.out.println("이건 Runnable 타입의 쓰레드 내용");
		}
	}
}

public class ThreadEx1 {

	/*
	 * 쓰레드생성방법
	 * 1.내자신이 쓰레드를 상속받는 방법
	 * 2.쓰레드 객체를 생성해서 run()을 구현하는 방법(익명클래스 정의법)
	 * 3.Runnable type 으로 생성해서 Thread(Runnable)에 탑재하는 방법
	 * 
	 *  위 3개중 뭐가됐든 반드시 run()을 오버라이드해야하고, Runnable상태로 전이되기 위해선 반드시 start()를 호출해야함
	 *  
	 */


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " 이 수행시작");
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		ThreadEx1_2 t2 = new ThreadEx1_2();
		MyThread	my	=	new MyThread();
		Thread t3 = new Thread(my);
		
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i= 0 ;i<5;i++ ) {
					System.out.println("역긴 main()에서 수행된 쓰레드의 내용" +
							Thread.currentThread().getName() + " 입니다.");
				}
				
			}
		});
		t4.start();
		t4.setName("T4 쓰레드");
		
		Thread t5 = new Thread() {
			public void run() {
				System.out.println("T5 쓰레드");
			}
		};
		
		t5.start();
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i = 0; i<5 ; i++) {
			System.out.println("main " + i);
		}
		
	}

}
