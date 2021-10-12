package study;

public class QuickSortMain {
	/*
		퀵소트란? 
		" 기준이되는(pivot)을 선정 후에 기준점을 시작점과 끝나는 점을 분할비교 "
		하는 것이다.
		
		시간복잡도는 n(n log n) 으로써 엄청 빠른 효율을 보여주고 있다.
		다만, 최악의 경우는 n(n*n)으로써 삽입,선택,버블과 같은 것을 볼 수 있다.
		
		재귀함수를 통하여, 퀵소트는 만들어진다.
	
	 */

	private static void quick(int[] arr, int first, int last) {
		System.out.printf("\n\n**first %d, last %d\n",first,last);
		print(arr);
		
		if(first >= last) return;
	
		//첫번째 인덱스 
		int pivot = first;
		int i = first + 1;
		int j = last;
		System.out.printf("\npivot = %d \n", arr[pivot]);
		
		while(i <= j) {
			while(i <= last && arr[i] <= arr[pivot]) i++;
			while(j > first && arr[i] >= arr[pivot]) j--;
			if( i > j ) {
				System.out.println(arr[pivot]);
				System.out.println(j);
				swap(arr,pivot,j);
			}
			else swap(arr,i,j);
			
			System.out.println("swap result");
			print(arr);
		} 
		System.out.println("pivot result");
		print(arr);
		
		quick(arr, first, j - 1);
		quick(arr, j + 1,  last);
	}
	
	private static void swap(int[] arr, int i, int j) {
		System.out.println("i  :"+ i);
		System.out.println("j  :"+ j);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]",arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(" 퀵 정렬을 시작합니다. ");
		int []arr = {54,34,41,89,67,16,52,23};
		
		quick(arr, 0, arr.length-1);
	}

}
