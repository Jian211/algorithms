package algorithm;

import java.util.Iterator;

public class Binary {
	static int result ;
	static String chg = "";
	static int x = 0;	
	
	static int changeA (String a ) {
		int ok = 0;
		for (int i = 0; i < a.length(); i++) {
			
		}
		
		return a;
	}
	
	static int binary(int n) {
		System.out.println("현재의 n의 값은 > "+ n);
		if(n == 1 || n == 0) {
			chg += Integer.toString(n);
			System.out.println("result의 값은 > "+chg);
			return n;
		}
		System.out.println(n%2);
		chg += Integer.toString(n%2);
		System.out.println("현재의 result의 값은 > "+ result);
		x++;
		System.out.println("---------------");
		return binary(n/2);
	}
	
	public static void main(String[] args) {
		int num = 17;
		
		binary(num);
		
		
	}
}
