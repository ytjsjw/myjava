package ioex;

import java.io.File;
import java.io.IOException;

public class FileExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		
		
		File f = new File("C:" + File.separator + "temp");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		
		String	fName = "press";
		
		File folder = new File(fName);
		File file	=	new File("myFile.txt");
		
		if(!folder.exists()) {
			System.out.println(folder.mkdir());
		}else {
			String path = folder.getAbsolutePath();
			System.out.println(path);
			
			File newFile = new File(folder, file.getName());
			System.out.println(newFile.createNewFile() == true ? " 파일이 생성됨" : "오류");
			
			System.out.println("이름 : " + newFile.getName());
			System.out.println("크기 : " + newFile.length() + "bytes");
			System.out.println("절대경로 : " + newFile.getAbsolutePath());
			System.out.println("부모 폴더 이름 : " + newFile.getParent());
			
			File	parent = newFile.getParentFile();
			File[] files = parent.listFiles();
			if(files.length != 0) {
				for(File fi : files) {
					System.out.println(fi.getName());
					System.out.println(fi.isDirectory() == true ? "폴더" : "파일");
				}
			}
		}
		delAll(folder.getAbsolutePath());
	}
		
		//재귀호출을 이용한 파일이 있는 폴더 삭제하기
		static void delAll(String path) {
			File[] files = new File(path).listFiles();
			for(File f : files) {
				if(f.isFile()) {
					f.delete();
					System.out.println("파일삭제함");
				}else {
					delAll(f.getAbsolutePath());
					f.delete();
					System.out.println("폴더삭제함");
				}
			}
		}

}
