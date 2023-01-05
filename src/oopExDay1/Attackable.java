package oopExDay1;

public interface Attackable {

	//공격 기능 선언
	void	attack(String taget); //잠정적으로 public abstract void attack(String taget);과 같음
	                              //interface는 제한없이 기능 사용 (추상 메서드와 같은 기능: 상속을 목적으로 생성자 없이
	                              //필드와 메서드 상속)
	
}