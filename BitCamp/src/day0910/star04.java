package day0910;

public class star04 {

	public static void main(String[] args) {
		int user = 5;
		for (int i = 0; i < user; i++) {
			for( int j = 0; j < user; j++) {
				if( j >= i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
