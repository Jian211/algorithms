package day0913;

import java.util.Scanner;

public class LottoGame05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//사용자로부터 수동 or 자동 선택.
		boolean selectBtn = true; // true = 수동 
		
		while(true) {
			System.out.println("원하시는 버튼을 눌러주십시오.");
			System.out.println("[1. 수동]  [2. 자동]");
			int selectNum = scanner.nextInt();
			
			if(selectNum == 1) {
				selectBtn = true;
				System.out.println("수동을 선택하셨습니다.");
			}else if(selectNum == 2) {
				selectBtn = false;
				System.out.println("자동을 선택하셨습니다.");
			}else{
				
			}
		
		}
	}
}
