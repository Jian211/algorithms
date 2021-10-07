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
			
			if(userChoice == 1)			joinViewer.join(); 		// 회원가입
 			
			else if(userChoice == 2)	showMovie();	 		// 비회원으로 프로그램 사용하기
			
			else if(userChoice == 3)	logInViewer.logIn();	// 로그인
			
			else if(userChoice == 4)	exitProgram();			// 종료
			
			else if(userChoice == 5)	showMovie();			// 프로그램 사용
			
			else if(userChoice == 6) 	logInViewer.logOut();	// 로그아웃
				
			else if(userChoice == 7)	exitProgram();			// 종료
			
		}
	}
	
	private int menuChoice() {
		String message;
		int userChoice;
		if(!loggerController.getLoggerStatus()) {
			loggerController.say();
			message = new String("1. 회원가입  2. 비회원으로 이용하기.  3. 로그인  4. 프로그램 종료");
			userChoice = ScannerUtil.nextInt(scanner, message,1,4);
		}else {
			loggerController.say();
			message = new String("1. 프로그램 이용하기  2. 로그아웃  3. 프로그램 종료");
			int topProgramCnt = 4;
			userChoice = ScannerUtil.nextInt(scanner, message,1,3) + topProgramCnt;
		}		
		return userChoice;
	}

	public void exitProgram() {
		System.out.println("이용해주셔서 감사합니다.");
		scanner.close();
		onOff = false;
	}
	
	public void showMovie() {
		String message = new String("1. 영화 목록  2. 극장 목록");
		int userChoice = ScannerUtil.nextInt(scanner, message,1,2);

		if(userChoice == 1)			movieViewer.info();		// 영화 목록보기

		else if(userChoice == 2) 	theaterViewer.info();	// 극장 목록보기
	}
}
