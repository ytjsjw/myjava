package basic;
import javax.swing.JOptionPane;

public class YonSanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		연산자(최(.,[],new),(), 선행(++,--), 단항(!,~,+,-,typeof,), 산술(*,/,%,+,-),
//		쉬프트(<<,>>,>>>),관계(==,!=, ===, !==, <,>,...), 
//		논리(&,|,&&,||), 삼항(조건 ?v1 : v2), 배정대입(+=,..),후행(++,--))
//		4 + 5 > 2 - 1 * 7 && ( 12 & 3 * 2) > 7 || -2 != 2;
		
//		ture && false || true
		
//		boolean res =  4 + 5 > 2 - 1 * 7 && ( 12 & 3 * 2) > 7 || -2 != 2;
		
		// ~ 비트반전..단항연산자
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(~1));
	
		//비트이동연산자 ..  <<? (부호비트는 두고 모두 좌측으로 ? 만큼이동, 새로운 비트는 0으로 채운다
		//              >>? (부호비트는 두고 모두 우측으로 ? 만큼이동, 새로운비트는 0으로 채운다
//		System.out.println(Integer.toBinaryString(1<<2)); //
//		System.out.println(Integer.toBinaryString(1>>3)); //
//
//		System.out.println(Integer.toBinaryString(-1));
//		System.out.println(Integer.toBinaryString(-1>>3));
//		System.out.println(Integer.toBinaryString(-1>>>3));
//	
//		String	mi	=	"hi";
//		String	mi2	=	new String("hi");
//		
//		if(mi	==	mi2) {  //값을 비교하는 것이 아니라 객체 비교하는 의미 (즉 Ref 가 같은지 비교!)
//			System.out.println("같은 객체");
//		}else {
//			System.out.println("다른 객체");
//			
//		}
//		
//		//두 문자열 객체의 값을 비교할때는 문자열.equals(비교문자열) 메서드를 이용해야함. (중요!!!)
//		if (mi.equals(mi2)) {
//			System.out.println("같은 문자열");
//		}else {
//			System.out.println("다른 문자열");
//		}
		
		String myName	= JOptionPane.showInputDialog("이름을 입력 하세요");
		String myName2	= JOptionPane.showInputDialog("이름2을 입력 하세요");
		
		if(myName	==	myName2) {  //값을 비교하는 것이 아니라 객체 비교하는 의미 (즉 Ref 가 같은지 비교!)
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
			
		}
		
		//두 문자열 객체의 값을 비교할때는 문자열.equals(비교문자열) 메서드를 이용해야함. (중요!!!)
		if (myName.equals(myName2)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
	}



}
