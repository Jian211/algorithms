package day0909;
// ���� ����
// ��ǻ�Ͱ� ���� 1~100 ������ ���ڸ� ����ڰ� ���ߴ� ����
// �÷���, �ְ� ���� ����, ���� ����� �ִ�.

import java.util.Random;

// �÷��̸� �� ��, ��ǻ�Ͱ� ���ڸ� �ϳ� �̾� ���� 
// ����ڴ� �� ���ڸ� ���� �� ���� �Է��� �ϰ� �ȴ�. 
// ����ڴ� ���� �Է��� �����Ͽ�, �Է��� �� ������ 1�� ������ ������ �ȴ�.

// ���� �ʿ��� ���, ���� �ְ� ������ ���� ������ �����ϴ� ��ɵ� �־�� �Ѵ�.
// �ְ� ���� ����
// �ְ� ���� ������ ���, ���� �ְ� ������ �����ִµ� ������ Ư���� �Է� Ƚ���� ���� ���� ���� ������ �ȴ�.
// ���� ���� ����ڰ� �÷����� ����� ���� �ÿ��� "���� �÷��� ����� �����ϴ�!" ��� ����Ѵ�.
import java.util.Scanner;

public class Ex12RandomGame {

	public static void main(String[] args) {
		System.out.println("1~100���� �� �ϳ��� ���ڸ� ���ߴ� ����!");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		boolean start = true;
		boolean play = false;
		final int MAX = 100;
		int computerNum = 0;
		int user = 0;
		int choice = 0;
		int bestScore = 0;
		int cnt = 0;
		
		while(start) {
			if(!play) {
				System.out.println("1. �÷���	 2. �ְ� ���� ����  3. ���� ");
				choice = scan.nextInt();
				if(choice < 1 && choice > 3) {
					System.out.println("* �ùٸ� ���ڸ� �ٽ� �Է����ּ���. *");
				}else {
					computerNum = random.nextInt(MAX)+1;
				}
			}
			if(choice == 1) {
				play = true;
				//System.out.println("��ǻ���� ����"+computerNum);
				System.out.println("1~100������ ���� �� � �����ϱ��?");
				System.out.print(" >");
				user = scan.nextInt();
				if(user < 0 && user > 100) {
					System.out.println("* �ùٸ� ���ڸ� �ٽ� �Է����ּ���. *");
				}else {
					cnt++;
				}
				if(user > computerNum) {
					System.out.println("���� �� �۽��ϴ�.");
				}else if(user < computerNum) {
					System.out.println("���� �� Ů�ϴ�.");
				}else {
					System.out.println(cnt + "������ ����!");
					play = false;
					if(cnt < bestScore && bestScore != 0) bestScore = cnt;
					cnt = 0;
				}
			}
			if(choice == 2) {
				if(bestScore == 0) {
					System.out.println("���� �ְ� ����� ���� �����ϴ�.");
				}else {
					System.out.printf("���� �ְ� ��� : [%d]ȸ\n", bestScore);
				}
			}
			if(choice == 3) {
				System.out.println("����ּż� �����մϴ� ^^");
				start = false;
				scan.close();
			}
		}
		
		
	}
}
