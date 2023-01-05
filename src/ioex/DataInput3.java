package ioex;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("sample.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				
				System.out.println(score);
				sum += score;
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("점수의 총 합 : " + sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(dis != null) {
				try {
					dis.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
