package ioex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 * byte[]을 이용해서 jvm 메모리(가상메모리)에 데이터를 쓰고 읽는 예제
 * byte[]을 쓸땐 문제없지만, 읽을때는 새롭게 읽은 갯수를 리턴하는것에 대해 주의
 */
public class UseBArrStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[10];
		
		//Byte배열레 쓰는 객체 선언
		ByteArrayOutputStream output = null;
		ByteArrayInputStream input = null;
		
		input	=	new ByteArrayInputStream(inSrc);
		output	=	new ByteArrayOutputStream();
		
		//읽어온 데이터를 배열 temp에 담는다
		input.read(temp,0, temp.length);
		output.write(temp,5,5);
		
		outSrc	=	output.toByteArray();
		
		System.out.println("input source: "+ Arrays.toString(inSrc));
		System.out.println("temp : " +  Arrays.toString(temp));
		System.out.println("OutPut source : "+  Arrays.toString(outSrc));
	}

}
