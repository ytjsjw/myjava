package langEx.nestcls;

import langEx.nestcls.InnerEx1.Inner1_1;

/*
 * 중첩클래스(Nested Class): 자바에는 4대 중첩 클래스가 존재
 * 멤버중첩, 정적(static)중첩, 지역중첩, 익명중첩
 * 
 * 중첩클래스 또는 중첩인터페이스를 두는 이유는 특정 클래스가 외부에 노출되어 어떤일을 하기 보다는,
 * 특정 클래스에서만 사용되어야 하고, 또한 코드의 복잡성을 내부에서 감추어서 사용하기 편하도록 하는데 있음
 * 
 * 1.멤버중첩클래스 : 위치가 내부 클래스의 멤버필드 위치로 선어되어있는 형태
 *   사용목적: 외부 클래스의 인스턴스 멤버처럼 활용하는데 있고, 주로 외부 클래스의 멤버들과 관련해서 작업을 하는데 사용
 */

class	InnerEx1{
	int	a	=	10;
	private	int	b	=	100;
	static	int	c	=	300;
	
	private int getA() {
		return a;
	}
	//중첩클래스 정의
	//정의 위치가 멤버드(메서드 또는 필드)가 같은 위치에 있기에, 멤버 중첩클래스라고 합니다.
	
	class Inner1_1{
		//Inner클래스에서도 생성자, 필드, 메서드 모드 선언 및 정의 가능
		int	d	=	400;
		
//		static	int	k	=	500; //non static inner에선 static필드 선언 불가함 하지만 상수로서는 가능하다.
		static final int e = 500;
		
		public void printData() {
			//바깥에 있는 변수를 내꺼인냥 사용
			System.out.println("int a= " + a);
			System.out.println(getA());
			System.out.println("int b= " + b);
			System.out.println("int c= " + c);
		}
	}
}
public class Inner1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inner클래스의 인스턴스를 생성시에 Outer.Inner타입으로 생성해야함 (꼭 기억!!!)  
		InnerEx1.Inner1_1 inner = new InnerEx1().new Inner1_1();
		//위 인스턴스 생성을 풀어쓰면 아래와 같다
		InnerEx1 outer	= new InnerEx1();
		InnerEx1.Inner1_1 inner2 = outer.new Inner1_1();
		inner2.printData();
	}

	
}
