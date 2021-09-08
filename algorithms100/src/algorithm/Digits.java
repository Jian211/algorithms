package algorithm;

public class Digits {
	// wari 진수 변환
	static int binaryNumber( int num, int wari) {
		int binary = num%wari;
		int a = num; 
		int b = 0;
		int cnt = 10;

		while(a >= 1) {
			a = a / wari;
			b = a % wari;
			binary += b * cnt;
			cnt = cnt * 10;
		}
		
		return binary;
	}
	public static void main(String[] args) {
		int num = 19;
		int digits = 16;
		
		System.out.println(binaryNumber(num,digits));
		
	}
}
