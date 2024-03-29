/*
 * 학습내용
 * 1. 조건문을 개발 하는 방법
 * 2. 상황
 * 	1. 조건 상황이 하나인 경우? - if
 * 	2. 조건 상황이 여러개인 경우? -if~else if
 * 	3. 조건 비교시 비교 데이터가 기본 타입 또는 참조?
 * 3. 문법
 * 	1. If
 * 	2. switch
 * 4. 참고사항
 * 	-클래스가 보유한 맴버 변수 (데이터), 메소드 (기능), 실제 사용 위한 전제조건
 * 		: 객체 생성후 객체를 관리하는 참조 변수로 변수, 메소드 호출
 * 				ex) person p = new person();
 * 					p.name = "최준경"
 * 	-유일하게 객체 생성 없이도 메소드, 변수를 호출 가능하게 해주는 키워드
 * 				: static
 * 5. 객체 생성 관련
 * 	1. 객체 생성 방법 (유일)
 * 		new 생성자 ([..]);
 * 	2. new 생성자 없이도 데이터 표기법만으로 객체가 되는 타입
 * 		String 타입 ""
 * 
 */

package step01;

public class Ex04Object {

	public static void main(String[] args) {
		/*
		 * 
		 * B 객체가 내부적으로 생성되는 Process 
		 * 	보유한 모든 맴버변수들이 완벽하게 메모리에 생성되면 정상으로 객체 생성 완료
		 * 	B객체가 생성 완료되는 조건은 보유한 맴버변수들이 완벽하게 생성되는게 전제조건
		 * 	A객체가 완벽하게 생성 -> B객체 생성 완료
		 * 
		 *  *객체 생성:
		 */
		B b = new B();
	}

}

class A{
	A(){
		System.out.println("A");
	}
}

class B{
	A a = new A();
	B(){
		System.out.println("B");
		}
}