package classEx;

public class OracleConnector implements DBConnector{

	public void makeConnection() {
		System.out.println("Oracle 데이터 베이스 연결 시작");
	}
	public void destroyConnection() {
		System.out.println("Oracle 데이터 베이스 연결 종료");
	}
	public void insert() {
		System.out.println("Oracle 데이터베이스 insert()실행");
	}
	public void delete() {
		System.out.println("Oracle 데이터베이스 delete()실행");
	}
	public void update() {
		System.out.println("Oracle 데이터베이스 update()실행");
	}
	public void selectAll() {
		System.out.println("Oracle 데이터베이스 selectAll()실행");
	}
	public void selectOne() {
		System.out.println("Oracle 데이터베이스 selectOne()실행");
	}

}
