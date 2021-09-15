package recursion;
// �����̴� ġŲ �� ������ �ֹ��� �� �ִ� ġŲ ������ n�� �����ִ�.
// �� ġŲ�������� �Ѹ��� �ֹ��� �� ���� ������ �ϳ��� ��� �ִµ�, 
// ������ k�� ������ ġŲ ���� �������� ��ȯ�� �� �ִ�.
// �����̰� ���� ���� �ִ� ġŲ�������� ġŲ�� �ִ� ����� ���� �� �ִ��� ���ϼ���.
// * �� ġŲ�� �ֹ��ϱ� ���ؼ��� �ݵ�� ġŲ ������ ���� �־���Ѵ�.
// �Է�: n k   ��� : ���� 
// �� : ����(n) 4�� ����(k) 3��

public class Backjun1673 {

	static int ateChicken ( int ticket, int coupang) {
		if(ticket/coupang < coupang) {
			return ticket + ticket/coupang;
		}
		return ticket + ateChicken(ticket/coupang,coupang);
	}
	
	public static void main(String[] args) {
		// ������ ¥�� ��.
		int coupon = 100;
		int stamp = 5;
		// ���Ȱ��
		System.out.println(ateChicken(coupon,stamp));
		int count = 0;
		int chicken = 0;
		// �Ϲ����� ���
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
