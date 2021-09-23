package classEx;

public class Student2 {
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private final int SUBJECT_SIZE = 3;
	
	// �޼ҵ�
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Student2) {
			Student2 a = (Student2) o;
			if(id == a.id) {
				return true;
			}
		}
		
		return false;
	}
	
	private int calculateSum() {
		return kor+eng+math;
	}
	
	private double calculateAverage() {
		return (double)calculateSum() / SUBJECT_SIZE;
	}
	
	public void printInfo() {
		System.out.println("--------------------------------------------");
		System.out.printf("��ȣ: %d�� �̸�: %s\n",id,name);
		System.out.printf("����: %3d�� ����: %3d�� ����: %3d��\n",kor,eng,math);
		System.out.printf("����: %3d�� ���: %06.2f��\n",calculateSum(),calculateAverage());
		
		System.out.println("--------------------------------------------");
	}
	
}
