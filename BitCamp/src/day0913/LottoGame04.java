package day0913;

import java.util.Scanner;

public class LottoGame04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("-----------------------------------");
			System.out.printf("%1d��° ���ڸ� �Է��ּ���.\n",i+1);
			int tmp = scanner.nextInt();
			int j = 0;
			boolean pass = true;
			System.out.println("�Է��Ͻ� ���ڴ� "+tmp+" �Դϴ�.");
			while(pass) {
				if(tmp == numbers[j]) {
					System.out.printf("�ߺ��� ���ڰ� �ԷµǾ����ϴ�. %1d��°�� �� ���ڸ� �ٽ��ѹ� �Է����ֽʽÿ�.", i);
					tmp = scanner.nextInt();
					System.out.println("�ٽ� �Է����ֽ� ���ڴ� "+tmp+" �Դϴ�.");
				}else{
					j++;
				}
				if(j == 5) pass = false;
			}
			numbers[i] = tmp;
		}
		System.out.println("���� ���ԿϷ�.-------------------");
		for (int n = 0; n < numbers.length; n++) {
			System.out.printf("[%2d]",numbers[n]);
		}
		System.out.println();
		System.out.println("���Ľ���.-------------------.");

		for (int i = 1; i < numbers.length; i++) {
			int bin = 0;
			for (int j = 1; j < numbers.length; j++) {
				if(numbers[j-1] > numbers[j]) {
					bin = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = bin;
				}
			}
		}
		
		
		
		for (int n = 0; n < numbers.length; n++) {
			System.out.printf("[%2d]",numbers[n]);
		}
		scanner.close();
	}
}
