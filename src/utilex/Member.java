package utilex;

/*
 * 자바의 record는 DTO와 유사한 개념으로 초기화를 생성자를 통해 합니다.
 * 따라서 초기화 필드값을 생성자에 넣어주시면, 자동으로 해당깩체가초기화되고
 * 자동으로 
 */

public record Member(String id, String name, Integer age) {

}
