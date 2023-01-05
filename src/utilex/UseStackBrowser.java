package utilex;

import java.io.IOException;
import java.util.Stack;

/*
 * stack 2개를 이용해서 웹브라우저의 back, forward의 URL 저장하는 방법
 */
public class UseStackBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> back = new Stack<String>();
		Stack<String> forward = new Stack<String>();
		
//		public static void	main(String[] args) {
//			goURL("http://www.daum.net");
//			goURL("http://www.naver.com");
//			goURL("http://www.nate.com");
//			printStatus();
//			goback();
//			printStatus();
//		}
		
//		public static void printStatus(){
//		
//		System.out.println("back stack : " + back);
//		System.out.println("forward stack : " + forward);
//		System.out.println("현재 화면은 : " + back.peek() + " 입니다.");
//		System.out.println();
//		}
		
//		public static void goURL(String url) {
//			Runtime runtime = Runtime.getRuntime();
//			try {
//			runtime.exec("C:\Program Files (x86)\Google\Chrome\Application\chrome.exe " + url);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			back.push(url);
//		}

	
	}
}
