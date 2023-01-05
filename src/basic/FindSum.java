package basic;
import javax.swing.JOptionPane;

public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	fir	=	Integer.parseInt(JOptionPane.showInputDialog("시작 수를 입력 하세요"));
		int	sec	=	Integer.parseInt(JOptionPane.showInputDialog("종료 수를 입력 하세요"));
		int	sum	=	0;
		
		int	gap	=	fir	-	sec;
	
//		int temp;  //아래 if 대체 
//		if(fir >= sec) {
//			temp	=	fir;
//			fir		=	sec;
//			sec		=	temp;
//		}
		
		if	(gap < 0) {
			for(int i = fir; i <= sec; i++) {
				sum	=	sum + i;			}
		}else {
			for(int i = fir; i >= sec; i--) {
				sum	=	sum + i;
			}
		}
		System.out.println("누적 합 : " + sum);
	}
}
