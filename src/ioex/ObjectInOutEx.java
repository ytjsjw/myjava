package ioex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*
 * 객체직렬화 및 object InOutputStream
 * : 객체를 통째로 파일이나, 특정 대상에 쓰고, 읽을 수있는 스트림
 *   직렬화 대상 객체는 반드시  Serialization 타입이어야 한다.
 *   직렬화 비대상 필드는  static, transient 필드
 *   static의 클래스 소요이기 때문이고, transient 키워드는 휘발성 요소로 필드를 관리할때 사용
 *   (예를 들어 중요한 정보는 객체직렬화에서 빼고 싶다면, transient  선언을 하면됨)
 *   직렬화 역직렬화 할때 JVM은 같은 클래스 버전인지를 확인 후 역직렬화 함
 *   따라서 특정 객체를 직렬화시 반드시 직렬화 버전(시리얼 넘버)를 유니크하게 줘야하고 
 *   두 값이 같아야 역직렬이 되어짐
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
//직렬화 대상인 Member, Product 클래스 정의. 모두 Serialization을 구현
class Member implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1247075086937691735L;
	//직렬화 대상인 멤필 선언
	private String	id;
	private	String	name;
	private static int cLsNum = 612;
	private transient String password = "1234";
	
}

@Builder   
@ToString
class Product implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3000334608779083821L;
	private	String	name;
	private int	price;
	
//	public Product(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
	
}


public class ObjectInOutEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("objectOut.dat");
		ObjectOutputStream oop = new ObjectOutputStream(fos);
		
				
		Member member = Member.builder()
		.id("Jason")
		.name("ytj")
		.password("123")
		.build();
		
		
		Product p = Product.builder()
		.name("book")
		.price(2500000)
		.build();
		
		
		int[] arr1 = {1,2,3};
		oop.writeObject(member);
		oop.writeObject(p);
		oop.writeObject(arr1);
		
		oop.flush();
		oop.close();
		System.out.println("file writ success");
		
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("objectOut.dat"));
		
		Member member2 = (Member)ios.readObject();
		Product p2	=	(Product)ios.readObject();
		int[] arr2 = (int[])ios.readObject();
		
		
		ios.close();
		
		System.out.println(member2);
		System.out.println(p2);
		System.out.println(arr2[1]);
	}

}
