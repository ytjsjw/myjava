package basic;


import javax.swing.JOptionPane;

public class GawiGame {

	JOptionPane thePane;
	String userinput;
	String com;
	String	msg;
	int playCount;
	int win;
	int loss;
	String[] theMessage;
	boolean isCorrect;
	MemberDTO member;
	
	public GawiGame(MemberDTO member) {
		
		int		gameStart	=	thePane.showInternalConfirmDialog(null, "게임하실래요");
		
		
		if(gameStart != 0) gameExit(member);
		
		msg	=	"게임을 시작 합니다.!!!";
		System.out.println(msg);

		theMessage = new String[] { "가위(1), 바위(2), 보(3) 중 하나 입력하세요" };
		showMenu(member);
	}

	private void showMenu(MemberDTO member) {
		while(!isCorrect) {
			
			userinput = thePane.showInputDialog(theMessage[0]);
			playGame();
			int		gameStart	=	thePane.showInternalConfirmDialog(null, "계속 게임하실래요 ?");
			

			if(gameStart != 0) {
				gameExit(member);
				isCorrect = true;
			}else isCorrect = false;
		}

	}

	private void playGame() {
		
		int	matchValue;
		boolean	cntStu	=	false;
		matchValue	=	setRandom();
		
		
		if (this.userinput == null) gameExit(member);
		if (this.userinput.equals("1") || this.userinput.equals("가위")) {
			if(matchValue == 1) cntStu	=	true;
			setCount(cntStu);
		} else if (this.userinput.equals("2") || this.userinput.equals("바위")) {
			if(matchValue == 2) cntStu	=	true;
				setCount(cntStu);
		} else if (this.userinput.equals("3") || this.userinput.equals("보")) {
			if(matchValue == 3) cntStu	=	true;
				setCount(cntStu);
		} else {
			thePane.showMessageDialog(null, "잘못된 값입니다. 재입력 바랍니다.");
			showMenu(member);
		}
		
	}

	public	void	gameExit(MemberDTO member) {
		msg	=	"게임을 종료 합니다..!!!";
		new ShowStat().showStatMethod(member,getWin(),getLoss(),getPlayCount());
	}
	
	public	int setRandom() {
		int max	=	3, min	=	1, matchValue = 1;
		matchValue = (int)(Math.random() * (max-min)) + min;
		return matchValue;
	}
	
	public	void setCount(boolean cntStu) {
		if(cntStu) {
			this.win++;	
		}else {
			this.loss++;
		}
		this.playCount++;
	}
	
	public int getLoss() {
		return this.loss;
	}
	public int getWin() {
		return this.win;
	}
	public int getPlayCount() {
		return this.playCount;
	}

}
