/*�н�����
 * 1. ����
 * 	1-1. Ÿ�� 
 * 		- �⺻ (8����, �ҹ���)
 * 		- ����
 * 			- �⺻�� �ƴ� ��� Ÿ��
 *  1-2. ���� ��ġ�� ���� ����
 *  	1.���
 *  		class {} ����
 *  	2.����
 *  		������ �Ǵ� �޼ҵ��� parameter
 *  
 * 
 */


package step01;
import model.domain.People;;

public class Ex03Variable {

	public static void main(String[] args) {
		//people ��ü ���� - new
		
		//people�� "¦�� �̸�", -���� ����, setXxx()
		
		//people�� getXxx() ȣ���ؼ� ��� 
		
		People person = new People();
		
		person.setName("���ذ�");
		person.setAge(-10);
		
		System.out.println(person.getName() + "" + person.getAge()); // system �� person �ΰ��� class ���
	}
}
