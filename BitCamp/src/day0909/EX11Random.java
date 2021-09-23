package day0909;
// Random Class
// Random은 정해진 규칙 없이 무수히 많은 숫자들이 나열 되어있고,
// 그것을 우리가 하나씩 뽑는 개념인 난수를 담당하는 클래스로써,
// 우리가 램ㄴ덤한 숫자를 뽑을 수 있게 해준다. 
// scanner와 마찬가지로 java.util에 있는 클래스를 불러와 사용이 가능하다.

import java.util.Random;
public class EX11Random {

	public static void main(String[] args) {
		Random random = new Random();
		
		// random은 내부적으로
		// 0~1사이의 무수한 실수를 뒤죽박죽 순서로 가지고있다.
		// 우리가 요청할때마다 그 실수를 하나씩 꺼내주는 개념이다.
		// 만약 우리가 실수 데이터타입의 난수가 필요할 때에는 메소드 넥스트 더블을 사용한다.
		
		System.out.println("1. nextDouble()");
		System.out.println("	1."+ random.nextDouble());
		System.out.println("	2."+ random.nextDouble());
		System.out.println("	3."+ random.nextDouble());
		System.out.println("	4."+ random.nextDouble());
		System.out.println("	5."+ random.nextDouble());

		// nextInt()
		System.out.println("2. nextInt()");
		System.out.println("	1."+ random.nextInt());
		System.out.println("	2."+ random.nextInt());
		System.out.println("	3."+ random.nextInt());
		System.out.println("	4."+ random.nextInt());
		System.out.println("	5."+ random.nextInt());

		// nextInt(MAX)
		System.out.println("3. nextInt(MAX)");
		System.out.println("	1."+ random.nextInt(20));
		System.out.println("	2."+ random.nextInt(20));
		System.out.println("	3."+ random.nextInt(20));
		System.out.println("	4."+ random.nextInt(20));
		System.out.println("	5."+ random.nextInt(20));
	}
}
