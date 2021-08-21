package _23;

import java.util.Scanner;

public class Average {
	
	static double average (int[]arr, int num) {
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total/num;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�л� ���� ����Դϱ�?");
		int students = 0;
		int [] studentArr = null;

		try {
			students = scan.nextInt();
			studentArr = new int[students];
			System.out.println("�л����� "+students+"�� �Դϴ�.");
		} catch (Exception e) {
			System.out.println("���ڸ� ����Ͽ� �ٽ� �Է����ּ���.");
		}
		for (int i = 0; i < students; i++) {
			System.out.println((i+1)+"��° �л��� ������ �Է����ּ���.");
			studentArr[i] = scan.nextInt();
		}
		double average = average(studentArr, students); // ��� ���� Ȯ��
		System.out.println("�л����� ��������� "+average+"�Դϴ�.");
		
		int count = 0;
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] > average) {
				count++;
			}
		}
		System.out.println("����� ���� �л��� "+count+"�� �Դϴ�.");
		double result = count / (double)students * 100;
		System.out.println(result);
	}
}
