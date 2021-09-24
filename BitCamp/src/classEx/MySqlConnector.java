package classEx;


// DBConnector �������̸� ��� �޴� MySqlConnector.
// �������̽� ����� extends�� �ƴ� implements��� Ű���带 ���� �̷������.
public class MySqlConnector implements DBConnector{

	public void makeConnection() {
		System.out.println("MySQL�� makeConnection() ����");
	}
	public void destroyConnection() {
		System.out.println("MySQL�� destroyConnection() ����");
	}
	public void insert() {
		System.out.println("MySQL�� insert() ����");
	}
	public void delete() {
		System.out.println("MySQL�� delete() ����");
	}
	public void update() {
		System.out.println("MySQL�� update() ����");
	}
	public void selectAll() {
		System.out.println("MySQL�� selectAll() ����");
	}
	public void selectOne() {
		System.out.println("MySQL�� selectOne() ����");
	}

}
