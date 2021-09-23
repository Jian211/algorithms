package day0915;

import java.util.Random;
import java.util.Scanner;

import util.ScannerUtil;

//로또 게임 프로그램을 만드시오
//조건 1. ScannerUtil을 사용
//2. 최대한 메소드를 분리
//3. 사용자가 원하는 횟수만큼 여러번 게임을 실행할 수 있더록 하시오(2차원배열)
//4. 컴퓨터의 숫자를 출력하고 나서 사용자의 숫자를 출력할 때, 각 게임마다 맞은 갯수를 옆에 별도로 표시하시오.
public class Ex04Lotto01 {
	static final int LOTTO_MAX = 6;

	public static void main(String[] args) {
		
		
		boolean gameCoin = true;
		int[] comNum = new int[LOTTO_MAX];
		int[][] lottoPaper = null;

		
		System.out.println("또로또~~");
		while(gameCoin) {
			
			String message = "1.자동 2.수동 3.종료";
			int userChoice = ScannerUtil.nextInt(message);
			if(userChoice != 3) {
				//오늘의 또로또 출력
				setRandomNum(comNum);	

				message = "원하시는 게임횟수를 입력해주십시오.";
				int cnt = ScannerUtil.nextInt(message);
				
				while(cnt < 0 ) {
					message = "다시한번 정확한 횟수를 입력해주십시오.";
					cnt = ScannerUtil.nextInt(message);
				}
				
				// 또로또 페이퍼 만들기
				lottoPaper = new int [cnt][LOTTO_MAX];	
				
				if(userChoice == 1) { 
					for (int i = 0; i < cnt; i++) {
						setRandomNum(lottoPaper[i]);
					}
				}
				
				if(userChoice == 2) {
					for(int i = 0 ; i < LOTTO_MAX ; i++) {
						settingNum(lottoPaper[i]);
					}
				}
				int [] collect = new int[cnt];
				for (int i = 0; i < cnt; i++) {
					for (int j = 0; j < LOTTO_MAX; j++) {
						if(lottoPaper[i][j] == comNum [i]) {
							collect[i]++;
						}
					}
				}
				//또로또 페이버 용지 출력
				System.out.print("오늘의 또로또 번호는");
				for (int i = 0; i < LOTTO_MAX; i++) {
					System.out.printf("[%2d]",comNum[i]);
				}
				System.out.println();
				if(lottoPaper != null) {
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%1d번 : ",i+1);
						for (int j = 0; j < LOTTO_MAX; j++) {
							System.out.printf("[%2d] ",lottoPaper[i][j]);
						}
						System.out.printf(" 맞춘 횟수[%2d]",collect[i]);
						System.out.println();
					}
				}
			}else {
				System.out.println("수고하셨습니다.");
				gameCoin = false;
				ScannerUtil.close();
			}
		}
		
	}
	public static void settingNum(int [] arr) {
		
		for (int j = 0; j < LOTTO_MAX; j++) {
			String message = j+1+"번째 숫자를 입력해주세요.";
			arr[j] = ScannerUtil.nextInt(message);
		}
	}
	public static void setRandomNum(int [] arr){
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int randomNum = random.nextInt(45)+1;
			if(!contains(arr,randomNum)) {
				arr[i] = randomNum;
			}else {
				i--;
			}
		}
	}
	public static boolean contains (int []arr, int e) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == e) {
				return true;
			}
		}
		return false;
	}
}
