package classEx;

/* 
	�ڹٿ����� ���߻���� �����Ǿ��ִ�.
	���� : AŬ������ BŬ���� �ΰ����� ����� �޴µ�
 		  ���� �� Ŭ���� ��� �Ȱ��� �̸��� �޼ҵ尡 �����ϸ�
 		  �ڽ� Ŭ���� ��ü�� �ش� �޼ҵ带 ȣ���� �� 
 		  A�� �޼ҵ尡 ȣ�� �Ǿ��ұ�, B�� ȣ���ؾ��ұ�

 	��, �ٸ� Ŭ������ ��ӹ޴� �θ��� Ŭ������ ��ӹ޴� ���� ������ ����.
 
*/
public class Gorilla extends Animal {
	public void move() {
		System.out.println("������ �ε帮�鼭 �����Դϴ�.");
	}
	public boolean  equals(Object o) {
		if(o instanceof Gorilla) {
			return true;
		}
		return false;
	}
}
