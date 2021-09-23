package day0910;

public class star07 {

	public static void main(String[] args) {
		int user = 5;
		String star = "";
		for (int i = 0; i < user*2; i++) {
			if(i < user) {
				star += " *";
				System.out.println(star);
			}else{
				for(int x = i+1-user ; x < user ; x++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
		
	}
}
