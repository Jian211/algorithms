package algorithm;

public class Binary {

	static void binary(int n) {
		if(n == 1 || n == 0) {
			System.out.print(n);
			return ;
		}
		binary(n/2);
		System.out.print(n%2);
	}
	
	public static void main(String[] args) {
		// 17
		// 8..1
		// 4..0
		// 2..0
		// 1..0
		
		int num = 10;
		
		binary(num);
		
		
	}
}
