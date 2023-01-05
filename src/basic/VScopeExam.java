package basic;

public class VScopeExam {
	
	//이렇게 클래스 or 멤버필드로 선언된 변수는 선언과 동시에 기본값으로 초기회 되어짐
	//즉 내가 따로 초기화 하지 않는 이상은 기본값으로 초기화되어 짐
	//수치형은 0 or 0.0, boolean은 false, 문자는 \u0000으로 초기화 되어짐
	//Rtype은 무조건 null로 초기화 되어짐
	
	static	int	i; //클래스 변수 선언
	static	String myName;

	public static void main(String[] args) {
        //클래스변수 출력합니다.
		//기본적으로 지역변수는 초기화 되지 않은 상태에서 사용되면 에러인데,
		//클래스 변수는 선언 후 클래스가 메모리에 로르되는 시점에 기본값으로 초기화되어지기 때문에 사용하는데 문제 되지 않음
		System.out.println(i);
		System.out.println(myName);
		
		
		
		//여기서는 자바에서 사용되는 변수의 scope에 대해 알아봄
		//기본적으로는 메서드내에서 선언된 변수는 로컬변수, 어떤 곳이든 {}내에서 선언된 변수는 블락변수
		//그리고 클래스에서 선언된 된수는 클래스 or 멤버필드로 지정
		//즉 static 이 붙은 변수는 클래스 변수, none static은 멤버필드(Instance 변수)라 합니다.
		//위 클래스 or 멤버필드는 순서대로 클래스가 메모리에 남아있는 동안 살아있고,
		//멤버는 객체가 몹쓸객체로 변이되기 전까지는 살아있습니다.
		//지역(local)변순느 메스드에 body가 끝나면 삭제되고, 블락은 블락이 실행후 삭제됨
		
		int	i = 10; //main()에서 처음 선언되었으므로 지역 변수 입니다.
		{
			int j = 2;   //j는 블락변수
			int sum = i * j;  // sum  블락변수
			System.out.println(sum);
		}
//			System.out.println(i + "*" + j + "=" + sum);	//j 와 sum이 블럭을 벋어나서 오류 발생
	}

}
