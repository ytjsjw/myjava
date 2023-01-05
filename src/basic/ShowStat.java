package basic;

import javax.swing.JOptionPane;

public class ShowStat {
	
	
	void showStatMethod(MemberDTO member, int getWin, int getLoss, int getPlayCount){
		JOptionPane.showMessageDialog(null, member.getMem_Email() + "님, 지금 까지 전적은" + getWin + " 승" +
				getLoss + " 패" + "총 전적 : " + getPlayCount);
		
		System.exit(0);
	}
}
