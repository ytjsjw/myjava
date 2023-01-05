package exceptionEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionEx2 {

	static	void	a()  {
		b();
	}
	static	void	b()	 {
		c();
	}
	static	void	c()  {
		
		FileInputStream fis = null;
		File f = null;
		
		f	= new File("tes2t.txt");


		try {
			
			fis = new FileInputStream(f);
			int	data;
			
			while((data = fis.read()) != -1 ) {
				System.out.println(data);
				System.out.println((char)data);
			}
		}catch(FileNotFoundException io) {
			System.out.println("파일찾을수없음" + io.getMessage());
//			io.printStackTrace();
		}catch(IOException fne) {
			
		}finally {
		
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성한 파일에 접근, 파일의 내용을 읽어오는 API 사용
		a();

	}

}
