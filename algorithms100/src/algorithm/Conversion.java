package algorithm;

public class Conversion {
	public static void main(String[] args) {
		// 대문자 > 소문자 , 소문자 > 대문자로 변환하기 
		String word = "helloWorlD";
		
		// ::아 스 키 코 드 테 스 트 
 		char a = 'a'; // a = 97    z = 122   -32 하면 소문자로 
		char A = 'Z'; // A = 65    Z = 90    +32 하면 대문자로 
		
		char [] arr = new char[word.length()];

		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			if(letter > 90) arr[i] = (char)(letter - 32); 
			if(letter < 90) arr[i] = (char)(letter + 32);
		}
		System.out.println(arr);
		
		// 영상 보고 난 후, ---------------------------------
		System.out.println("영상보고 난 후 ");
		System.out.println(bigLetter(word));      // HELLOWORLD
		System.out.println(smallLetter(word));    // helloworld
		System.out.println(toChangeLetter(word)); // HELLOwORLd
		
	}
	// 주어진 단어를 전부 대문자로 만드는 메소드 
	static char[] bigLetter(String word){
		char [] newArr = word.toCharArray();
		for(int i = 0; i < newArr.length ;i++) {
			if(newArr[i] > 90) newArr[i] = (char)(newArr[i] - 32); 
			if(newArr[i] < 90) newArr[i] = newArr[i];
		}
		return newArr;
	}
	// 주어진 단어를 전부 소문자로 만드는 메소드 
	static char[] smallLetter (String word) {
		char [] newArr = word.toCharArray();
		for(int i = 0; i < newArr.length ;i++) {
			if(newArr[i] > 90) newArr[i] = newArr[i]; 
			if(newArr[i] < 90) newArr[i] = (char)(newArr[i] + 32);
		}
		return newArr;
	}
	// 주어진 단어를 대 > 소 , 소 > 대문자로 변환하는 메소드 
	static char[] toChangeLetter(String word){
		char [] newArr = word.toCharArray();
		for(int i = 0; i < newArr.length ;i++) {
			if(newArr[i] > 90) newArr[i] = (char)(newArr[i] - 32); 
			else newArr[i] = (char)(newArr[i] + 32);
		}
		return newArr;
	}
}
