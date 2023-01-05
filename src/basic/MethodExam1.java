package basic;

public class MethodExam1 {

	
	static int max(int x, int y) {
		if(x>y) return x;
		return y;
	}
	
	
	public static void main(String[] args) {
		
		int whichMax = max(10,11);
		
//		System.out.println(print());   리턴값이 없는 void 메서드 호출시엔 에러
		System.out.println("두 수중 : " + max(10,11) + "이 더 큽니다.");  // max메서드는 리턴값이 있으므로 사용가능
		
		boolean is = String.valueOf(true).concat("h").contains("s");
		
		// TODO Auto-generated method stub
		/*
		 * 자바 메서드: 자바를 포함 모든 객체지향 언어에는 메서드라는 이름의 기능을 정의하고, 제공
		 * 메서는든 자바스크립트의 function과 같은 개념
		 * 어떤 로직이 반복적으로 필요할 경우 해당 로직을 분리해서 메서드로 정의해 놓으면 그 기능을
		 * 필요할때 마다 사용(재활용)
		 * 
		 * 아래는 메서드 선언 syntax입니다. []내의 키워드는 option이라서, 선언해도 그만 안해도 그만
		 * 
		 *  앞으로 객체지향을 공부하기 전까지는 main()에서 다른 메서드를 호출하여 사용할텐데 그때 호출되어지는
		 *  메서드는 반드시 static으로 정의 해야한다.
		 *  
		 *  문법: [public,protected,default,private] 4개 중 하나, 만약 비선언시 무주건 default로 간주
		 *  [static] : 클래스단위의 메서드인지의 여부 키워드...없으면 무조건 객체의 메서드로 선언한 것과 같음
		 *  return type: 정의한 메서드가 실행 중 또는 종료시에 넘겨줄 값이 존재한다면 해당 타입을 리턴으로 지정해야함
		 *                  만약 넘겨줄 것(return)이 없을 경우엔 void로 선언해야 함 
		 *                  리턴 타입에는 []를 쓰지 않았기 때문에 필수임
		 *     methodName : 리턴타입 바로 옆에는 반드시 메서드 명을 선언 해야함(이름 규칙은 변수와 같음) 역시 필수
		 *     
		 *     methodName([parameter1,parameter2,,,p(n)]); 이름옆의 괄호는
		 *     메서드가 정의될 때 어떤 파라미터 값이 필요 없을땐 그냔 괄호만, 만약 필요시엔 해당 값의 타입과, 그 값을
		 *     local에서 사용시 사용될 변;수명을 넣어줌. 이렇게 선언된 변수명은 해당 메서드의 지역변수로 활용되어짐
		 *     
		 *     메서드 body{} : 메서드이름(){메서드바디} 좌에서 보듯이 일반적인 메서드 정의 형식
		 *     메서드 바디에는 해당 메서드가 어떤 로직을 구현할지에 대한 상세 로직을 구현하는 부분
		 *     상속시 필요에 따라서 바디가 없는 선언부만 갖을수도 있음
		 *     
		 *     바디{}내의 return : 만약 메서드가 수행 중간 또는 후에 뭔가를 되돌려줄(return) 의도가 있다면,
		 *     return 키워드를 이용, 메서드의 선언시 선언된 리턴 타입과 같거나, 큰 타입으로 리턴 시키면 됨
		 *     로직 중간에 return이 호출되면 해당 메서드는 그 시점에 종료되어짐
		 *     만약 void 타입의 메서드에서 return을 사용하게 되면 명시적으로 해당 시점에 그 메서드의 수행을
		 *     멈추겠다는 의미
		 *     
		 *     총론 : 위 내용을 종합하여 메서드를 정의한 예는 아래와 같음
		 *     [public]
		 * 
		 */

	
	}
	
	
	//파라메터 유형(타입/갯수/순서)을 메서드 시그니처(method signature)라고 함
	//동일명으로 정의한 메서드가 컴파일러가 컴파일시 중복 정의 여부를 판별하는 요소
	//파라미터의 갯수,타입, 순서 모두가 같은 경우 같은 메서드로 인식하여 컴파일 에러 발생됨
	
	
	//메서드를 같은 이름으로 목적은 같지만 디데일이 조끔씩 틀린경우 정의 하였을때, 컴파일러(VM)는 호출하는 메서드의
	//시그니처를 깆ㄴ으로 해당 메서드를 호출하게 됩니다. 해서 아래처럼 동일명으로 시그니쳐만 틀리게 정의한것을
	//메서드를 오버로딩(overloading)했다라고 합니다.
	//아래의 예와 같은 print라는 메서드에 파라메터의 타입,숫자,갯수가 다른 여러개의 메소드가 있으니
	//print메소드에 오버로딩했다고 하는 것임.
	
	static void print(int count, String msg) {
	
	}
	
	
	static void print(String msg, int count) {
		for(int i = 0; i<=count; i++) {
			System.out.println(msg + "print");
		}
	}
	
	static void print(String msg) {
		System.out.println(msg + "출력됨");
		System.out.println(msg + "출력됨");
		System.out.println(msg + "출력됨");
		System.out.println(msg + "출력됨");
		System.out.println(msg + "출력됨");
	}

	static void print() {
		System.out.println("print");
		System.out.println("print");
		System.out.println("print");
		System.out.println("print");
		System.out.println("print");
	}

}
