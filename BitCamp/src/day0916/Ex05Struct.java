package day0916;

import struct.Student;

public class Ex05Struct {
    public static void main(String[] args) {
        Student s = new Student();

        s.id = 3;
        s.name = "ss";
        s.korean = 80;
        s.english = 81;
        s.math = 81;

        Student s2 = new Student();
        s2.id = 4;
        s2.name = "dd";
        s2.korean = 90;
        s2.english = 91;
        s2.math = 91;

        Student[] arr = new Student[3];
        arr[0].id = 40;
        arr[1].id = 50;
        arr[2].id = 60;

    }
}
