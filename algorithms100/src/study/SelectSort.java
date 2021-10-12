package study;

public class SelectSort {
	/*
	 	선택정렬이란?
	 	" 가장 작은 수를 맨 앞으로 가져가 보는 것은 어떨까? "
	 	에서 시작된 질문이며, 핵심이다.
	 	
	 	선택정렬은 n(n+1)/2의 속도를 갖고있다.
	 	이것을 빅오 표기법으로 O(N^2) 라고한다.
	 	
	 	선택정렬의 특징은 데이터가 많으면 많을 수록 연산 시간이 점점 더 많아 진다는 것이다.
	 	즉, 데이터들이 많을 때 선택정렬을 사용한다면 비효율적인 활용이라고 볼 수 있다는 것이다.
	 
	   	만약, 10개의 데이터 갯수가 있다고 했을 때,
	   	처음에는 10개 그 다음은 9개 .... 1개가 될 때까지 검사를 한다. 

	  
	 */
	
	public static void main(String[] args) {
		int [] arr = {1,6,8,5,4,7,2,3,10,9};
		int temp = 0;
		int index= 0;
		int min;
		for (int i = 0; i < arr.length; i++) {
			min = 99;
			for (int j = i; j < arr.length; j++) {
				if(min > arr[j]) {
					min  = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp ;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]",arr[i]);
		}
		
	}
}
