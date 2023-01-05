package exceptionEx;

import javax.swing.JOptionPane;

/*
 * 예외발생시켜서, 예외 객체자 jvm에게 던져지는(throw) 걸 확인하고 예외 타입을 알아봅니다.
 * 또한 콜 스텍에서 예외가 어떻게 전파되는지 확인
 * 
 * RuntimeException은 실행 예외를 정의한 클래스로 하위에 있는 모든 예외는 실행이 되어야만 발생할 수 있는 예외
 * 즉 컴파일러가 알수 없다. 예외와 같은 계층이거나 상위에 있는 예외들은 알려진 예외로 컴파일러가 관여하기에 이런 API를
 * 사용할때는 예외를 핸들링(try~catch), 전파선언(throws)중 하나를 하지 않으면 컴파일 에러가 발생
 */

public class ExceptionEx1 {

	static void	c() {
		String	input = JOptionPane.showInputDialog("나눌숫자값입력");
		double	d	=3;
		
		try {//예외 핸들링
			System.out.println(3/Integer.parseInt(input));
			
			System.out.println("여기 try구문의 예외 발생후 코드");
		}catch(ArithmeticException kk) {
			System.out.println("계산시 예외 발생");
			System.out.println("원인 : "+ kk.getMessage());
			System.out.println("0으로 나눌수 없습니다.");
		}catch(RuntimeException ae) {
			System.out.println("계산시 예외 발생");
			System.out.println("원인 : "+ ae.getMessage());
			System.out.println("0으로 나눌수 없습니다.");
		}
	
	}
	
	static	void	b() {
		c();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b();
	}

}
