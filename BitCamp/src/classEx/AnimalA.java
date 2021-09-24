package classEx;

public abstract class AnimalA {
	// 추상 메소드의 경우, 우리가 클래스와 메소드를 선언할 때 abstract만 붙여주고 
	// 실제 코드 구현은 하지 않는다.
	
	public abstract void makeSound();
	public abstract void move();

	// 추상 메소드는 쉽게 표현하자면
	// 이 클래스를 상속 받는 클래스는 반드시 
	// 해당 추상 메소드르을 재정의(오버라이딩)하여 가지고 있어야한다.
	public void printInfo() {
		System.out.println("동물입니다.");
	}
	public void ok() {
		System.out.println("ok");
	}
}
// 추상클래스
// 인터페이스
// 상속 