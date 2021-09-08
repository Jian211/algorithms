package algorithm;

public class Game369 {

	public static void main(String[] args) {
		
		for (int j = 1; j <= 100; j++) {
			if( j%10 == 3 || j%10 == 6 || j%10 == 9 ) {
				System.out.println("¦");
			}else{
				System.out.println(j);
			}
		}
		System.out.println();

	}
}
