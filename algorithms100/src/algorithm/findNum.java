package algorithm;

public class findNum {

	public static void main(String[] args) {
		int[] numberList = {1,2,2,3,1,4,2,2,4,3,5,3,2};
		
		// ���󺸱��� ȥ�� �� ��.		
		// 1~5������ ���ڸ� ���� ����Ʈ 
		int [] savedNumbers = new int[5];
		
		// numberList�� ���ڵ��� savedNumbers�� �ֱ�  
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] == 1)	savedNumbers[0]++;
			if(numberList[i] == 2)	savedNumbers[1]++;
			if(numberList[i] == 3)	savedNumbers[2]++;
			if(numberList[i] == 4)	savedNumbers[3]++;
			if(numberList[i] == 5)	savedNumbers[4]++;			
		}
		
		// � ���ڰ� ū�� ���غ���.  --> �ʹ� �ȼ����� ( ����Լ��� �ᵵ �� �� ������..)
		int bigNum = compare(savedNumbers[4],compare(savedNumbers[3],compare(savedNumbers[2],compare(savedNumbers[0], savedNumbers[1]))));
		// ���� ���� ���� ���ڴ�?
		for (int i = 0; i < savedNumbers.length; i++) {
			if(savedNumbers[i] == bigNum) {
				System.out.println(bigNum +"�� ������ ���ΰ��� "+ (i+1));
			}
		}
		// ------------------------------------------- ���� �� ��
		int [] countNumbers = new int [numberList.length];
		
		for (int i = 0; i < countNumbers.length; i++) 	countNumbers[numberList[i]]++;
		
		//Ƚ ��
		int emt = 0;
		int last = 0;
		
		for (int i = 0; i < countNumbers.length; i++) {
			if(countNumbers[i] > emt) {
				emt = countNumbers[i];
				last = i;
			}
		}
		System.out.println(emt+"�� ������ ���ΰ���" +last);
		
	}
	
	static int compare(int a, int b) {
		if( a > b) {
			return a;
		}else {
			return b;
		}
	}
}
