package day0914;

public class Ex06Method {

/* 메소드의 경우, 우리가 선언과 구현으로 나눌 수가 잇는데,
 클래스의 경우, 메소드는 반드시 선언과 구현이 같이 이루어져야 한다.
 메소드의 선언은 다음과 같이 이루어진다.
 접근제한자 (static) 리턴타입 메소드 이름(파라밐터)
 접근제한자 : 해당 메소드를 외부 클래스가 접근 할때 어디에 잇는 외부 클래스가 접근 가능한지 설정하는 키워드. Access Modifier 한다.
			 접근제한자는 public, protected, package, private 4종류가 있따.
			 public    : 다른 패키지에 있는 다른 클래스도 실행가능.
			 protected : 같은 패키지에 있는 다른 클래스는 실행가능
						 다른 패키지에 있는 클래스의 경우 상속관계 일때만 실행가능.
			 package   : 같은 패키지에 있는 다른 클래스는 실행가능
					 	 단, 패키지는 어디에 있던간에 실행할 수 없다.
			 private   : 다른 패키지는 어디에 있떤간에 실행할수 없다.
			 			 즉, 해당클래스만 실행가능하다.
 static : static 키워드는 해당 메소드를 클래스 변수를 선언하지 않고 사용할수 있게한다.
			예를 들어서, 만약 우리가  기존에 사용하던  Scanner 클래스의  nextInt()메소드에
			static 키워드가 붙어있다면, Scanner scanner = new Scanner(System.in) 
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
