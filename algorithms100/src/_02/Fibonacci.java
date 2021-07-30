package _02;

public class Fibonacci {

	public static void main(String[] args) {
	int firstNum = 1;  // a(n-1)
	int secondNum = 1; // a(n-2)
	int []arr = new int[20];
	
	arr[1] = firstNum;
	arr[2] = secondNum;
	for(int i = 3; i < 10 ; i++) {
		int nowNum = firstNum + secondNum;
		arr[i] = nowNum;
		
		firstNum = secondNum;
		secondNum = nowNum;
		System.out.println("i= " + arr[i]);
	}
		
	}
}
