package classEx;


// DBConnector 인터페이를 상속 받는 MySqlConnector.
// 인터페이스 상속은 extends가 아닌 implements라는 키워드를 통해 이루어진다.
public class MySqlConnector implements DBConnector{

	public void makeConnection() {
		System.out.println("MySQL의 makeConnection() 실행");
	}
	public void destroyConnection() {
		System.out.println("MySQL의 destroyConnection() 실행");
	}
	public void insert() {
		System.out.println("MySQL의 insert() 실행");
	}
	public void delete() {
		System.out.println("MySQL의 delete() 실행");
	}
	public void update() {
		System.out.println("MySQL의 update() 실행");
	}
	public void selectAll() {
		System.out.println("MySQL의 selectAll() 실행");
	}
	public void selectOne() {
		System.out.println("MySQL의 selectOne() 실행");
	}

}
