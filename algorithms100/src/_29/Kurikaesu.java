package _29;

public class Kurikaesu {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		String plus = "+";
		String minus = "-";
		String result = null;
		boolean changeValue = false; // true == +  // false == -

		for (int i = 1; i < arr.length; i++) {
			changeValue = changeValue == false ? true : false;
			if(result == null) {
				result = "1";
			}
			if(changeValue) {
				result += plus + arr[i];
			}else{
				result += minus + arr[i];
			}
		}
		System.out.println(result);
	}
}
