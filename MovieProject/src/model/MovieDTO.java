package model;


public class MovieDTO {
	private int id;
	private String title;
	private String content;
	private String grade;
	
	public MovieDTO() {
		this.title = "아직 정보가 없습니다.";
		this.content = "아직 정보가 없습니다.";
		this.grade = "아직 정보가 없습니다.";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String toString() {
		System.out.println("[  "+title+"  ]");
		return "";
	}
}
