package workBook;

import java.util.Scanner;

/*
 	ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����.
 	��° �ٺ��� N���� �ٿ��� ���� �־�����.
 	�� ���� ������ 1,000,000���� �۰ų� ���� �����̴�.
	���� �ߺ����� �ʴ´�.
 
 */
public class SortBackjun2751 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		int [] arr = new int[userChoice];
		
		// �迭�� �� �ֱ�
		for (int i = 0; i < userChoice; i++) {
			arr[i] = scanner.nextInt();
		} 
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]",arr[i]);
		}
		System.out.println();
		
		quickSort(arr,0,arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]",arr[i]);
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		int pivot = start;
		int i = start+1;
		int j = end;
		
		if(i > j) return;
		
		while(i < j) {
			while(arr[i] <= arr[pivot] && i < end) {
				i++;
			}
			while(arr[j] >= arr[pivot] && start < j) {
				j--;
			}
			
			if(i >= j) {
				int temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			quickSort(arr, start, j-1);
			quickSort(arr, j + 1, end);
		}
		
		
	}
}
