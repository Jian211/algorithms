package algorithm;

public class Recursive {
	
	static int way1 ( int fir , int sec) {
		int result = 0;
		for (int i = fir; i <= sec; i++) {
			result += i;
		}
		return result;
	}
	
	static int way2 ( int a , int b) {
		if(a == b) return b;
		return a+way2(++a,b);
	}
	
	public static void main(String[] args) {
		System.out.println(way1(3,5));
		System.out.println(way2(3,5));
		
	}

}
