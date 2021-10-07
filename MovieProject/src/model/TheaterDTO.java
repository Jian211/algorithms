package model;

public class TheaterDTO {
	private int theaterId;
	private String name;
	private String location;
	private String phoneNumber;
	private int [] theaterMovies = new int[6];
	
	public TheaterDTO() {
		
	}
	
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int [] getTheaterMovies() {
		return theaterMovies;
	}

	public void setTheaterMovies(int [] theaterMovies) {
		this.theaterMovies = theaterMovies;
	}
}
