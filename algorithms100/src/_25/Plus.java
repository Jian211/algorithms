package _25;

public class Plus {

	public static void main(String[] args) {
		int getNum = 26;
		int result = 0;
		int cycle = getNum;
		do {
			int numOfTen = cycle/10;
			int numOfOne = cycle%10;
			int sum = numOfTen + numOfOne;
			cycle = numOfOne*10 + sum%10;
			result++;
		} while(cycle != getNum);
		System.out.println(result);
	}
}
