package _13;

public class Main {

	public static void main(String[] args) {
		// �Էµ� �� N��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ� ���� �簢���� ����Ͻÿ�
		// 1 2 3 4
		// 2 4 5 8
		// 3 6 9 12

		int n = 6;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.printf("%3d", i + 1 + j*(1 + i)); //�����Ѱ�
				System.out.printf("%3d", (i+1) * (j+1));	// ���󿡼� ���°� 
			}
			System.out.println();
		}
	
	}

}
