package model.user;

public class LoggerDTO extends UserDTO{
	private boolean status;
	
	public LoggerDTO() {
		this.setId(99);
		this.setName("guest");
		this.setNickname("guest");
		this.setPassword("guest");
		this.setRank(99);
		this.status = false;
	}
	
	
	public boolean isStatus() {
		return status;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
