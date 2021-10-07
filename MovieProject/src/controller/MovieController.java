package controller;

import java.util.ArrayList;
import model.CommentDTO;
import model.MovieDTO;
import model.RatingDTO;

public class MovieController {
	private static ArrayList<MovieDTO> mvList = new ArrayList<>();
	private static int nextId = 1;

	private RatingController ratingController;
	private CommentController commentController;
	
	public void movieConnection() {
		commentController = new CommentController();
		ratingController = new RatingController();
		commentController.commentConnection();
		ratingController.ratingConnection();
		
		for (int i = 1; i <= 8; i++) {
			MovieDTO movieDTO = new MovieDTO();
			
			movieDTO.setId(nextId++);
			movieDTO.setTitle("Title "+i);
			movieDTO.setContent("내용"+i);
			movieDTO.setGrade(i+"0세 이상");
			
			mvList.add(movieDTO);
		}
	}
	public MovieDTO selectOne(int mvId) {
		for(MovieDTO m : mvList) {
			if(m.getId() == mvId) {	
				int index = mvList.indexOf(m);
				return mvList.get(index);
			}
		}
		return null;
	}
	public void selectAll() {
		if(mvList.isEmpty()) {
			System.out.println("현재 상영중인 영화가 없습니다.");
		}
		for(MovieDTO mv : mvList) {
			System.out.printf(" %d [ %s ]\n",mv.getId(),mv.getTitle());
		}
	}
	
	// 일반인, 전문가 평점, 영화 제목 
	public void printSelectedMovie(int movieId) {
		System.out.println("요기");
		ratingController.show(movieId);
		String      movieTitle = mvList.get(movieId-1).getTitle();
		int	    reveiwerRating = ratingController.getReviewerRating(movieId);
		String reviewerComment = commentController.getReviewerComment(movieId);
		
		// 생각해보니 평균으로 만들어야함.
		int      userRating = ratingController.getUserRating(movieId);
		String     userComment = commentController.getUserComment(movieId);
		
		System.out.println("=====================================");
		System.out.printf(" %d [ %s ]\n", movieId, movieTitle);
		System.out.printf("[ Reviewer ] %d점 - %s -\n",reveiwerRating, reviewerComment);
		System.out.printf("[   User   ] %d점 - %s -\n",userRating, userComment);
		
	}
	public String getMovieTitle(int movieId) {
		MovieDTO temp = selectOne(movieId);
		return temp.getTitle();
	}
	
	// 유저가 선택한 영화 평점만보기.
	public void printRating(int movieId) {
		// 영화 타이틀 찾기
		String movieTitle = selectOne(movieId).getTitle();
		//평점 찾기
		int reviewerRating = ratingController.getReviewerRating(movieId);
		int userRating = ratingController.getUserRating(movieId);

		System.out.printf("%d의 영화 [ %s ]의 평점은\n",movieId,movieTitle);
		System.out.printf("유저 평점   [ %d]입니다.\n",reviewerRating);
		System.out.printf("리뷰어 평점 [ %d]입니다.\n",userRating);
	}
	
	// 영화별 평론가 평점 보기
	public void printReviewerComment(int movieId) {
		String movieTitle = selectOne(movieId).getTitle();
		// 평론가 펑점 받아오기
		int reviewerRating = ratingController.getReviewerRating(movieId);
		String comment = commentController.getReviewerComment(movieId);
		
		System.out.printf("[ %s ]영화, 평론가의 평점 및 평론입니다.\n",movieTitle);
		System.out.printf("[ %d점 ] - %s -\n",reviewerRating,comment);
	}
	
	public void printUserComment(int movieId) {
		String movieTitle = selectOne(movieId).getTitle();
		// 평론가 펑점 받아오기
		int userRating = ratingController.getUserRating(movieId);
		String comment = commentController.getUserComment(movieId);
		
		System.out.printf("[ %s ]영화, 유저의 평점 및 평론입니다.\n",movieTitle);
		System.out.printf("[ %d점 ] - %s -\n",userRating,comment);
		
	}
	public void printOne(int movieId) {
		MovieDTO temp = selectOne(movieId);
		System.out.println("["+temp.getId()+"]");
		System.out.println("현재 제목 : "+ temp.getTitle());
		System.out.println("현재 내용 : "+ temp.getContent());
		System.out.println("현재 제한 : "+ temp.getGrade());
	}
	
	public void addMovie( String title, String content, String grade) {
		MovieDTO temp = new MovieDTO(); 
		RatingDTO temp1 = new RatingDTO();
		CommentDTO temp2 = new CommentDTO();
		
		int movieId = nextId++;
		
		temp.setId(movieId);
		temp.setTitle(title);
		temp.setContent(content);
		temp.setGrade(grade);
		mvList.add(temp);
		
		temp1.setReviewerRating(0);
		temp1.setMovieId(movieId);
		temp1.setUserRating(0);
		temp1.setWriterId(0);
		ratingController.setRating(temp1);
		
		temp2.setMovieId(movieId);
		temp2.setWriterRank(2);
		temp2.setCommentId(movieId);
		temp2.setComment("아직없음");
		temp2.setTitle("아직없음");
		commentController.setComment(temp2);
	}

	public void editMovie(int movieId, String title, String content, String grade) {
		MovieDTO temp = selectOne(movieId);
		int index = mvList.indexOf(temp);
		temp.setTitle(title);
		temp.setContent(content);
		temp.setGrade(grade);
		mvList.set(index, temp);
	}

	public void removeMovie(int movieId) {
		MovieDTO temp = selectOne(movieId);
		int index = mvList.indexOf(temp);
		mvList.remove(index);
	}
}
