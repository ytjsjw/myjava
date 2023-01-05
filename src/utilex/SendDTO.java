package utilex;

import java.util.ArrayList;

/*
 * 이 클래스는 필요한 DTO객체를 필요한 만큼 생성해서 List Type으로 DAO에게 보내는 역활
 */

public class SendDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDTO	dto1	=	new	StudentDTO();
		dto1.setNumber(1);
		dto1.setGroup(2);
		dto1.setName("윤태종");
		dto1.setTel("11111111");
		
		StudentDTO	dto2	=	new	StudentDTO();
		dto2.setNumber(1);
		dto2.setGroup(2);
		dto2.setName("한유섭");
		dto2.setTel("22222222");

		StudentDTO	dto3	=	new	StudentDTO();
		dto3.setNumber(1);
		dto3.setGroup(2);
		dto3.setName("조기제");
		dto3.setTel("3333333");
		
		ArrayList<StudentDTO> members	=	new ArrayList<StudentDTO>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		
		StudentDAO	dao	=	StudentDAO.getInstance();
		dao.putDtos(members);
		
		
		


	}

}
