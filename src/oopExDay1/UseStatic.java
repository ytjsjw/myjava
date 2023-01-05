package oopExDay1;

public class UseStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static으로 선언된 필드, 메서드 호출방법
		StaticExam.showA();
		new	StaticExam().showB();
		new	StaticExam().showA();
	}

}
