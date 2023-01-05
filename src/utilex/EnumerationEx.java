package utilex;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String>	v=	new Vector<String>();
		v.add("hi");
		v.add("hello");
		v.add("world");
		v.add("java");
		v.add("program");
		
		
		printToEnumeration(v.elements());
	}

	private static void printToEnumeration(Enumeration<String> elements) {
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
	}
	
	
}
