package algorithm;

public class Conversion {
	public static void main(String[] args) {
		// �빮�� > �ҹ��� , �ҹ��� > �빮�ڷ� ��ȯ�ϱ� 
		String word = "helloWorlD";
		
		// ::�� �� Ű �� �� �� �� Ʈ 
 		char a = 'a'; // a = 97    z = 122   -32 �ϸ� �ҹ��ڷ� 
		char A = 'Z'; // A = 65    Z = 90    +32 �ϸ� �빮�ڷ� 
		
		char [] arr = new char[word.length()];

		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			if(letter > 90) arr[i] = (char)(letter - 32); 
			if(letter < 90) arr[i] = (char)(letter + 32);
		}
		System.out.println(arr);
		
		// ���� ���� �� ��, ---------------------------------
		System.out.println("���󺸰� �� �� ");
		System.out.println(bigLetter(word));      // HELLOWORLD
		System.out.println(smallLetter(word));    // helloworld
		System.out.println(toChangeLetter(word)); // HELLOwORLd
		
	}
	// �־��� �ܾ ���� �빮�ڷ� ����� �޼ҵ� 
	static char[] bigLetter(String word){
		char [] newArr = word.toCharArray();
		for(int i = 0; i < newArr.length ;i++) {
			if(newArr[i] > 90) newArr[i] = (char)(newArr[i] - 32); 
			if(newArr[i] < 90) newArr[i] = newArr[i];
		}
		return newArr;
	}
	// �־��� �ܾ ���� �ҹ��ڷ� ����� �޼ҵ� 
	static char[] smallLetter (String word) {
		char [] newArr = word.toCharArray();
		for(int i = 0; i < newArr.length ;i++) {
			if(newArr[i] > 90) newArr[i] = newArr[i]; 
			if(newArr[i] < 90) newArr[i] = (char)(newArr[i] + 32);
		}
		return newArr;
	}
	// �־��� �ܾ �� > �� , �� > �빮�ڷ� ��ȯ�ϴ� �޼ҵ� 
	static char[] toChangeLetter(String word){
		char [] newArr = word.toCharArray();
		for(int i = 0; i < newArr.length ;i++) {
			if(newArr[i] > 90) newArr[i] = (char)(newArr[i] - 32); 
			else newArr[i] = (char)(newArr[i] + 32);
		}
		return newArr;
	}
}
