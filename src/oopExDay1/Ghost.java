package oopExDay1;

public class Ghost extends Terran implements GhostAbility {

	private	String	name;
	private	String	rank;
	private	int		hp;
	private	int		damage;
	
	
	public Ghost(String name, String rank, int hp, int damage) {
		
			super("고스트");
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
				if(this.hp == 40) {
					return;
				}
				Thread.sleep(1000);
				this.hp += hp;
				System.out.println(this.name + this.rank + " 이 치료를 받고 있습니다.");
				System.out.println("+" + hp + " 증가");
			}
		}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("GoGoGo!!!");
	}

	@Override
	public void attack(String taget) {
		// TODO Auto-generated method stub
		System.out.println(super.getTheUnit() + "이 딱총을 쏘며 " + taget + " 을 공격합니다.");
	}

	@Override
	public void nuclearLaunch(int x, int y) {
		System.out.println("핵폭잔 발사됨...좌표는 [" + x);
		
	}


}
