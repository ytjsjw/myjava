package ioex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeMyDateEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File newText = new File("mk.text");
		
		FileWriter fw = new FileWriter(newText);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("word\n");
		bw.write("kjons");
		bw.close();
	}
}
