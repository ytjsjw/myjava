package ioex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			DataInputStream dis = new DataInputStream(new FileInputStream(new File("sample.dat")));
//			
//			System.out.println(dis.readInt());
//			System.out.println(dis.readFloat());
//			System.out.println(dis.readBoolean());
//			
//			dis.close();
			
			//EofException을 이용한 datainput 예외처리
			try {
				int[] score = {100,85,64,32,55,88};
				
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("sample.dat")));
				
				for(int i = 0; i<score.length; i++) {
					dos.writeInt(score[i]);
				}
				dos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
