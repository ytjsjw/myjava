package basic;

public class ArrayExam {

	public static void main(String[] args) {

		/*
		 * 자바배열 : 자바에서는 String, 배열은 모두 P type이 아닌 R type입니다. 즉 객체란 뜻
		 * 때문에 P type과 개념이 틀림
		 * 배열을 생성할 때는 반드시 new라는 키워드를 이용해서 생성
		 * 또 배열은 객체라서 해당 객체를 REF하는 변수(reference 변수)를 반드시 이용해서 뭔가를 해야함.
		 * 즉 ref를 잃어버린 배열객체는 이후 더이상 사용 불가능하기 때문(몹쓸객체)
		 */
		
		System.out.println(new int[] {1,2,3});
		
		//배열생성식 1 : 길이만 준다.
		int[]	arr	=	new	int[3]; //자바에서는 빈배열(length)가 없는 배열은 생성불가
		//따라서 반드시 length는 줘야 한다. 생성된 배열 객체의 hashcode 출력
		System.out.println(arr.length);
		
		//배열은 값을 주지 않고 생성하면(기본배열객체) 자동으로 해당 기본값으로 초기화된다.
		
		for(int a : arr)			//배열값을 변수에 담아 실행하는 for loop : arr배열 수만큼 arr배열에 값을 a변수에 asing 
			System.out.println(a);
		//		
//		//배열식 2 : 값을 주고 초기화 하기
//		String	strArry[]	=	{"Hello","World","Java"};
//		for(String str : strArry) {
//			System.out.println(str);
//			System.out.println(strArry);
//		
//		//배열식 3 : 위 1,2를 합친 형태 ....length만 빼준다
//		char[] stars = new char[] {'a','b','c'};
//		
//		
//				
//		}
		
	}

}
