package arrList;

// �л� ������ ���� �� �մ� Ŭ����

public class Student {
	String name;
	int id;
	Subjects subject = new Subjects() ;
	
	public Student () {
		name = "���� �������� ����.";
		id = -1;
		subject.kor = -1;
		subject.eng = -1;
		subject.math = -1;
	}
		
	public Student(String name, int id, int kor, int eng, int math) {
		this.name = name;
		this.id = id;
		subject.kor = kor;
		subject.eng = eng;
		subject.math = math;
	}
	
	public int sumAll () {		return subject.kor + subject.eng + subject.math; }
	
	public double avg (int a) {	return (double)a/3.00; }

	public String toString () {
		return this.name+"�л� : "+" �������� : "+subject.kor+"  �������� : "+subject.eng+"  �������� : "+subject.math + "   ��� = "+ avg(sumAll());
	}
	
	 public boolean equals(Object o) {
		 if(o instanceof Student) {
			 Student s = (Student) o;
			 if(this.id == s.id) {
				 return true;
			 }
		 }
		return false;
	}
}
