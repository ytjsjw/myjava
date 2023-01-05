package basic;
import java.io.IOException;

public class JavaInputThingsEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("수나 문자 입력");
		
		//아래의 콘솔을 이용해서 사용자가 입력한 값 하나를 프로그램 내부로 return시키는 메서드
//		int input = System.in.read();
//		char inputc = (char)System.in.read();
		
//		System.out.println("입력값은 " + input);
//		System.out.println("입력값은 " + inputc);
		
//		char	input	=	(char)System.in.read();
		
//		System.in.read();
//		System.in.read();
	
		//숫자를 입력 받을겁니다.
//		int	digit	=	System.in.read() - 48;
//		System.out.println("입력한 수 " + digit);
		System.out.println("첫번째 수 입력");

		int 	firNum		=	System.in.read() - 48;
		
		System.in.read();
		System.in.read();

		

		System.out.println("연산자 입력");

		char	addGubun	=	(char)System.in.read();

		System.in.read();
		System.in.read();
		
		
		

		System.out.println("두번째 수 입력");

		int		secNum		=	System.in.read() - 48;

		System.in.read();
		System.in.read();
		
		
		
		int		sum;
		
		sum = firNum + secNum;

		System.out.println(firNum);
		System.out.println(secNum);
		System.out.println(addGubun);
		
		System.out.println("" + firNum + addGubun + secNum + " = " + sum);
		
	}

}
