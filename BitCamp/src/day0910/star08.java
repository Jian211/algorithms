package day0910;

public class star08 {

	public static void main(String[] args) {
		int user = 5;
		
		for (int i = 0; i < user*2; i++) {
			if(i < user) {
				for(int j = 0 ; j < user; j++) {
					if( j+1 >= user - i ) {
						System.out.print(" *");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println(" ");
			}else{
				for(int x = 0 ; x < user ; x++) {
					if(x+user >= i+1 ) {
						System.out.print(" *");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

	}

}
