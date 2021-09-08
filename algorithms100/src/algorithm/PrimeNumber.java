package algorithm;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13;
		
		// 소수란 나누어 지는 숫자가 1과 자신 뿐이므로, 자신 + 1을 했을때 계산한 값과 맞으면 소수라고 생각했다. 
		int sum = 0;
		
		for(int i=1; i <= num;i++) {
			if( num % i == 0) {
				sum = sum + i;
			}
			if( sum == num +1 ) {
				System.out.println(num + "은 소수입니다. ");
			}
		}
		// 영상 본 후 ==================================
		//첫번째 방법
		System.out.println("checkA = "+checkA(13));  // true == 소수
		System.out.println("checkB = "+checkB(13));  // true == 소수
		System.out.println("checkC = "+checkC(13));  // true == 소수
		System.out.println("checkD = "+checkD(13));  // true == 소수
		System.out.println("---");
		System.out.println(checkA(12));  // false != 소수
		System.out.println(checkB(12));  // false != 소수
		System.out.println(checkC(12));  // false != 소수
		System.out.println(checkD(12));  // false != 소수
		System.out.println("---");
		System.out.println(checkA(122));  
		System.out.println(checkB(1245)); 
		System.out.println(checkC(263));  
		System.out.println(checkD(779));  
	}
	// 첫번째 방법 주어진 값이 1과 본인을 제외한 숫자가 나누어지는지의 대하여,
	static boolean checkA ( int num ) {
		for(int i = 2; i < num ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// 두번째 방법으로 주어진 값의 절반만 비교해도 같은 결과가 나온다.
	static boolean checkB(int num) {		
		for(int i = 2; i < num/2 ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// 세번째 방법으로 i를 제곱해서 연산을한다. (시간이 2배로 준다.)
	static boolean checkC(int num) {
		for(int i = 2; i*i <= num ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// 네번째 방법 
	static boolean checkD(int num) {
		if(num % 2 == 0 && num % 3 == 0) {
			return false;
		}
		return true;
	}
}
