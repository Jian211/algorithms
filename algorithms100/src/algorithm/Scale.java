package algorithm;

public class Scale {

	static String result(int [] arr ) {
		String ascending = "ascending";
		String descending = "descending";
		String mixed = "mixed";
		String result = null;
		
		boolean ok = false;
		
		for (int i = 1; i < arr.length; i++) {
			int numBefore = arr[i-1];
			int numNow = arr[i];
			
			if(numBefore - numNow == -1)  ok = true; 
			else if(numBefore - numNow ==  1)  ok = false; 
			else return mixed;
		}
		return ok == true ? ascending : descending ; 
	}
	
	public static void main(String[] args) {
		int [] exA = {1,2,3,4,5,6,7,8};	// ascending 오름차순 출력
		int [] exB = {8,7,6,5,4,3,2,1}; // descending 내림차순 출력
		int [] exC = {8,1,7,2,6,3,5,4}; // mixed 섞임 출력 
		
		System.out.println(result(exA));
		System.out.println(result(exB));
		System.out.println(result(exC));
	}
}
