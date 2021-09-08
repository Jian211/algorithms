package algorithm;

public class Fatorial {

	static int fatorial(int num) {
		if(num == 1) return 1;
		return num * fatorial(num-1);
	}
	
	public static void main(String[] args) {
		int num = 5;
		int result = 0;
		
		result = 0;
		
		System.out.println(fatorial(4));
	}
}
