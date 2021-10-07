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
	
	// 영화 목록 보기.
	public void info() {
		int userChoice = menuChoice();
		
		if(userChoice == 1)			movieChoice();			// 영화선택
	
		else if(userChoice == 2)	movieRating();			// 영화 레이팅 보기
			
		else if(userChoice == 3) 	userRating();			// 유저 레이팅 보기
	
		else if(userChoice == 4)    reviewerRating();		// 리뷰어 레이팅 보기
		
		else if(userChoice == 5)	System.out.println("첫 화면으로 돌아갑니다.");

		else if(userChoice == 6)  	managerAddMovie();		// [관리자] 영화 추가

		else if(userChoice == 7) 	managerEditMovie(); 	// [관리자] 영화 수정

		else if(userChoice == 8) 	managerRemoveMovie();   // [관리자] 영화 삭제
	}
	
	private int menuChoice() {
		String message;
		int userChoice;
		showMovieList();
		if(loggerController.getLoggerRang() == 2) {
			message = new String("1. 영화선택보기  2. 영화별 평점보기   3. 영화별 고객 평점보기  4. 영화별 평론가 평점보기  5. 뒤로가기  6. 영화등록  7. 영화 정보 수정   8. 영화 삭제 " );
			userChoice = ScannerUtil.nextInt(scanner, message , 1, 8);
		}else {
			message = new String("1. 영화선택보기  2. 영화별 평점보기   3. 영화별 고객 평점보기  4. 영화별 평론가 평점보기  5. 뒤로가기" );
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
		String message = new String("삭제할 영화의 번호를 입력해주세요.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		
		message = "정말로 삭제하시겠습니까 ? y/n";
		String yesNo = ScannerUtil.nextLine(scanner, message);

		if(yesNo.equalsIgnoreCase("y")) {
			movieController.removeMovie(movieId);
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제를 취소하셨습니다.");
		}
		
		info();		
	}

	private void managerEditMovie() {
		String message = new String("수정할 영화의 번호를 입력해주세요.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		movieController.printOne(movieId);
		
		message = new String("Title를 입력해주세요.");
		String title = ScannerUtil.nextLine(scanner, message);

		message = new String("내용을 입력해주세요.");
		String content = ScannerUtil.nextLine(scanner, message);
		
		message = new String("Grade를 입력해주세요.");
		String grade = ScannerUtil.nextLine(scanner, message);
		
		movieController.editMovie(movieId,title,content,grade);
		info();
	}

	private void managerAddMovie() {
		String message = new String("Title를 입력해주세요.");
		String title = ScannerUtil.nextLine(scanner, message);

		message = new String("내용을 입력해주세요.");
		String content = ScannerUtil.nextLine(scanner, message);
		
		message = new String("Grade를 입력해주세요.");
		String grade = ScannerUtil.nextLine(scanner, message);
		
		movieController.addMovie(title, content, grade);
		info();
	}

	private void reviewerRating() {
		String message = new String("영화의 번호를 입력해주세요.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		movieController.printReviewerComment(movieId);
		info();
	}

	private void userRating() {
		String message = new String("영화의 번호를 입력해주세요.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		movieController.printUserComment(movieId);
		
		message = new String("해당영화에 평점과 댓글을 작성하시려면 1번, 나가시려면 2번을 입력해주세요.");
		int userChoice = ScannerUtil.nextInt(scanner, message);
		if(userChoice == 1) {
			int userRang = loggerController.getLoggerRang();
			boolean login = loggerController.getLoggerStatus();
			if(login && userRang == 1) {
				message = new String("평점, 1~5 사이의 숫자를 입력해주세요.");
				int rating = ScannerUtil.nextInt(scanner, message);
				ratingcontroller.addUserRating(movieId ,loggerController.getLoggerId(),rating);		

				//제작
				message = new String("댓글의 제목을 입력해주세요.");
				String title = ScannerUtil.nextLine(scanner, message);
				message = new String("댓글을 입력해주세요.");
				String comment = ScannerUtil.nextLine(scanner, message);
				commentController.addUserComment(movieId ,loggerController.getLoggerId(), title ,comment);
				// 댓글출력
				
			} else if(!login){
				message = new String("로그인을 하셔야 이용가능합니다. 로그인 하시겠습니까? y/n");
				String yesNo = ScannerUtil.nextLine(scanner, message);
				if(yesNo.equalsIgnoreCase("y")) {
					logInViewer.logIn();
				}else {
					System.out.println("취소하셨습니다.");
				}
			} else {
				System.out.println("죄송합니다. 일반유저분들만 이용가능합니다.\n");
			}
		}else if(userChoice == 2) {
			System.out.println("댓글작성 및 평점등록을 취소하셨습니다.");
		}
		
		info();
	}

	private void movieChoice() {
		String message = new String("영화의 번호를 입력해주세요.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		// 미완. 레이팅 평균 메소드 생성 밑 수정해야함. 일단대기
		movieController.printSelectedMovie(movieId);
		// 댓글 기능( 여유있으면 제작 )
		// makeComment()
		info();
	}
	
	private void movieRating() {
		//영화를 선택
		String message = new String("영화의 번호를 입력해주세요.");
		int movieId = ScannerUtil.nextInt(scanner, message);
		
		movieController.printRating(movieId);
		info();
	}
}
