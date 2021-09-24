package day0923;

import classEx.AnimalA;
import classEx.Cat;
import classEx.Dog;

/*
�߻� Ŭ����, �߻� �޼ҵ�, �������̽�
 	Ŭ���� ����� �츮�� �ڵ��� ���뼺�� ���̱� ���� ����Ѵ�. 
 	�׿� ���ؼ� �߻� Ŭ����, �߻� �޼ҵ�, �������̽� ����� 
	�ڵ��� ���뼺���ٴ� �������� �ο��ϱ� ���� ���ȴ�.
*/

public abstract class Ex03Abastract {
	public static void main(String[] args) {
		// �߻� Ŭ������ �������� ���� �޼ҵ尡 �����ϹǷ�
		// �ش� Ŭ������ �����ڸ� �츮�� ���� ȣ�� �� �� ����.
		// ��� �� Ŭ������ ��ӹ޴� Ŭ������ �����ڰ� �ʿ��ϴ�.
		AnimalA a = new Dog();
		AnimalA b = new Cat();
		a.makeSound();
		a.move();
		b.makeSound();
		b.move();
		observe(b);
		
		// �������̽��� �߻� Ŭ������ �ſ� ����������
		// �ٸ� ����, 
		// ������ �����Ǵ� �޼ҵ尡 �����ϴ� �߻�Ŭ������ �ٸ���
		// �������̽��� ��� �޼ҵ尡 �߻� �޼ҵ�� ���̴�.
	}
	
	public static void observe(AnimalA a) {
		a.makeSound();
		a.move();
	}
}
