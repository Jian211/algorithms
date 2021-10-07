package model;

public class ScreenInfoDTO {
	private int screenId;
	private int movieId;
	private int theaterId;
	private String screenTime;
	
	public ScreenInfoDTO() {
		
	}
	
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getScreenTime() {
		return screenTime;
	}
	public void setScreenTime(String screenTime) {
		this.screenTime = screenTime;
	}
	
	
	
}
