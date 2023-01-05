package utilex;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class UseCaseQueue {

	static	LinkedList	q2	=	new LinkedList();
	static	Queue<String>	q	=	new LinkedList<String>();
	static	Queue	q3	=	new LinkedList();
	
	static	final int MAX_INPUT_SIZE = 5; //저장 가능한 최대 명령어 갯수 초기화
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			while(true) {
				System.out.print(">>> ");
				
				Scanner s = new Scanner(System.in);
				String	input	=	s.nextLine().trim();
				
				if(input.equals("")) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help : 도움말 보기");
					System.out.println("q OR Q : 프로그램 종료하기");
					System.out.println("history : 최근 입력 명령어를 최대" + MAX_INPUT_SIZE + "보여줍니다.");
				}else if(input.contentEquals("history")) {
					int i = 0;
					saver(input);
					
					LinkedList<String> temp	=	(LinkedList<String>)q3;
					ListIterator<String> it	=	temp.listIterator();
					while(it.hasNext()) {
						System.out.println(++i + ". " + it.next());
					}
				}
				else {
					saver(input);
					System.out.println(input);
				}
				
			}
		}catch	(Exception e) {
			System.out.println("입력오류");
		}
	}

	public	static	void	saver(String input) {
		if(!"".equals(input)) {
			q3.offer(input);
		}
		
		if(q.size() > MAX_INPUT_SIZE) {
			q3.remove();
		}
	}
	
	//Q
}
