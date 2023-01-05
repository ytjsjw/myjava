package oopExDay1;

//이 클래스는 마린을 정의한 클래스
//클래스에는 3가지 정의 (속성,생성자,메서드)
//일반적으로 정의 순서는 위 순으로한다.

public class Marine extends Terran implements Attackable, Moveable  {  //클래스에는 public or default만 존재함.
	
    //public > protected > default > private ==> 접근제어자(Access Modifier)
	//속성정의//Fields  -->객체를 구성하는 속성..즉 객체속성 멤버필드
	private	String	name;
	private	String	rank;
	private	int		hp;
	private	int		damage;
	
	/*
	 * 생성자...생성자는 클래스가 인스턴스화 될때 JVM호출하는 일종의 메서드와 같은 코드
	 * 위처럼 메서드와 같다는 말은 ()를 가지고 있다는 말인데, 틀린점은 리턴타입을 선언해선 안되고(하면 메서드화 되버림),
	 * 생성자 명은 반드시 클래스명과 같아야 한다는 점
	 * 만약 생성자를 하나도 정의하지 않은 경우엔 컴파일시 컴파일러가 기본생성자(default)를 자동으로 클래스내에 넣어줌
	 * 하지만 하나라도 정의하면 컴파일러는 제공하지 않음
	 * 
	 *
	 */
	
	
//	public Marine() { //컴파일러가 넣어주는 기본 생성자가 어떤 역할를 하는지 코드로 정의
//		// TODO Auto-generated constructor stub
//		name	=	null;
//		rank	=	null;
//		hp		=	0;
//		damage	=	0;
//}

//	public Marine(String name) {
//		this.name	=	name;
//	}
//	
//	public Marine(String name, String rank) {
//
//		/*
//		 * 생성자 this([params]): 이미 정의된 생성자를 호출하는 코드
//		 * 파라미터는 옵션. 이렇게 호출하면 정의된 생성자가 호출되어지기 때문에 코드를 재 사용 가능
//		 * 단!!! this()는 무조건 생성자 첫 코드에서만 호출할 수 있고, 한번이상 사용안됨
//		 * this.name	=	name; ==> this(name);   위에 public Marine(String name)에 받은 name값을 넣어 호출
//		 */
//		this.name	=	name;
//		this.rank	=	rank;
//	}

	public Marine(String name, String rank, int hp, int damage) {
		super("테란");
		this.name	=	name;
		this.rank	=	rank;
		this.hp		=	hp;
		this.damage	=	damage;
	}
	
	public Marine() {
		super("테란");
		this.name	=	name;
		this.rank	=	rank;
		this.hp		=	hp;
		this.damage	=	damage;
	}
	
	//객체의 정보를 외부에 표시하는 interface역할을 하는 메서드 정의
	public String	toString() {
		return	super.toString() + "이름은 " + this.name + " 계급은 " + this.rank + " HP :" + this.hp + " damage : " + this.damage;
	}
	
	//이동하는 기능인 move메서드 정의
	public void move(int x, int y) {
		System.out.println(this.name + " 이 " + "[ " + x + "] , [" + y + "]로 이동했습니다.");
	}
	
	//치료받는 메서드 정의
	public void getHealing(int hp) throws InterruptedException {
		while(true) {
			
			if(this.hp == StrarUnitsProp.ALL_UNIT_DEATH_HP) {
				System.out.println("마린이 죽었습니다.");
			}
			if(this.hp == StrarUnitsProp.MARINE_MAX_HP) {
				return;
			}
			Thread.sleep(1000);
			this.hp += hp;
			System.out.println(this.name + this.rank + " 이 치료를 받고 있습니다.");
			System.out.println("+" + hp + " 증가");
		}
	}

	
	public void sound() {
		//impelents는 추상 메서드에 내용부{}를 정의한 형태
		//
		System.out.println("GoGoGo!!!");
	}

	@Override
	public void attack(String taget) {
		// TODO Auto-generated method stub
		System.out.println(super.getTheUnit() + "이 " + taget + " 을 공격합니다.");
	}

}
