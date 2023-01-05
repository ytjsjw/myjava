package utilex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Queue 구조: FIFO구조. 이를 구현한 클래스가 LinkedList이기에 
 * 위 클래스 객체를 이용해서 아래의 메서드를 호출하면 자동으로 큐 구조로 이루어진다.
 * 대표적 메서드 몇가지
 * element(): 삭제없이 저장된 요소 리턴. peek와 다른점은 큐가 비었을때 예외를 발생
 * peek()은 null만 리턴
 * 
 * offer(Object obj) : 큐에 객체저장...리턴은 true/false
 * peek() :삭제없이 큐의 출구 바로전에 있는 요소에 Ref만 리턴. 비었다면 null리턴
 * poll() : 큐에서 출구 바로전에 있는 요소 리턴 및 삭제
 * remove() : 큐에서 출구 바로전에 있는 요소 가져온다. 비었으면 예외 발생
 * 
 */
public class QueueStackEx {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=======Queue의 값 출력 ============");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
		//stack 자료구조 구현
		Stack<String> stack	=	new	Stack<String>();
		stack.push("0");
		stack.push("1");
		stack.push("2");
		System.out.println("=======Stack 의 값 출력 ============");
	
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	} 
}
