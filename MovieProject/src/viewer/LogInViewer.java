package viewer;

import java.util.Scanner;

import controller.LoggerController;
import controller.UserController;
import util.ScannerUtil;

public class LogInViewer {
	private Scanner scanner;
	private UserController userController;
	private LoggerController loggerController;
	
	public void loginViewerConnection() {
		scanner = new Scanner(System.in);
		userController = new UserController();
		loggerController = new LoggerController();
	}
	
	public void logIn() {
		String message;
		System.out.println("==========  �α���  ==========");
		
		message = new String("���̵� �Է����ּ���.");
		String userName = ScannerUtil.nextLine(scanner, message);

		message = new String("��й�ȣ�� �Է����ּ���.");
		String userPassword = ScannerUtil.nextLine(scanner, message);
		
		boolean logInResult = userController.auth(userName, userPassword);
		System.out.println(logInResult);
	
		// login ����
		if(!logInResult) {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ʋ���ϴ�.");
			message = new String("�α����� �Ͻ÷��� 0, �ʱ�ȭ������ ���ư��÷��� 1�� �Է����ּ���.");
			int userChoice = ScannerUtil.nextInt(scanner, message);
			
			if(userChoice == 0) {
				logIn();
			}else if(userChoice == 1) {
				System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
			}
		} 
		// login ����
		else if(logInResult) {
			System.out.println("�α��μ���");
			// �α����� ������ ������ ���� �� �������� ����.
			loggerController.setLoggerInfo(
					userController.getUserInfo(userName, userPassword)
			);
		}
	}

	public void logOut() {
		String message = "�α׾ƿ��� �Ͻðڽ��ϱ�? y/n";
		String userChoice = ScannerUtil.nextLine(scanner, message);
		
		if(userChoice.equalsIgnoreCase("y")) {
			loggerController.loggerConnection();
		}else {
			System.out.println("�α׾ƿ��� ����ϼ̽��ϴ�.");
		}
		
		
	}

}
