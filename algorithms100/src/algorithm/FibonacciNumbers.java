package algorithm;

public class FibonacciNumbers {
	
	static int fibonacci (int n) {
		if( n == 1 ) return 1;
		if( n == 2 ) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2) ;
	}
	// �׻� ��Ģ�� �� ã�� ���� �O���ϴ�. 
	public static void main(String[] args) {
		int end	=	6;
		System.out.println(fibonacci(end));

		
	}
}
