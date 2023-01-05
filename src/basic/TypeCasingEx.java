package basic;


public class TypeCasingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입 프로모션: 작은 타입을 큰 타입에 대입하는 형태..무조건 된다.
		//타입 케스팅(Casting): 큰 타입을 작은 타입에 대입할때 사용되는 연산자를 이용해서 대입하는 형태를 말함.
		//케스팅 연산자는 연산자 우선순위의 1순위 중 .,[],() 다음이다.

		byte	b	=	1;	short	s;	int	i;	long	lo;
		float	f;	double	d;
		
		//타입 프로모션..
		s	=	b;
		i	=	s;
		lo	=	i;
		f	=	lo;
		d	=	f;
		
		//타입 케스팅..
		//f	=	d; 오류 안됨 되게하려면 아래와 같이 케스팅해야 됨.. (변환type)변수;
		f	=	(float)d;
		lo	=	(long)f;
		
		d = 3.74;
		
		int i2;
		
		i2	=	(int)d;
		System.out.println(i2);   //단축키워드 syso
		
		
		System.out.println(Integer.toBinaryString(-128));
		
		b = (byte)128;
		System.out.println(b);
		
		
	}

}
