package utilex;

import java.util.ArrayList;

/*
 * 이 틀래스는 DB에 접근해서 데이터를 select, insert, update, deleteㄹ르 하는 기능의 DAO
 * 기본적으로 Singleton 방식으로 정의할 예정
 * 따라서 생성자는 private으로 정의하고, static메서드를 이용해서 외부 객체가 instance를 사용할 수 있도록 정의  꼭 기억
 */
public class StudentDAO {

	
	private static StudentDAO instance	=	new StudentDAO();
	
//	private StudentDAO(){
//	}
	
	public static StudentDAO getInstance() {
		return instance;   // instance 대신 this사용 못함( static에서는 non static를 사용할수 없기때문)
		                   // 해서 private static으로 객체를 생성한 instance로 리턴
	}
	
	public	void	putDtos(ArrayList<StudentDTO> list) {

		for	(int i= list.size()-1; i>=0; i-- ) {
			StudentDTO dto	=	list.get(i);
			System.out.println(dto.getNumber());
			System.out.println(dto.getName());
		}

	}
	
}
