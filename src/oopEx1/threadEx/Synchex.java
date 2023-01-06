package oopEx1.threadEx;
/*
 * 자바 동기화(synchronized): 하나 이상의 쓰레드가 하나의 공유 객체에 접근해서 공유된
 * 멤버필드를 사용할 때 동기화가 되어지지 않으면, 올바른 값이 도출되지 않을 수 있다
 * 해서 자바에서는 동기화란 개념을 통해 하나의 쓰레드가 공유 객체를 점유하는 순가 해당 객체에
 * lock을 걸어서 다른 쓰레드가 접근할 수 없도록 한다. 점유한 쓰레드가 작업을 다 마칠때까지
 * 다른 쓰레드는 대기 영역에 머물게되고, lock을 해제하는 순간 객체에 접슨하여  run()수행
 * 
 * 동기화 적용 방법 
 * 1.멤버필드의 값을 조작하는 메서드 전체에 동기화 선언
 * 2.특정메서드에서 동기화가 필요한 로직에 동기화 블럭을 선언
 * 
 * 1번째 방법에는 메서드 return type 선언전에 synchronized라는 키워드르 선언
 * 2번째 밥업에는 synchronized(공유객체명){동기화가 필요한 로직 구현}로 한다
 * 
 * 
 */

class Account{
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		if(this.balance >= balance) {
			try {
				Thread.sleep(1000);
				this.balance -= money;
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class ConThred implements Runnable{
	//이 쓰레드가 위의 Account 객체 하나를 고유 하도록하기 위해 필드로 Account객체를 생성
	Account	myAcc	=	new	Account();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(myAcc.balance >0)	{
			int money = (int)(Math.random()*3 +1) * 100;
			myAcc.withdraw(money);
			System.out.println("현재잔액 : "+ myAcc.balance);
		}
	}
	
}
public class Synchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConThred shared	=	new	ConThred();
		Thread th1	=	new Thread(shared);
		Thread th2	=	new Thread(shared);
		
		th1.start();
		th2.start();
	}

}
