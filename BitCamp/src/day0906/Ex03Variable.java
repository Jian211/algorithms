package day0906;

public class Ex03Variable {

	public static void main(String[] args) {
		String name = "�ڸ���";
		int age = 12;
		int grade = 1;
		int studentClass = 1;
		int kor = 50;
		int eng = 72;
		int math = 81;
		int sum = kor + eng + math;
		double avg = sum / 3.0;

		System.out.printf("�̸�: [%s] ���� :[%03d]��\n", name, age);
		System.out.printf("�г�: %d�г� ��: %d��\n", grade,studentClass);
		System.out.printf("����: [%4d]�� ����: [%4d]�� ����: [%4d]��\n", kor, eng, math);
		System.out.printf("����: [%4d]�� ���:[%06.2f]\n",sum,avg); 
	}
}
