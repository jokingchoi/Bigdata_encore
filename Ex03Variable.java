/*학습내용
 * 1. 변수
 * 	1-1. 타입 
 * 		- 기본 (8가지, 소문자)
 * 		- 참조
 * 			- 기본이 아닌 모든 타입
 *  1-2. 선언 위치에 따른 구분
 *  	1.멤버
 *  		class {} 하위
 *  	2.로컬
 *  		생성자 또는 메소드의 parameter
 *  
 * 
 */


package step01;
import model.domain.People;;

public class Ex03Variable {

	public static void main(String[] args) {
		//people 객체 생성 - new
		
		//people에 "짝궁 이름", -나이 대입, setXxx()
		
		//people의 getXxx() 호출해서 출력 
		
		People person = new People();
		
		person.setName("최준경");
		person.setAge(-10);
		
		System.out.println(person.getName() + "" + person.getAge()); // system 과 person 두개의 class 사용
	}
}
