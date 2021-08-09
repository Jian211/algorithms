package _13;

public class Main {

	public static void main(String[] args) {
		// 입력된 수 N만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
		// 1 2 3 4
		// 2 4 5 8
		// 3 6 9 12

		int n = 6;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.printf("%3d", i + 1 + j*(1 + i)); //내가한거
				System.out.printf("%3d", (i+1) * (j+1));	// 영상에서 나온거 
			}
			System.out.println();
		}
	
	}

}
