package basic;
/*
 * 코딩시 보라색은 모두 키워드. 따라서 변수나,메서드명으로 절대 사용불가
 * 아래 클래스옆에 public은 option입니다. 넣거나 빼거나 문제없지만 나중에 패키지란걸배우면 알게됨.
 * 클래스 이름 명명법: 아래의 class옆에 있는 이름은 클래스명이라함.
 * 이름은 반드시 * 1000000000 첫자는 대문자로 시작해야하고, 한단어 이상 영결시 새단어의 첫단어는 기본적으로 대문다.
 * "_"(언드바)와 $를 사용할 수 있지만 아무도 사용않함
 * 모든변수,클래스,메서드 이름에는 첫문자는 숫자가 올 수 없습니다.
 * 
 * 아래의 클래스 이름이 소스코드의 파일명과 반드시 일치해야 합니다.(대소문자까지)
 */

public class FirstJavaEx {  //class body
	public static void main(String[] args) {	//메서드 body
		
		/*
		 * 자바에서 변수를 사용할 때 반드시 값이 초기화 되어 있어야 합니다.
		 * 위에서 초기화란 초기화 또는 초기 값이 존재해야 한다는 말
		 * 변수를 처음 선언할 때는 반드시 변수명 앞에 타입이 선언되어야 함
		 * 이렇게 선언된 변수는 해당 타입만 값을 넣을 수 있음.
		 */
		/*
		 * 리터럴 데이터 : 직접적으로 정해진 데이터 값 ex> 10 + 20, "안녕"
		 * 메서드안에 선언된 최초 변수를 local(지역)변수라 함
		 */
		
		/*
		 * java Data Type :
		 * 
		 * 1.수치형(정수) : byte(1byte) -->short(2byte) -->int(default) --> long(8byte)
		 * 2.수치형(실수) : float(4byte) --> double(8byte, default)
		 * 3.문자형(char): char(2byte)
		 * 4.논리형(boolean) : true or false
		 * 5.객체형(Reference Type) : 
		 * 
		 * 1,2,3,4 네개의 자료형을 자바에서는 통틍러 원시자료형(Primitive Type)이라고 합니다. =>P type
		 * 
		 * 그러므로 변수는 크게 Primitive Type(P type)과 Reference Type(R type)으로 나뉜다.
		 */
		byte	a, b; //a는 지역변수 선언(declared)(메서드내에서 처믐 선언된 변수를 지역변수라 함) 
		              //변수 a는 byte type이므로 8bit 즉 값이 127을 넘을 수 없다.
		
		a	=	1;
		b	=	1;
		byte	c	=	1;
		
		//short type는 자바에서 사장된 데이터 타입
		short	s	=	100;
		
		a	=	10;
		
		int	in	=	1;
		//연산자를 만났을 경우엔 두 타입을 비교해서 default보다 작으면 default 타입으로 변환 후 연산 결과 타입도 default 타입이다.(중요!!!)
		//default 보다 큰 타입의 연산인 경우 무조건 큰 타입으로 리턴된다.
		
		in = a + b;
		
		
//		System.out.println(a + b + c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		
		long	lo	=	1L;  //long에 숫자대입시 숫자 뒤에 대문자L를 찍어줘야 한다.
		
		long	it	=	lo + 1;
		
		float f = 3.14F;
		f = lo;
		
		//타입 프로모션: 작은 타입을 큰 타입에 대입하는 형태..무조건 된다.
		//타입 케스팅(Casting): 큰 타입을 작은 타입에 대입할때 사용되는 연산자를 이용해서 대입하는 형태를 말함.
	}
}
