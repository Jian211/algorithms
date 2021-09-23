package day0915;

import util.ArrayUtil;

/*
 	�迭�� ���� �Ҵ�(dynamic allocation)
 	�츮�� ������ �迭�� ũ�⸦ �����Ͽ� �ش�ũ�⸸ ����Ͽ���.
 	
 	#���� : ũ�Ⱑ 4�� int �迭 > int[] arr = new int[4];
 	ũ�Ⱑ �����Ǿ��ִ� ���� �Ҵ� �迭�� ���,
 	�츮�� ������ ũ�⺸�� ���� ���� �ְ� �; ���� �� ����.
 	����, �⺻�� ������Ÿ���� �迭�� ��� 0����, ������ ������Ÿ���� �迭�� ��� null�� �ʱ�ȭ�� ������
 	�츮�� ��� ���� �迭�� �����ߴ��� �˾Ƴ��� ���ؼ��� �߰������� �۾��� �Ͽ���
 	Ư���� ������ �ʱ�ȭ�� �迭�� ĭ�� ��ĭ���� �˾ƾ��Ѵ�.

	�̷��� ������ �ذ��ϱ� ���� ���� ������ �ٷ� "�����Ҵ�"
	�����Ҵ� �迭�� ���, �迭�� ũ�Ⱑ �߰��ϸ� �þ�� �����ϸ� �پ��� �����ο� ũ�⸦ ������ �ȴ�.

	��, ���� �Ҵ��� ���, ���� �迭�� �ּҰ��� ������ä �ٲٴ� ���� �ƴ϶�
	���ο� �迭�� ���� ������ ���� �� �ش� �迭�� ���Ͻ��Ѽ� ���� �迭�� ���� ����� ����� ����ϰԵȴ�.
*/

public class Ex07DynamicAlloc {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		String [] arr1 = {"����","���","��"};
		/*
		
		// size
		System.out.println("1. size(arr)");
		System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
		
		// empty
		System.out.println("2. isEmpty(arr)");
		System.out.println("ArrayUtil.isEmpty(arr): " + ArrayUtil.isEmpty(arr));
		
		// contains
		System.out.println("3. contains(arr)");
		System.out.println("ArrayUtil.contains(arr): " + ArrayUtil.contains(arr,3));
		System.out.println("ArrayUtil.contains(arr): " + ArrayUtil.contains(arr,5));
		
		// indexOf
		System.out.println("4. indexOf(arr)");
		System.out.println("ArrayUtil.indexOf(arr): " + ArrayUtil.indexOf(arr,3));
		System.out.println("ArrayUtil.indexOf(arr): " + ArrayUtil.indexOf(arr,50));
		
		// lastIndexOf
		System.out.println("5. lastIndexOf(arr)");
		System.out.println("ArrayUtil.lastIndexOf(arr): " + ArrayUtil.lastIndexOf(arr,1));
		System.out.println("ArrayUtil.lastIndexOf(arr): " + ArrayUtil.lastIndexOf(arr,50));
		
		// set
		System.out.println("9. set");
		System.out.println("set() �� ArrayUtil.get(arr,2):  "+ ArrayUtil.get(arr, 2));
		System.out.println("set() �� ArrayUtil.get(arr,2):  "+ ArrayUtil.get(arr, 2));

		// removeByIndex 
		System.out.println("10. removeByIndex");
		ArrayUtil.toString(arr);
		ArrayUtil.toString(ArrayUtil.removeByIndex(arr, 0));
		System.out.println();
		
		//removeByElement
		System.out.println("10. removeByElement");
		ArrayUtil.toString(arr);
		ArrayUtil.toString(ArrayUtil.removeByElement(arr, 0));
		System.out.println();
		*/
		
		System.out.println("1. toString");
		ArrayUtil.toString(arr1);
		
	}

}
