package oopExDay1;

public class StarCraft {
	
	public static void main(String[] args) throws InterruptedException {
	//마린 틀래스를 정의 했기 때문에 객체를 만들고 싶은 만큼 생성할 수 있다
	//객체 생성 코드는 ClassName ref변수 = new ClassName(); 처럼할 수 있다
		
//	Terran terran = new Terran("마린");	
	
//	Terran marine	=	new Marine("Jason","이병", 60, 60);
//	Terran firebet	=	new FireBet("불추장","하사", 60, 60);
//	Terran magic	=	new Magic("간호사","일병", 50, 0);
//
//	
//	marine.sound();
//	firebet.sound();
//	magic.sound();
//	
//	((Marine)marine).move(20,30);  // (Marine)marine.move(20,30)는 연산자 우선순위에따라 .연산이 먼저 이루어져서
//	                               // Terran class에서 move를 찾는데 해당 메서가가 없어서 에러
//	                               // 그러므로 마린클래스로 케스팅을 ()연산자로
	
	Marine m1	=	new	Marine("Janson", "이등병", 60, 30 );   //Instance화 하는 단계 즉, 객체를 생성하는 코드
//									//해서 정확한 문법적 표현은 Instantiation이라고 한다.
//									//위에서 Marine()이 호출된 이후엔 Marine클래스의 인스턴스가 생성되고
//	                                //해당 인스턴스는 JVM이 관리하는 Heap메모리 영역에 저장되어짐.
////	Marine m2	=	new	Marine("Jackson", "일병", 35, 30);
////	
////	m1.move(20,30);
////	m2.getHealing(1);
////	//private 속정 즉 은닉(hidden) 정보를 직접 접근하여 에러 발생
//////	m1.name = 	"Jason";
//////	m1.hp	=	40;
//////	m1.name = 	"Jakson";
//////	m1.hp	=	40;
//////	
////	System.out.println(m1);
////	System.out.println(m2);
//	
	FireBet	f1	=	new FireBet("꼬추장","상병", 60, 80);
	Magic	md1	=	new Magic("꼬추장","하사", 60, 0);
	
	
	/*
	 * 부모에게 상속받은 메서드의 내용부만 재정의 해서 자식에 맞게 정의한 것을 객체지향에선 메서드 오버라이드(Override)라고함
	 * 반드시 지켜야할 조건 : 접근 제어자는 부모보다 같거나 커야하며, 리턴타입, 시그니쳐는 반드시 동일해야 함
	 */
	
//	System.out.println(m1.toString());  //marine의 toString메서드 실행(부모(Terran)의 toString이 가려짐)
//	System.out.println(f1.toString());  //부모(Terran)의 toString메서드 실행
//	System.out.println(md1.toString());
//
//	m1.sound();
//	f1.sound();
//	md1.sound();

//	md1.healing("마린");
	
	Terran[]	allUnit	=	{m1,f1,md1};
	
	for(int	i	=	0; i < allUnit.length; i++) {
		
		Terran	theUnit	=	allUnit[(int)(Math.random()* allUnit.length)];
		
//		theUnit.sound();
		
		//만약 리턴되는 인스턴스가 메딕이라면, "마린"을 치료토록 해보세요
		//즉 healing("마린")을 호출하세요
		
		if (theUnit instanceof Magic) {
			((Magic) theUnit).healing("마린");
		}
		
		if(theUnit instanceof Marine)
			((Marine)theUnit).move(300,300);
		else if(theUnit instanceof FireBet) {
			((FireBet)theUnit).move(300,300);
		}else {
			Magic m = (Magic)theUnit;
			m.move(300,300);
			m.healing("마린");
		}
		
		
	//(	theUnit).move(300,300);
	}
	
	/*
	 * 객체지향의 다형성(Polymorphism): 다형성이란, "상속"관계에서 생성된 인스턴스 Ref하는 형태가 다양하게 변경될 수있다는 뜻
	 * 즉 우리가 Ptype에 배웠던 프로모션, 케스팅과 같다.
	 * ( 프로모션 : 
	 * 상속관계에서 자식의 인스턴스를 생성 또는 이미 생성된 인스턴스를 Ref할 때 부모타입으로 가능한데, 이때 생성된 인스턴스는
	 * 해당 클래스의 생성자를 호출하여 생성되었기에 메모리에서 사라지기 전까지는 인스턴스 타입은 불변(꼭 기억)
	 * 
	 * 하지만 해당 인스턴스를 Ref한 타입 변수는 부모 타입이기에 Ref타입은 부모타입으로 변경되어지게 됨.
	 * 하지만 인스턴스에만 정의된 메서드를 호출하게 될시에는 컴파일 에러가 유발됨
	 * 이유는 Ref하는 변수 타입에는 해당 내용이 없기 때문
	 * 
	 * 이렇게 다형성을 구현하는 이유는 상속 관계에서 자식들이 상속받은 메서드를 자신의 목적에 오버라이드 했을경우, 어떤 
	 * 타입이건 상관없이 동일하게 부모 타입으로 Ref해서 오버라이드된 메서드를 호출할 때, 즉 메서드명은 하나로 통일하되,
	 * 내용부는 인스턴스에 적용된 내용이 나오도록하는데 목적이 있음
	 * 
	 * 꼭 기억해야할 것은 부모 타입으로 Ref하던, 인스턴스를 생성하던, 생성된 인스턴스의 타입은 절대 불변이라는 것
	 * 
	 */
	
	
	}
}