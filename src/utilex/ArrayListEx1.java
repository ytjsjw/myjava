package utilex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * ArrayList : 순서 유지, 중복 허용하는 List type의 대표적 클래스
 */
public class ArrayListEx1 {

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 --> " + list1);
		System.out.println("list2 --> " + list2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List  list1	=	new	ArrayList();
		ArrayList list2 = new ArrayList();
//		Collection	list3	=	new	ArrayList();
		

		list1.add("a");
		list1.add("b");
		list1.add("c");
		
//		list2.add(new Integer(1));
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(2);
		list2.add("1");

		print((ArrayList)list1, list2);
	
		
		
		
		//list2의 일정부분 분리해서 새로
//		ArrayList list3	=	(ArrayList)list2.subList(1, 4);
		ArrayList list3	=	new ArrayList(list2.subList(1, 4));

		print(list2, list3);
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list2, list3);

		list2.set(3,"KKK");
		print(list2, list3);

		//retainAll	--> 겹치는 부분만 남기고 삭제
		list2.retainAll(list3);
		print(list2, list3);

		Collections.sort(list2);
		Collections.sort(list3);
		print(list2, list3);
		
		//특정 list가 값으로 존재하는지 알아봄
		System.out.println(list2.containsAll(list3));
		
		//특정 객체가 존재하는지 알아보기
		System.out.println(list2.contains(2));
		System.out.println(list2.indexOf(2));
		
		//get(), remove()를 이용해서 Element삭제하기
		for	(int i= list3.size()-1; i>=0; i-- ) {
			if(list2.contains(list3.get(i))) {
				list2.remove(i);
			}
		}
		
		print(list2, list3);
		
		
		
	}

}
