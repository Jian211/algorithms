package _10;

public class Main {

	public static void main(String[] args) {
 		int num = 6;
		
		int a = 0;
		for(int i=1 ; i <= num ; i++) {
			for(int j=1 ; j <= num; j++) {
				a += 1;
				System.out.printf("%3d",a);
			}
			System.out.println();
		}
		//// 영상 본 후..
		System.out.println("영상본후");
		for(int i=0 ; i < num ; i++) {
			for(int j=0 ; j < num ; j++) {
				System.out.printf("%3d",i * num + j + 1);
			}
			System.out.println();
		}
		
		
	}	
}
