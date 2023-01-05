package utilex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Set타입 : Collection으 자식타입으로 기본적으로는 List와 메서드가 동일한게 많음
 * 특징: 중복 허용하지 않는게 있고, 검색기능을 추가한 형태의 API들이 Set탕입에 있음. 또한 정렬 기능을
 */

public class SetEx1 {

	public static void main(String[] args) {
		HashSet<String>	set	=	new HashSet<String>();
		HashSet<Integer>set2	=	new HashSet<Integer>();
		
//		set.add("1");
//		set.add("2");
//		set.add("3");
//		set.add("4");
//		set.add("1");
		//set2.add(5);
//		
//		System.out.println(set);
//		
//		set2	=	new HashSet<Integer>();
		for(int i = 0; set2.size()<6; i++) {
			int num	=	(int)(Math.random() * 45) + 1;
			System.out.println(i);
			set2.add(num);
			System.out.println(set2);
			
		}
		System.out.println(set2);
		
		List<Integer>	li	=	new LinkedList<Integer>(set2);
		Collections.sort(li);
		
		System.out.println(li);
//		Iterator<String> ir = set.iterator();
		
		
		
		
		
	}

}
