package day0923;

import classEx.Animal;
import classEx.Gorilla;
import classEx.Monkey;

/*
 	��� (Inheritance)�̶�,
 	�θ� Ŭ������ �޼ҵ� Ȥ�� �ʵ��� �ڽ� Ŭ������ �״�� �޾Ƽ� 
 	�� �� �ְ� ���ִ� ���� ����̶�� �Ѵ�.
 	
 	����� Ŭ���� ��Ӱ� �������̽� ������� �����µ�
 	
 	Ŭ���� ����� ������ �ڵ��� ���뼺�� ���̱� �����̸�,
 	�������̽� ����� ������ ������(Polymorphism)�� �����̴�.
 	
 	����ϴ� ��:
 	public class �ڽ�Ŭ���� extends �θ�Ŭ����{
 		
 	}
 
 	
 	�ڽ� Ŭ������ ��ü�� �ʱ�ȭ�� ������ 
 	�θ� Ŭ������ �����ڰ� ���� ȣ�� �ǰ� �� ������ �ڽ� Ŭ������ �����ڰ� ȣ���� �ȴ�.
 	
 	�������̵�( Override )��,
 	�θ�Ŭ�����κ��� ��ӹ��� "�޼ҵ�"�� �ڽ� Ŭ������ ����ϱ� �������� ���,
 	"�޼ҵ�"�� �ڽ� Ŭ�������� ������ �Ͽ� ����ϴ� ���� �������̵� ����Ѵ�. 
 	��, �������̵带 �� �� ������ ����
 	�θ�Ŭ������ �����Ѵ�� �Ȱ��� �������־���Ѵ�.
 
 	java.lang.Object
 	Object��? ��ü�� ���Ѵ�. ( OOP -> Object Oriented Programming )
	�ڹ��� ��� Ŭ������ java.lang.Object�� ���������γ� ���������� ����� �޴´�.
	

 	������ ( polymorphism )��,
 	�پ��� ����� ���� ������ ���Ѵ�.
 	�ڹ��� ���, ���� Ÿ��, ������, �Ķ���Ϳ� �θ� Ŭ������ Ÿ������ �����ָ�
 	�ڽ� Ŭ������ �� �ڸ��� �� �� �ִ�. 
 	��, �ڽ� Ŭ������ �ڸ����� �θ� Ŭ������ �� �� ����.  
 	
 */


public class Ex02Inheritance {
	public static void main(String [] args) {
		Monkey a = new Monkey();
		a.setType("�ڳ���");
		a.move();
		a.makeSound();
		a.showInfo();
		
		Gorilla g = new Gorilla();
		g.setType("����");
		g.makeSound();
		g.move();
		g.showInfo();

		Gorilla g2 = new Gorilla();
		System.out.println(g.equals(g2));
		String abc = new String("abc");
		System.out.println(g.equals(abc));
		
		Animal g3 = new Gorilla();
		
		// ��ü�� println()�� ������ ��� �ɱ�?
		System.out.println(g);
		System.out.println(g2);
		System.out.println(g3);
	}
}
