package utilex;

import java.util.StringTokenizer;

public class StTokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	msg	=	"Hell,java,world/jsp";
		
		StringTokenizer st	=	new StringTokenizer(msg,",&/");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			String	s = st.nextToken();
			System.out.println(s);
		}
	}

}
