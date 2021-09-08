package algorithm;

public class Involution {

	public static void main(String[] args) {
		int a,b;
		a = 5;
		b = 3;
		
		int result = 1;
		
		for(int i=0 ; i < b ; i++) {
			result = result * a;
		}
		System.out.println(result);
	}
}
