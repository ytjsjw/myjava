package basic;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	i	=	0;
		do {
			i++;
			System.out.println(i);
		}while(i < 5);
	}
	/*
	 * do~while 을  이용해서 아래조건으로 구현
	 * 
	 * 클래스명 ScoreEx1
	 * 학생의 성적을 입력받아 출력
	 * 1.과목은 국,영,수
	 * 2. 각 과목의 점수는 0~100사이만
	 * 3. 올바르지 않은 점수 입력시 재입력 받도록 즉 다음 과목의 점수를 입력받는 로직으로 넘어가면 안됨.
	 * 4. 모든 과목이 올바르게 입력되면 아래처럼 출력
	 * 5. 총점 : 몇점, 평균 : ?.? 학점 A,B,C or F'
	 * 6. 학점의 기준은 90이상은 A, 80~89까지 B, 70~79 까지 C, 나머진 F
	 * 7. 참고로 위 학점을 계산하려면 평점을 구해서 하는게 편함
	 * 8. 평점은 평균을 10으로 나눠서 계산
	 */
}
