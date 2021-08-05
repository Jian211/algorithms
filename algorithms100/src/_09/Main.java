package _09;

public class Main {

	public static void main(String[] args) {
		int num = 1242;
		
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
		
	
	}

}
