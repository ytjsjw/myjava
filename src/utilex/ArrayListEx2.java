package utilex;

import java.util.ArrayList;

import oopExDay1.FireBet;
import oopExDay1.Ghost;
import oopExDay1.Magic;
import oopExDay1.Marine;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// Collection의 Generic
		/*
		 * Generic이란 jdk 1.5부터 지원하는 개념
		 * Collection의 요소로 Object로 기본적으로 채웠을때, 채우기는 쉬우나 만약 다른 객체들이
		 * 추출되어진다면, 각 객체의 특정 메서드 등을 호출할때 문제가 발생
		 * 때문에 instanceof를 이용 객체의 타입을 일일이 비교하여 호출하는 방법밖에 없게 됨
		 * 해서 Generic이라는 개념을 도입하여, Element요소를 한정하도록 하는게 목적
		 * 문법은 <Element Type>을 선언하면 됩니다. 이때 추가되는 모든 요소는 반드시 <Element Type>이어야만 함
		 */
		
		Marine marine	=	new Marine(null, null, 0, 0);
		Magic	magic	=	new Magic(null, null, 0, 0);
		FireBet	firebet	=	new FireBet(null, null, 0, 0);
		Ghost	ghost	=	new Ghost(null, null, 0, 0);
		
		ArrayList	terran	=	new	ArrayList();
		terran.add(marine);
		terran.add(magic);
		terran.add(firebet);
		
		for(int i = 0; i<terran.size(); i++) {
			
		}
	}

}
