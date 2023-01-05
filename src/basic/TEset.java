package basic;

public class TEset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] multiArr[] = new int[3][4];
//		int[] multiArr2[] = new int[(int)(Math.random()*5) + 1][(int)(Math.random()*5) + 1];

//		String[][] myApt = new String[3][4];
//		
//		myApt[2][2] = "윤태종";
//		
//		
//		for(int i = 0; i<multiArr.length; i++) {
//			for(int j = 0; j<multiArr[i].length; j++) {
//				System.out.println(i + " : " + j + " = " + multiArr[i][j]);
//			}
//		}
//		
////		String[]	u_Apt[]	=	{{},{}};  //초기화  u_Apt = new String[][] {{},{}}
//		String[]	u_Apt[]	=	{{"노재현","문지광","최대진"},{"조정기","조기제","임진우"}};  //초기화
		
		//생성식 3번
//		String	herApt[][]	=	new	String[][] {{},{}};
		String	herApt[][]	=	new	String[][] {{"A","B"},{"C","D"}};
		String	chgApt[][]	=	new	String[][] {{"Z","Y"},{"V","W"}};
		
		for(int i = 0; i<herApt.length; i++) {
			for(int j= 0; j<herApt[i].length; j++) {
	//			herApt[i][j]	=	chgApt[i][j];
				System.out.println( herApt[i][j]);
			}
		}
//		
//		//동적가변배열 : Outer의 크기는 생성시 초기화 하고 Inner의  크기와 값은 동적으로 적용하는 배열
//		char[]	stars[]	=	new	char[10][];
//		
//		for(int i= 0; i<stars.length; i++) {
//			stars[i] = new char[i + 1];			//하위 배열을 동적으로 생성
//			for(int j= 0; j<stars[i].length; j++) {
//				stars[i][j] = '*';
//				System.out.print(stars[i][j]);
//			}
//			System.out.println();
//		}
		
	}

}
