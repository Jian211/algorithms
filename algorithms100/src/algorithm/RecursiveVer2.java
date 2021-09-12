package algorithm;

public class RecursiveVer2 {
	// ������ ���� ��
	static int [][] homeTown = {{0,0,0,1,1},
								{0,0,0,0,1},
								{1,0,0,0,0},
								{1,1,0,0,0},
								{1,1,0,1,1},
	};
	static int [] apartmentNums = new int[10];
	static int houseCount = 0;
	static void find(int a,int b,int houseCount) {
		System.out.println("----------------------");
		System.out.printf("���� ��ġ [%1d][%1d]\n",a,b);
		homeTown[a][b] = 0;
		apartmentNums[houseCount]++;

		if( b-1 >= 0 && homeTown[a][b-1] == 1 ) {
			System.out.printf("��ǥ[%1d][%1d]�������� �̵��մϴ�.\n",a,b-1);
			find(a,b-1,houseCount);
		}
		if( b+1 < homeTown.length && homeTown[a][b+1] == 1) {
			System.out.printf("��ǥ[%1d][%1d]���������� �̵��մϴ�.\n",a,b+1);
			find(a,b+1,houseCount);
		}
		if( a-1 >= 0 && homeTown[a-1][b] == 1 ) {
			System.out.printf("��ǥ[%1d][%1d]�������� �̵��մϴ�.\n",a-1,b);
			find(a-1,b,houseCount);
		}
		if( a+1 < homeTown.length && homeTown[a+1][b] == 1 ) {
			System.out.printf("��ǥ[%1d][%1d]�Ʒ������� �̵��մϴ�.\n",a+1,b);
			find(a+1,b,houseCount);
		}
	}
	static void result (int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d]",arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < homeTown.length; i++) {
			for (int j = 0; j < homeTown.length; j++) {
				if(homeTown[i][j] == 1) { 	// 1�� �ֺ��� ã�´�
					// ����Լ� ����
					find(i,j,houseCount);
					houseCount++;
				}
			}
		}
		result(apartmentNums);
	}
}
