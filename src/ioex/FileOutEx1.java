package ioex;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		a	=	1;
		byte	b	=	100;
		int		han	=	'윤';
		
		System.out.println(Integer.toBinaryString(han));
		//50980,1100011100100100
		
		
		/*
		 * 파일에데이터를 쓰는 순서
		 * OutputStream연다
		 * 쓴다(write())
		 * 닫는다(flush(), close())
		 * 참고로 close()는 내부적으로 flush()를 호출
		 */
		String	fileName	=	"myFirst.dat";
		File	file		=	null;
		FileOutputStream	fos	=	null;
		
		try {
			file	=	new File(fileName);
			fos		=	new FileOutputStream(file);
			
			fos.write(han);
			fos.write(a);
			fos.write(b);
			fos.close();
			
			System.out.println("파일에 작업 완료");
		}catch (Exception e) {
			
		}
		
		
	}

}
