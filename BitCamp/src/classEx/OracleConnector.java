package classEx;

public class OracleConnector implements DBConnector{

	public void makeConnection() {
		System.out.println("Oracle ������ ���̽� ���� ����");
	}
	public void destroyConnection() {
		System.out.println("Oracle ������ ���̽� ���� ����");
	}
	public void insert() {
		System.out.println("Oracle �����ͺ��̽� insert()����");
	}
	public void delete() {
		System.out.println("Oracle �����ͺ��̽� delete()����");
	}
	public void update() {
		System.out.println("Oracle �����ͺ��̽� update()����");
	}
	public void selectAll() {
		System.out.println("Oracle �����ͺ��̽� selectAll()����");
	}
	public void selectOne() {
		System.out.println("Oracle �����ͺ��̽� selectOne()����");
	}

}
