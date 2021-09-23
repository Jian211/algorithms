package day0910;

public class star10 {

	public static void main(String[] args) {
		int user = 5;
		
		for (int i = 0; i < user*2-1; i++) {
		
			if(i < user) {
				for(int j = 0 ; j < user; j++) {
					if( j+1  > user - i ) {
						System.out.print("  ");
					}else {
						System.out.print(" *");
					}
				}
				for (int k = 1; k < user; k++) {
					if ( k + 1 > i) {
						System.out.print(" *");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			} else {
				// i∞° 5¿ÃªÛ
				for(int x = 0 ; x < user ; x++) {
					if(x+user > i+1 ) {
						System.out.print("  ");
					}else {
						System.out.print(" *");
					}
				}
				for(int u = 0 ; u < user-1; u++) {
					if( i - user < user- u-3) {
						System.out.print("  ");
					}else {
						System.out.print(" *");
					}
				}
				System.out.println();
			}
		}
	}

}
