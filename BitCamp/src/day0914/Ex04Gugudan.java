package day0914;

public class Ex04Gugudan {

	public static void main(String[] args) {
		int [][] arr = new int [9][9];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = (i+1) * (j+1);
				System.out.printf("[%1d X %1d = %2d]",j+1,i+1,arr[j][i]);
			}
			System.out.println();
		}
		
	}
}
