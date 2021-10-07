package viewer;

import java.util.Scanner;

import controller.UserController;
import model.user.UserDTO;
import util.ScannerUtil;

public class JoinViewer {
	private UserController userController;
	private Scanner scanner;
	
	public void joinViewerConnection() {
		scanner = new Scanner(System.in);
		userController = new UserController();
		userController.userControllerConnection();
	}
	
	
	public void join() {
		UserDTO temp = new UserDTO();
		String message;
		
		message = new String("���̵� �Է����ּ���.");
		String userName = ScannerUtil.nextLine(scanner, message);

		// ���̵� �ߺ� �˻� 
		boolean nameCheck = userController.auth(userName);
		while(nameCheck) {
			message = new String("���̵� �ߺ��Ǿ����ϴ�. �ٸ� ���̵� �Է����ּ���.");
			userName = ScannerUtil.nextLine(scanner, message);
			nameCheck = userController.auth(userName);
		}
		
		message = new String("��й�ȣ �Է����ּ���.");
		String userPassword = ScannerUtil.nextLine(scanner, message);

		message = new String("�г����� �Է����ּ���.");
		String userNickname = ScannerUtil.nextLine(scanner, message);
		
		// �г��� �ߺ� �˻�
		boolean nicknameCheck = userController.auth(userNickname);
		while(nicknameCheck) {
			message = new String("������� �г����Դϴ�. �ٸ� �г����� �Է����ּ���.");
			userNickname = ScannerUtil.nextLine(scanner, message);
			nameCheck = userController.auth(userNickname);
		}
		
		temp.setName(userName);
		temp.setPassword(userPassword);
		temp.setNickname(userNickname);
		
		userController.insert(temp);
	}	
}
