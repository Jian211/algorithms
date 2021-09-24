package day0923;

import classEx.DBConnector;
import classEx.MySqlConnector;
import classEx.OracleConnector;
import util.ScannerUtil;

public class Ex04Interface {
	static DBConnector conn;
	
	public static void main(String[] args) {
		conn = new OracleConnector();
		showMenu();
	}
	
	private static void showMenu() {
		String messge = "1. DB���� 2. ������ �Է�  3. ������ ��ü ���  4. ������ ���� ���  5. ������ ����  6. ������ ����  7. ���α׷� ����"; 
		while(true) {
			int userChoice = ScannerUtil.nextInt(messge,1,7);
			if(userChoice == 1) {
				conn.makeConnection();
			}else if(userChoice == 2) {
				conn.insert();
			}else if(userChoice == 3) {
				conn.selectAll();
			}else if(userChoice == 4) {
				conn.selectOne();
			}else if(userChoice == 5) {
				conn.update();
			}else if(userChoice == 6) {
				conn.delete();
			}else if(userChoice == 7) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
	}
}
