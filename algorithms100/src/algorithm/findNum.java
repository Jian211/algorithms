package algorithm;

public class findNum {

	public static void main(String[] args) {
		int[] numberList = {1,2,2,3,1,4,2,2,4,3,5,3,2};
		
		// 영상보기전 혼자 한 것.		
		// 1~5까지의 숫자를 담을 리스트 
		int [] savedNumbers = new int[5];
		
		// numberList의 숫자들을 savedNumbers에 넣기  
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] == 1)	savedNumbers[0]++;
			if(numberList[i] == 2)	savedNumbers[1]++;
			if(numberList[i] == 3)	savedNumbers[2]++;
			if(numberList[i] == 4)	savedNumbers[3]++;
			if(numberList[i] == 5)	savedNumbers[4]++;			
		}
		
		// 어떤 숫자가 큰지 비교해보기.  --> 너무 안섹시해 ( 재귀함수를 써도 될 것 같은데..)
		int bigNum = compare(savedNumbers[4],compare(savedNumbers[3],compare(savedNumbers[2],compare(savedNumbers[0], savedNumbers[1]))));
		// 가장 많이 나온 숫자는?
		for (int i = 0; i < savedNumbers.length; i++) {
			if(savedNumbers[i] == bigNum) {
				System.out.println(bigNum +"번 등장한 주인공은 "+ (i+1));
			}
		}
		// ------------------------------------------- 영상 본 후
		int [] countNumbers = new int [numberList.length];
		
		for (int i = 0; i < countNumbers.length; i++) 	countNumbers[numberList[i]]++;
		
		//횟 수
		int emt = 0;
		int last = 0;
		
		for (int i = 0; i < countNumbers.length; i++) {
			if(countNumbers[i] > emt) {
				emt = countNumbers[i];
				last = i;
			}
		}
		System.out.println(emt+"번 등장한 주인공은" +last);
		
	}
	
	static int compare(int a, int b) {
		if( a > b) {
			return a;
		}else {
			return b;
		}
	}
}
