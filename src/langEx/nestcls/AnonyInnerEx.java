package langEx.nestcls;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 익명클래스 : 이름이 없는 클래스
 * 특정 클래스 또는 인터페이스타입에 적용된 메서드나 생성자에 바로 클래스를 정의 후 특정 메서드를 호출하는 방식
 * 
 * 이렇게 정의된 클래스는 익명으로 처리되어, 생성 및 작업후 사라지게 되는 형태
 */

interface TestAnonyInner{
	int	data	=	10000;
	void	printData();
	void	yourMethod();
}

class	UseAnonyInner{
	public	void	test() {
		//익명클래스는 어디에서건 정의 가능
		new TestAnonyInner() {
			
			@Override
			public void yourMethod() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println(data);
			}
		}.printData();
	}
}
//ActionListener를 구현하는 클래스 정의...내가 해당 타입의클래스가 된다
class MyactionListen implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("사용자가 버튼클릭");
		System.exit(0);
	}
}
public class AnonyInnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseAnonyInner u = new UseAnonyInner();
		u.test();
		
		Frame f = new Frame("헸갈리네요");
		f.setSize(300, 300);
		Button	button	=	new Button("닫기");
		
		button.addActionListener(new MyactionListen());
		
//		//익명클래스 구현
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("사용자가 버튼클릭");
//				System.exit(0);
//			}
//		});
		
		
		f.add(button);
		f.setVisible(true);
	}

}
