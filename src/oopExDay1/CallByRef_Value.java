package oopExDay1;

import java.util.Arrays;

public class CallByRef_Value {

	/*
	 * 정말 중요한 내용!!!!!
	 * 
	 * 객체의 참조(ref)를 이해해야 됨
	 * CallByValue라는 개념은 메서드간의 call시 파라미터 Ptype으로 주고 받는 경우에 일어남
	 * 
	 * 이때는 전에 자바스크리트에서 말했듯이 값을 보내기 전에 다른 메모리에 복사 후 복사된 메모리에서 값을
	 * 꺼내 전달하기 때문에 전달 받은 쪽에서도 값을 변경해도 전달한 쪽의 값은 변함이 없음
	 * 
	 */
	
	static	void	callByValue(int a) {
		a = a + 10;
		System.out.println("파라미터로 받은 a " + a);
	}
	
	static	void	callByRef(int[] arr) {
		arr[0]	=	100;
		arr[1]	=	200;
		arr[2]	=	300;
		
		System.out.println("callByRef에서의 배열값 : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	a	=	1;
		//a값을 callByValue()에게 전달 후 a 값 출력
		callByValue(a);
		System.out.println(a);
		
		int[]	arr	=	{1,2,3,};
		System.out.println("callByRef() 호출전 배열값 : " + Arrays.toString(arr));
		callByRef(arr);
		System.out.println("callByRef() 호출후 배열값 : " + Arrays.toString(arr));
	}

}
