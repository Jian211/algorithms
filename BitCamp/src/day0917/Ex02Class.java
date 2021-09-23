package day0917;

import classEx.Student;

public class Ex02Class {
    public static void main(String[] args) {
        // 학생 s1생
        Student s1 = new Student();

        // 생성자 출력 
        s1.printInfo();
        
        // 파라미터가 포함된 생성자 출력
        s1 = new Student(4, "지명근", 44, 44, 45);
        s1.printInfo();

        // 학생 s1의 정보를 초기화 시키기
        s1.id = 1;
        s1.name = "사에";
        s1.korean = 80;
        s1.english = 80;
        s1.math = 81;
        s1.printInfo();

        // 두번째 학생 정보 입력
        Student s2 = new Student();
        s2.id = 2;
        s2.name = "마사카제!";
        s2.korean = 90;
        s2.english = 90;
        s2.math = 91;
        s2.printInfo();

        System.out.println("--------------------------------------------\n");
        s1 = new Student(4, "ddd", 44, 44, 45);
        s2 = new Student(4, "ddd", 44, 44, 45);
        s1.printInfo();
        s2.printInfo();

        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}
