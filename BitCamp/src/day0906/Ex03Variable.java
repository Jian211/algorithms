package day0906;

public class Ex03Variable {

	public static void main(String[] args) {
		String name = "코린이";
		int age = 12;
		int grade = 1;
		int studentClass = 1;
		int kor = 50;
		int eng = 72;
		int math = 81;
		int sum = kor + eng + math;
		double avg = sum / 3.0;

		System.out.printf("이름: [%s] 나이 :[%03d]세\n", name, age);
		System.out.printf("학년: %d학년 반: %d반\n", grade,studentClass);
		System.out.printf("국어: [%4d]점 영어: [%4d]점 수학: [%4d]점\n", kor, eng, math);
		System.out.printf("총점: [%4d]점 평균:[%06.2f]\n",sum,avg); 
	}
}
