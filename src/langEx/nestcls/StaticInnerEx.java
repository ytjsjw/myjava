package langEx.nestcls;

/*
 * 외부 클래스의 멤버필드 선언위치에 선언되며, 외부 클래스의 static멤버처럼 호출 및 객체 생성가능
 * 주로 외부 클래스의 static 멤버, 특히 static메서드를 사용할 목적으로 주로 정의
 * 만약 내부 클래스에서 static 필드(상수 아님)을 선언해야 할 경우엔 무조건 static inner클래스로 선언되어야함
 * jdk 17 이전 버전까지 
 */

public class StaticInnerEx {

	int	a		=	10;
	private	int	b	=	100;
	static	int	c	=	200;
	
	public int	getA() {
		return	a;
	}
	
	public int	getB() {
		return	b;
	}
	static int	getC() {
		return	c;
	}
	
	public	static	class	StaticInner{
		int	d	=	300;
		static	final	int	e	=	400;
		static	int	f	=	500;
		
		//static method정의
		public static void printA() {
//			System.out.println("a = " + a); a는 non static이라 사용못함 c는 사용가능
			System.out.println("getC() :" + getC()); //마찬가지로 메서드도 static 메서드만 사용가능
			
		}
		
		public void printB() {
//			System.out.println("a = " + a); a는 non static이라 사용못함 c는 사용가능
			System.out.println("getC() :" + getC()); //마찬가지로 메서드도 static 메서드만 사용가능
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticInnerEx.StaticInner.printA();    //static 이라 생성자없이 직접 호출가능
		StaticInnerEx.StaticInner sInner = new StaticInner();  //static 인너클래스라 직접 생성가능
		sInner.printB();
	}

}
