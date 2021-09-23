package day0923;

import java.util.ArrayList;

import util.ScannerUtil;

public class BoardEx01 {
	static ArrayList<NoteBook> list = new ArrayList<NoteBook>();
	static int nextId = 1;
	
	// 메인 메소드
	public static void main(String[] args) {
		showMenw();
	}
	
	
	//메뉴 출력 메소드
	public static void showMenw() {
		
	}
	
	// 글 작성 메소드
	public static void write() {
		// 입력할 글의 내용을 담을 notebook 객체선언 및 초기화 
		NoteBook a = new NoteBook();
		
		String message;
		
		// 글 번호 입력
		a.setNo(nextId++);
		
		// 글 제목입력
		message = "";
		a.setTitle(ScannerUtil.nextLine(message));
		
		// 글작성자 입력
		message = "";
		a.setWriter(ScannerUtil.nextLine(message));
		
		message = "";
		a.setBody(ScannerUtil.nextLine(message));
		
		// list추가
		list.add(a);
	}
	
	// 글 목록 출력 메소드
	public static void printList() {
		if(list.isEmpty()) {
			System.out.println("입력된 글이 존재하지 않습니다.");
		}else {
			System.out.println("---------------------------");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d. %s \n",list.get(i).getNo(), list.get(i).getTitle());
			}
			System.out.println("---------------------------");
			String message = new String("상세보기할 글 혹은 번호, 뒤로가시려면 0을 입력해주세요.");
		
			int userChoice = ScannerUtil.nextInt(message);
			if(userChoice != -1) {
				//사용자가 0을 입력하지 않았을 경우,
				// 올바른 번호를 입력했는지 체크
				// 그런 후, 올바른 번호이면 printOne
				// 올바르지 않으면 다시 입력.
				while(!validate(userChoice)) {
					System.out.println("해당 글 번호는 존재하지 않습니다.");
					userChoice = ScannerUtil.nextInt(message);
				}
				
				if(userChoice != 0 ) {
					printOne(userChoice);
				}
			}
		}
	}
	
	// 글 개별 출력 메소드
	public static void printOne(int no) {
		int index = indexOf(no);
		list.get(index).sendAll();
		String message = new String("1. 수정 2. 삭제 3. 뒤로가기");
		int userChoice = ScannerUtil.nextInt(message, 1, 3);
		if(userChoice == 1) {
			update(no);
		}else if(userChoice == 2) {
			delete(no);
		}else if(userChoice == 3) {
			printList();
		}
	}

	// 글 수정 메소드
	public static void update(int no) {
		String message;
		int index = indexOf(no);
		
		message = new String ("새로운 제목을 입력해주세요.");
		list.get(index).title = ScannerUtil.nextLine(message);

		message = new String ("새로운 내용을 입력해주세요.");
		list.get(index).body = ScannerUtil.nextLine(message);
		
		printOne(no);
	}

	// 글 삭제 메소드
	public static void delete(int no) {
		int index = indexOf(no);
		String message = new String("글을 정말로 삭제하시겠습니까? y/n");
		String YN = ScannerUtil.nextLine(message);
		if(YN.equalsIgnoreCase("Y")) {
			list.remove(index);
			printList();
		}else {
			printOne(no);
		}
	}
	// 해당 글 번호가 존재하는 글 번호인지 체크하는 메소드
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
	// 파라미터로 들어온 idㄱ밧과 일치하는 객체의 인덱스를 찾는 indexOf
	public static int indexOf(int no) {
		NoteBook b = new NoteBook();
		b.setNo(no);
		return list.indexOf(b);
	}
}
