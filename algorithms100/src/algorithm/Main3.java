package algorithm;

public class Main3 {
	
	int checking (int a ) {
		return a;
	}

	public static void main(String[] args) {
		// ����. 1~100 ���� ���ڰ� �Էµ� �� �ѹ��̶� �ԷµǾ����� ����� �� 
		// 10������ �����ϰ�.. 
		// �������� ���� ���ڸ� �迭�� �����ϱ� 
		int cnt = 0;
		int []arr = new int[10];
		int [] result = new int[10];
		int a = 0;
		while(cnt < 10) {
			int randomNum = (int) Math.round(Math.random()*10);
			System.out.println(cnt+1+"��° ���ڴ� "+ randomNum);
			
			for(int i=0 ; i < arr.length ; i++) {
				if(arr[i] == randomNum) {
					System.out.println("��ģ��!");
					a = randomNum;
					result[a] = randomNum;
				}
			}
			arr[cnt] = randomNum;
			cnt++;
		}
		System.out.println("arr��");
		for (int i = 0; i < result.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("result��");
		for (int i = 0; i < result.length; i++) {
			if(result[i] != 0) {
				System.out.print(result[i]+" ");
			}
		}
	}

}
