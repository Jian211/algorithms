package day0913;

import java.util.Random;

public class Ex01Switch {

	public static void main(String[] args) {
		int [] arr = new int[45];
		Random random = new Random();
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(arr.length) + 1 ;
			System.out.printf("%d,[%d3]\n",i+1,arr[i]);
		}
		
		
	}
}
