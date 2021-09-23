package day0923;

import java.util.ArrayList;

import classEx.Student2;
import util.ScannerUtil;
public class GradeBook01 {
	private static ArrayList<Student2> list = new ArrayList<>();
	private static int nextId = 1;
	private static final int SCORE_MAX = 100;
	private static final int SCORE_MIN = 0;

	//���� �޼ҵ�
	public static void main(String [] args) {
		showMenu();
	}
	
	// �޴� ��� �޼ҵ�
	private static void showMenu() {
		String message = new String("1. �Է� 2. ��ü��� ��� 3. ����");
		while(true){
			int userChoice = ScannerUtil.nextInt(message);
			if(userChoice == 1) {
				insert();
			}else if(userChoice == 2) {
				printList();
			}else if(userChoice == 3) {
				System.out.println("����� �ּż� �����մϴ�.");
				break;
			}
		}
	}
	
	// �л� �Է� �޼ҵ�
	private static void insert() {
		String message;
		Student2 s = new Student2();
		
		s.setId(nextId++);
		
		message = new String("�л��� �̸��� �Է����ּ���.");
		s.setName(ScannerUtil.nextLine(message));
	
		message = new String("�л��� ���������� �Է����ּ���.");
		s.setKor(ScannerUtil.nextInt(message, SCORE_MIN, SCORE_MAX));

		message = new String("�л��� ���������� �Է����ּ���.");
		s.setKor(ScannerUtil.nextInt(message, SCORE_MIN, SCORE_MAX));
		
		message = new String("�л��� ���������� �Է����ּ���.");
		s.setKor(ScannerUtil.nextInt(message, SCORE_MIN, SCORE_MAX));
	
		list.add(s);
	}
	// �л� ��� ��� �޼ҵ�
	private static void printList() {
		if(list.isEmpty()) { 
			System.out.println("���� �Էµ� �л��� �������� �ʽ��ϴ�.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				Student2 s = list.get(i);
			}
			/*
			 	���� for�� (foreach��)�̶�, list,�迭����
			 	�Ȱ��� ������ Ÿ���� ���ʴ�� ���ִ� ���
			 	�ش� �ݷ����� ��ü�� ���ʴ�� �̾Ƽ� 
			 	�ӽ� ������ �ҷ��ִ� for���̴�.
			 	��, �ش� foreach���� �� ��,
			 	�ݷ����� ũ�Ⱑ ����Ǹ� ������ �߻��ϹǷ�
			 	��¿����� ����ϴ� ���� ����.
			
			 */
			
			//����ġ ���� ���ư��� �߰��� ũ�Ⱑ ����Ǹ� �����߻�*
			for(Student2 s: list) {
				System.out.printf("%d. %s\n",s.getId(),s.getName());
			}
			
			String message = new String("�󼼺��� �� �л��� ��ȣ, �Ǵ� �ڷΰ��÷��� 0�� �Է����ּ���.");
			int userChoice = ScannerUtil.nextInt(message);
			while(userChoice != 0 && retrieve(userChoice) == null) {
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				userChoice = ScannerUtil.nextInt(message);
			}
			if(userChoice != 0) {
				printOne(userChoice);
			}
		}
		
	}
	// �л� ��ȣ�� ���� ��ġ�ϴ� �л��� list���� �˻��Ͽ� return�ϴ� �޼ҵ�
	// �� �ش� �л� ��ȣ�� �������� ���� ��쿡�� null���� 
	private static Student2 retrieve(int id) {
		Student2 s = new Student2();
		s.setId(id);
		
		int index = list.indexOf(s);
		if(index != -1) {
			return list.get(index);
		}
		
		return null;
	}
	
	// �л� ���� ���� �޼ҵ�
	private static void printOne(int id) {
		Student2 s = retrieve(id);
		s.printInfo();
		
		String message = new String("1. ���� 2. ���� 3. �ڷΰ���");
		int userChoice = ScannerUtil.nextInt(message);
		if(userChoice == 1) {
			update(id);
		}else if(userChoice == 2) {
			delete(id);
		}else if(userChoice == 3) {
			printList();
		}
	}
	
	// �л� ���� �޼ҵ�
	private static void update(int id) {
		Student2 s = retrieve(id);
		
		String message ;
		message = new String("���ο� ���� ������ �Է����ּ���.");
		s.setKor(ScannerUtil.nextInt(message));
		
		message = new String("���ο� ���� ������ �Է����ּ���.");
		s.setEng(ScannerUtil.nextInt(message));
		
		message = new String("���ο� ���� ������ �Է����ּ���.");
		s.setMath(ScannerUtil.nextInt(message));
		
		printOne(id);
	}
	
	// �л� ���� �޼ҵ�
	private static void delete(int id) {
		Student2 s = retrieve(id);
		
		String message = new String("������ �����Ͻðڽ��ϱ�? y/n");
		String YN = ScannerUtil.nextLine(message);
		
		if(YN.equalsIgnoreCase("Y")) {
			list.remove(s);
			printList();
		}else {
			printOne(id);
		}
	}
}

