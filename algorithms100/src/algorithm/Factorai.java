package algorithm;

public class Factorai {

	public static void main(String[] args) {
		// ���丮��(���) 
		int factNum = 5;
		
		int a = 1;
		for(int i=1; i <= factNum ;i++) {
			a *= i;
		}
		// 5! = 5 * 4 * 3 * 2 * 1
		// 5! = 5(5-1)(5-2)(5-3)(5-4)
		// n! = n(n-1)(n-2)(n-3)(n-4)
		// Ȯ���� ����Լ��� ������ �־�δ�. ����Լ��� �������
		System.out.println(dorumamu(4)); // 24
		System.out.println(dorumamu(5)); // 120
		System.out.println(dorumamu(6)); // 720
		
	}
		static int dorumamu (int a) {
			return a == 1 ? 1 : a * dorumamu(a - 1);
		}
}
