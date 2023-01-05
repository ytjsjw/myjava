package ioex;

import java.io.FileInputStream;

public class FileInputEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis	=	new FileInputStream("kk");
			int	data	=	0;
			
			while((data = fis.read()) != -1) {
				char c = (char)fis.read();
				System.out.print(c);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
