package algorithms01;

public class Student {
	private String name;
	private String no;
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no   = no;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}	
	
}
