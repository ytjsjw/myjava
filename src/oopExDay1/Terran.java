package oopExDay1;

public abstract class Terran {
//public final class Terran {
	
	/*
	 * final키워드 : final은 클래스,멤버필드,메서드,메서드파라메터,메서드 바디내 어디에도 사용될 수 있다.
	 * 
	 * 이름에서 알수 있듯이 final키워드 뭔가를 고정 시키는 역할 함
	 * z
	 */
	
	/*
	 * 테란이라는 유닛은 실제 존재하지 않기에 이 클래스에는 테란 유닛이 발생시 어떤 유닛인지를 판별(마리,파이어벳등)하는
	 * 속성 하나만 선언
	 * 
	 * 메서드 또한 건물을 제외한 모든 유닛들이 가지는 속성
	 */
	
	/*
	 * 자바추상화(Abstraction): 자바 추상화란 특정 메서드가 자신을 위한것이 아닌, 오로지 상속만을 위한
	 * 것으로 생각될 때, 해당 메서드를 추상화할 수 있다.
	 * 이렇게 추상화 된 메서드를 추상메서드라 하고, 이메서드는 abstract라는 키워드를 통해 선언함
	 * 이렇게 클래스내에 추상 메서드가 하나이상 포함되면 해당 클래스는 명시적으로 추상 클래스로 선언되어야한다
	 * 
	 * 이렇게 추상 메서드로 선언된 클래스는 그 이후부터 절대 자신의 인스턴스를 생성할 수 없다.
	 * 하지만 상속 및 다형성등은 그대로 유지할 수 있습니다.
	 * 
	 * 참고로 자신으 인스턴스를 못 만든다는 말은 생성자를 정의할 수 없다는 뜻이 아님
	 * 생성자가 없으면 자식 인트턴스도 못 만드니 당연히 상속도 못함
	 * 따라서 자산의 인스턴스를 못 만들뿐 나머지는 모두 같음
	 * 또한 추상 클래스를 상속받은 자식 믈래스는 부모가 선언한 추상 메서드를 명시적으로(무조건) 오버라이드 해야한다
	 */
	
	public String theUnit;//생성된 유닛이 어떤 애인지 알려주는 속성
//	private String theUnit;//생성된 유닛이 어떤 애인지 알려주는 속성
	
	//내 자식 객체가 생성시에 타입을 초기화 하기 위해 생성자 정의
	public Terran(String theUnit) {
		this.theUnit	=	theUnit;
	}

	
	//모든 유닛은 기본적으로 소리로 리액션할 수있도록 상속 목적을 sound()에서드 정의
	//이 메서드는 Terran
	public abstract void sound();
	
	
	//해당 유닛이 어떤 유닛인지 타입을 문자열로 리턴하는 toString()정의
	public String toString() {
		return "이 유닛은 " + theUnit;
	}
	
	//이 메서드는 객체의 타입값을 리턴해주도록 정의
	public String	getTheUnit() {
		return	theUnit.substring(theUnit.lastIndexOf(""));
	}
}
