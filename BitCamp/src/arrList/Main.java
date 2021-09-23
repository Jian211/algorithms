package arrList;

import java.util.*;

import util.ScannerUtil;

public class Main {
	static int chk (int a) {
		while(0 > a || a > 3 ) {
			a = ScannerUtil.nextInt("1~3������ ��Ȯ�� ���ڸ� �����ֽñ� �ٶ��ϴ�.");
		}
		return a;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student std1 = new Student("������", 0,12,54,12);
		Student std2 = new Student("������", 1,82,32,67);
		Student std3 = new Student("�����", 2,52,80,95);
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		String message;
		
		boolean onOff = true;
		
		System.out.println("�л����� ���α׷��Դϴ�.");	
		// �л����� ���α׷�
		while(onOff){
			message = "1. �Է�  2. ���  3. ����";
			int userChoice = ScannerUtil.nextInt(message);
			userChoice = chk(userChoice);
			// 1. �Է�
			if(userChoice == 1) {
				// �л��� �����Է�.
				Student s = new Student();
				message = "�л��� �̸��� �Է����ּ���.";
				s.name = ScannerUtil.nextLine(message);
				message = "�л��� ���������� �Է����ּ���.";
				s.subject.kor = ScannerUtil.nextInt(message);
				message = "�л��� ���������� �Է����ּ���.";
				s.subject.eng = ScannerUtil.nextInt(message);
				message = "�л��� ���������� �Է����ּ���.";
				s.subject.math = ScannerUtil.nextInt(message);
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
				s.id = 3;
				stdList.add(s);
			}
			else if(userChoice == 2) {
				message = "1. ��ü�л���ȸ  2. Ư���л���ȸ  3. �ڷΰ���";
				userChoice = chk(ScannerUtil.nextInt(message));
				// ��ü �л� ��ȸ
				if(userChoice == 1) {
					stdList.forEach( i -> System.out.println(i));
				}
				// Ư�� �л� ��ȸ
				else if(userChoice == 2) {
					// ���ϴ� �л��� �������ּ���.
					String name = ScannerUtil.nextLine("���ϴ� �л��� �̸��� �Է����ּ���.");
					boolean a = true;
					int cnt = 0;
					while(a) {
						if(stdList.get(cnt).name.equals(name)) {
							System.out.println(stdList.get(cnt));
							a = false;
						}
						cnt++;
					}
					if(!a) {	// �л��� �ִٴ� ���� 
						userChoice = chk(ScannerUtil.nextInt("1. �������� 2. ���� 3. ���ư���"));
						if(userChoice == 1) {
							// ���� ���� 
							int kor = ScannerUtil.nextInt("���� ������ �Է����ּ���.");
							int eng = ScannerUtil.nextInt("���� ������ �Է����ּ���.");
							int math = ScannerUtil.nextInt("���� ������ �Է����ּ���.");
							stdList.get(cnt-1).subject.kor = kor;
							stdList.get(cnt-1).subject.eng = eng;
							stdList.get(cnt-1).subject.math = math;
						}
						else if(userChoice == 2) {
							// ����
							stdList.remove(cnt-1);
						}else if(userChoice == 3) {
							
						}
						
					}
					
				}
				else if(userChoice == 3) {
					
				}
			}
			else if(userChoice == 3) {
				System.out.println("�̿����ּż� �����մϴ�.");
				onOff = false;
			}
			//1. �Է�
			//2. ���
			//3. ����
		}
	}
}
