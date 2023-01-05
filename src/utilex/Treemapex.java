package utilex;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;


/*
 * 이진 트리기반 맵, 키와 벨류를 같이 저장하는 건 같음. 단 키를 기준으로 자동 정렬됨
 * 검색관련 메서드는 해당 트리맵 클래스에만 존재하기에, 이메서드를 활용하기 위해선 다형성으로 생성불가
 */
public class Treemapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tm	=	new TreeMap<String, Integer>();
		
		tm.put("orange", 100);
		tm.put("strawberry", 1000);
		tm.put("banana", 200);
		tm.put("kiwi", 700);
		tm.put("태종", 99);
		tm.put("철민", 100);

		//기본적으로 정렬된 크리 출력해보기
		
		Set	entrySet	=	tm.entrySet();
		System.out.println(entrySet);

	//	Set<Entry<String, Integer>>entrySet2	= tm.entrySet();
		
		//특정키에대한 정보 알아오기
		Entry<String, Integer>	entry	=	null;
		
		entry	=	tm.firstEntry();
		System.out.println(entry.getKey() + " : " + entry.getValue() );
		
		
		NavigableMap<String, Integer>	descMap	=	tm.descendingMap();
		Set<Entry<String, Integer>> descSet	=	descMap.entrySet();
		
		System.out.println("+++++++" + descSet);
		for(Entry<String, Integer> e: descSet) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
	}

}
