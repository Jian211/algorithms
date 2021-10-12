package study;

public class InsertSort {	
	/*
	 	삽입정렬이란?
	 	" 정렬이 되어있다고 가정한 후에 정렬을 수행하는 알고리즘이다. "
	 	
	 	버블정렬과 선택정렬과 같은 시간복잡도를 갖는다.
	 	다만, 다른점은 효율적인 수행으로 인하여 같은 시간복잡도를 갖고있다고 하여도
	 	삽입정렬이 훨씬 빠르다.
	 	또한, 거의 정렬된 상태에서의 배열에서 삽입정렬을 수행 할 시에는 시간적,공간적 측면에서는
	 	거의 최고라고 할수 있다.
	 
	 	삽입 정렬의 특징은,
	 	앞의 숫자는 정렬되어 있다고 가정하고, 그 뒤에 숫자를 앞의 숫자와 비교하여,
	 	작은지 큰지를 비교해 정렬해 나간다.
	 	
	 */

	public static void main(String[] args) {
		int [] arr = {4,6,8,5,1,7,2,3,10,9};
		int temp,j;
		
		for (int i = 1; i < arr.length - 1; i++) {
			j = i;
			while(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				if(j > 0) {
					j--;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]", arr[i]);
		}
	}
}
