package basic;
import javax.swing.JOptionPane;

public class QuizUserMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int	x	=	0;
		
		while(true) {
			String	choice	=	JOptionPane.showInputDialog(null, "1.최대값 2.사이합 3.수나열 4.종료");
			
			if(choice == "" || choice == null) System.exit(0);
			
			x	=	Integer.parseInt(choice);
			
						
			if(x == 1) {
				//결과를 return 해주는 메서드를 호출하여 값 출력할 수 있도록 메서드 정의
				int	res	=	max();
				System.out.println("두 수중 최대수는 : " + res);
			}else if(x == 2) {
				sum2Values();// 정의하세요
			}else if(x == 3) {
				int	firstSu	=	Integer.parseInt(JOptionPane.showInputDialog("첫수 입력"));
				int	secSu	=	Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력"));
				int	thirdSu	=	Integer.parseInt(JOptionPane.showInputDialog("세번째수 입력"));
				
				// 아래의 메서드 정의하세요
				String	str	=	printNumSequence(firstSu, secSu, thirdSu);
				
				JOptionPane.showConfirmDialog(null, "큰 순으로 나열은 \n" + str);
			}else if(x == 4) {
				break;
			}else {
				JOptionPane.showConfirmDialog(null, "잘못입력 했습니다.");
				break;
			}
			System.out.println();
		}
	}

	static int max() {
		int	firstSu	=	Integer.parseInt(JOptionPane.showInputDialog("첫수 입력"));
		int	secSu	=	Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력"));

		if(firstSu > secSu) return	firstSu;
		
		return	secSu;
		
	}

	static	void sum2Values() {
		int	firstSu	=	Integer.parseInt(JOptionPane.showInputDialog("첫수 입력"));
		int	secSu	=	Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력"));
		int	temp	=	0;
		int	sum		=	0;
		
		if((firstSu - secSu) > 0) {
			temp	=	firstSu;
			firstSu	=	secSu;
			secSu	=	temp;
		}
		
		for(int i = firstSu; i <= secSu; i++) {
			sum	= sum +	i;
		}

		JOptionPane.showConfirmDialog(null, "사이 합 : " + sum);
	
	}
	
	static String printNumSequence(int firstSu, int secSu, int thirdSu) {
		String	retstr 	=	"";
		int		temp	=	0;
		
			if(secSu >= firstSu && secSu >= thirdSu) {  //무조건 두번째 값이 클경우
				temp   = firstSu;
				firstSu = secSu;
				secSu = temp;
				
			}else if( thirdSu >= firstSu && thirdSu >= secSu) {  //무조건 세번째 값이 클 경우
				temp   = firstSu;
				firstSu = thirdSu;
				thirdSu = temp;
			}
			
			if(thirdSu >= secSu) {
				temp	=	secSu;
				secSu	=	thirdSu;
				thirdSu  =	temp;
			}		
			
			retstr = "" + firstSu + secSu + thirdSu; 
		return	retstr;
	}
	
}

