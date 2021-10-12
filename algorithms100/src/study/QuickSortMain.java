package study;

public class QuickSortMain {
	/*
		����Ʈ��?  quickSort
		" �����̵Ǵ�(pivot)�� ���� �Ŀ� �������� �������� ������ ���� ���Һ� "
		�ϴ� ���̴�.
		
		�ð����⵵�� n(n log n) ���ν� ��û ���� ȿ���� �����ְ� �ִ�.
		�ٸ�, �־��� ���� n(n*n)���ν� ����,����,����� ���� ���� �� �� �ִ�.
		
		����Լ��� ���Ͽ�, ����Ʈ�� ���������.
	
	 */
	
	// �迭�� �޾ƿ�,
	static void quickSort(int [] arr) {
		//����Ʈ�� �迭�� ó�� ���� �ε��� �׸��� ������ �ε��� ���� �־��ش�.
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
