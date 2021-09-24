package employeeManagement;

import java.util.ArrayList;

import util.ScannerUtil;

public class EmployeeMain {
	static ArrayList<Employee> lists = new ArrayList<>();
	static Employee emp;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("������","�����","ex@email.com",3000000,2018);
		Employee emp2 = new Employee("��������","�����","ex@email.com",3000000,2020);
		Employee emp3 = new Employee("ȸ����","����","ex@email.com",3000000,2015);
		Employee emp4 = new Employee("������","������","ex@email.com",3000000,2018);
		Employee emp5 = new Employee("��������","���ĺ�","ex@email.com",3000000,2020);
		Employee emp6 = new Employee("ȸ����","��������","ex@email.com",3000000,2017);
		Employee emp7 = new Employee("��������","�������","ex@email.com",3000000,2019);
		Employee emp8 = new Employee("��������","���Ͽ�","ex@email.com",3000000,2014);
		Employee emp9 = new Employee("��������","����","ex@email.com",3000000,2022);
		lists.add(emp1);
		lists.add(emp2);
		lists.add(emp3);
		lists.add(emp4);
		lists.add(emp5);
		lists.add(emp6);
		lists.add(emp7);
		lists.add(emp8);
		lists.add(emp9);
		boolean start = true;
		showEmployee(start);
	}
	static void showEmployee(boolean start) {
		while(start) {
			//������ �� �޾ƿ���.
			int userChoice;
			userChoice = checking(ScannerUtil.nextInt("1. ��� ��Ȳ 2. ��� ��� 3. ��� ���� �� ���� 4. ����"), 4);
			
			// ��� ��Ȳ �� �� �˻�
			if(userChoice == 1) {
				// ��ü ��� ��Ȳ
				joinedEmployee();			
				// �� �˻�
				userChoice = checking(ScannerUtil.nextInt("1. �μ��� ��ȸ 2. �޿��� ��ȸ 3. �Ի�⵵ ��ȸ 4. �̸���ȸ 5. �ڷΰ���"), 5);
				
				if	   (userChoice == 1) 	findTeam();
				
				else if(userChoice == 2)	findSalary();
				
				else if(userChoice == 3) 	findJoinedDay();
				
				else if(userChoice == 4) 	findName();
				
				else if(userChoice == 5) 	joinedEmployee();
			}

			// ��� ��� 
			else if(userChoice == 2)	joinEmployee();
			
			// ��� ���� �� ����
			else if(userChoice == 3) 	editEmp();
			
			// �ý��� ����
			else if(userChoice == 4) {
				System.out.println("������ �� �̿����ֽʼ�.");
				start = false;
				
			}
		}
	}
	
	private static void editEmp() {
		int userChoice = checking(ScannerUtil.nextInt("1. ����  2. ����"), 2);
		if(userChoice == 1) {
			// ��� ����
			editEmployee();
		}else {
			// ��� ����
			deleteEmployee();
		}
	}
	private static void findTeam() {
		int userChoice = checking(ScannerUtil.nextInt("1. �������� 2. ������  3. ȸ����  4. ��������  5. �ڷΰ���"),5);
		String [] team = {"��������","������","ȸ����","��������","�ڷΰ���"};
		if(userChoice == 5) {
			joinedEmployee();
		}else {
			boolean exist = false;
			System.out.printf("%s ���� ��� �˻���...\n",team[userChoice-1]);
			for (int i = 0; i < lists.size(); i++) {
				if(lists.get(i).getTeam().equals(team[userChoice-1])) {
					lists.get(i).toString();
					exist = true;
				}
			}
			if(exist) {
				System.out.println("================== �˻� �Ϸ� ===================");
			}else {
				System.out.println(" �ش� �μ����� ����� �����ϴ�. ");
			}
		}
	}
	private static void findName() {
		String name = ScannerUtil.nextLine("��ȸ�ϰ��� �ϴ� ����� �̸��� �Է����ּ���. ex) ȫ�浿 ");
		System.out.printf("%s����� ã�� ��...\n",name);
		for (int i = 0; i < lists.size(); i++) {
			if(lists.get(i).getName().equals(name)) {
				lists.get(i).toString();
			}
		}
		System.out.println("============== �˻� �Ϸ� ==============");
		
	}
	private static void findJoinedDay() {
		int startDay = ScannerUtil.nextInt("���۱��� �⵵�� �Է����ּ���.  ex) 1999 ");
		int lastDay = ScannerUtil.nextInt("������ ���� �⵵�� �Է����ּ���. ex) 2020 ");
		System.out.printf("%d ~ %d ������ ����� �˻���...",startDay,lastDay);
		for (int i = 0; i < lists.size(); i++) {
			int joined = lists.get(i).getJoined();
			if(startDay <= joined && joined <= lastDay) {
				lists.get(i).toString();
			}
		}
		System.out.println("=============  �˻� ��� ================");
	}
	private static int searchEmployee(String name) {
		int index = -1;
		for (int i = 0; i < lists.size(); i++) {
			if(name.equals(lists.get(i).getName())) {
				index = i;
				lists.get(i).toString();
			}
		}
		return index;
	}
	private static void editEmployee() {
		String tmp = ScannerUtil.nextLine("�����Ϸ��� ����� �̸��� �Է����ּ���.");
		int index = searchEmployee(tmp);
		
		tmp = ScannerUtil.nextLine("���ο� �̸��� �Է����ּ���.");
		lists.get(index).setName(tmp);
		
		tmp = ScannerUtil.nextLine("���ο� �̸����� �Է����ּ���.");
		lists.get(index).setEmail(tmp);

		tmp = ScannerUtil.nextLine("���ο� ���� �Է����ּ���.");
		lists.get(index).setTeam(tmp);
		
		int tmp1 = ScannerUtil.nextInt("���ο� ���޿��� �Է����ּ���.");
		lists.get(index).setSalary(tmp1);
		
		tmp1 = ScannerUtil.nextInt("���ο� �Ի糯 �Է����ּ���.");
		lists.get(index).setSalary(tmp1);
	}
	private static void deleteEmployee() {
		String name = ScannerUtil.nextLine("�����Ϸ��� ����� �̸��� �Է����ּ���.");
		int index = searchEmployee(name);
		
		String YN = ScannerUtil.nextLine(name+"����� ����� �����Ͻðڽ��ϱ�? Y/N");
		
		if(YN.equalsIgnoreCase("y")) {
			lists.remove(index);
			System.out.println(name+"����� �����ϼ̽��ϴ�.");
		}else {
			System.out.println(name+"����� ������ ����ϼ̽��ϴ�.");
		}
		joinedEmployee();
	}
	private static void joinEmployee() {
		emp = new Employee();
		
		String name = ScannerUtil.nextLine("����� �̸��� �Է����ֽʽÿ�.");
		emp.setName(name);
		
		String team = ScannerUtil.nextLine(name+"�� �μ��� �Է����ֽʽÿ�.");
		emp.setTeam(team);

		String email = ScannerUtil.nextLine(name+"�� email�� �Է����ֽʽÿ�.");
		emp.setEmail(email);

		int salary = ScannerUtil.nextInt(name+"�� ���޿��� �Է����ֽʽÿ�.");
		emp.setSalary(salary);

		int joined = ScannerUtil.nextInt(name+"�� �Ի���� �Է����ֽʽÿ�.");
		emp.setJoined(joined);
		
		lists.add(emp);
	}
	private static int checking(int num, int max) {
		int result = num;
		while(result < 0 || result > max ) {
			result = ScannerUtil.nextInt("��Ȯ�� ���ڸ� �Է����ּ���.");
		}
		return result;
	}
	private static void joinedEmployee() {
		lists.forEach( emp -> System.out.printf(emp.toString()));
	}
	private static void findSalary () {
		int min = ScannerUtil.nextInt("��������");
		int max = ScannerUtil.nextInt("�ְ����");
		System.out.printf("%d ~ %d ���̿� �ִ� ����� �˻���...\n ",min,max);
		boolean exist = false;
		for (int i = 0; i < lists.size(); i++) {
			int salary = lists.get(i).getSalary();
			if(min <= salary && salary <= max) {
				lists.get(i).toString();
				exist = true;
			}
		}
		if(exist) {
			System.out.println("=============  �˻� ��� ================");
		}else {
			System.out.println("�ش� ����� �������� �ʽ��ϴ�.");
		}
	}
	
}
