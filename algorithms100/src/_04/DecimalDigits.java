package _04;

import java.util.ArrayList;

public class DecimalDigits {
	public static void main(String[] args) {
		// ����. 10������ 2������ ��ȯ �Ͻÿ�.
		int num = 30;
		
		//������ ��� ����
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//��� ������ ���� ����
		int q; // �� > quotient
		int r; // ������ > remainder
		
		// while�� �Ἥ ���� 1�̳� 0��  �� ������ 2�� ��� ������.
		while( 0 < num) {
			q = num/2;
			r = num%2;
			arr.add(r);
			num = q;
		}
		System.out.println("2������ ��ȯ�� ���� :"+arr.get(4)+arr.get(3)+arr.get(2)+arr.get(1)+arr.get(0));		 
	}
}
