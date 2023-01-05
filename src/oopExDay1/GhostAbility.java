package oopExDay1;

public interface GhostAbility extends Attackable, Moveable {

	//자신몸체 안보이게하고 레이져로 유도해 몰래 적진에 핵 폭탄을 유도하는 기능
	
	void nuclearLaunch(int x, int y);
	
}
