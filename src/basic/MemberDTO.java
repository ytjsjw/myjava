package basic;
import javax.swing.JOptionPane;

public class MemberDTO {
	
	private	String	mem_Email;
	JOptionPane input;
	GawiGame game;
	MemberDTO member;
	
	String	member_Email;
	
	public	MemberDTO() {
		inputEmail();
	}
	
	//메서드 리턴을 void로 했는데, 예시 끝난 후 로직상 변경해야 할 겁니다.
	public void inputEmail() {
		
		this.mem_Email = input.showInputDialog("Email을 입력 바랍니다.");
//		semMember(this.member);
				
	//	System.out.println("메일: " + this.member  + "변수메일 :" + this.mem_Email);
		
		member_Email	=	getMem_Email();
//		game = new GawiGame(this.getMember());
		game = new GawiGame(this);
			
		
		//new ShowStat().showStatMethod(getMember(),game.win,game.loss,game.playCount);
	}
	
	
	public void semMember(MemberDTO member) {
		
		System.out.println("---->>>>>>" + member);
		this.member = member;
	}
	public MemberDTO getMember() {
		return this.member != null ? member : null;
	}
	
	public String getMem_Email() {
		return mem_Email;
	}
   
}
