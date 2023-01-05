package langEx.nestcls;

/*
 * Local Inner(지역중첩클래스): 특정 메서드에 종속되어진 클래스
 * 구현 목적 : 특정 메서드 호출할 때 해당 내용부가 특정 클래스에 정의된 내용 결과를 리턴하도록 정의
 * 주의점 : 이 로컬 클래스는 메서드에서만 존재하기 때문에 메서드가 실행이 되지 않을 경우엔 존재 자체가 없음
 *        반대로 메서드가 실행이 끝날 경우에도 존재가 사라짐 즉 외부에 절대 노출이 안된다는 뜻
 *        
 * 이 로컬클래스는 jdk 버전 업이 되기전에는 상수(final)만 가질수 있었는데, 아마15? 이상부터는 상수가
 * 아니어도 지역 변술르 가질수 있음
 * 
 * 이 메서드는 외부에 있는 다른 필드등(Inner 클래스 포함) 에 모두 접근 가능
 */

public class LocalInner {

	int	k	=	1;
	
	class	InstanceInner{	//멤버inner 클래스정의
		int	a	=	100;
	}
	
	static	class	StaticInner{
		int	b			=	200;
		static	int	c	=	300;
	}
	
	void	yourMethod(int	gg) {
		
		int	localVar	=	100;
		class	LocalInner1{
			int	d	=	400;
			
			InstanceInner	in	=	new	InstanceInner();
			
			int	k	=	gg	+	10	+	localVar;
			//클래스이기 때문에 메서드도 정의 가능
			//해당메서드는 outer의 멤버들도 참조 가능
			void doSom() {
				int r = k + d + StaticInner.c + localVar + gg;
				System.out.println(r);
			}
		}new LocalInner1().doSom();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner outer = new LocalInner();
		LocalInner.InstanceInner in	=	outer.new InstanceInner();
		
		System.out.println(in.a);
		outer.yourMethod(10);
	}

}
