package langEx;

import javax.swing.JOptionPane;


public class quizeStringEx {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 사용자의 이메일 입력 받아서 조건에 맞게 출력
		 * 
		 * 1.ID(Email)입력하세요
		 * 2.입력 후 빈 문자열인지 검사
		 * 3. 빈 문자열이 아닌 경우 아래처럼 검사
		 * 3_1. ID와 서버로 분리하여 ID를 검증(idValidate())하시는데
		 * 길이는 8~12자 사이여야하고, 반드시 첫자는 대문자 여야 함
		 * 또한 ID 중에는 받드시 숫자가 하나 이상 이어야 합니다.
		 * 만약 위위 조건이 틀린경우, 뭐가 틀렸는지를 메세지 띄우고, 모두 정상이면
		 * 사용자에게 로그인 되었습니다.라고 출력
		 */
		boolean	conYn	=	true;
		String	msg;
		
		while (conYn) { 
				String	inputId	=	JOptionPane.showInputDialog("ID(Email)을 입력하세요!!!");

			if (inputId == null) {
				msg	=	"종료합니다.!!!";
				conYn	=	errMsg(msg,"Y");
			}else {
				if (inputId.isEmpty()) {
					msg	=	"ID(Email)을 입력하지 않으셨습니다.";	
					conYn	=	errMsg(msg,"N");
				}else {
					String	id	= inputId.substring(0,inputId.indexOf('@'));
					
					if	( id.length() < 8 || id.length() > 12 ) {
						msg	=	"입력하신 ID은 받드시 8~12사이여야 합니다.";	
						conYn	=	errMsg(msg, "N");
					}else {
							String	firU	=	id.substring(0,1);
							System.out.println("========1");
					
							if (firU.toUpperCase() == id.substring(0,1)) {
//							if ( firU.Equals(firU.toUpperCase()) ) {
								System.out.println("========2");
								
								// 숫자하나이상
								if (!(id.matches(".*[0-9].*"))){
									msg	=	"ID는 적어도 숫자가 하나이상 이어야 합니다.";	
									conYn	=	errMsg(msg,"N");
								}else {
									msg	=	"로그인 되었습니다.";
									conYn = errMsg(msg, "Y");
								}
							}else {
								msg	=	"입력하신 ID의 첫자는 대문자여야 합니다.";	
								conYn	=	errMsg(msg,"N");
								System.out.println(conYn);
							}

					}			

				}
			}
		}
		

	}
	
	static boolean	errMsg (String msg, String conYn) {
		JOptionPane.showMessageDialog(null, msg);
		if (conYn.equals("N")) {
			return	true;
		}else return false;
	}

}
