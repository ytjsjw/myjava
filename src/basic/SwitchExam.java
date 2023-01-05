package basic;
import javax.swing.JOptionPane;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바에서 switch~case 구문의 조건값으로는 int 이하만 된다
		 * 반드시 기억
		 */

		String	msg			=	"";
		String	a			=	"a";
		int		continu_yn	=	0;
		int		cal_yn 		=	JOptionPane.showInternalConfirmDialog(null, "계산기를 실행하시겠습니까?");

		if(cal_yn != 0) {
			msg	=	"좋은 하루 되세요.!!!";
			System.out.println(msg);
			System.exit(0);
		}

		while(continu_yn == 0) {
			double	result 	=	0;
			int		input1	=	Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자 입력 하세요"));
			char	yon		=	JOptionPane.showInputDialog("연산자입력").charAt(0);
			int		input2	=	Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자 입력 하세요"));
		
			switch (yon) {
			case '+':	result	=	input1	+	input2;
				break;
			case '-':	result	=	input1	-	input2;
				break;
			case '*':	result	=	input1	*	input2;
				break;
			case '/':	result	=	input1	/	input2;
				break;
			
			default:
				msg	=	"장난";
				break;
			}
		
			if(!msg.equals("")) {
				JOptionPane.showMessageDialog(null, msg);
//			System.exit(0);  //프로그램종료
				return;   //main 종료
			}
		
			System.out.println("" + input1 + " " + yon + " " + input2 + " = " + result);

			continu_yn		=	JOptionPane.showInternalConfirmDialog(null, "계산기를 계속 실행하시겠습니까?");
			if	(continu_yn != 0) {
				System.out.println("좋은 하루 되세요!!!!");
				System.exit(0);
			}
		}
		
	}
}
