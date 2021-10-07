package model.user;

public class ManagerDTO extends UserDTO {
	private int rank = 2;
	
	public ManagerDTO() {
		this.setRank(rank);
	}
}
