package arrList;

// 학생 정보를 적을 수 잇는 클래스

public class Student {
	String name;
	int id;
	Subjects subject = new Subjects() ;
	
	public Student () {
		name = "아직 정해지지 않음.";
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
		return this.name+"학생 : "+" 국어점수 : "+subject.kor+"  영어점수 : "+subject.eng+"  수학점수 : "+subject.math + "   평균 = "+ avg(sumAll());
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
