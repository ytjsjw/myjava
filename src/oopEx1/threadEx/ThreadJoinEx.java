package oopEx1.threadEx;

/*
 * join()호출한 쓰레드는 호출된 쓰레드에게 cpu점유권을 양보하고 끝날때까지 기다린다.
 * 쓰레드 자체의 메서드로 쓰레드를 제어하는데 사용되는 대표적 메서드
 * 쓰레드 자체의 메서드로 제어를 시키는데 사용되는 메서드는 아래와같다
 * 
 * sleep(),join(),yield()....resume()등
 * 
 * 
 */
class ThreadB extends Thread{

	private long sum;

	public long getSum() {
	return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i = 0; i<10; i++) {
			sum += i;
		}
	};

}	
public class ThreadJoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이 메인 쓰레드에서는 위의 join쓰레드를 start()시틴 후 1~100까지의 연산 합을 리턴
		 * join()을 호출하기 전에는 연산이 완료되기 전에 호출이 되어서 완전한 값을 get하지 못함
		 * 이후 join()호출, 완전한 값을 얻게될텐데 그 차이점을 이해해야함
		 */
		
		/*
		 * 현재 cpu에 탑재된 즉 연산중인 Thread 객체를 리턴받는 메서드
		 */
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("메인의 우선순위 값 : " + Thread.currentThread().getPriority());
		
		ThreadB threadB= new ThreadB();
//		threadB.setPriority(10)
		threadB.start();
		
		try {
			//join()을 호출한 애는 main쓰레드이고, 호출당한 애는 threadB입니다.
			//따라서 threadB가 run()을 모두 완료할때까지 Main쓰레드는 기다리는 상태가 됨
			//정확히는 sleep()호출과 같음 이때 main쓰레드는 누가 깨워주지 않으면 계속 실행대기 영역에서 
			//머무르게되기 때문에 문제발생 따라서 내부적으로 InterruptedException을 발생시켜 main쓰레드를
			//깨워, Runnable상태로 다시 갈 수 있도록 만드는것
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThreadB가 연산한 1-100까지의 합 : " + threadB.getSum());
	}

}
