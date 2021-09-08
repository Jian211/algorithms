package algorithm;

public class Snail {
	static void print (int [][]arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int num = 6;
		int [][] snail = new int[num][num];

		int col = 0; // 열 세로 
		int row = -1;  // 행 가로
		int value = 0;
		int changePM = 1;
		int length = num;
		
		while(true) {
			for (int i = 0; i < length; i++) {
				value++;
				row += changePM;
				snail[col][row] = value;
			}

			length--;
			
			if(length == 0) break;
			
			for (int i = 0; i < length; i++) {
				value++;
				col+= changePM;
				snail[col][row] = value;
			}
			changePM *= -1;
		}
		
		print(snail);
	}
}
