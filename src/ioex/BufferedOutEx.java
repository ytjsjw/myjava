package ioex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for(int i = '1'; i<='9'; i++) {
				bos.write(i);
			}
			
			fos.close();  //이럴경우 5개만 찍히고 close하므로 버퍼를 close해줘야 함 bos.close()
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
