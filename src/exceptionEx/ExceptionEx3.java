package exceptionEx;

import java.io.Closeable;

class MyRes implements AutoCloseable{
	
	private	String	name;

	public	MyRes(String name) {
		this.name = name;
		System.out.println("내 리소스 "+ name + "열었음");
	}
	public	String	read1() {
		System.out.println("내 리소스 "+name + "읽기");
		return "100";
	}
	
	public	String	read2() {
		System.out.println("내 리소스 "+name + "읽기2");
		return "abcd";
	}
	
	@Override
	public void close() throws Exception {
			System.out.println("내 리소스 연결 끊기 또는 닫기 실행");
	}
}

public class ExceptionEx3 {

	public static void main(String[] args) {

		try(MyRes res = new MyRes("A")){
			String	data	=	res.read1();
			int	value	=	Integer.parseInt(data);
		}catch	(Exception e) {
			System.out.println("여기서 예외 핸들링..." + e.getMessage());
		}

		
		MyRes	res1	=	new MyRes("res1");
		MyRes	res2	=	new MyRes("res2");
		
		try(res1; res2){
			String	d	=	res1.read1();
			String	e	=	res2.read2();
		}catch	(Exception e) {
			System.out.println("예외 발생시 do~someting");
		}
		
		
	}

}
