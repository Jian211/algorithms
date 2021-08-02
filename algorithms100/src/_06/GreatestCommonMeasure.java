package _06;

public class GreatestCommonMeasure {
	public static void main(String[] args) {
		//�Էµ� �μ��� �ִ������� ���Ͻÿ�.  ���� : 6
		int fir = 12;
		int sec = 18;
		
		//�ִ����� ����.
		int greatestCommonMeasure = 1;

		while(true) {
			if(fir % 2 == 0 && sec % 2 == 0) {
				greatestCommonMeasure = greatestCommonMeasure *2;
				fir = fir/2;
				sec = sec/2;
			}else if(fir % 3 == 0 && sec % 3 == 0){
				greatestCommonMeasure = greatestCommonMeasure *3;
				fir = fir/3;
				sec = sec/3;
			}else {
				break;
			}
		}
		System.out.println("���� �� ��");
		int num1 = 12;
		int num2 = 18;
	
		// �ִ� �����
		System.out.println(num1 +"��"+num2+"�� �ִ� �������? "+gcd(num1,num2)); 	// 6
		System.out.println("10�� 20�� �ִ� �������? "+gcd(10, 20));    	// 10
		System.out.println("301235�� 21045�� �ִ� �������? "+gcd(301235, 21045)); // 5
		
		// �ּ� ����� 
		System.out.println("�ּ� ����� = "+lcm(num1, num2));	// 36
		System.out.println("�ּ� ����� = "+lcm(8,22));  		// 88
		System.out.println("�ּ� ����� = "+lcm(12352,21352));	// 32967488
	}
	
	// ��Ŭ���� ȣ����. �ִ� ������� ���ϴ� �˰��� ����
	// ���� https://blog.naver.com/dkdlfjq31/222283997197
	static int gcd(int a, int b) {
		int chgtmp = 0;
		if(a < b) {
			chgtmp = b;
			b = a;
			a = chgtmp;
		}
		while( b != 0 ) {
			int tmp = a % b;	// �� �����ϱ����� ����. 
			a = b;
			b = tmp;
		}
		return a;
	}
	// �ּ� ����� ���� 
	static int lcm(int a,int b) {
		return a*b / gcd(a,b);
	}
}
