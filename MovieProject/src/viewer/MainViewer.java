package viewer;

import java.util.Scanner;

import controller.LoggerController;
import util.ScannerUtil;

public class MainViewer {
	private Scanner scanner;
	private JoinViewer joinViewer;
	private LogInViewer logInViewer;
	private MovieViewer movieViewer;
	private TheaterViewer theaterViewer;
	private LoggerController loggerController;
	private static boolean onOff = true;
	
	public MainViewer() {
		scanner = new Scanner(System.in);
		movieViewer = new MovieViewer();
		joinViewer = new JoinViewer();
		logInViewer = new LogInViewer();
		theaterViewer = new TheaterViewer();
		loggerController = new LoggerController();
		
		joinViewer.joinViewerConnection();
		movieViewer.movieViewerConnection();
		logInViewer.loginViewerConnection();
		theaterViewer.theaterViewerConnection();
		loggerController.loggerConnection();
	}
	
	public void showViewer() {
		while(onOff) {
			int userChoice = menuChoice();
			
			if(userChoice == 1)			joinViewer.join(); 		// ȸ������
 			
			else if(userChoice == 2)	showMovie();	 		// ��ȸ������ ���α׷� ����ϱ�
			
			else if(userChoice == 3)	logInViewer.logIn();	// �α���
			
			else if(userChoice == 4)	exitProgram();			// ����
			
			else if(userChoice == 5)	showMovie();			// ���α׷� ���
			
			else if(userChoice == 6) 	logInViewer.logOut();	// �α׾ƿ�
				
			else if(userChoice == 7)	exitProgram();			// ����
			
		}
	}
	
	private int menuChoice() {
		String message;
		int userChoice;
		if(!loggerController.getLoggerStatus()) {
			loggerController.say();
			message = new String("1. ȸ������  2. ��ȸ������ �̿��ϱ�.  3. �α���  4. ���α׷� ����");
			userChoice = ScannerUtil.nextInt(scanner, message,1,4);
		}else {
			loggerController.say();
			message = new String("1. ���α׷� �̿��ϱ�  2. �α׾ƿ�  3. ���α׷� ����");
			int topProgramCnt = 4;
			userChoice = ScannerUtil.nextInt(scanner, message,1,3) + topProgramCnt;
		}		
		return userChoice;
	}

	public void exitProgram() {
		System.out.println("�̿����ּż� �����մϴ�.");
		scanner.close();
		onOff = false;
	}
	
	public void showMovie() {
		String message = new String("1. ��ȭ ���  2. ���� ���");
		int userChoice = ScannerUtil.nextInt(scanner, message,1,2);

		if(userChoice == 1)			movieViewer.info();		// ��ȭ ��Ϻ���

		else if(userChoice == 2) 	theaterViewer.info();	// ���� ��Ϻ���
	}
}
