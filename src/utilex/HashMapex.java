package utilex;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>	map	=	new HashMap<Integer, String>();
		
		map.put(2, "임진제");
		map.put(3, "김동환");
		map.put(1, "조기제");
		map.put(4, "박동원");
		
		for(int i = 1; i<=map.size();i++) {
			System.out.println(map.get(i));
		}
		
		getMap(map);
		
	}

	static void getMap(Map map) {
		if(map != null) {
			Set<Integer> set	=	map.keySet();
			Object[] keys	=	set.toArray();
			for(int i = 0; i < keys.length; i++) {
				System.out.println(keys[i] + ":" + map.get(keys[i]));
			}
		}
	}
}
