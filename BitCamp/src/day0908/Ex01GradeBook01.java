package day0908;

import java.util.Scanner;

public class Ex01GradeBook01 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String A = "현역";
		String B = "공익";
		String C = "면제";
		
		System.out.println("성별을 입력해주십시오. 남자 : 1 , 여자 : 2");
		System.out.print(">");
		int gender = scan.nextInt();
		if(gender != 1 || gender != 2) {
			System.out.println("숫자로 다시 입력해주십시오.");
			System.out.print(">");
			gender = scan.nextInt();
		}

		System.out.println("나이를 입력해주십시오.");
		System.out.print(">");
		scan.nextLine();
		int age = scan.nextInt();
		if(!(age >= 0)) {
			System.out.println("나이를 다시 입력해주십시오.");
			System.out.print(">");
			scan.nextLine();
		}
		int body = 0;
		
		scan.close();
		
		System.out.println(gender == 1  ? "남자" : "여자");
		if(age > 19 && gender == 1) {
			System.out.println("축하드립니다. 군대가십쇼");
		}else if(age < 20 && gender == 1){
			System.out.println("미성년자에게는 신체등급이 부여되지않습니다.");
		}else {
			System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
		}
		
		
		
	}
}
