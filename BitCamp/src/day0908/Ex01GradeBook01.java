package day0908;

import java.util.Scanner;

public class Ex01GradeBook01 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String A = "����";
		String B = "����";
		String C = "����";
		
		System.out.println("������ �Է����ֽʽÿ�. ���� : 1 , ���� : 2");
		System.out.print(">");
		int gender = scan.nextInt();
		if(gender != 1 || gender != 2) {
			System.out.println("���ڷ� �ٽ� �Է����ֽʽÿ�.");
			System.out.print(">");
			gender = scan.nextInt();
		}

		System.out.println("���̸� �Է����ֽʽÿ�.");
		System.out.print(">");
		scan.nextLine();
		int age = scan.nextInt();
		if(!(age >= 0)) {
			System.out.println("���̸� �ٽ� �Է����ֽʽÿ�.");
			System.out.print(">");
			scan.nextLine();
		}
		int body = 0;
		
		scan.close();
		
		System.out.println(gender == 1  ? "����" : "����");
		if(age > 19 && gender == 1) {
			System.out.println("���ϵ帳�ϴ�. ���밡�ʼ�");
		}else if(age < 20 && gender == 1){
			System.out.println("�̼����ڿ��Դ� ��ü����� �ο������ʽ��ϴ�.");
		}else {
			System.out.println("�������Դ� ������ �ǹ��� �ο����� �ʽ��ϴ�.");
		}
		
		
		
	}
}
