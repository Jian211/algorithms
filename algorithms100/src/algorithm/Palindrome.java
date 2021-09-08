package algorithm;

public class Palindrome {

	public static void main(String[] args) {
		// 입력된 수가 팰린드롬인지를 판별하시오. 
		int num = 123254321;
		String s = Integer.toString(num);
		boolean result = false;
		
		for (int i = 0; i < s.length()/2; i++) {
			char fir = s.charAt(i);
			char last = s.charAt((s.length()-i-1));
			System.out.println("fir ="+fir);
			System.out.println("last ="+last);
			if(fir == last) {
				result = true;
			}else{
				result = false;
				break;
			}
			System.out.println(result) ;
		}
		System.out.println("result = " + result) ;
	}
}
