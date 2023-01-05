package ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C:\full_stack_Work\myjava\src\basic\Fruit.java
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		String orgin = "C:\\full_stack_Work\\myjava\\src\\basic\\Fruit.java";
		File backup = new File("Fruit.java.back");
		
		try {
			fis	=	new FileInputStream(orgin);
			fos	=	new FileOutputStream(backup);
			
			int data = 0;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
			
			System.out.println(backup.getName() + " 이 복사");
		}catch (Exception e) {
			// TODO: handle exception
		}
				
	}

}
