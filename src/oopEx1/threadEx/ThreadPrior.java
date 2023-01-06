package oopEx1.threadEx;

class Pthread1 extends Thread{
	public void run(){
		for(int i = 0; i<300; i++) {
			System.out.print("-");
			for(int x = 0; x<100000; x++);
		}
	}
}

class Pthread2 extends Thread{
	public void run(){
		for(int i = 0; i<300; i++) {
			System.out.print("|");
			for(int x = 0; x<100000; x++);
		}
	}
}

public class ThreadPrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pthread1 th1 = new Pthread1();
		Pthread2 th2 = new Pthread2();
		
		//우선순위 다르게
		th2.setPriority(1);
		th1.setPriority(8);
		
		
		System.out.println(th1.getName() + "쓰레드우선순위 : " + th1.getPriority());
		System.out.println(th2.getName() + "쓰레드우선순위 : " + th2.getPriority());
		th1.start();
		th2.start();
	}

}
