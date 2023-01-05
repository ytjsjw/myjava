package exceptionEx;
/*
 * 사용자 정의 예외: 사용자 정의 예외란 예외 클래스를 프로그래머가 지접 정의 해서 던지는 형태
 * 이때 사용되는 형태는 대표적으로 알려진 또는 실행예외 두개정도 만들어 쓸수 있다
 * 알려진 예외는 Exception의 자식으로 클래스를 정의 하여 객체를 만들어 사용하는 형태
 * 실행 예외는 Runtime을 상속받아 필요시 던지는 형태
 */

//exception을 상속받은 알려진 예외(Checked)로 정의
//다른건 다 상속받아서 부모의 메서드를 그대로 이용하면 되지만, 예외 내용은 직접 정의
//때문에 파라미터 한개의 생성자를 호출 후 예외 내용을 부모에게 전달하도록 함

class	AccException	extends Exception{
	String	exceptionMsg;
	public AccException(String	exceptionMsg) {
		super(exceptionMsg);
	}
}

//계좌 클래스를 정의 하고, 인출(withdraw())시에 잔액이 부족할 경우 예외를 던지도록 함
class	Account{
	int	balance;

	public	Account(int balance) {
		this.balance = balance;
	}
	
	//입금메서드정의
	public	void	deposit(int amount) {
		this.balance += amount;
	}

	//출금메서드 정의
	public	int	withdraw(int money) throws AccException {
		if(balance < money) {
			throw new AccException("잔액 부족 " + (money - balance) + " 이 모자랍니다.!!!" );
		}
		return this.balance -= money;
	}
}	
public class UserExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account	acc	=	new	Account(1000);
		int	acc2	=	100;
		//예금을 하는 메서드 호출 잔액을 2000으로 증가함
		acc.deposit(1000);
		System.out.println("현재 잔액 : "+ acc.balance);
		
		try {
			acc.withdraw(acc2);
		} catch (AccException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			String	theMsg	=	e.getMessage();
			System.out.println(theMsg);
		}
	}

}
