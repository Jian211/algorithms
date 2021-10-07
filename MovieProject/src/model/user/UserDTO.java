package model.user;

public class UserDTO {
	private int id;
	private	String name;
	private String password;
	private String nickname;
	private int rank = 1;

	public UserDTO() {
		
	}
	
	public UserDTO(String name, String password, String nickname) {
		this.name = name;
		this.password = password;
		this.nickname = nickname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		System.out.printf("[ID : %d] [Rank : %d] [Name : %s] [Nick : %s] [PW : %s]\n",this.id,this.rank,this.name,this.nickname,this.password);
		return "";
	}
	
	
}
