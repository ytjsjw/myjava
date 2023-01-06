package oopEx1.threadEx;
/*
 * run()내부의 로직이 의미없는 (연산을 하지 않는)반복 작업을 수행시엔 yeild()를 호출하여 자신을
 * 대기 상태로 전환 하도록하고, 타 쓰레드에게 Cpu점유를 양보하도록 제어하는 메서드
 * join()과 다른 점은 join()외부에서 호출하는 형태로 제어를 하지만, yeild()는 내부에서 직접제어
 * 즉 루프등의 조건에 따라서 yeild()를 호출
 */

class WorkerThread extends Thread{
	public boolean work = true;
	
	public WorkerThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(work) { //상태값에따른 루프 분기작업..즉 work가 true시에만 연산을 한다
				System.out.println(getName() + " 쓰레드가 연산수행");
			}else {
				//이 조건에서는 아무것도 할게 없으니 다른 쓰레드에게 양보
				Thread.yield();
			}
		}
	}
}
public class YieldThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WorkerThread2개 생성 하나는 루프 flag값을 false로 주고 이후에 경쟁쓰레드가 CPU를 점유하는 상황을 보세요
		 * 이후 다시 flag를  true로 주면 다시 경쟁상태로 넘어감 이렇게 되는 이유는 내부적으로 yeild를 호출해서 임
		 */
		WorkerThread wThread1	=	new WorkerThread("워커1");
		WorkerThread wThread2	=	new WorkerThread("워커2");
		
		wThread1.start();
		wThread2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wThread1.work = false;
		
		try {
			Thread.sleep(10000);
			wThread1.work = true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
