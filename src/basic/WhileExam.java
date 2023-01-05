package basic;
import javax.swing.JOptionPane;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean	flag	=	false;
		int		a		=	1;
		
		Outer:while(a <= 5) {
			a++;
			System.out.println("while 실행");
			inner:while(true) {
				int y = JOptionPane.showConfirmDialog(null, "Continue");
				if(y == 1 || y == 2) {
							System.out.println("Label을 이용해서 while을 끝냅니다.");
							break Outer;
						}
			}
		}
		System.out.println("현재 a의 값 : " + a);
	}

}
