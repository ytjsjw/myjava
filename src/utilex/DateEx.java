package utilex;

import java.util.Date;

/*
 * System.curruntTimemillis():시스템으로부터 현재 시간을 long으로 리턴
 * long은 MilliSecond을 뜻함
 */
public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.currentTimeMillis());
		Date now	=	new	Date();
		Date now2	=	new Date(System.currentTimeMillis());
		Date now3	=	new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24));
		
		System.out.println(now);
		System.out.println(now2);
		System.out.println(now3);
		now.setTime(System.currentTimeMillis() + (1000 * 60 * 60 * 24));
		System.out.println("==========" + now);

	}

}
