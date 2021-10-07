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
			movieDTO.setContent("����"+i);
			movieDTO.setGrade(i+"0�� �̻�");
			
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
			System.out.println("���� ������ ��ȭ�� �����ϴ�.");
		}
		for(MovieDTO mv : mvList) {
			System.out.printf(" %d [ %s ]\n",mv.getId(),mv.getTitle());
		}
	}
	
	// �Ϲ���, ������ ����, ��ȭ ���� 
	public void printSelectedMovie(int movieId) {
		System.out.println("���");
		ratingController.show(movieId);
		String      movieTitle = mvList.get(movieId-1).getTitle();
		int	    reveiwerRating = ratingController.getReviewerRating(movieId);
		String reviewerComment = commentController.getReviewerComment(movieId);
		
		// �����غ��� ������� ��������.
		int      userRating = ratingController.getUserRating(movieId);
		String     userComment = commentController.getUserComment(movieId);
		
		System.out.println("=====================================");
		System.out.printf(" %d [ %s ]\n", movieId, movieTitle);
		System.out.printf("[ Reviewer ] %d�� - %s -\n",reveiwerRating, reviewerComment);
		System.out.printf("[   User   ] %d�� - %s -\n",userRating, userComment);
		
	}
	public String getMovieTitle(int movieId) {
		MovieDTO temp = selectOne(movieId);
		return temp.getTitle();
	}
	
	// ������ ������ ��ȭ ����������.
	public void printRating(int movieId) {
		// ��ȭ Ÿ��Ʋ ã��
		String movieTitle = selectOne(movieId).getTitle();
		//���� ã��
		int reviewerRating = ratingController.getReviewerRating(movieId);
		int userRating = ratingController.getUserRating(movieId);

		System.out.printf("%d�� ��ȭ [ %s ]�� ������\n",movieId,movieTitle);
		System.out.printf("���� ����   [ %d]�Դϴ�.\n",reviewerRating);
		System.out.printf("����� ���� [ %d]�Դϴ�.\n",userRating);
	}
	
	// ��ȭ�� ��а� ���� ����
	public void printReviewerComment(int movieId) {
		String movieTitle = selectOne(movieId).getTitle();
		// ��а� ���� �޾ƿ���
		int reviewerRating = ratingController.getReviewerRating(movieId);
		String comment = commentController.getReviewerComment(movieId);
		
		System.out.printf("[ %s ]��ȭ, ��а��� ���� �� ����Դϴ�.\n",movieTitle);
		System.out.printf("[ %d�� ] - %s -\n",reviewerRating,comment);
	}
	
	public void printUserComment(int movieId) {
		String movieTitle = selectOne(movieId).getTitle();
		// ��а� ���� �޾ƿ���
		int userRating = ratingController.getUserRating(movieId);
		String comment = commentController.getUserComment(movieId);
		
		System.out.printf("[ %s ]��ȭ, ������ ���� �� ����Դϴ�.\n",movieTitle);
		System.out.printf("[ %d�� ] - %s -\n",userRating,comment);
		
	}
	public void printOne(int movieId) {
		MovieDTO temp = selectOne(movieId);
		System.out.println("["+temp.getId()+"]");
		System.out.println("���� ���� : "+ temp.getTitle());
		System.out.println("���� ���� : "+ temp.getContent());
		System.out.println("���� ���� : "+ temp.getGrade());
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
		temp2.setComment("��������");
		temp2.setTitle("��������");
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
