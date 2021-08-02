package _06;

public class GreatestCommonMeasure {
	public static void main(String[] args) {
		//입력된 두수의 최대공약수를 구하시오.  정답 : 6
		int fir = 12;
		int sec = 18;
		
		//최대공약수 변수.
		int greatestCommonMeasure = 1;

		while(true) {
			if(fir % 2 == 0 && sec % 2 == 0) {
				greatestCommonMeasure = greatestCommonMeasure *2;
				fir = fir/2;
				sec = sec/2;
			}else if(fir % 3 == 0 && sec % 3 == 0){
				greatestCommonMeasure = greatestCommonMeasure *3;
				fir = fir/3;
				sec = sec/3;
			}else {
				break;
			}
		}
		System.out.println("영상 본 후");
		int num1 = 12;
		int num2 = 18;
	
		// 최대 공약수
		System.out.println(num1 +"과"+num2+"의 최대 공약수는? "+gcd(num1,num2)); 	// 6
		System.out.println("10과 20의 최대 공약수는? "+gcd(10, 20));    	// 10
		System.out.println("301235과 21045의 최대 공약수는? "+gcd(301235, 21045)); // 5
		
		// 최소 공배수 
		System.out.println("최소 공배수 = "+lcm(num1, num2));	// 36
		System.out.println("최소 공배수 = "+lcm(8,22));  		// 88
		System.out.println("최소 공배수 = "+lcm(12352,21352));	// 32967488
	}
	
	// 유클리드 호제법. 최대 공약수를 구하는 알고리즘 공식
	// 참고 https://blog.naver.com/dkdlfjq31/222283997197
	static int gcd(int a, int b) {
		int chgtmp = 0;
		if(a < b) {
			chgtmp = b;
			b = a;
			a = chgtmp;
		}
		while( b != 0 ) {
			int tmp = a % b;	// 몫 저장하기위한 변수. 
			a = b;
			b = tmp;
		}
		return a;
	}
	// 최소 공배수 공식 
	static int lcm(int a,int b) {
		return a*b / gcd(a,b);
	}
}
