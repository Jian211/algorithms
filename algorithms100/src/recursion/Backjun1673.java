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
		System.out.println("ticket" + ticket);
		System.out.println("ticket/coupang" + ticket/coupang);
		if(ticket/coupang < 5) {
			System.out.println("5��������"+ticket/coupang);
			return ticket/coupang;
		}
		return ticket + ateChicken(ticket/coupang,coupang);
	}
	
	public static void main(String[] args) {
		// ������ ¥�� ��.
		int coupon = 100;
		int stamp = 5;
		int count = 0;
		int chicken = 0;
		System.out.println(ateChicken(coupon,stamp));
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
