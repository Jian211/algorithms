package algorithm;

public class Main {

	public static void main(String[] args) {
		int num = 1242;
		
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
		
		//숫자 --> 문자
		String chc = Integer.toString(1234);
		System.out.println((chc));
		
	}

}
