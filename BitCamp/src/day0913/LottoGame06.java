package day0913;

import java.util.Random;
import java.util.Scanner;

public class LottoGame06 {

	public static void main(String[] args) {
		final int MAX_NUM = 6;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		// ��ǻ���� ���� ���ڻ̱� 
		int [] computerRandomNums = new int[MAX_NUM];
		
		for (int i = 0; i < computerRandomNums.length; i++) {
			boolean pass = true;
			int tmp = random.nextInt(45);
			int j = 0; 
			while(pass) {
				if(tmp == computerRandomNums[j]) {
					tmp = random.nextInt(45)+1;
				}else{
					j++;
				}
				if(j == MAX_NUM - 1) pass = false;
			}
			computerRandomNums[i] = tmp;
		}
		
		System.out.print("������ �ζǹ�ȣ�� ");
		for (int i = 0; i < computerRandomNums.length; i++) {
			System.out.printf("[%2d]",computerRandomNums[i]);
		}
		System.out.println();
		int [] userNum = new int[MAX_NUM];
		boolean start = true;
		boolean stopNum = true;
		while (stopNum ) {
			System.out.println("1. ����   2. �ڵ�");
			int startNum = scan.nextInt();
			if(startNum == 1) {
				start = true;
			}else {
				start = false;
			}
			if(start) {
				for (int i = 0; i < userNum.length; i++) {
					boolean pass = true;
					System.out.print(">");
					int tmp = scan.nextInt();
					int j = 0;
					while(pass) {
						if(tmp == userNum[j]) {
							tmp = scan.nextInt();
						}else{
							j++;
						}
						if(j == MAX_NUM - 1) pass = false;
					}
					userNum[i] = tmp;
				}
				scan.close();
			}
			if(!start) {
				for (int i = 0; i < userNum.length; i++) {
					boolean pass = true;
					int tmp = random.nextInt(45);
					int j = 0;
					while(pass) {
						if(tmp == userNum[j]) {
							tmp = random.nextInt(46);
						}else{
							j++;
						}
						if(j == MAX_NUM - 1) pass = false;
					}
					userNum[i] = tmp;
				}
			}
			System.out.print("������ ���� ��ȣ��");
			for (int i = 0; i < userNum.length; i++) {
				System.out.printf("[%2d]",userNum[i]);
			}
			stopNum = false;
		}
		System.out.println();
		System.out.println("��� Ȯ�� ��...");
		
		int check = 0;
		for (int i = 0; i < userNum.length; i++) {
			for (int j = 0; j < userNum.length; j++) {
				if(userNum[i] == computerRandomNums[j]) check++;
			}
		}
		System.out.println("���� ������~?  "+check+"�� �Դϴ�~");
	}
}
