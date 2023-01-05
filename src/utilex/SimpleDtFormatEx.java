package utilex;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * SimpleDateFormat : 가장 많이 쓰이는 날짜 포캣터
 * 지정된 Letter를 조합하여 Date객체를 format()에 파라미터를 넘기면 포맷대로 출력
 * Letter를 조합아여 만들걸 pattern 이라고하는데 이 패턴을 SimpleDateFormat의 생성자에 넘기면 그대로 포멧
 */
public class SimpleDtFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar	cal	=	Calendar.getInstance();
		
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		
		sdf1 	= new SimpleDateFormat("yyyy-mm-dd");
		sdf2	= new SimpleDateFormat("yy년 MMM dd일 E요일");
		
		//위 cal 객체를 Date 객체로 변환, format 파라메터로 넘긴다.
		System.out.println(sdf1.format(cal.getTime()));
		System.out.println(sdf2.format(cal.getTime()));
	}

}
