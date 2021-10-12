package study;

public class QuickSortMain {
	/*
		퀵소트란?  quickSort
		" 기준이되는(pivot)을 선정 후에 기준점을 시작점과 끝나는 점을 분할비교 "
		하는 것이다.
		
		시간복잡도는 n(n log n) 으로써 엄청 빠른 효율을 보여주고 있다.
		다만, 최악의 경우는 n(n*n)으로써 삽입,선택,버블과 같은 것을 볼 수 있다.
		
		재귀함수를 통하여, 퀵소트는 만들어진다.
	
	 */
	
	// 배열을 받아옴,
	static void quickSort(int [] arr) {
		//퀵소트는 배열과 처음 값의 인덱스 그리고 마지막 인덱스 값을 넣어준다.
		quickSort(arr, 0 ,arr.length - 1);
	}

	static void quickSort(int [] arr, int start , int end) {
		int pivot = start;
		int i = start + 1;
		int h = end;
		
		if(start >= end) return;
		
		while(i < h) {
			while(i <= end && arr[i] <= arr[pivot]) i++;
			while(h > start && arr[h] >= arr[pivot]) h--;
			
			if(i > h) {
				int temp = arr[h];
				arr[h] = arr[pivot];
				arr[pivot] = temp;
			} else {
				int temp = arr[i];
				arr[i] = arr[h];
				arr[h] = temp;
			}
			
			quickSort(arr, start, h - 1);
			quickSort(arr, h + 1, end);
		}
	
	}
	
	
	
	public static void main(String[] args) {
		int [] arr = {45,12,87,23,57,13,6,78,90,55};
		
		quickSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]",arr[i]);
			
		}
	}
}
