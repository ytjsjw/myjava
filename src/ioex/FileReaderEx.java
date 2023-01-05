package ioex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C:\full_stack_Work\myjava\src\basic\ArrayExam.java
		File file	=	new File("C:\\full_stack_Work\\myjava\\src\\basic\\ArrayExam.java");
		
		FileReader fr 			= null;
		BufferedReader br 		= null;
		LineNumberReader lnr 	= null;
		
		int readData;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			lnr = new LineNumberReader(br);
			String	msg	=	null;
			
			int i = 1;
			while((msg = lnr.readLine()) != null) {
				System.out.print(lnr.getLineNumber() + " ");
				System.out.println(msg);
			}

			lnr.close();

			File f = new File("ArrayExam.java.back");
			PrintWriter pw = new PrintWriter(f);
			
			pw.write(msg);
			pw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		try {
//			fr = new FileReader(file);
//			while((readData = fr.read()) != -1) {
//				System.out.print((char)readData);
//			}
//			fr.close();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
				
	}

}
