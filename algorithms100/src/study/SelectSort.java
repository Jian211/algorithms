package study;

public class SelectSort {
	/*
	 	���������̶�?
	 	" ���� ���� ���� �� ������ ������ ���� ���� ���? "
	 	���� ���۵� �����̸�, �ٽ��̴�.
	 	
	 	���������� n(n+1)/2�� �ӵ��� �����ִ�.
	 	�̰��� ��� ǥ������� O(N^2) ����Ѵ�.
	 	
	 	���������� Ư¡�� �����Ͱ� ������ ���� ���� ���� �ð��� ���� �� ���� ���ٴ� ���̴�.
	 	��, �����͵��� ���� �� ���������� ����Ѵٸ� ��ȿ������ Ȱ���̶�� �� �� �ִٴ� ���̴�.
	 
	   	����, 10���� ������ ������ �ִٰ� ���� ��,
	   	ó������ 10�� �� ������ 9�� .... 1���� �� ������ �˻縦 �Ѵ�. 

	  
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
