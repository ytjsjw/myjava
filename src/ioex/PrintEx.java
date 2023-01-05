package ioex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("message.log");
		FileOutputStream fos = null;
		PrintStream ps	=	null;
		
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		
		try {
			fos = new FileOutputStream(f, true);
			ps = new PrintStream(fos);
			System.out.println("안녕 메세지 입력 후 끝내려면 q입력");
			
			while(true) {
				System.out.println("msg : ");
				input = sc.nextLine();
				if(input.equalsIgnoreCase("q")){
					System.out.println("좋은하루");
					System.exit(0);
					break;
					
				}
				ps.println(input);
				ps.flush();
			}
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
