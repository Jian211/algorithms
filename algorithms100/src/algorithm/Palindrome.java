package algorithm;

public class Palindrome {

	public static void main(String[] args) {
		// �Էµ� ���� �Ӹ���������� �Ǻ��Ͻÿ�. 
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
