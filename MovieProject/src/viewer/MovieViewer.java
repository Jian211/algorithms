package viewer;

import java.util.Scanner;

import controller.CommentController;
import controller.LoggerController;
import controller.MovieController;
import controller.RatingController;
import util.ScannerUtil;

public class MovieViewer {
	private Scanner scanner;
	private MovieController movieController;
	private LoggerController loggerController;
	private RatingController ratingcontroller;
	private CommentController commentController;
	private LogInViewer logInViewer;
	
	public void movieViewerConnection() {
		scanner = new Scanner(System.in);
		loggerController = new LoggerController();
		movieController = new MovieController();
		commentController = new CommentController();
		ratingcontroller = new RatingController();
		logInViewer = new LogInViewer();

		movieController.movieConnection();
		ratingcontroller.ratingConnection();
		loggerController.loggerConnection();
		commentController.commentConnection();
		logInViewer.loginViewerConnection();
	}
	
	// ��ȭ ��� ����.
	public void info() {
		int userChoice = menuChoice();
		
		if(userChoice == 1)			movieChoice();			// ��ȭ����
	
		else if(userChoice == 2)	movieRating();			// ��ȭ ������ ����
			
		else if(userChoice == 3) 	userRating();			// ���� ������ ����
	
		else if(userChoice == 4)    reviewerRating();		// ����� ������ ����
		
		else if(userChoice == 5)	System.out.println("ù ȭ������ ���ư��ϴ�.");

		else if(userChoice == 6)  	managerAddMovie();		// [������] ��ȭ �߰�

		else if(userChoice == 7) 	managerEditMovie(); 	// [������] ��ȭ ����

		else if(userChoice == 8) 	managerRemoveMovie();   // [������] ��ȭ ����
	}
	
	private int menuChoice() {
		String message;
		int userChoice;
		showMovieList();
		if(loggerController.getLoggerRang() == 2) {
			message = new String("1. ��ȭ���ú���  2. ��ȭ�� ��������   3. ��ȭ�� �� ��������  4. ��ȭ�� ��а� ��������  5. �ڷΰ���  6. ��ȭ���  7. ��ȭ ���� ����   8. ��ȭ ���� " );
			userChoice = ScannerUtil.nextInt(scanner, message , 1, 8);
		}else {
			message = new String("1. ��ȭ���ú���  2. ��ȭ�� ��������   3. ��ȭ�� �� ��������  4. ��ȭ�� ��а� ��������  5. �ڷΰ���" );
			userChoice = ScannerUtil.nextInt(scanner, message , 1, 5);
		}
		return userChoice;
	}

	private void showMovieList() {
		System.out.println("========== MOVIE LIST ==========");
		movieController.selectAll();
		System.out.println("================================");
	}
	
	private void managerRemoveMovie() {
		String message = new String("������ ��ȭ�� ��ȣ�� �Է����ּ���.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		
		message = "������ �����Ͻðڽ��ϱ� ? y/n";
		String yesNo = ScannerUtil.nextLine(scanner, message);

		if(yesNo.equalsIgnoreCase("y")) {
			movieController.removeMovie(movieId);
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ����ϼ̽��ϴ�.");
		}
		
		info();		
	}

	private void managerEditMovie() {
		String message = new String("������ ��ȭ�� ��ȣ�� �Է����ּ���.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		movieController.printOne(movieId);
		
		message = new String("Title�� �Է����ּ���.");
		String title = ScannerUtil.nextLine(scanner, message);

		message = new String("������ �Է����ּ���.");
		String content = ScannerUtil.nextLine(scanner, message);
		
		message = new String("Grade�� �Է����ּ���.");
		String grade = ScannerUtil.nextLine(scanner, message);
		
		movieController.editMovie(movieId,title,content,grade);
		info();
	}

	private void managerAddMovie() {
		String message = new String("Title�� �Է����ּ���.");
		String title = ScannerUtil.nextLine(scanner, message);

		message = new String("������ �Է����ּ���.");
		String content = ScannerUtil.nextLine(scanner, message);
		
		message = new String("Grade�� �Է����ּ���.");
		String grade = ScannerUtil.nextLine(scanner, message);
		
		movieController.addMovie(title, content, grade);
		info();
	}

	private void reviewerRating() {
		String message = new String("��ȭ�� ��ȣ�� �Է����ּ���.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		movieController.printReviewerComment(movieId);
		info();
	}

	private void userRating() {
		String message = new String("��ȭ�� ��ȣ�� �Է����ּ���.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		movieController.printUserComment(movieId);
		
		message = new String("�ش翵ȭ�� ������ ����� �ۼ��Ͻ÷��� 1��, �����÷��� 2���� �Է����ּ���.");
		int userChoice = ScannerUtil.nextInt(scanner, message);
		if(userChoice == 1) {
			int userRang = loggerController.getLoggerRang();
			boolean login = loggerController.getLoggerStatus();
			if(login && userRang == 1) {
				message = new String("����, 1~5 ������ ���ڸ� �Է����ּ���.");
				int rating = ScannerUtil.nextInt(scanner, message);
				ratingcontroller.addUserRating(movieId ,loggerController.getLoggerId(),rating);		

				//����
				message = new String("����� ������ �Է����ּ���.");
				String title = ScannerUtil.nextLine(scanner, message);
				message = new String("����� �Է����ּ���.");
				String comment = ScannerUtil.nextLine(scanner, message);
				commentController.addUserComment(movieId ,loggerController.getLoggerId(), title ,comment);
				// ������
				
			} else if(!login){
				message = new String("�α����� �ϼž� �̿밡���մϴ�. �α��� �Ͻðڽ��ϱ�? y/n");
				String yesNo = ScannerUtil.nextLine(scanner, message);
				if(yesNo.equalsIgnoreCase("y")) {
					logInViewer.logIn();
				}else {
					System.out.println("����ϼ̽��ϴ�.");
				}
			} else {
				System.out.println("�˼��մϴ�. �Ϲ������е鸸 �̿밡���մϴ�.\n");
			}
		}else if(userChoice == 2) {
			System.out.println("����ۼ� �� ��������� ����ϼ̽��ϴ�.");
		}
		
		info();
	}

	private void movieChoice() {
		String message = new String("��ȭ�� ��ȣ�� �Է����ּ���.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		// �̿�. ������ ��� �޼ҵ� ���� �� �����ؾ���. �ϴܴ��
		movieController.printSelectedMovie(movieId);
		// ��� ���( ���������� ���� )
		// makeComment()
		info();
	}
	
	private void movieRating() {
		//��ȭ�� ����
		String message = new String("��ȭ�� ��ȣ�� �Է����ּ���.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		
		movieController.printRating(movieId);
		info();
	}
}
