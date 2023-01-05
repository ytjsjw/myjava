package ioex;

import java.io.File;
import java.io.FileInputStream;

public class FileInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	fileName = "myFirst.dat";
		File	f	=	null;
		FileInputStream	fis	=	null;
		
		try {
			//아래는 위위 코드를 한방코드로 정리한 코드
			//new FileInputStream(new File("myFirst.dat"));
			f	=	new File(fileName);
			fis	=	new	FileInputStream(f);
			
			//read()한번 호출때마다 1 byte씩  읽어온다
			//만약 파일의 끝에 다다르면 더이상 읽을게 없기 때문에 예외를 발생시키지 않고, -1리턴
			//리턴값인 int를 스트림에서 읽은 byte를 int로 리턴한 것이지 int를 읽느것이 아니니 주의
//			while(true) {
//				int	data	=	fis.read();
//				if(data == -1) {
//					break
//					System.out.println("읽은 데이터: " + (char)data);
//				}
//			}
			
			fis.close();
			
		}catch(Exception e) {
			
		}
	}

}
