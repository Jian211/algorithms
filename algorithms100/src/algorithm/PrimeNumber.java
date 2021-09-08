package algorithm;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13;
		
		// �Ҽ��� ������ ���� ���ڰ� 1�� �ڽ� ���̹Ƿ�, �ڽ� + 1�� ������ ����� ���� ������ �Ҽ���� �����ߴ�. 
		int sum = 0;
		
		for(int i=1; i <= num;i++) {
			if( num % i == 0) {
				sum = sum + i;
			}
			if( sum == num +1 ) {
				System.out.println(num + "�� �Ҽ��Դϴ�. ");
			}
		}
		// ���� �� �� ==================================
		//ù��° ���
		System.out.println("checkA = "+checkA(13));  // true == �Ҽ�
		System.out.println("checkB = "+checkB(13));  // true == �Ҽ�
		System.out.println("checkC = "+checkC(13));  // true == �Ҽ�
		System.out.println("checkD = "+checkD(13));  // true == �Ҽ�
		System.out.println("---");
		System.out.println(checkA(12));  // false != �Ҽ�
		System.out.println(checkB(12));  // false != �Ҽ�
		System.out.println(checkC(12));  // false != �Ҽ�
		System.out.println(checkD(12));  // false != �Ҽ�
		System.out.println("---");
		System.out.println(checkA(122));  
		System.out.println(checkB(1245)); 
		System.out.println(checkC(263));  
		System.out.println(checkD(779));  
	}
	// ù��° ��� �־��� ���� 1�� ������ ������ ���ڰ� �������������� ���Ͽ�,
	static boolean checkA ( int num ) {
		for(int i = 2; i < num ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// �ι�° ������� �־��� ���� ���ݸ� ���ص� ���� ����� ���´�.
	static boolean checkB(int num) {		
		for(int i = 2; i < num/2 ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// ����° ������� i�� �����ؼ� �������Ѵ�. (�ð��� 2��� �ش�.)
	static boolean checkC(int num) {
		for(int i = 2; i*i <= num ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// �׹�° ��� 
	static boolean checkD(int num) {
		if(num % 2 == 0 && num % 3 == 0) {
			return false;
		}
		return true;
	}
}
