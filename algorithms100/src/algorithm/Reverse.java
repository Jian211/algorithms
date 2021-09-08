package algorithm;

public class Reverse {

	static String way1 (String word) {
		char [] arr = new char[word.length()];
		String result = "";
		
		for(int i = word.length()-1 ; i >= 0 ;i--) {
			arr[i] = word.charAt(i);
			result += word.charAt(i);
		}
		return result;
	}
	
	static String way2 (String word) {
		char[] arr = word.toCharArray();
		char tmp;

		for(int i=0 ; i < arr.length/2 ; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = tmp;
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String word = "ADEFH";
		System.out.println(way1(word));
		System.out.println(way2(word));
	}
}
