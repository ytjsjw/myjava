package basic;
import java.io.IOException;
import java.util.Scanner;


public class JavaInputThingsEx2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		/*
		 * 사용자가 입력한 문자열을 프로그램으로 읽는 Api사용 예 2번째.
		 */

		//Scanner 객체 생성. 아래 객체를 생성하면 다음부터는 sc.메서드()를 이용해서 사용자 입력값을 프로그램으로 가져옵니다.
		//Scanner  java.util 선택(사용)
//		Scanner sc = new Scanner(System.in);   클래스 변수로 이동 시켜서 사용
		
		System.out.println("메세지 입력....");
		
		String	value1	=	sc.nextLine();
		System.out.println(value1);
		
		int fir = sc.nextInt();
		System.out.println(fir + 1);
		
//			System.out.println("문자 입력");
//			char	input	=	(char)System.in.read();
//			System.in.read();
//			System.in.read();
//			System.out.println("입력한 결과 : " + input);
	}

	static void doSome() {
		sc.nextLine();
	}
}
