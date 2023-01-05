package oopExDay1;

public class StaticExam {

//	static	int	a;
	static	final int	a;
	int	b; //멤버필드
	
	static	void	showA() {
	}
	void	showB() {
		System.out.println("멤버필드 b값 "+ this.b);
	}
	
	static {
		a	=	10;
		System.out.println("static 블락호출됨..");
		System.out.println("static의 값 : "+ a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 메서드 호출됨...");
	}

}
