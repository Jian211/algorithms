package recursion;
// �����̴� ġŲ �� ������ �ֹ��� �� �ִ� ġŲ ������ n�� �����ִ�.
// �� ġŲ�������� �Ѹ��� �ֹ��� �� ���� ������ �ϳ��� ��� �ִµ�, 
// ������ k�� ������ ġŲ ���� �������� ��ȯ�� �� �ִ�.
// �����̰� ���� ���� �ִ� ġŲ�������� ġŲ�� �ִ� ����� ���� �� �ִ��� ���ϼ���.
// * �� ġŲ�� �ֹ��ϱ� ���ؼ��� �ݵ�� ġŲ ������ ���� �־���Ѵ�.
// �Է�: n k   ��� : ���� 
// �� : ����(n) 4�� ����(k) 3��

public class Backjun1673 {

	static void ateChicken ( int ticket, int ) {
		
	}
	
	public static void main(String[] args) {
		// ������ ¥�� ��.
		int coupon = 100;
		int stamp = 5;
		int count = 0;
		int chicken = 0;
		//�״ϱ� ġŲ�� ��������(ġŲ�ϳ�)�� ���� 1��
		while (coupon > 0) {
			coupon--;
			chicken++;
			count++;
			if(count == stamp) {
				count = 0;
				coupon++;
			}
		}
		System.out.println(chicken);
		
	
	}
}
