package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import model.CommentDTO;

public class CommentController {
	private static ArrayList<CommentDTO> commentList;
	private CommentDTO commentDTO;
	private final String DATE_FORMAT = "y/M/d h:m:s";
	private static Calendar cal = Calendar.getInstance();
	private SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	private int nextId;
	private RatingController ratingController;
	
	public void commentConnection() {
		ratingController = new RatingController();
		commentList = new ArrayList<>();
		commentDTO = new CommentDTO();
		nextId = 1;
		
		commentDTO.setComment("훌륭합니돠");
		commentDTO.setCommentId(nextId++);
		commentDTO.setMovieId(1);
		commentDTO.setTitle("살아있는 동안 나올 수 없는...");
		commentDTO.setWriterId(2);
		commentDTO.setWriterRank(2);
		commentDTO.setWrittenTime(cal.getInstance());
		commentDTO.setUpdatedTime(cal.getInstance());
		
		commentList.add(commentDTO);
		
		for (int i = 1; i <= 8; i++) {
			CommentDTO temp = new CommentDTO();
			
			temp.setMovieId(i);
			temp.setWriterId(i);
			temp.setComment(i +"hello");
			temp.setCommentId(nextId++);
			temp.setTitle("title"+i);
			temp.setWriterRank(1);
			temp.setWrittenTime(sdf.getCalendar());
			temp.setUpdatedTime(sdf.getCalendar());
			
			commentList.add(temp);
		}
	}

	public void setComment(CommentDTO temp) {
		commentList.add(temp);
	}
	
	
	public String getReviewerComment(int movieId) {
		for(CommentDTO c : commentList) {
			if(c.getWriterRank() == 2) {
				return c.getComment(); 
			}
		}
		return null;
		
	}
	
	
	public String getUserComment(int movieId) {
		for(CommentDTO comm : commentList) {
			if(comm.getWriterRank() == 1 && comm.getMovieId() == movieId){
				return comm.getComment();
			}
		}
		return null;
	}

	public void addUserComment(int movieId, int loggerId, String title, String comment) {
	
		CommentDTO temp = new CommentDTO();
		temp.setComment(comment);
		temp.setCommentId(nextId++);
		temp.setMovieId(movieId);
		temp.setTitle(title);
		temp.setWriterId(loggerId);
		temp.setWriterRank(1);
		temp.setWrittenTime(cal.getInstance());
		temp.setUpdatedTime(cal.getInstance());
		
		commentList.add(temp);
	}
	
	public CommentDTO selectOne(int movieId) {
		for(CommentDTO c : commentList) {
			if(c.getMovieId() == movieId) {
				return c;
			}
		}
		return null;
	}
	public void printMovieComments(int movieId) {
		int cnt = 1;
		for(CommentDTO c : commentList) {
			if(c.getMovieId() == movieId) {
				int writerRating = ratingController.getRating(c.getWriterId());
				System.out.println("=========================================");
				System.out.printf("[%d] - %s -  평점 : %s \n",cnt++, c.getTitle(), writerRating);
				System.out.println(c.getComment());
				System.out.println("=========================================");
			}
		}
	}
	
	public void printAll() {
		for(CommentDTO c : commentList) {
			System.out.printf("[%d] - %s - %s \n",c.getCommentId(), c.getTitle(), c.getWriterRank());
			System.out.println(c.getComment());
		}
	}
	
	public void printOne(int movieId) {
		CommentDTO temp = selectOne(movieId);
		System.out.printf("[%d] - %s - %s \n",temp.getCommentId(),temp.getTitle(),temp.getWriterRank());
		System.out.println(temp.getComment());
	}

}
