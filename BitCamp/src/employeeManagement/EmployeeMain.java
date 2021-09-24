package employeeManagement;

import java.util.ArrayList;

import util.ScannerUtil;

public class EmployeeMain {
	static ArrayList<Employee> lists = new ArrayList<>();
	static Employee emp;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("개발팀","전요수","ex@email.com",3000000,2018);
		Employee emp2 = new Employee("디자인팀","지명근","ex@email.com",3000000,2020);
		Employee emp3 = new Employee("회계팀","계산기","ex@email.com",3000000,2015);
		Employee emp4 = new Employee("개발팀","가나다","ex@email.com",3000000,2018);
		Employee emp5 = new Employee("디자인팀","알파벳","ex@email.com",3000000,2020);
		Employee emp6 = new Employee("회계팀","과제과제","ex@email.com",3000000,2017);
		Employee emp7 = new Employee("마케팅팀","사과랑배","ex@email.com",3000000,2019);
		Employee emp8 = new Employee("마케팅팀","오하요","ex@email.com",3000000,2014);
		Employee emp9 = new Employee("마케팅팀","저녁","ex@email.com",3000000,2022);
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
			//유저의 값 받아오기.
			int userChoice;
			userChoice = checking(ScannerUtil.nextInt("1. 사원 현황 2. 사원 등록 3. 사원 수정 및 삭제 4. 종료"), 4);
			
			// 사원 현황 및 상세 검색
			if(userChoice == 1) {
				// 전체 사원 현황
				joinedEmployee();			
				// 상세 검색
				userChoice = checking(ScannerUtil.nextInt("1. 부서별 조회 2. 급여별 조회 3. 입사년도 조회 4. 이름조회 5. 뒤로가기"), 5);
				
				if	   (userChoice == 1) 	findTeam();
				
				else if(userChoice == 2)	findSalary();
				
				else if(userChoice == 3) 	findJoinedDay();
				
				else if(userChoice == 4) 	findName();
				
				else if(userChoice == 5) 	joinedEmployee();
			}

			// 사원 등록 
			else if(userChoice == 2)	joinEmployee();
			
			// 사원 수정 및 삭제
			else if(userChoice == 3) 	editEmp();
			
			// 시스템 종료
			else if(userChoice == 4) {
				System.out.println("다음에 또 이용해주십쇼.");
				start = false;
				
			}
		}
	}
	
	private static void editEmp() {
		int userChoice = checking(ScannerUtil.nextInt("1. 수정  2. 삭제"), 2);
		if(userChoice == 1) {
			// 사원 수정
			editEmployee();
		}else {
			// 사원 삭제
			deleteEmployee();
		}
	}
	private static void findTeam() {
		int userChoice = checking(ScannerUtil.nextInt("1. 마케팅팀 2. 개발팀  3. 회계팀  4. 디자인팀  5. 뒤로가기"),5);
		String [] team = {"마케팅팀","개발팀","회계팀","디자인팀","뒤로가기"};
		if(userChoice == 5) {
			joinedEmployee();
		}else {
			boolean exist = false;
			System.out.printf("%s 팀의 사원 검색중...\n",team[userChoice-1]);
			for (int i = 0; i < lists.size(); i++) {
				if(lists.get(i).getTeam().equals(team[userChoice-1])) {
					lists.get(i).toString();
					exist = true;
				}
			}
			if(exist) {
				System.out.println("================== 검색 완료 ===================");
			}else {
				System.out.println(" 해당 부서에는 사원이 없습니다. ");
			}
		}
	}
	private static void findName() {
		String name = ScannerUtil.nextLine("조회하고자 하는 사원의 이름을 입력해주세요. ex) 홍길동 ");
		System.out.printf("%s사원을 찾는 중...\n",name);
		for (int i = 0; i < lists.size(); i++) {
			if(lists.get(i).getName().equals(name)) {
				lists.get(i).toString();
			}
		}
		System.out.println("============== 검색 완료 ==============");
		
	}
	private static void findJoinedDay() {
		int startDay = ScannerUtil.nextInt("시작기준 년도를 입력해주세요.  ex) 1999 ");
		int lastDay = ScannerUtil.nextInt("마지막 기준 년도를 입력해주세요. ex) 2020 ");
		System.out.printf("%d ~ %d 사이의 사원들 검색중...",startDay,lastDay);
		for (int i = 0; i < lists.size(); i++) {
			int joined = lists.get(i).getJoined();
			if(startDay <= joined && joined <= lastDay) {
				lists.get(i).toString();
			}
		}
		System.out.println("=============  검색 결과 ================");
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
		String tmp = ScannerUtil.nextLine("수정하려는 사원의 이름을 입력해주세요.");
		int index = searchEmployee(tmp);
		
		tmp = ScannerUtil.nextLine("새로운 이름을 입력해주세요.");
		lists.get(index).setName(tmp);
		
		tmp = ScannerUtil.nextLine("새로운 이메일을 입력해주세요.");
		lists.get(index).setEmail(tmp);

		tmp = ScannerUtil.nextLine("새로운 팀을 입력해주세요.");
		lists.get(index).setTeam(tmp);
		
		int tmp1 = ScannerUtil.nextInt("새로운 월급여를 입력해주세요.");
		lists.get(index).setSalary(tmp1);
		
		tmp1 = ScannerUtil.nextInt("새로운 입사날 입력해주세요.");
		lists.get(index).setSalary(tmp1);
	}
	private static void deleteEmployee() {
		String name = ScannerUtil.nextLine("삭제하려는 사원의 이름을 입력해주세요.");
		int index = searchEmployee(name);
		
		String YN = ScannerUtil.nextLine(name+"사원의 기록을 삭제하시겠습니까? Y/N");
		
		if(YN.equalsIgnoreCase("y")) {
			lists.remove(index);
			System.out.println(name+"사원을 삭제하셨습니다.");
		}else {
			System.out.println(name+"사원의 삭제를 취소하셨습니다.");
		}
		joinedEmployee();
	}
	private static void joinEmployee() {
		emp = new Employee();
		
		String name = ScannerUtil.nextLine("사원의 이름을 입력해주십시오.");
		emp.setName(name);
		
		String team = ScannerUtil.nextLine(name+"의 부서를 입력해주십시오.");
		emp.setTeam(team);

		String email = ScannerUtil.nextLine(name+"의 email을 입력해주십시오.");
		emp.setEmail(email);

		int salary = ScannerUtil.nextInt(name+"의 월급여를 입력해주십시오.");
		emp.setSalary(salary);

		int joined = ScannerUtil.nextInt(name+"의 입사년을 입력해주십시오.");
		emp.setJoined(joined);
		
		lists.add(emp);
	}
	private static int checking(int num, int max) {
		int result = num;
		while(result < 0 || result > max ) {
			result = ScannerUtil.nextInt("정확한 숫자를 입력해주세요.");
		}
		return result;
	}
	private static void joinedEmployee() {
		lists.forEach( emp -> System.out.printf(emp.toString()));
	}
	private static void findSalary () {
		int min = ScannerUtil.nextInt("최저기준");
		int max = ScannerUtil.nextInt("최고기준");
		System.out.printf("%d ~ %d 사이에 있는 사원을 검색중...\n ",min,max);
		boolean exist = false;
		for (int i = 0; i < lists.size(); i++) {
			int salary = lists.get(i).getSalary();
			if(min <= salary && salary <= max) {
				lists.get(i).toString();
				exist = true;
			}
		}
		if(exist) {
			System.out.println("=============  검색 결과 ================");
		}else {
			System.out.println("해당 사원은 존재하지 않습니다.");
		}
	}
	
}
