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
		System.out.println("학생 수는 몇명입니까?");
		int students = 0;
		int [] studentArr = null;

		try {
			students = scan.nextInt();
			studentArr = new int[students];
			System.out.println("학생수는 "+students+"명 입니다.");
		} catch (Exception e) {
			System.out.println("숫자를 사용하여 다시 입력해주세요.");
		}
		for (int i = 0; i < students; i++) {
			System.out.println((i+1)+"번째 학생의 점수를 입력해주세요.");
			studentArr[i] = scan.nextInt();
		}
		double average = average(studentArr, students); // 평균 점수 확보
		System.out.println("학생들의 평균점수는 "+average+"입니다.");
		
		int count = 0;
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] > average) {
				count++;
			}
		}
		System.out.println("평균을 넘은 학생은 "+count+"명 입니다.");
		double result = count / (double)students * 100;
		System.out.println(result);
	}
}
