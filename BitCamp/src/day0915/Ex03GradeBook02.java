package day0915;
// 스캐너 유틸을 사용한
// 성적관리 프로그램.
// 단, 1차원 배열만 사요하고
// 메소드로 분리하는 것은 하지 않을 것이다.

import java.util.Scanner;

import util.ScannerUtil;

public class Ex03GradeBook02 {

	public static void main(String[] args) {
		// 상수
		final int SUBJECT_SIZE = 3;
		final int STUDENT_SIZE = 3;
		final int SCORE_MIN = 3;
		final int SCORE_MAX = 3;
		
		//변수
		Scanner scanner = new Scanner(System.in);
		int [] idArr = new int[STUDENT_SIZE];
		String [] nameArr = new String[STUDENT_SIZE];
		int [] korArr = new int[STUDENT_SIZE];
		int [] engArr = new int[STUDENT_SIZE];
		int [] mathArr = new int[STUDENT_SIZE];
		int curInder = 0;
		
		while (true) {
			String message = "1. 입력 2. 출력 3. 종료";
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			
			if( userChoice == 1) {
				if (curInder < STUDENT_SIZE) {
					message = "학생의 번호를 입력해주세요.";
					idArr[curInder] = ScannerUtil.nextInt(scanner, message);
					message = "학생의 이름을 입력해주세요.";
					nameArr[curInder] = ScannerUtil.nextLine(scanner, message);
					message = "학생의 국어점수를 입력해주세요.";
					korArr[curInder] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
					message = "학생의 영어점수를 입력해주세요.";
					engArr[curInder] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
					message = "학생의 수학점수를 입력해주세요.";
					mathArr[curInder] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
					
					
					curInder++;
				}else {
					System.out.println("더 이상 입력하실 수 없습니다.");
				}
				
			}else if( userChoice == 2) {
				
			}else if( userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
			
		}
		
	}
}
