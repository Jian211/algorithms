package day0909;

import java.util.Random;
import java.util.Scanner;

public class Ex12RSPGame {

	public static void main(String[] args) {
		System.out.println("���� ���� ��! ����!");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		final int MAX = 3;
		boolean play = false;
		boolean start = true;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(start) {
			int computer = 0;
			int user = 0;
			
			System.out.println("-----------------");
			System.out.println("1: play,  2: �������  3: ����");
			int coin = scan.nextInt();
			if(coin == 1) {
				System.out.println("0: ����,  1: ���� ,  2: ��  �� �ϳ��� ���Ͽ� �ֽʽÿ�.");
				System.out.print(">");
				user = scan.nextInt();
				if( 0 > user || user > 2) {
					System.out.println("��! �̾ҳ�! �ȵ𳻶�!");
				}else {
					play = true;
				}
			}
			if(coin == 2){
				if(win+draw+lose == 0) System.out.println("���� �÷��� ����� �����ϴ�.");
				else {
					System.out.printf("��[%3d] ��[%3d] ��[%3d]\n", win, draw, lose);
					double winningRate = (double)win/(win+draw+lose) * 100.00; 
					System.out.printf("�·�[%.1f]\n",winningRate);
					play = false;
				}
			}
			if(coin == 3) {
				System.out.println("�����ϼ̽��ϴ�.");
				play = false;
				start = false;
			}
			
			if(play) {
				computer = random.nextInt(MAX);
				if(user == computer) {
					draw++;
					System.out.println("�����ϴ�.");
				}else if(user == 0) {
					if(computer == 1) {
						win++; 
						System.out.println("You Win!"); 
					}
					if(computer == 2) {
						lose++;
						System.out.println("You lose!");
					}
				}else if(user == 1) {
					if(computer == 0) {
						lose++;
						System.out.println("You lose!");
					}
					if(computer == 2) {
						win++;
						System.out.println("You Win!"); 
					}
				}else if(user == 2){
					if(computer == 0) {
						win++;
						System.out.println("You Win!");
					}
					if(computer == 1) {
						lose++;
						System.out.println("You lose!");
					}
				}
				play = false;
			}
		}
		scan.close();
		
	}
}
