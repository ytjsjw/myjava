package basic;

public class CharEx {

	public static void main(String[] args) {
		char	c	=	'a';
		
//		System.out.println(++c + 1);
		
		//char의 기보값: \u0000
		char	c2	=	'\u0000';
		
//		System.out.println(c2);
		
		c2 = '윤';
		System.out.println((int)c2);
		
		System.out.println(Integer.toHexString(50980));     //16진수
		
		char	myLastName;
		
		myLastName	=	'\uc724';
		System.out.println(myLastName);
		
		//자바의 escape문자열
		//escape란 출력시 특정 기호를 사용하여 탭, 라인변경, 줄바꿈 등을 할 수 있는 문자
		//사용법은 바드시 문자열 내에 \(escape문자)를 사용해야 함
		//n(라인변경), t(탭), /n/r(엔터), //(역슬래시), ' 싱글쿼트
		
//		System.out.print("1\n\r\t\'" + "A" + "\'\\");
//		System.out.print("2");
		
		
		if('a' < 'b') {
//			System.out.println("a > b");
		}
		
	}

}
