package day0923;

import classEx.Animal;
import classEx.Gorilla;
import classEx.Monkey;

/*
 	상속 (Inheritance)이란,
 	부모 클래스의 메소드 혹은 필도를 자식 클래스가 그대로 받아서 
 	쓸 수 있게 해주는 것을 상속이라고 한다.
 	
 	상속은 클래스 상속과 인터페이스 상속으로 나뉘는데
 	
 	클래스 상속의 목적은 코드의 재사용성을 높이기 위함이며,
 	인터페이스 상속의 목적은 다형성(Polymorphism)을 위함이다.
 	
 	상속하는 법:
 	public class 자식클래스 extends 부모클래스{
 		
 	}
 
 	
 	자식 클래스의 객체를 초기화할 때에는 
 	부모 클래스의 생성자가 먼저 호출 되고 그 다음에 자식 클래스의 생성자가 호출이 된다.
 	
 	오버라이드( Override )란,
 	부모클래스로부터 상속받은 "메소드"가 자식 클래스가 사용하기 부적절한 경우,
 	"메소드"를 자식 클래스에서 재정의 하여 사용하는 것을 오버라이드 라고한다. 
 	단, 오버라이드를 할 시 주의할 점은
 	부모클래스가 선언한대로 똑같이 선언해주어야한다.
 
 	java.lang.Object
 	Object란? 객체를 뜻한다. ( OOP -> Object Oriented Programming )
	자바의 모든 클래스는 java.lang.Object를 직접적으로나 간접적으로 상속을 받는다.
	

 	다형성 ( polymorphism )란,
 	다양한 모습을 지닌 성격을 말한다.
 	자바의 경우, 리턴 타입, 생성자, 파라미터에 부모 클래스를 타입으로 적어주면
 	자식 클래스도 그 자리에 들어갈 수 있다. 
 	단, 자식 클래스의 자리에는 부모 클래스가 들어갈 수 없다.  
 	
 */


public class Ex02Inheritance {
	public static void main(String [] args) {
		Monkey a = new Monkey();
		a.setType("코끼리");
		a.move();
		a.makeSound();
		a.showInfo();
		
		Gorilla g = new Gorilla();
		g.setType("고릴라");
		g.makeSound();
		g.move();
		g.showInfo();

		Gorilla g2 = new Gorilla();
		System.out.println(g.equals(g2));
		String abc = new String("abc");
		System.out.println(g.equals(abc));
		
		Animal g3 = new Gorilla();
		
		// 객체를 println()에 넣으면 어떻게 될까?
		System.out.println(g);
		System.out.println(g2);
		System.out.println(g3);
	}
}
