package model.user;

public class ReviewerDTO extends UserDTO{
	private int rank = 2;
	
	public ReviewerDTO() {
		this.setRank(rank);
	}
}
