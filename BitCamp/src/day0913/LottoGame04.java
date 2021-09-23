package day0913;

import java.util.Scanner;

public class LottoGame04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("-----------------------------------");
			System.out.printf("%1d번째 숫자를 입력주세요.\n",i+1);
			int tmp = scanner.nextInt();
			int j = 0;
			boolean pass = true;
			System.out.println("입력하신 숫자는 "+tmp+" 입니다.");
			while(pass) {
				if(tmp == numbers[j]) {
					System.out.printf("중복된 숫자가 입력되었습니다. %1d번째에 들어갈 숫자를 다시한번 입력해주십시오.", i);
					tmp = scanner.nextInt();
					System.out.println("다시 입력해주신 숫자는 "+tmp+" 입니다.");
				}else{
					j++;
				}
				if(j == 5) pass = false;
			}
			numbers[i] = tmp;
		}
		System.out.println("숫자 삽입완료.-------------------");
		for (int n = 0; n < numbers.length; n++) {
			System.out.printf("[%2d]",numbers[n]);
		}
		System.out.println();
		System.out.println("정렬시작.-------------------.");

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
