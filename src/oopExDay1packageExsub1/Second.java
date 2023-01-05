package oopExDay1packageExsub1;

import oopExDay1packageEx.First;

public class Second extends First {

	public Second() {
		super("윤");
	}
	
	 public static void mane(String[] args) {
		 //다른 패키지에 있는 First 의 생성자를 호출
		 First f1 = new First("윤");			//ctr + shif + o누르면 패키지 import됨
//		 First f2 = new First("윤");			위 super를 이용해서 처리
	 }
}
