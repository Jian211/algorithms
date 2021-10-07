package model;

import java.util.Calendar;

public class CommentDTO {
	private int movieId;
	private int commentId;
	private int writerId;
	private int writerRank;
	private String title;
	private String comment;
	private Calendar writtenTime;
	private Calendar updatedTime;

	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getWriterId() {
		return writerId;
	}
	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Calendar getWrittenTime() {
		return writtenTime;
	}
	public void setWrittenTime(Calendar writtenTime) {
		this.writtenTime = writtenTime;
	}
	public Calendar getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Calendar updatedTime) {
		this.updatedTime = updatedTime;
	}
	public int getWriterRank() {
		return writerRank;
	}
	public void setWriterRank(int writerRank) {
		this.writerRank = writerRank;
	}
	
}
