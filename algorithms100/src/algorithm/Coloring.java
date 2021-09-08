package algorithm;

public class Coloring {
	static final int COLOR = 2;
	static final int SIZE = 4;
	
	static int [][] arr = { {0,0,0,0,0},
							{0,0,1,1,0},
							{0,0,0,0,1},
							{0,0,0,0,0},
							{0,0,1,0,0},
	};
	
	static void result(int [][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
	
	static void color (int x, int y) {
		if(arr[x][y] != 1 ) arr[x][y] = COLOR;
		
		if(x - 1 >= 0    && arr[x-1][y] != 1 && arr[x-1][y] != COLOR )	color(x-1,y); 
		if(x + 1 <= SIZE && arr[x+1][y] != 1 && arr[x+1][y] != COLOR )	color(x+1,y); 
		if(y - 1 >= 0    && arr[x][y-1] != 1 && arr[x][y-1] != COLOR )	color(x,y-1); 
		if(y + 1 <= SIZE && arr[x][y+1] != 1 && arr[x][y+1] != COLOR )  color(x,y+1); 
	}
	
	public static void main(String[] args) {
		result(arr);
		System.out.println("0을 2로 변경 후 ");
		color(0,0);
		result(arr);
	}
}
