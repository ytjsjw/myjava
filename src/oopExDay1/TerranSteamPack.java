package oopExDay1;

//테란을 위한 Steampack 기능 선언

public interface TerranSteamPack {

	//인터페이스 내부에는 목적에 따라서 클래스를 정의 할 수 있음
	//이러한 클래스를 중첩(Nested)클래스라고 하는데, 추 후 설명
	//지금은 inner Class를 정의해서, 외부에서 해당 클래스를 객체화하여 구현할 수 있도록 할 예정
	//마린과 파이어벳과 스팀팩을 사용가능
	
	class SteamPack{
		Terran	terran;
//		public	SteamPack(Terran theUnit) {
//			if(theUnit instanceof Terran)
//				this.terran	=	theUnit;
//		}
		
		public	SteamPack(Terran theUnit) {
			if(theUnit instanceof Terran)
				this.terran	=	theUnit;
		}		
		
		public void steamPack() {
			System.out.println("스팀팩을 이용해서 공격...체력 10%, 공격력 +10%");
		}
	}
}
