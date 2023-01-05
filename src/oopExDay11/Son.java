package oopExDay11;

public class Son extends Parent{

	private	int		s_Age;
	private	String	s_Addr;
	private	String	s_Nm;
	private	String	s_job;
	
	public Son(String name, int age, String job, String addr) {
		super("미국ja", "taxiDriver");
		this.s_Nm	=	name;
		this.s_job	=	job;
		this.s_Age	=	age;
		this.s_Addr	=	addr;
	}
	
	public void dojob() {
		System.out.println("직업은 " + this.s_job + " 입니다.");
	}
	
}
