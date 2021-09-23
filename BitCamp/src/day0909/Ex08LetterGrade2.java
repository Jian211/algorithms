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
		// ����ڷκ��� ������ �Է� �޾�
		// A,B,C,D,F  �� ����ϴ� ���α׷�
		// �� ����ڰ� �Է��� ������ �Է� ����� ����ǰ�
		// ��� ����� ���d�Ƹ� ���� �������� �Է��� ������ ���ĺ��� ��µȴ�.
		// ����, �߸��� ������ �Է����� ���, �ùٸ� ������ �Էµɶ����� �ٽ� �Է��� �޴´�. 
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int score = 0;
		
		while(true) {
			if(score < 0 && 100 >= score) {
				System.out.println("��Ȯ�� ������ �Է����ֽʽÿ�");
				score = 0;
			}
			if(choice < 0  || choice > 3) {
				System.out.println("��Ȯ�� ���ڸ� �Է����ֽʽÿ�");
				choice = 0;
			}
			System.out.println("���Ͻô� ���ڸ� �Է����ּ���.");
			System.out.println("1. �Է�  2. ���  3. ����");
			choice = scan.nextInt();
			if(choice == 1) {
				System.out.println("�Է¹�ư�� �����ϼ̽��ϴ�. ������ �Է����ּ���.");
				System.out.print("���� > ");
				score = scan.nextInt();
			}
			if(choice == 2) {
				System.out.println("���� ���");
				String result = checkingScore(score);
				System.out.println(result + " score "+score);
				scan.close();
				break;
			}
			if(choice == 3) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
		}
	}
}
