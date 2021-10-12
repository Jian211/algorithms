package study;

public class BubbleSort {
	
	/*
	 	버블정렬이란?
	 	" 바로 옆에 있는 수랑 비교해서 작은 수를 앞에다 놓으면 어떨까 ? " 라는 질문에서 시작되었다.
	 	
	 	매우 직관적이며, 구현하기 쉽지만 알고리즘들 중에서 최악의 효율을 지니고 있다.
	 	
		회전을 돌때마다 가장 큰값이 맨뒤로 가는 것이 특징이다.
		
		선택정렬과 같은 시간복잡도 O(N^2)  or  O(N * N) 
	  	를 갖고 있지만 실제로 수행을 해보면, 버블정렬이 더욱 복잡하다는 것을 알수 있따.
	  	이유는, 선택정렬 같은 경우는 가장 작은값을 하나 집어 마지막에만 스위칭을 하지만,
	  	
	  	버블정렬 같은 경우는 매번 스위칭을 해주기 때문에 알고리즘들 가운데서는 최악의 효율을 지닌다.
	  
	 */
	public static void main(String[] args) {
		int [] arr = {1,6,8,5,4,7,2,3,10,9};
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length - i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]", arr[i]);
		}
	}
}
