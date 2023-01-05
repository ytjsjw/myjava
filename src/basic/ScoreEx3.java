package basic;
import javax.swing.JOptionPane;

public class ScoreEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 다중배열을 이용해서 3명의 성적관리 프로그램 생성
		 * 전체적인 조건은 다 같되, 한명당 모든 성적이 올바르지 않을 경우엔 다음 사람의 성적이 입력되면 안됨
		 * 
		 * 출력시 첫번째 사람은 철수, 다음은 영희 다음은 순애로 지정하여 예시처럼 출력
		 * 철수님의 총점 : ? 평균 : ?
		 * 단 이름값은 입력받지 않음
		 * 
		 */
		
		//My logic
		String	stdName[]	=	new	String[] {"철수","영희","순애"};
		String	gakName[]	=	new	String[] {"국어","영어","수학"};
		int[][]	stdScor		=	new	int[3][4];
		float[]	avgs		=	new float[stdScor.length];

		//위 두개의 배열을 이용해서 구현..총점과 평균을 출력
		
		for(int i = 0; i < stdName.length; i++) {
			
			for(int j = 0; j < gakName.length; j++ ) {
			
				do {
					stdScor[i][j]	=	Integer.parseInt(JOptionPane.showInputDialog(stdName[i]+ gakName[j] + " 점수 입력 하세요"));
				}while(stdScor[i][j] < 0 || stdScor[i][j] > 100);

				stdScor[i][stdScor.length]	+=	stdScor[i][j];
			}
			

			avgs[i]	=	(float)(stdScor[i][stdName.length] / 3.0);
			
			System.out.println(stdName[i] + " 총점 : " + stdScor[i][stdScor.length] + ", 평균 : " + (Math.round(avgs[i])*100)/100 );
		}

//		//teacher
//		String	stdName[]	=	new	String[] {"철수","영희","순애"};
//		String	sub_name[]	=	new	String[] {"국어","영어","수학"};
//		int[][]	scores		=	new	int[3][4];
//		float[]	avgs		=	new float[stdScor.length];
//		int isCorrect		=	-1;
//		
//		for(int i = 0; i<scores.length; i++) {
//			
//			for(int j = 0; j<scores[i].length - 1; j++) {
//				do {
//					if(isCorrect != -1) {
//						JOptionPane.showMessageDialog(null, "틀렸습니다.");
//					}
//					scores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(sub_name[j] + "점수입력"));
//					isCorrect++;
//				}while (scores[i][j] < 0 || scores[i][j] > 100);
//				isCorrect	=	-1;
//				
//				scores[i][scores.length] += scores[i][j];
//				}
//				avgs[i] = (float)(scores[i][scores.length] / 3.0);
//			}
		
		
	}

}
