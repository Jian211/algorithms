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
	
	public void commentConnection() {
		commentList = new ArrayList<>();
		commentDTO = new CommentDTO();
		nextId = 1;
		
		commentDTO.setComment("�Ǹ��մϵ�");
		commentDTO.setCommentId(nextId++);
		commentDTO.setMovieId(1);
		commentDTO.setTitle("����ִ� ���� ���� �� ����...");
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
			temp.setCommentId(i);
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
	
	// Ȯ���� ���� �޼ҵ�
	public void printAll() {
		for(CommentDTO c : commentList) {
			System.out.println(c.getWriterRank());
		}
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
		System.out.println("���� �ڸǵ� �����");
	}

}
