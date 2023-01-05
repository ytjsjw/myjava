package ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<InputStream> streams = new Vector<InputStream>();
		
		SequenceInputStream sis = null;
		
		File f1 = new File("myFirst.dat");
		File f2 = new File("123.txt");
		
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		
		try {
			
			fis1 = new FileInputStream(f1);
			fis2 = new FileInputStream(f2);
			//위 두개의 입력스트림 객체를 Vector메 add시킨다.
			streams.add(fis1);
			streams.add(fis2);
			
			//SequenceInputStream에  생성자 Enumeration객체로 스트림을 넘겨주기위해 vector의
			//Enumeration을 리턴하는 메서드 호출
			Enumeration<InputStream> er = streams.elements();
			sis = new SequenceInputStream(er);
			
			int data = 0;
			while((data = sis.read()) != -1) {
				System.out.print((char)data);
			}
			
			sis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
				
	}

}
