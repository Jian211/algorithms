package employeeManagement;

public class Employee {
	private int id;
	private String team;
	private String name;
	private String email;
	private int salary;
	private int joined;
	
	private int count = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getJoined() {
		return joined;
	}
	public void setJoined(int joined) {
		this.joined = joined;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee a = (Employee) obj;
			if(id == a.id) {
				return true;
			}
		}
		return false;
	}
	public Employee() {
		this.team = "미정";
		this.name = "미정";
		this.email = "미정";
		this.salary = -1;
		this.joined = -1;
		this.id = count++;
	}
	public Employee(String team, String name, String email, int salary, int joined) {
		this.team = team;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.joined = joined;
		this.id = count++;

	}
	
	public String toString() {
		System.out.println("=====================================================");
		System.out.printf("[%s] %s / %s / %d / %d\n",team,name,email,joined,salary);
		return "";
	}
}
