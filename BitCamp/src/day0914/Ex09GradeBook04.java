package day0914;

import java.util.Scanner;

public class Ex09GradeBook04 {
	public static void result(String [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%1d %3d �л��� ������ ������ ",arr[i][i]);
			for (int j = 0; j < arr.length-1; j++) {
				System.out.printf("[%2d], ",arr[i][j]);
			}
			System.out.print("�Դϴ�. ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		final int STURDENT_NUM = 5;
		int info = 4;
		String [][] arr = new String [STURDENT_NUM][info];
		Scanner scan = new Scanner(System.in);
		
		
		int student = 0;
		int infoCnt = 0;
		while(student < STURDENT_NUM) {
			System.out.printf("%1d��° �л��� �̸��� ����,����,���� ������ �����ֽʽÿ�.\n",student+1);
			System.out.print("> name : ");
			arr[student][infoCnt] = scan.nextLine();
			System.out.print("> kor : ");
			arr[student][++infoCnt] = scan.nextLine();
			System.out.print("> eng : ");
			arr[student][++infoCnt] = scan.nextLine();
			System.out.print("> math : ");
			arr[student][++infoCnt] = scan.nextLine();
			student++;
			infoCnt = 0;
		}
		scan.close();
		result(arr);
		// call by value   call by reference
	}
}
