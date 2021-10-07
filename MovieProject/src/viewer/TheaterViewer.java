package viewer;

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
			
		else if(userChoice == 3) 	System.out.println("�ڷΰ��ڽ��ϴ�. ");

		else if(userChoice == 4) 	managerEditTheater();
			
		else if(userChoice == 5) 	manageRemoveTheater();
			
		else if(userChoice == 6) 	managerAddTheater();

		else if(userChoice == 7) 	managerRemoveTheaterMovies();

	}


	private int menuChoice() {
		String message;
		int userChoice;

		if(loggerController.getLoggerRang() == 2) {
			message = "1. ���� ��Ϻ���  2. ���� ��������  3. �ڷΰ���  4. ���� ���� ���� ����  5. ���� ���� ���� ����  6. ���ο� ������ ����ϱ�  7. ���� ������ ����";
			userChoice = ScannerUtil.nextInt(scanner, message , 1, 7);
		} else {
			message = "1. ���� ��Ϻ���  2. ���� ��������  3. �ڷΰ���";
			userChoice = ScannerUtil.nextInt(scanner, message,1,3);
		}
		return userChoice;
	}


	private void managerRemoveTheaterMovies() {
		String message = new String("���� ������ �����Ͻ÷��� ������ ��ȣ�� �Է����ּ���.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		
		message = new String("���� �������� ���� �����Ͻ÷��� 1�� , �κл����Ͻ÷��� 2���� �Է����ּ���.");
		int userChoice = ScannerUtil.nextInt(scanner, message);
		if(userChoice == 1) {
			theaterController.removeAllTheaterMovies(theaterId);
		}
		else if(userChoice == 2) {
			theaterController.removeTheaterMovie(theaterId);			
		}
		info();		
	}


	private void managerAddTheater() {
		String message = new String("���ο� �������� ����Ͻ� ������ ��ȣ�� �Է����ּ���.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		theaterController.printTheaterInfo(theaterId);
		
		System.out.println("�������� ����Ͻ� �ð��븦 �Է����ּ���.");
		message = "1. [9~11��]  2. [11~13��]  3. [13~15��]  4.[15~17��]  5. [17~19��]  6. [19~21��] ";
		int time = ScannerUtil.nextInt(scanner, message) - 1;
		
		message = "����Ͻ� ��ȭ�� �������ּ���.";
		movieController.selectAll();
		int movieId = ScannerUtil.nextInt(scanner,message);
		
		theaterController.addTheaterMovie(theaterId, movieId, time);
		
		theaterController.printTheaterInfo(theaterId);
		info();		
	}


	private void manageRemoveTheater() {
		String message = new String("�����Ͻ÷��� ������ ��ȣ�� �Է����ּ���.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		theaterController.removeTheater(theaterId);
		info();
	}


	private void managerEditTheater() {
		String message = new String("�����Ͻ÷��� ������ ��ȣ�� �Է����ּ���.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		theaterController.editTheater(theaterId);
		info();		
	}


	private void showSelectedTheater() {
		String message = new String("���Ͻô� ������ ��ȣ�� �Է����ּ���.");
		int theaterId = ScannerUtil.nextInt(scanner, message);
		theaterController.printTheaterInfo(theaterId);
		info();
	}


	private void showTheaterList() {
		theaterController.printAll();
		info();
	}
}
