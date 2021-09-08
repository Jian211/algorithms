package algorithm;

public class Main5 {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d", j * n + 1 + i);
			}
			System.out.println();
		}
		
		System.out.println("영상 본 후,,,");
		
		int b = 1;
		int [][]arr = new int [n][n];
		for(int i=0 ; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = b++;
			}
		}
		
		for(int i=0 ; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
