package viewer;

import java.util.ArrayList;
import java.util.Scanner;

import controller.LoggerController;
import controller.MovieController;
import controller.TheaterController;
import util.ScannerUtil;

public class TheaterViewer {
	private LoggerController loggerController;
	private Scanner scanner;
	private TheaterController theaterController;
	private MovieController movieController;
	
	public void theaterViewerConnection() {
		scanner = new Scanner(System.in);
		movieController = new MovieController();
		loggerController = new LoggerController();
		theaterController = new TheaterController();
		theaterController.theaterControllerConnection();
	}

	
	public void info() {
		int userChoice = menuChoice();
		
		if(userChoice == 1)			showTheaterList();
		
		else if(userChoice == 2)	showSelectedTheater();
			
		else if(userChoice == 3) 	System.out.println("뒤로가겠습니다. ");

		else if(userChoice == 4) 	managerEditTheater();
			
		else if(userChoice == 5) 	manageRemoveTheater();
			
		else if(userChoice == 6) 	managerAddTheater();

		else if(userChoice == 7) 	managerRemoveTheaterMovies();

	}


	private int menuChoice() {
		String message;
		int userChoice;

		if(loggerController.getLoggerRang() == 2) {
			message = "1. 극장 목록보기  2. 극장 개별보기  3. 뒤로가기  4. 기존 극장 정보 수정  5. 기존 극장 정보 삭제  6. 새로운 상영정보 등록하기  7. 기존 상영정보 삭제";
			userChoice = ScannerUtil.nextInt(scanner, message , 1, 7);
		} else {
			message = "1. 극장 목록보기  2. 극장 개별보기  3. 뒤로가기";
			userChoice = ScannerUtil.nextInt(scanner, message,1,3);
		}
		return userChoice;
	}


	private void managerRemoveTheaterMovies() {
		String message = new String("기존 상영정보 삭제하시려는 극장의 번호를 입력해주세요.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		
		message = new String("기존 상영정보를 전부 삭제하시려면 1번 , 부분삭제하시려면 2번을 입력해주세요.");
		int userChoice = ScannerUtil.nextInt(scanner, message);
		if(userChoice == 1) {
			theaterController.removeAllTheaterMovies(theaterId);
		}
		else if(userChoice == 2) {
			int max = theaterController.theaterMoviesSize(theaterId);
			ArrayList<Integer> deleteList = new ArrayList<>();
			while(true) {
				message = "삭제하고자 하는 번호를 하나씩 입력해주세요. 없으시면 0을 입력해주세요.";
				userChoice = ScannerUtil.nextInt(scanner, message,0,max);
				if(userChoice != 0) {
					deleteList.add(userChoice-1);
				}else if(userChoice == 0){
					break;
				}
			}
			theaterController.removeTheaterMovie(deleteList, theaterId);	
			System.out.println("삭제가 완료되었습니다.");
		}
		info();		
	}

	private void managerAddTheater() {
		String message = new String("새로운 상영정보를 등록하실 극장의 번호를 입력해주세요.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		theaterController.printTheaterInfo(theaterId);
		
		System.out.println("상영정보를 등록하실 시간대를 입력해주세요.");
		message = "1. [9~11시]  2. [11~13시]  3. [13~15시]  4.[15~17시]  5. [17~19시]  6. [19~21시] ";
		int time = ScannerUtil.nextInt(scanner, message) - 1;
		
		message = "등록하실 영화를 선택해주세요.";
		movieController.selectAll();
		int movieId = ScannerUtil.nextInt(scanner,message);
		
		theaterController.addTheaterMovie(theaterId, movieId, time);
		
		theaterController.printTheaterInfo(theaterId);
		info();		
	}

	private void manageRemoveTheater() {
		String message = new String("삭제하시려는 극장의 번호를 입력해주세요.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		
		message = "정말로 삭제하시겠습니까? y/n";
		String yesNo = ScannerUtil.nextLine(scanner, message);
		if(yesNo.equalsIgnoreCase("y")) {
			if(!theaterController.removeTheater(theaterId)) {
				System.out.println("해당 상영관은 존재하지 않습니다.");
			}else{
				System.out.println("삭제되었습니다.");
			}
		}else {
			System.out.println("삭제가 취소되었습니다.");
		}
		
		info();
	}


	private void managerEditTheater() {
		String message = new String("수정하시려는 극장의 번호를 입력해주세요.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		
		message = "수정할 로케이션의 정보를 입력해주세요";
		String location = ScannerUtil.nextLine(scanner, message);
		
		message = "수정할 영화관의 이름정보를 입력해주세요";
		String name = ScannerUtil.nextLine(scanner, message);

		message = "수정할 phone Number 정보를 입력해주세요";
		String phone = ScannerUtil.nextLine(scanner, message);
		theaterController.editTheater(theaterId,location,name,phone);
		System.out.println("수정 완료되었습니다.");
		info();		
	}


	private void showSelectedTheater() {
		String message = new String("원하시는 극장의 번호를 입력해주세요.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		theaterController.printTheaterInfo(theaterId);
		info();
	}


	private void showTheaterList() {
		theaterController.printAll();
		info();
	}
}
