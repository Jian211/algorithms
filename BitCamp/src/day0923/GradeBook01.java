package day0923;

import java.util.ArrayList;

import classEx.Student2;
import util.ScannerUtil;
public class GradeBook01 {
	private static ArrayList<Student2> list = new ArrayList<>();
	private static int nextId = 1;
	private static final int SCORE_MAX = 100;
	private static final int SCORE_MIN = 0;

	//메인 메소드
	public static void main(String [] args) {
		showMenu();
	}
	
	// 메뉴 출력 메소드
	private static void showMenu() {
		String message = new String("1. 입력 2. 전체목록 출력 3. 종료");
		while(true){
			int userChoice = ScannerUtil.nextInt(message);
			if(userChoice == 1) {
				insert();
			}else if(userChoice == 2) {
				printList();
			}else if(userChoice == 3) {
				System.out.println("사용해 주셔서 감사합니다.");
				break;
			}
		}
	}
	
	// 학생 입력 메소드
	private static void insert() {
		String message;
		Student2 s = new Student2();
		
		s.setId(nextId++);
		
		message = new String("학생의 이름을 입력해주세요.");
		s.setName(ScannerUtil.nextLine(message));
	
		message = new String("학생의 국어점수를 입력해주세요.");
		s.setKor(ScannerUtil.nextInt(message, SCORE_MIN, SCORE_MAX));

		message = new String("학생의 영어점수를 입력해주세요.");
		s.setKor(ScannerUtil.nextInt(message, SCORE_MIN, SCORE_MAX));
		
		message = new String("학생의 수학점수를 입력해주세요.");
		s.setKor(ScannerUtil.nextInt(message, SCORE_MIN, SCORE_MAX));
	
		list.add(s);
	}
	// 학생 목록 출력 메소드
	private static void printList() {
		if(list.isEmpty()) { 
			System.out.println("아직 입력된 학생이 존재하지 않습니다.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				Student2 s = list.get(i);
			}
			/*
			 	향상된 for문 (foreach문)이란, list,배열등의
			 	똑같은 데이터 타입이 차례대로 모여있는 경우
			 	해당 콜렉션의 객체를 차례대로 뽑아서 
			 	임시 변수로 불러주는 for문이다.
			 	단, 해당 foreach문을 쓸 때,
			 	콜렉션의 크기가 변경되면 에러가 발생하므로
			 	출력에서만 사용하는 것이 좋다.
			
			 */
			
			//포이치 문이 돌아가는 중간에 크기가 변경되면 에러발생*
			for(Student2 s: list) {
				System.out.printf("%d. %s\n",s.getId(),s.getName());
			}
			
			String message = new String("상세보기 할 학생의 번호, 또는 뒤로가시려면 0을 입력해주세요.");
			int userChoice = ScannerUtil.nextInt(message);
			while(userChoice != 0 && retrieve(userChoice) == null) {
				System.out.println("잘못된 번호입니다.");
				userChoice = ScannerUtil.nextInt(message);
			}
			if(userChoice != 0) {
				printOne(userChoice);
			}
		}
		
	}
	// 학생 번호를 토대로 일치하는 학생을 list에서 검색하여 return하는 메소드
	// 단 해당 학생 번호가 존재하지 않을 경우에는 null리턴 
	private static Student2 retrieve(int id) {
		Student2 s = new Student2();
		s.setId(id);
		
		int index = list.indexOf(s);
		if(index != -1) {
			return list.get(index);
		}
		
		return null;
	}
	
	// 학생 개별 보기 메소드
	private static void printOne(int id) {
		Student2 s = retrieve(id);
		s.printInfo();
		
		String message = new String("1. 수정 2. 삭제 3. 뒤로가기");
		int userChoice = ScannerUtil.nextInt(message);
		if(userChoice == 1) {
			update(id);
		}else if(userChoice == 2) {
			delete(id);
		}else if(userChoice == 3) {
			printList();
		}
	}
	
	// 학생 수정 메소드
	private static void update(int id) {
		Student2 s = retrieve(id);
		
		String message ;
		message = new String("새로운 국어 점수를 입력해주세요.");
		s.setKor(ScannerUtil.nextInt(message));
		
		message = new String("새로운 영어 점수를 입력해주세요.");
		s.setEng(ScannerUtil.nextInt(message));
		
		message = new String("새로운 수학 점수를 입력해주세요.");
		s.setMath(ScannerUtil.nextInt(message));
		
		printOne(id);
	}
	
	// 학생 삭제 메소드
	private static void delete(int id) {
		Student2 s = retrieve(id);
		
		String message = new String("정말로 삭제하시겠습니까? y/n");
		String YN = ScannerUtil.nextLine(message);
		
		if(YN.equalsIgnoreCase("Y")) {
			list.remove(s);
			printList();
		}else {
			printOne(id);
		}
	}
}

