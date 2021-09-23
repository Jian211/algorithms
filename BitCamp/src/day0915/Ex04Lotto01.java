package day0915;

import java.util.Random;
import java.util.Scanner;

import util.ScannerUtil;

//�ζ� ���� ���α׷��� ����ÿ�
//���� 1. ScannerUtil�� ���
//2. �ִ��� �޼ҵ带 �и�
//3. ����ڰ� ���ϴ� Ƚ����ŭ ������ ������ ������ �� �ִ��� �Ͻÿ�(2�����迭)
//4. ��ǻ���� ���ڸ� ����ϰ� ���� ������� ���ڸ� ����� ��, �� ���Ӹ��� ���� ������ ���� ������ ǥ���Ͻÿ�.
public class Ex04Lotto01 {
	static final int LOTTO_MAX = 6;

	public static void main(String[] args) {
		
		
		boolean gameCoin = true;
		int[] comNum = new int[LOTTO_MAX];
		int[][] lottoPaper = null;

		
		System.out.println("�Ƿζ�~~");
		while(gameCoin) {
			
			String message = "1.�ڵ� 2.���� 3.����";
			int userChoice = ScannerUtil.nextInt(message);
			if(userChoice != 3) {
				//������ �Ƿζ� ���
				setRandomNum(comNum);	

				message = "���Ͻô� ����Ƚ���� �Է����ֽʽÿ�.";
				int cnt = ScannerUtil.nextInt(message);
				
				while(cnt < 0 ) {
					message = "�ٽ��ѹ� ��Ȯ�� Ƚ���� �Է����ֽʽÿ�.";
					cnt = ScannerUtil.nextInt(message);
				}
				
				// �Ƿζ� ������ �����
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
				//�Ƿζ� ���̹� ���� ���
				System.out.print("������ �Ƿζ� ��ȣ��");
				for (int i = 0; i < LOTTO_MAX; i++) {
					System.out.printf("[%2d]",comNum[i]);
				}
				System.out.println();
				if(lottoPaper != null) {
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%1d�� : ",i+1);
						for (int j = 0; j < LOTTO_MAX; j++) {
							System.out.printf("[%2d] ",lottoPaper[i][j]);
						}
						System.out.printf(" ���� Ƚ��[%2d]",collect[i]);
						System.out.println();
					}
				}
			}else {
				System.out.println("�����ϼ̽��ϴ�.");
				gameCoin = false;
				ScannerUtil.close();
			}
		}
		
	}
	public static void settingNum(int [] arr) {
		
		for (int j = 0; j < LOTTO_MAX; j++) {
			String message = j+1+"��° ���ڸ� �Է����ּ���.";
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
