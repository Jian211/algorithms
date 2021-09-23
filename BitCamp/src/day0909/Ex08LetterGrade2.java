package day0909;

import java.util.Scanner;

public class Ex08LetterGrade2 {

	static String checkingScore(int n) {
		String [] score = {"A","B","C","D","F"};
		if(n >=90) 		return score[0];
		else if(n >=80) return score[1];
		else if(n >=70) return score[2];
		else if(n >=60) return score[3];
		else return score[4];
	}
	
	public static void main(String[] args) {
		// 사용자로부터 점수를 입력 받아
		// A,B,C,D,F  를 출력하는 프로그램
		// 단 사용자가 입력을 누르면 입력 기능이 실행되고
		// 출력 기능을 실햏아면 가장 마지막에 입력한 점수와 알파벳이 출력된다.
		// 또한, 잘못된 점수를 입력했을 경우, 올바른 점수가 입력될때까지 다시 입력을 받는다. 
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int score = 0;
		
		while(true) {
			if(score < 0 && 100 >= score) {
				System.out.println("정확한 점수를 입력해주십시오");
				score = 0;
			}
			if(choice < 0  || choice > 3) {
				System.out.println("정확한 숫자를 입력해주십시오");
				choice = 0;
			}
			System.out.println("원하시는 숫자를 입력해주세요.");
			System.out.println("1. 입력  2. 출력  3. 종료");
			choice = scan.nextInt();
			if(choice == 1) {
				System.out.println("입력버튼을 실행하셨습니다. 점수를 입력해주세요.");
				System.out.print("점수 > ");
				score = scan.nextInt();
			}
			if(choice == 2) {
				System.out.println("점수 출력");
				String result = checkingScore(score);
				System.out.println(result + " score "+score);
				scan.close();
				break;
			}
			if(choice == 3) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
	}
}
