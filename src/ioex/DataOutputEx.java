package ioex;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos	=	new FileOutputStream("sample.dat");
			dos =	new DataOutputStream(fos);
			dos =	new DataOutputStream(fos);
			
			dos.writeInt(10);
			dos.writeFloat(20.0F);
			dos.writeBoolean(true);
			dos.writeUTF("Hello");
			
			dos.close();
			

			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
