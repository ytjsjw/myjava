package basic;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class JavaInputThingsEx3 {

	/*
	 * 사용자 입력을 GUI로 처리하는걸 배워봅니다.
	 */

	public static void main(String[] args) throws IOException {
		//JOptionPane 객체의 메서드를 이용해서 적절한 input GUI 생성하기.
		String fir = JOptionPane.showInputDialog("첫 수를 입력 하세요");
		int	p_fir	=	Integer.parseInt(fir);
		int	p_sec	=	(int)Double.parseDouble(fir);

		//컴폰 창
		JOptionPane.showInternalConfirmDialog(null, "확인할래");
		System.out.println(p_fir + 1);
		System.out.println(p_sec + 1);
		
		
		String	msg	=	"이건 알럿과 비슷";
		
		//첫번째는 나를 연 부모창의 객체를 주는데, 지금은 무시
		//두번째 파라미터 값은 문자열로 뿌려질 내용
		JOptionPane.showMessageDialog(null, msg);

		
		/*
		 * 클래스 명은 Stu_Score1
		 * 1. 프로그램이 시작하면 사람 이름 입력받기 (콘솔 or GUI)
		 * 2. 입력이 된 후엔 국어점수 입력하세요 라는 메세지 띄우고 값을 입력 받음
		 * 3. 다음엔 영어 점수 입력 하세요 후 2 번과 동일
		 * 4. 수학 점수 입력하세요 후 2번과 동일
		 * 5. 출력 결과는 아래와 같이
		 * 노재현님 !!! 당신의 성적은 다음과 같습니다.
		 * 총점 : ~점
		 * 평균 : ~점
		 * 
		 */
	}
}
