package algorithm;

public class Main3 {
	
	int checking (int a ) {
		return a;
	}

	public static void main(String[] args) {
		// 문제. 1~100 까지 숫자가 입력될 때 한번이라도 입력되었으면 출력할 것 
		// 10번으로 가정하고.. 
		// 랜덤으로 받은 숫자를 배열에 저장하기 
		int cnt = 0;
		int []arr = new int[10];
		int [] result = new int[10];
		int a = 0;
		while(cnt < 10) {
			int randomNum = (int) Math.round(Math.random()*10);
			System.out.println(cnt+1+"번째 숫자는 "+ randomNum);
			
			for(int i=0 ; i < arr.length ; i++) {
				if(arr[i] == randomNum) {
					System.out.println("겹친다!");
					a = randomNum;
					result[a] = randomNum;
				}
			}
			arr[cnt] = randomNum;
			cnt++;
		}
		System.out.println("arr는");
		for (int i = 0; i < result.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("result는");
		for (int i = 0; i < result.length; i++) {
			if(result[i] != 0) {
				System.out.print(result[i]+" ");
			}
		}
	}

}
