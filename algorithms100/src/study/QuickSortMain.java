package study;

public class QuickSortMain {
	/*
		����Ʈ��? 
		" �����̵Ǵ�(pivot)�� ���� �Ŀ� �������� �������� ������ ���� ���Һ� "
		�ϴ� ���̴�.
		
		�ð����⵵�� n(n log n) ���ν� ��û ���� ȿ���� �����ְ� �ִ�.
		�ٸ�, �־��� ���� n(n*n)���ν� ����,����,����� ���� ���� �� �� �ִ�.
		
		����Լ��� ���Ͽ�, ����Ʈ�� ���������.
	
	 */

	private static void quick(int[] arr, int first, int last) {
		System.out.printf("\n\n**first %d, last %d\n",first,last);
		print(arr);
		
		if(first >= last) return;
	
		//ù��° �ε��� 
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
		System.out.println(" �� ������ �����մϴ�. ");
		int []arr = {54,34,41,89,67,16,52,23};
		
		quick(arr, 0, arr.length-1);
	}

}
