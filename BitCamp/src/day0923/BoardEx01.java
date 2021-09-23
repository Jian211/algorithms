package day0923;

import java.util.ArrayList;

import util.ScannerUtil;

public class BoardEx01 {
	static ArrayList<NoteBook> list = new ArrayList<NoteBook>();
	static int nextId = 1;
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		showMenw();
	}
	
	
	//�޴� ��� �޼ҵ�
	public static void showMenw() {
		
	}
	
	// �� �ۼ� �޼ҵ�
	public static void write() {
		// �Է��� ���� ������ ���� notebook ��ü���� �� �ʱ�ȭ 
		NoteBook a = new NoteBook();
		
		String message;
		
		// �� ��ȣ �Է�
		a.setNo(nextId++);
		
		// �� �����Է�
		message = "";
		a.setTitle(ScannerUtil.nextLine(message));
		
		// ���ۼ��� �Է�
		message = "";
		a.setWriter(ScannerUtil.nextLine(message));
		
		message = "";
		a.setBody(ScannerUtil.nextLine(message));
		
		// list�߰�
		list.add(a);
	}
	
	// �� ��� ��� �޼ҵ�
	public static void printList() {
		if(list.isEmpty()) {
			System.out.println("�Էµ� ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("---------------------------");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d. %s \n",list.get(i).getNo(), list.get(i).getTitle());
			}
			System.out.println("---------------------------");
			String message = new String("�󼼺����� �� Ȥ�� ��ȣ, �ڷΰ��÷��� 0�� �Է����ּ���.");
		
			int userChoice = ScannerUtil.nextInt(message);
			if(userChoice != -1) {
				//����ڰ� 0�� �Է����� �ʾ��� ���,
				// �ùٸ� ��ȣ�� �Է��ߴ��� üũ
				// �׷� ��, �ùٸ� ��ȣ�̸� printOne
				// �ùٸ��� ������ �ٽ� �Է�.
				while(!validate(userChoice)) {
					System.out.println("�ش� �� ��ȣ�� �������� �ʽ��ϴ�.");
					userChoice = ScannerUtil.nextInt(message);
				}
				
				if(userChoice != 0 ) {
					printOne(userChoice);
				}
			}
		}
	}
	
	// �� ���� ��� �޼ҵ�
	public static void printOne(int no) {
		int index = indexOf(no);
		list.get(index).sendAll();
		String message = new String("1. ���� 2. ���� 3. �ڷΰ���");
		int userChoice = ScannerUtil.nextInt(message, 1, 3);
		if(userChoice == 1) {
			update(no);
		}else if(userChoice == 2) {
			delete(no);
		}else if(userChoice == 3) {
			printList();
		}
	}

	// �� ���� �޼ҵ�
	public static void update(int no) {
		String message;
		int index = indexOf(no);
		
		message = new String ("���ο� ������ �Է����ּ���.");
		list.get(index).title = ScannerUtil.nextLine(message);

		message = new String ("���ο� ������ �Է����ּ���.");
		list.get(index).body = ScannerUtil.nextLine(message);
		
		printOne(no);
	}

	// �� ���� �޼ҵ�
	public static void delete(int no) {
		int index = indexOf(no);
		String message = new String("���� ������ �����Ͻðڽ��ϱ�? y/n");
		String YN = ScannerUtil.nextLine(message);
		if(YN.equalsIgnoreCase("Y")) {
			list.remove(index);
			printList();
		}else {
			printOne(no);
		}
	}
	// �ش� �� ��ȣ�� �����ϴ� �� ��ȣ���� üũ�ϴ� �޼ҵ�
	public static boolean validate(int no) {
		if(no == 0) {
			return true;
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				return true;
			}
		}
		return false;
	}
	// �Ķ���ͷ� ���� id����� ��ġ�ϴ� ��ü�� �ε����� ã�� indexOf
	public static int indexOf(int no) {
		NoteBook b = new NoteBook();
		b.setNo(no);
		return list.indexOf(b);
	}
}
