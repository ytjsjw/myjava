package oopEx1.threadEx;

/*
 * 공유 객체 내부에 동기화 메서드와 블럭이 여러개면 쓰레드가 이중 하나를 점유하면 다른 쓰페드는
 * 해당 메서드와 다르 ㄴ동기화 블럭 메서드 또한 접근차단(객체에 lock걸림) 하지만 일반 메서드는 수행 가능
 * 
 * 쓰레드가 동기화 메서드를 실행하는 즉시 객체엔 lock 수행후엔 lock해제, 이때 대기중인 쓰레드는 
 * 잘못하면 데드락(Death lock) 상태에 빠질 수 있으며, 이땐 아무것도 하지 못하는 상태가 될 수 있음
 * 
 * 메서드 전체에 동기화를 걸지 않고 일부만 적용하고 싶을때 동기화 블럭을 사용
 * 형식 : void someMethod(){synchronized(공유객체){동기화 적용 로직}
 * 
 */

//아래의 클래스는 잔액을 계산하는 기능을 가진 클래스
//각각 메서드를 통해 하나는 금액을 set, 하나는 get하도록 합니다.
//이때 이 객체를 다중의 쓰레드가 접근하면서 각기 다른 메서드를 호출하면 오류된 값이나오는데 이를 동기화 메서드와 블럭을
//이용하여 적절히 제어함

class Calculator{
	

	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public synchronized void setMoney(int money) {
		this.money = money;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " : " + this.money);
	}


	public void setMoney2(int money) {
		synchronized(this) {//자신이 공유 객체임을 선언함
			this.money = money;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+ " : " + this.money);
		}
	}


	class User1Thread extends Thread{
		private Calculator	calculator;
		
		public	User1Thread() {
			setName("User1Thread");
		}
		
		public void setCalculator(Calculator cal) {
			this.calculator = cal;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			calculator.setMoney(100);
		}
	}

	class User2Thread extends Thread{
		private Calculator	calculator;
		
		public	User2Thread() {
			setName("User1Thread");
		}
		
		public void setCalculator(Calculator cal) {
			this.calculator = cal;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			calculator.setMoney2(50);
		}
	}

	public class Synchex2 {

//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			Calculator cal = new Calculator();
//			
//			User1Thread u1 = new User1Thread();
//			u1.setCalculator(cal);
//			u1.start();
//			User2Thread u2 = new User2Thread();
//			u2.setCalculator(cal);
//			u2.start();
//		
//
//		}

	}	

}