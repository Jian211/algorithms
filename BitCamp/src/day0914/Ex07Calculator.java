package day0914;

import java.util.Scanner;

public class Ex07Calculator {

	public static void sum (int x, int y) {
		System.out.printf("%2d + %2d = [%2d]\n",x,y,x+y);
	}
	public static void minus (int x, int y) {
		System.out.printf("%2d - %2d = [%2d]\n",x,y,x-y);
	}
	public static void multiply (int x, int y) {
		System.out.printf("%2d x %2d = [%2d]\n",x,y,x*y);
	}
	public static void division (int x, int y) {
		System.out.printf("%2d / %.2f = [%2d]\n",x,(double)y,(double)x/(double)y);
	}
	public static void quota (int x, int y) {
		System.out.printf("%2d %% %2d = [%2d]\n",x,y,x%y);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주십시오.");
		System.out.print(">");
		int a = scanner.nextInt();
		System.out.println("두번째 숫자를 입력해주십시오.");
		System.out.print(">");
		int b = scanner.nextInt();
		sum(a,b);
		minus(a,b);
		multiply(a,b);
		division(a,b);
		quota(a,b);
		scanner.close();
	}
}
