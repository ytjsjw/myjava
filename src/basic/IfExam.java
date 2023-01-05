package basic;
import javax.swing.JOptionPane;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건식을 이용해서 아래 로직 완성
		/*
		 * 수 3개 입력 받음
		 * 출력 결과는 가장 큰 수 부터 출력
		 * ex> 4, 1001, 985 --> 결과 : 1001 >= 985 >= 4
		 */
		
		int	input1	=	Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자 입력 하세요"));
		int	input2	=	Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자 입력 하세요"));
		int	input3	=	Integer.parseInt(JOptionPane.showInputDialog("세번째 숫자 입력 하세요"));
		
		int	temp = 0;
		
		if(input2 >= input1 && input2 >= input3) {  //무조건 두번째 값이 클경우

			temp   = input1;
			input1 = input2;
			input2 = temp;
			
		}else if( input3 >= input1 && input3 >= input2) {  //무조건 세번째 값이 클 경우
			temp   = input1;
			input1 = input3;
			input3 = temp;
		}
		
		if(input3 >= input2) {
			temp	=	input2;
			input2	=	input3;
			input3  =	temp;
		}
		System.out.println("결과 : " + input1 + " >= " + input2 + " >= " + input3);
	}

}
