package oopExDay11;

public class Parent {

	private	String	faNm;
	private	String	fajob;
	
	public Parent(String faNm,	String fajob) {
		this.faNm	=	faNm;
		this.fajob	=	fajob;
	}
	
	public void dojob() {
		System.out.println("직업은 " + this.fajob + " 입니다.");
	}

}
