package day0909;
// Random Class
// Random�� ������ ��Ģ ���� ������ ���� ���ڵ��� ���� �Ǿ��ְ�,
// �װ��� �츮�� �ϳ��� �̴� ������ ������ ����ϴ� Ŭ�����ν�,
// �츮�� �������� ���ڸ� ���� �� �ְ� ���ش�. 
// scanner�� ���������� java.util�� �ִ� Ŭ������ �ҷ��� ����� �����ϴ�.

import java.util.Random;
public class EX11Random {

	public static void main(String[] args) {
		Random random = new Random();
		
		// random�� ����������
		// 0~1������ ������ �Ǽ��� ���׹��� ������ �������ִ�.
		// �츮�� ��û�Ҷ����� �� �Ǽ��� �ϳ��� �����ִ� �����̴�.
		// ���� �츮�� �Ǽ� ������Ÿ���� ������ �ʿ��� ������ �޼ҵ� �ؽ�Ʈ ������ ����Ѵ�.
		
		System.out.println("1. nextDouble()");
		System.out.println("	1."+ random.nextDouble());
		System.out.println("	2."+ random.nextDouble());
		System.out.println("	3."+ random.nextDouble());
		System.out.println("	4."+ random.nextDouble());
		System.out.println("	5."+ random.nextDouble());

		// nextInt()
		System.out.println("2. nextInt()");
		System.out.println("	1."+ random.nextInt());
		System.out.println("	2."+ random.nextInt());
		System.out.println("	3."+ random.nextInt());
		System.out.println("	4."+ random.nextInt());
		System.out.println("	5."+ random.nextInt());

		// nextInt(MAX)
		System.out.println("3. nextInt(MAX)");
		System.out.println("	1."+ random.nextInt(20));
		System.out.println("	2."+ random.nextInt(20));
		System.out.println("	3."+ random.nextInt(20));
		System.out.println("	4."+ random.nextInt(20));
		System.out.println("	5."+ random.nextInt(20));
	}
}
