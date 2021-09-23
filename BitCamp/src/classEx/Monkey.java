package classEx;

public class Monkey extends Animal{
	public Monkey() {
		System.out.println("----------------------------");
		System.out.println("monkey 클래스 생성자 호출");
		System.out.println("----------------------------");
	}
	// makeSound()를 오버라이드
	public void makeSound() {
		System.out.println("우끼끾!!");
	}
	
	public void move() {
		System.out.println("나무 사이를 점프하면서 움직입니다.");
	}
}

