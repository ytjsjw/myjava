package oopExDay1;

import oopExDay1.TerranSteamPack.SteamPack;

//인터페이스의 강의 파일
public class Starcraft2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terran	marine	=	new	Marine("Janson", "이등병", 60, 30 ); 
		Terran  firebet	=	new FireBet("꼬추장","상병", 60, 80);
		Terran  magic	=	new Magic("꼬추장","하사", 60, 0);
		Ghost   ghost	=	new Ghost("닌자","하사", 60, 0);
	
		((Attackable)marine).attack("저그");
		((Attackable)firebet).attack("저그");

		((Moveable)marine).move(100,100);
		
		TerranSteamPack.SteamPack steamPack = new SteamPack(marine);
		TerranSteamPack.SteamPack steamPack2 = new SteamPack(firebet);
		
		steamPack.steamPack();
		steamPack.steamPack();
		
		//Ghost 유닛을 만든 후, 좌표 550, 350 지점에 핵폭탄을 유도해 보세요
		
		ghost.nuclearLaunch(550,350);
		
	}

}
