package basic;
import javax.swing.JOptionPane;

/*
	 * 국영수 세점수 받느건 같고, 다른 점수 시 해당 과목에 대한 입력이 반복 출력
	 * 모두 정상이면 , 출력결과는 아까와 같게
	 */
	

public class ScoreEx2ByArr {

	public static void main(String[] args) {
		
		int	score[] = new int[4]; //이 배열에는 각 과목의 점수와 총점도 int라 총점까지 넣도록 배열 생성
		
		//아래 배열은 메세지 출력시 과목명을 출력토록 한 것
		
		String	theMsg[]	=	{"국어","영어","수학"};
		float	avg			=	0F;
		char	hak			=	'F';
		//위 두개의 배열을 이용해서 구현..총점과 평균을 출력
		
		for(int i = 0; i < theMsg.length; i++) {
			
			do {
				score[i]	=	Integer.parseInt(JOptionPane.showInputDialog(theMsg[i] + "점수 입력 하세요"));
			}while(score[i] < 0 || score[i] > 100);

			score[3]	+=	score[i];
		}

		
		avg	=	(float)(score[3] / 3.0);
		
		
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
		System.out.println(Math.round(avg * 100)); 
		System.out.println("총점 : " + score[3] + ", 평균 : " + (Math.round(avg * 100)/100.0) + " 학점 : " + hak);
	}

}
