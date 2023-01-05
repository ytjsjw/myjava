package basic;
import javax.swing.JOptionPane;

public class Stu_Score1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myName	= JOptionPane.showInputDialog("이름을 입력 하세요");
		int	p_kuk	=	Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력 하세요"));
		int	p_eng	=	Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력 하세요"));
		int	p_su	=	Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력 하세요"));
		
		int		sum		=	p_kuk + p_eng + p_su;
		double	avg;
		
//		avg	=	(float)sum/3;
		avg =	(double)sum/3.0;
		
		JOptionPane.showMessageDialog(null, myName + "님 당신의 성적은 아래와 같습니다.\n 총점 :" + sum + "\n 평균 :" + avg);
		//JOptionPane.showMessageDialog(null, "총점 : " + sum);
		//JOptionPane.showMessageDialog(null, "평균 : " + avg);

//		System.out.println("" + myName + p_kuk + p_eng + p_su);

	}

}
