package classEx;

//추상클래스 AnimalA를 상속받는 Dog 클래스
public class Dog extends AnimalA{
	// 추상클래스를 상속받는 클래스는 
	// 반드시 추상클래스 안의 추상 메소드들을 오버라이딩 해주어야한다.
	
	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}

	@Override
	public void move() {
		System.out.println("이곳저곳 어휴 정신사납당!");
	}

}
