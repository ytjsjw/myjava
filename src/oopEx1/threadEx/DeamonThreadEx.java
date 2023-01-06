package oopEx1.threadEx;

public class DeamonThreadEx implements Runnable{

	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new DeamonThreadEx());
		
		//데몬쓰레드로 설정
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i<=20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
			
			//5초마다 저장 쓰레드가 Flag 확인하여 저장기능 수행
			if(i % 5 == 0)	autoSave = true;
		}
		System.out.println("메인 종료.....부모 쓰레드 종료");
	}
	//아래의 run()은 무한루프 돌면서 5초마다 자동 저장됨 이라는 메세지 출력
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(2 * 1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			if(autoSave == true)
				autoSave();
		}
	}
	
	private	void	autoSave() {
		System.out.println("자동저장");
	}
}
