package model;

public class RatingDTO {
	private int id;
	private int writerId;
	private int movieId;
	private int userRating;
	private int reviewerRating;
	
	public RatingDTO() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWriterId() {
		return writerId;
	}
	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getReviewerRating() {
		return reviewerRating;
	}

	public void setReviewerRating(int reviewerRating) {
		this.reviewerRating = reviewerRating;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}
	
	
}
