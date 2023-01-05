package basic;
import javax.swing.JOptionPane;

public class ScoreEx1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int	kuk = 0, eng = 0, mat = 0, sum = 0;
		char	hak = 'F';
		double	avg = 0;
		boolean	con_yn	=	true;

		do {
			kuk	=	Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력 하세요"));
			if (kuk >= 0 && kuk < 100) con_yn = false;
		}while(con_yn);
		
		do {
			eng	=	Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력 하세요"));
			if (eng >= 0 && eng < 100) {
				con_yn = false;
			}else	con_yn = true;
		}while(con_yn);

		do {
			mat	=	Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력 하세요"));
			if (mat >= 0 && mat < 100) {
				con_yn = false;
			}else con_yn = true;
		}while(con_yn);

		sum	=	kuk + eng + mat;
		avg	=	sum / 3.0;
		
//		if ( avg >= 90 ) {
//			hak	=	'A';
//		}else if( avg >= 80 && avg < 90 ){
//			hak	=	'B';
//		}else if( avg >= 70 && avg < 80 ){
//			hak =	'C';
//		}else 	hak	=	'F';
//		

		switch((int)(avg/10)) {
		case	10:
		case	9:
			hak	=	'A';
			break;
		case	8:
			hak	=	'B';
			break;
		case	7:
			hak	=	'C';
		break;
		}
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg + " 학점 : " + hak);
	}

}
