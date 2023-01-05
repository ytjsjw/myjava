package langEx;

public class stringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb	=	sb.append(new String(" Java World..일어..!!!").toCharArray());
		System.out.println(sb.capacity());
		sb.ensureCapacity(200);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		char[]	addMsg	=	"기지개좀 켜고".toCharArray();
		
		sb.insert(sb.indexOf("일어"),addMsg);
		System.out.println(sb);
		sb.setCharAt(0, 'k');
		System.out.println(sb);

		String	ss	=	sb.toString();
		System.out.println("ss : " + ss);
	}

}
