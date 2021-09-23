package day0909;
// 랜덤 게임
// 컴퓨터가 만든 1~100 사이의 숫자를 사용자가 맞추는 게임
// 플레이, 최고 점수 보기, 종료 기능이 있다.

import java.util.Random;

// 플레이를 할 시, 컴퓨터가 숫자를 하나 뽑아 놓고 
// 사용자는 그 숫자를 맞출 때 까지 입력을 하게 된다. 
// 사용자는 최초 입력을 포함하여, 입력을 할 때마다 1씩 점수가 오르게 된다.

// 만약 필요한 경우, 기존 최고 점수를 현재 점수로 갱신하는 기능도 있어야 한다.
// 최고 점수 보기
// 최고 점수 보기의 경우, 현재 최고 점수를 보여주는데 게임의 특성상 입력 횟수가 낮을 수록 높은 점수가 된다.
// 또한 만약 사용자가 플레이한 기록이 없을 시에는 "아직 플레이 기록이 없습니다!" 라고 써야한다.
import java.util.Scanner;

public class Ex12RandomGame {

	public static void main(String[] args) {
		System.out.println("1~100가지 중 하나의 숫자를 맞추는 게임!");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		boolean start = true;
		boolean play = false;
		final int MAX = 100;
		int computerNum = 0;
		int user = 0;
		int choice = 0;
		int bestScore = 0;
		int cnt = 0;
		
		while(start) {
			if(!play) {
				System.out.println("1. 플레이	 2. 최고 점수 보기  3. 종료 ");
				choice = scan.nextInt();
				if(choice < 1 && choice > 3) {
					System.out.println("* 올바른 숫자를 다시 입력해주세요. *");
				}else {
					computerNum = random.nextInt(MAX)+1;
				}
			}
			if(choice == 1) {
				play = true;
				//System.out.println("컴퓨터의 숫자"+computerNum);
				System.out.println("1~100사이의 숫자 중 어떤 숫자일까요?");
				System.out.print(" >");
				user = scan.nextInt();
				if(user < 0 && user > 100) {
					System.out.println("* 올바른 숫자를 다시 입력해주세요. *");
				}else {
					cnt++;
				}
				if(user > computerNum) {
					System.out.println("값이 더 작습니다.");
				}else if(user < computerNum) {
					System.out.println("값이 더 큽니다.");
				}else {
					System.out.println(cnt + "번만에 정답!");
					play = false;
					if(cnt < bestScore && bestScore != 0) bestScore = cnt;
					cnt = 0;
				}
			}
			if(choice == 2) {
				if(bestScore == 0) {
					System.out.println("현재 최고 기록은 아직 없습니다.");
				}else {
					System.out.printf("현재 최고 기록 : [%d]회\n", bestScore);
				}
			}
			if(choice == 3) {
				System.out.println("즐겨주셔서 감사합니다 ^^");
				start = false;
				scan.close();
			}
		}
		
		
	}
}
