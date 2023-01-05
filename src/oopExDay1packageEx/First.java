package oopExDay1packageEx;

public class First {
	
//	Marine[] m;
//	Magic	medic;
//	JOptionPane	thePane;
	/*
	 * 접근제어자(AccessModifier): 접근제어자는 public > protected > default > private 순
	 * 사용범위는 클래스( public or default )
	 * 필드, 생성자, 메서드(4개 모두)
	 * 
	 * 접근제어자를 선언하지 않을시 컴파일러는 기본적으로 default(이름없는) 접근제어자를 넣어줌
	 * 
	 * public		: 패키지 구분없이 모두에게 참조 가능한 형태를 뜻하며
	 * protected 	: 같은 패키지내에선 접근 가능, 다른 패키지에서는 상속받은 자식 클래스만 가능
	 * default		: 같은 패키지에서만 가능
	 * private		: 오로지 자신 클래스만 가능
	 * 
	 */
	public String name;
	protected	String	addr;
	String	password;
	
	//이 생성자는 public이기에 다른 패키지에서도 호출 가능함
//	public	First() {
//		
//	}
	
	//이 생성자는 protected 이기에 같은 패키지에서는 호출 가능, 다른 패키지에선 오로지 자긱 
	public	First(String name) {
		this.name =name;
	}
	
	First(String addr, String password){
		this.addr =addr;
		this.password = password;
	}
	
	
	public void setName(String name) {
		this.name	=	name;
	}
	
	protected void	setAddr(String	addr) {
//		this.addr			
	}
	
	
	public	static void main(String[] args) {
			
	}
}
	

