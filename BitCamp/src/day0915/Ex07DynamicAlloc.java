package day0915;

import util.ArrayUtil;

/*
 	배열의 동적 할당(dynamic allocation)
 	우리가 기존에 배열은 크기를 지정하여 해당크기만 사용하였다.
 	
 	#예시 : 크기가 4인 int 배열 > int[] arr = new int[4];
 	크기가 고정되어있는 정적 할당 배열의 경우,
 	우리가 지정된 크기보다 많은 값을 넣고 싶어도 넣을 수 없다.
 	또한, 기본형 데이터타입의 배열일 경우 0으로, 참조형 데이터타입의 배열의 경우 null로 초기화가 되지만
 	우리가 몇개의 값을 배열에 저장했는지 알아내기 위해서는 추가적으로 작업을 하여서
 	특이한 값으로 초기화된 배열에 칸이 몇칸인지 알아야한다.

	이러한 문제를 해결하기 위해 나온 개념이 바로 "동적할당"
	동적할당 배열의 경우, 배열의 크기가 추가하면 늘어나고 삭제하면 줄어드는 자유로운 크기를 가지게 된다.

	단, 동적 할당의 경우, 기존 배열의 주소값을 유지한채 바꾸는 것이 아니라
	새로운 배열을 만들어서 변경을 가한 후 해당 배열을 리턴시켜서 기존 배열에 덮어 씌우는 방법을 사용하게된다.
*/

public class Ex07DynamicAlloc {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		String [] arr1 = {"감자","사과","배"};
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
		System.out.println("set() 전 ArrayUtil.get(arr,2):  "+ ArrayUtil.get(arr, 2));
		System.out.println("set() 전 ArrayUtil.get(arr,2):  "+ ArrayUtil.get(arr, 2));

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
