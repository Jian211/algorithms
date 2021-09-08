package algorithm;

public class Main2 {

	public static void main(String[] args) {
		int num = 5;
		// 1  2  3  4
		// 8  7  6  5
		// 9 10 11 12 이런식으로 출력하라 (ㄹ 모양)
		int [][] arr = new int[num][num];
		
		boolean a = false;
		
		for(int i = 0 ; i < num ; i++) {
			if(i % 2 == 0) {
				for(int j=0 ; j < num; j++) {
					arr[i][j] = num*i + j + 1;
					System.out.printf("%3d", num*i + j + 1);
				}
			}else {
				for(int j= num - i ; j >= 0 ; j--) {
					arr[i][j] = num * i + num - j;
					System.out.printf("%3d", num * i + num - j);
					if( num * i + num - j == 0 ) {
						a = true;
					}
				}
			}
			System.out.println();
		}
//		for(int i=0 ; i < num ; i++) {
//			for(int j=0 ; j < num ; j++) {
//				System.out.printf("%3d", arr[i][j]);
//			}
//			System.out.println();
//		}
		System.out.println(a);
	}
}
