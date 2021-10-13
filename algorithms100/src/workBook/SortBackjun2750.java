package workBook;

import java.util.Scanner;

/*
  ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����.
  ��° �ٺ��� N���� �ٿ��� �� �־�����.
  �� ���� ������ 1,000���� �۰ų� ���� �����̴�.
  ���� �ߺ����� �ʴ´�.
 */


//���������� Ȱ���غ���
// �ּҰ� min�� �����Ŀ� ����ؼ� ���� ��ü�ϴ� ����� ����� ��.
public class SortBackjun2750 {
	public static void main(String[] args) {
		int [] arr = new int[1001];
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int min;
		int index = 0;
		for (int i = 0; i < num; i++) {
			min = 1001;
			for (int j = i; j < num; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.printf("[%d]",arr[i]);
		}
	}
}
