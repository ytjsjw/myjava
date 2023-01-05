package langEx;

class	Value{
	int	value;
	
	public	Value(int value) {
		this.value	=	value;
	}
}

class	Person{
	long	id;
	
	public	Person(long id) {
		this.id	=	id;
	}
	
	//상속받은 equals()오버라이드하기
	@Override
	public boolean equals(Object obj) {
		//두 객체의 특정 값이 같은지 비교
		if(obj != null && obj instanceof Person) {
			return	id == ((Person)obj).id;
		}else return false;

	} 

}


public class ObjectExam {

	Person	p1	=	new	Person(12345);
	Person	p2	=	new	Person(12345);
	
	
	public String toString() {
		return "오버라이된 내용";
	}
	
	public static void main(String[] args) {

		Value	v1	=	new	Value(10);
		Value	v2	=	new	Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("같은 객체");
		}else	System.out.println("다른 객체");
		
		v1 = v2;

		if(v1.equals(v2)) {
			System.out.println("같은 객체");
		}else	System.out.println("다른 객체");

		
		ObjectExam	objex	=	new	ObjectExam();
		
		System.out.println(objex);
		
		System.out.println(objex.getClass().getName());
		
		System.out.println(Integer.toHexString(objex.hashCode()));
		
		System.out.println(objex.getClass().getName() + "@" + Integer.toHexString(objex.hashCode()));

	
	}

}
