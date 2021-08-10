package _14;

public class Cucu {
	public static void main(String[] args) {
		int a,b;
		a = 2;
		b = 3;
		
		for (int i = 1; i < 10; i++) {
			System.out.print(a +"*"+ i +" = " + a*i);
			System.out.print("        ");
			System.out.print(b +"*"+ i +" = " + b*i);
			System.out.println();
		}
		System.out.println("영상본 후 ");
		
		for (int i = 1; i < 10; i++) {
			for (int j = a; j <= b; j++) {
				System.out.printf("%3d *%3d =%3d", j ,i,j*i);
			}
			System.out.println();
		}
		
	}
}
