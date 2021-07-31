package _04;

import java.util.ArrayList;

public class DecimalDigits {
	public static void main(String[] args) {
		// 문제. 10진수를 2진수로 변환 하시오.
		int num = 30;
		
		//가변의 어레이 생성
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//몫과 나머지 변수 생성
		int q; // 몫 > quotient
		int r; // 나머지 > remainder
		
		// while을 써서 몫이 1이나 0이  될 때까지 2를 계속 나눈다.
		while( 0 < num) {
			q = num/2;
			r = num%2;
			arr.add(r);
			num = q;
		}
		System.out.println("2진수로 변환한 값은 :"+arr.get(4)+arr.get(3)+arr.get(2)+arr.get(1)+arr.get(0));		 
	}
}
