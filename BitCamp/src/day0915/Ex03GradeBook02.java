package day0915;
// ��ĳ�� ��ƿ�� �����
// �������� ���α׷�.
// ��, 1���� �迭�� ����ϰ�
// �޼ҵ�� �и��ϴ� ���� ���� ���� ���̴�.

import java.util.Scanner;

import util.ScannerUtil;

public class Ex03GradeBook02 {

	public static void main(String[] args) {
		// ���
		final int SUBJECT_SIZE = 3;
		final int STUDENT_SIZE = 3;
		final int SCORE_MIN = 3;
		final int SCORE_MAX = 3;
		
		//����
		Scanner scanner = new Scanner(System.in);
		int [] idArr = new int[STUDENT_SIZE];
		String [] nameArr = new String[STUDENT_SIZE];
		int [] korArr = new int[STUDENT_SIZE];
		int [] engArr = new int[STUDENT_SIZE];
		int [] mathArr = new int[STUDENT_SIZE];
		int curInder = 0;
		
		while (true) {
			String message = "1. �Է� 2. ��� 3. ����";
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			
			if( userChoice == 1) {
				if (curInder < STUDENT_SIZE) {
					message = "�л��� ��ȣ�� �Է����ּ���.";
					idArr[curInder] = ScannerUtil.nextInt(scanner, message);
					message = "�л��� �̸��� �Է����ּ���.";
					nameArr[curInder] = ScannerUtil.nextLine(scanner, message);
					message = "�л��� ���������� �Է����ּ���.";
					korArr[curInder] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
					message = "�л��� ���������� �Է����ּ���.";
					engArr[curInder] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
					message = "�л��� ���������� �Է����ּ���.";
					mathArr[curInder] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
					
					
					curInder++;
				}else {
					System.out.println("�� �̻� �Է��Ͻ� �� �����ϴ�.");
				}
				
			}else if( userChoice == 2) {
				
			}else if( userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
			
		}
		
	}
}
