package algorithm;

public class Factorai {

	public static void main(String[] args) {
		// 팩토리얼(계승) 
		int factNum = 5;
		
		int a = 1;
		for(int i=1; i <= factNum ;i++) {
			a *= i;
		}
		// 5! = 5 * 4 * 3 * 2 * 1
		// 5! = 5(5-1)(5-2)(5-3)(5-4)
		// n! = n(n-1)(n-2)(n-3)(n-4)
		// 확실히 재귀함수랑 관련이 있어보인다. 재귀함수를 만드려면
		System.out.println(dorumamu(4)); // 24
		System.out.println(dorumamu(5)); // 120
		System.out.println(dorumamu(6)); // 720
		
	}
		static int dorumamu (int a) {
			return a == 1 ? 1 : a * dorumamu(a - 1);
		}
}
