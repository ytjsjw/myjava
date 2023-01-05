package oopExDay1;

public class InheritanceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Parent, Son, Sister 클래스를 정의
		 * Parent 클래스는 이 가계도에서 시조 역할 ( 즉 성(Famil Name)이 처음 시작되는 시점 )
		 * 클래스 정의시 필드로 familyName : String을 정의
		 * 자신을 포함 모든 자식들과 자손들 모두 성은 기본적으로 미국ja씨 입니다.
		 * 즉 Parent 부터 Sister까지는 객체화 될때 무조건 성은 미국Ja 입니다.
		 * 
		 * Parent에는 위 성을 초기화 하도록 필드 및 생성자를 정의 하시고, Parent의 직업은 taxiDriver입니다.
		 * 
		 * doJob()메서드를 정의 하시고, 메서드를 호출할때마다 내직업은 택시운전입니다가 나와야 함
		 * Son과 Sister는 Parent를 상속받고, 추가될 필드로는 나이,주소만 추가
		 * 
		 * 각 두 자년는 기본직업(즉 가업)도 상속 받는데, 각 직업이 부모와는 틀립니다.
		 * Son은 프로그래머, Sister는 웹디자이너 입니다.
		 * 
		 * 따라서 해당 두 자녀 클래스는 상속받은 메서드에 자신의 현재 직업이 출력되도록 오버라이드 해야 합
		 * 
		 * 또한 두 자년는 기본적으로 객체 생성시, 추가된 필드는 물론, 본인들의 성 또한 초기화 되도록 생성자도 정의 하세요
		 * 
		 * 모든 테스트는 IntroMyFam 클래스에 main()을 두시고, 각 개체 생성 및 메서드 호출등을 테스트하게 작업
		 * 
		 * 
		 */
	}

}
