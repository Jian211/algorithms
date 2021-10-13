package workBook;

import java.util.Scanner;

/*
  첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
  둘째 줄부터 N개의 줄에는 수 주어진다.
  이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
  수는 중복되지 않는다.
 */


//선택정렬을 활용해보자
// 최소값 min을 설정후에 계속해서 값을 교체하는 방식을 기억할 것.
public class SortBackjun2750 {
	public static void main(String[] args) {
		int [] arr = new int[1001];
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int min;
		int index = 0;
		for (int i = 0; i < num; i++) {
			min = 1001;
			for (int j = i; j < num; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.printf("[%d]",arr[i]);
		}
	}
}
