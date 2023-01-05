package utilex;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 1.Properties 기본객체생성
		 * 2.Properties 파일을 스트림(Stream)을 통해 접근(Access)한다.
		 * 3.getProperty(key)를 통해 키 정보를 주면 Value를 리턴
		 */
		
		Properties prop = new Properties();
		
	//	prop.load(Properties.class.getResourceAsStream("db.properties"));  1번방법
	//	ClassLoader를 통해 프로퍼티스 파일에 대한 스트림 생성
		prop.load(ClassLoader.getSystemResourceAsStream("db.properties")); //2번방법
		
//		url:orcle:thin:@localhost:1521:orcl
//		driver:oracle.jdbc.dirver.OracleDriver
//		username:ytj
//		password:11111
//		admin:administrator
		
		String	url			=	prop.getProperty("url");
		String	dirver		=	prop.getProperty("driver");
		String	username	=	prop.getProperty("username");
		String	password	=	prop.getProperty("password");
		String	admin		=	prop.getProperty("administrator");
		
		System.out.println(url);
	}

}
