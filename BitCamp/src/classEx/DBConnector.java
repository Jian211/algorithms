package classEx;

// Database ������ ����� Ŭ�������� ������ ���� �޼ҵ带 ������ �������̽�

public interface DBConnector {
	public void makeConnection();
	public void destroyConnection();
	public void insert();
	public void delete();
	public void update();
	public void selectAll();
	public void selectOne();
}
