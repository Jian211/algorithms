package day0913;

import java.util.Scanner;

public class LottoGame05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//����ڷκ��� ���� or �ڵ� ����.
		boolean selectBtn = true; // true = ���� 
		
		while(true) {
			System.out.println("���Ͻô� ��ư�� �����ֽʽÿ�.");
			System.out.println("[1. ����]  [2. �ڵ�]");
			int selectNum = scanner.nextInt();
			
			if(selectNum == 1) {
				selectBtn = true;
				System.out.println("������ �����ϼ̽��ϴ�.");
			}else if(selectNum == 2) {
				selectBtn = false;
				System.out.println("�ڵ��� �����ϼ̽��ϴ�.");
			}else{
				
			}
		
		}
	}
}
