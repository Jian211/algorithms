package arrList;

import java.util.*;

import util.ScannerUtil;

public class Main {
	static int chk (int a) {
		while(0 > a || a > 3 ) {
			a = ScannerUtil.nextInt("1~3까지의 정확한 숫자를 적어주시기 바랍니다.");
		}
		return a;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student std1 = new Student("강찬밥", 0,12,54,12);
		Student std2 = new Student("볶음밥", 1,82,32,67);
		Student std3 = new Student("밥오밥", 2,52,80,95);
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		String message;
		
		boolean onOff = true;
		
		System.out.println("학생관리 프로그램입니다.");	
		// 학생관리 프로그램
		while(onOff){
			message = "1. 입력  2. 출력  3. 종료";
			int userChoice = ScannerUtil.nextInt(message);
			userChoice = chk(userChoice);
			// 1. 입력
			if(userChoice == 1) {
				// 학생의 정보입력.
				Student s = new Student();
				message = "학생의 이름을 입력해주세요.";
				s.name = ScannerUtil.nextLine(message);
				message = "학생의 국어점수를 입력해주세요.";
				s.subject.kor = ScannerUtil.nextInt(message);
				message = "학생의 영어점수를 입력해주세요.";
				s.subject.eng = ScannerUtil.nextInt(message);
				message = "학생의 수학점수를 입력해주세요.";
				s.subject.math = ScannerUtil.nextInt(message);
				System.out.println("입력이 완료되었습니다.");
				s.id = 3;
				stdList.add(s);
			}
			else if(userChoice == 2) {
				message = "1. 전체학생조회  2. 특정학생조회  3. 뒤로가기";
				userChoice = chk(ScannerUtil.nextInt(message));
				// 전체 학생 조회
				if(userChoice == 1) {
					stdList.forEach( i -> System.out.println(i));
				}
				// 특정 학생 조회
				else if(userChoice == 2) {
					// 원하는 학생을 선택해주세요.
					String name = ScannerUtil.nextLine("원하는 학생의 이름을 입력해주세요.");
					boolean a = true;
					int cnt = 0;
					while(a) {
						if(stdList.get(cnt).name.equals(name)) {
							System.out.println(stdList.get(cnt));
							a = false;
						}
						cnt++;
					}
					if(!a) {	// 학생이 있다는 증거 
						userChoice = chk(ScannerUtil.nextInt("1. 점수수정 2. 삭제 3. 돌아가기"));
						if(userChoice == 1) {
							// 점수 수정 
							int kor = ScannerUtil.nextInt("국어 점수를 입력해주세요.");
							int eng = ScannerUtil.nextInt("영어 점수를 입력해주세요.");
							int math = ScannerUtil.nextInt("수학 점수를 입력해주세요.");
							stdList.get(cnt-1).subject.kor = kor;
							stdList.get(cnt-1).subject.eng = eng;
							stdList.get(cnt-1).subject.math = math;
						}
						else if(userChoice == 2) {
							// 삭제
							stdList.remove(cnt-1);
						}else if(userChoice == 3) {
							
						}
						
					}
					
				}
				else if(userChoice == 3) {
					
				}
			}
			else if(userChoice == 3) {
				System.out.println("이용해주셔서 감사합니다.");
				onOff = false;
			}
			//1. 입력
			//2. 출력
			//3. 종료
		}
	}
}
