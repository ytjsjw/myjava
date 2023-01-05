package basic;
import java.util.Arrays;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* main()의 파라미터인 String[]에 값을 주고 시작해 봅니다. */
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		//향상된 for.. jdk 1.5부터 지원됨...특정 그룹데이터의 전체를 다 루프할때 요긴
		//자바스크립트의 for in과 거의 유사함
		
//		for(String str : args)
//			System.out.println(str);
//		
//		for(char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.print(ch);
//		}
//		System.out.println();
//		for(int i = 65; i <= 90; i++) {
//			System.out.print((char)i);
//		}
		
		
		//구구단 전체 돌기
		//자바에서만 존재 하는 label loop
		//loop에 이름(Label)을 주고 호출하여 제어하는 방법
		//outer, inner는 임의로 명명
//		outer:for(int i = 2; i <= 9; i++) {
////			if( i%2 == 0) {	//짝수단 건너뛰기
////				continue;
////			}
//				inner:for( int j = 1; j <= 9; j++) {
//					if(i%2 == 0)
//						break outer;  //또는 continue 사용
//					int	sum = i * j;
//					System.out.println(i + " * " + j + " = " + sum);
//			}
//			System.out.println(i + "단 끝");
//		}
//		
		
		//중첩 for에서 초기화 변수를 재활용 할때 발생하는 로직 작성
		
		for(char a = 'A'; a <= 'Z'; a++) {
			for(char b = a; b <= 'Z'; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		
//		int[]	intArr	=	{12,30,3,50,107,505};
//		
//		Arrays.sort(intArr);
//		
//		for(int i = 0;	i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
		
	}

}
