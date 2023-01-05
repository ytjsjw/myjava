package langEx;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

import javax.swing.text.DefaultCaret;

public class StingExam {

	public static void main(String[] args) throws UnsupportedEncodingException {

		
//		String	a	=	"abc";
//		String	b	=	"abC";
//		
//		if(a == b) {
//			System.out.println("같은 객체");
//		}else System.out.println("다른객체");
//		
//		String	c	=	new	String();
//		String	d	=	new	String(b);
//		
//		if(d == b) {
//			System.out.println("같은 객체");
//		}else System.out.println("다른객체");
//		
//		if(d.equals(b)) {
//			System.out.println("다른 문자열객체지만 값은 같음");
//		}else System.out.println("다른 문자열 객체며 값도 틀림");
//
//		if(d.equalsIgnoreCase(b)) {
//			System.out.println("다른 문자열객체지만 값은 같음");
//		}else System.out.println("다른 문자열 객체며 값도 틀림");
//		
//		
//		byte[] 	yArr 	= {65,66,67};
//		yArr	=	"안녕하세요".getBytes();
//		String	yStr	=	new	String(yArr,3,6);
//		System.out.println(yStr);
//		
//		System.out.println(Arrays.toString(bArr));
//
//		byte[] 	kArr 	= {-20,-107,-120};
//		String	kStr	=	new	String(kArr);
//		System.out.println(kStr);
//	
//		char[] chArr = {'오','늘','하'};
//		
//		String	chStr	=	new String(chArr);
//		System.out.println(chStr);
//		
//		char[]	uniCodes	=	chStr.toCharArray();
//		int[]	converUni	=	new	int[uniCodes.length];
//		for(int i = 0; i<uniCodes.length; i++) {
//			converUni[i] = uniCodes[i];
//		}
//		System.out.println(Arrays.toString(converUni));
//		
//		String	uniStr	=	new String(uniCodes,0,uniCodes.length);
//		System.out.println(uniStr);
		
		String	myMsg	=	"오늘의 자바는 문자열 객체 까지 했씁니다";
		byte[]	bArr	=	myMsg.getBytes();
		String	bStr	=	new	String(bArr);
		System.out.println(bStr);
		
//		String	cStr	=	new String(bArr, 0, bArr.length, "ISO-8859-1");
		String	cStr	=	new String(bArr, 0, bArr.length);
		System.out.println(cStr);
		System.out.println(cStr.length());
		
		for(int i = 0 ; i<cStr.length(); i++) {
			char	ch	=	cStr.charAt(i);
			System.out.print(ch);
		}
//		
		System.out.println(cStr.charAt(cStr.length()-1));
		
		String	hi	=	String.copyValueOf(new char[]  {'h','e','l','l','o'});
		
		System.out.println(hi);
		
		String	email	=	"newno7134@hotmail.com";
		
		if(email.endsWith(".com") || email.endsWith("co.kr")){
			System.out.println("올바른 메일주서입니다.");
		}
		
		//format(): static이면서 문자열,수치형등을 모두 특정 형식대로 포맷하여 설정
		/*
		 * 문법 : %d(10진수형식), %s(문자열형식), %f(실수형), Locale(날짜등의 형식)
		 * 기본적으로 포맷을 적용하면 우측 정렬이 적용, 만약 -표시를 하게되면 왼쪽 정렬
		 */
	
		int	i	=23;
		
		System.out.println(String.format("%d", i));
		System.out.println(String.format("%d_", i));
		System.out.println(String.format("%5d_", i));
		System.out.println(String.format("%-5d_", i));
		System.out.println(String.format("%05d_", i));
		
		int	i2	= 123456789;
		//%뒤에 ,를 주면 자동으로 3자리마다 ,를 녛어줌
		System.out.println(String.format("%,d", i2));
		System.out.println(String.format("%,015d", i2));
		
		//문자열
		String	str	=	"hellow";
		System.out.println(String.format("%.2s_", str));
		System.out.println(String.format("%-12.2s_", str));
		
		//실수형  소수점이하 자리수 지정시 defalut 반올림
		double	n	=	22123.55678;
		System.out.println(String.format("%f", 3.4));
		System.out.println(String.format("%f", n));
		System.out.println(String.format("%.2f", n));
		System.out.println(String.format("%.3f", n));
	//	System.out.println(String("%,d",Integer.parseInt(String.format("%.0f", n))));
		
		System.out.println(email);
		//이메일 @ 여부판단하기 indexOf('@')
		
		int	idx	=	email.indexOf('@');
		System.out.println(idx);
		
		int	idx2	=	email.indexOf('n',email.indexOf('n')+1);
		System.out.println(idx2);
		
		//delimeter는 문자열 구분자를 뜻함. ", /"
		String	deliStr;
		deliStr	=	String.join(":","hello","java","World");
		System.out.println(deliStr);
		
//		email = email.replace('@', 'a');
//		System.out.print(email);
		
		//newno7134@hotmail.com => newno7134@green.com
		String	servernm	=	email.substring(email.indexOf('@')+1);
		String	id			=	email.substring(0, email.indexOf('@')+1);
		
		String	newServernm	=	servernm.replace(servernm, "green.com");
		String	newEmail	=	id.concat(newServernm);
		System.out.println(newEmail);
		
		//valueof : 연산되지 않은 문자열 형태로 넘기기위해 특정타입을 만들어 보냄
		int	aa	=	11;
		String	aaStr	=	String.valueOf(aa);
		System.out.println(aaStr + 1);
		
		
		System.out.println(id.toUpperCase());
		System.out.println("^^"+id.substring(0,1));		
//		Charset	charset	=	Charset.defaultCharset();
//		charset.availableCharsets();
//		
//		System.out.println(charset);
//		System.out.println(charset.availableCharsets());
	}

}
