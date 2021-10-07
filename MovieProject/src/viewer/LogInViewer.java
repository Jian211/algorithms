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
		System.out.println("==========  로그인  ==========");
		
		message = new String("아이디를 입력해주세요.");
		String userName = ScannerUtil.nextLine(scanner, message);

		message = new String("비밀번호를 입력해주세요.");
		String userPassword = ScannerUtil.nextLine(scanner, message);
		
		boolean logInResult = userController.auth(userName, userPassword);
		System.out.println(logInResult);
	
		// login 실패
		if(!logInResult) {
			System.out.println("아이디 혹은 비밀번호가 틀립니다.");
			message = new String("로그인을 하시려면 0, 초기화면으로 돌아가시려면 1을 입력해주세요.");
			int userChoice = ScannerUtil.nextInt(scanner, message);
			
			if(userChoice == 0) {
				logIn();
			}else if(userChoice == 1) {
				System.out.println("초기화면으로 돌아갑니다.");
			}
		} 
		// login 성공
		else if(logInResult) {
			System.out.println("로그인성공");
			// 로그인한 유저의 정보를 복사 및 지속적인 유지.
			loggerController.setLoggerInfo(
					userController.getUserInfo(userName, userPassword)
			);
		}
	}

	public void logOut() {
		String message = "로그아웃을 하시겠습니까? y/n";
		String userChoice = ScannerUtil.nextLine(scanner, message);
		
		if(userChoice.equalsIgnoreCase("y")) {
			loggerController.loggerConnection();
		}else {
			System.out.println("로그아웃을 취소하셨습니다.");
		}
		
		
	}

}
