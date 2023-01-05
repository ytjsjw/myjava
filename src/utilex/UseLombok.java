package utilex;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//https://projectlombok.org/download에서 최신 lombok.jar를  C:\ 아닌 다른 루트 드라이브에 다운
//cmd --> C:\로 이동하여 java -jar lombok.jar 20초 정도 기다리면 설치화면 나옴 -->설치
// lib 폴더 생성 --> 해당 폴더에 lombok.jar 붙이기 --> 해당 자르파일 우클릭 -->build path --> add to build path

//@Data // 이 어노테이션은 getter, setter, toString, hashcode, equals()를 자동으로 생성

//@Data
@Data
class Student{
	private	String	id;
	private	String	name;
	private	int		age;
	
}

/*
 * 롭복 annotaion 설정정보
 * 
 */

/*
 * 
@NoArgsConstructor //기본 생성자를 포함시킨다.
@AllArgsConstructor //필드초기화 생성자를 포함 시틴다.
@RequiredArgsConstructor //기본적으로 생성자라 포함, 만약 Final 또는 @NotNull이 붙은 필드가 있다면 이 필드만 초기화 하는 생성자 포함
@Getter	
@Setter
@EqualsAndHashCode // equals(), hashCode() 포함
@ToString 

 */

@Data
@NoArgsConstructor
@AllArgsConstructor
class	Student2{
	private	String	id;
	private	String	name;
	private	int		age;
}

class	Student3{
	private	final		String	id	=	 "jason";
	@NonNull private	String	name;
	private	int					age;
}

public class UseLombok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student	stu1	=	new Student();
//		Student3 stu3	=	new Student3("jjj");
		
		System.out.println(stu1.getAge());
	}
	
}
