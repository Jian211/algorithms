package day0917;

import java.util.Scanner;

import struct.Student;
import util.ArrayUtil;
import util.ScannerUtil;

public class Ex01GradeBook01 {
    // 상수 선언 
    final static int SUBJECT_SIZE = 3;
    final static int STUDENT_MAX = 5;
    final static int SCORE_MIN = 0;
    final static int SCORE_MAX = 100;

    // 공용 클래스 선언
    static Scanner scanner = new Scanner(System.in);
    static Student[] arr = new Student[0];
    
    // 공용 변수 선언
    static int nextId = 1;

    // 메인클래스 
    public static void main(String[] args) {
    	// 함수 실행 
    	showMenu();
    }

    // showMenu()
    public static void showMenu() {
        while (true) {
            System.out.println("----------------------------\n");
            System.out.println("학생 정보 관리 프로그램");
            System.out.println("\n----------------------------\n");

            String message = "1.입력  2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if (userChoice == 1) {
            	insert();
            } else if (userChoice == 2) {
                printAll();
            } else if (userChoice == 3) {
                System.out.println("�궗�슜�빐二쇱뀛�꽌 媛먯궗�빀�땲�떎.");
                scanner.close();
                break;
            }
        }
    }

    // insert()
    public static void insert() {
    	
    	// arr배열의 현재 사이즈가 5보다 작을때 
        if (ArrayUtil.size(arr) < STUDENT_MAX) {
            // 학생클래스 타입의 s를 선언;
        	Student s = new Student();

        	// 스트링 타입의 message 선언;
        	String message;

            // id + 1
            s.id = nextId++;

            // 이름을 입력받기.
            message = "이름을 입력해주세요.";
            s.name = ScannerUtil.nextLine(scanner, message);

            // 점수들 입력받기
            message = "국어 점수를 입력해주세요.";
            s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            message = "영어 점수를 입력해주세요.";
            s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            message = "수학 점수를 입력해주세요.";
            s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 전역 arr에 학생 타입의 s를 추가
            arr = ArrayUtil.add(arr, s);
        } else {
            System.out.println("------------------------------------\n");
            System.out.println("보유한 학생이 꽉 차서 더이상의 입력을 불가능합니다.");
            System.out.println("\n------------------------------------\n");
        }

    }

    // printAll()
    public static void printAll() {
    	// arr 배열의 값이 0이면 true;
        if (ArrayUtil.isEmpty(arr)) {
            System.out.println("------------------------------------\n");
            System.out.println("등록된 학생이 없습니다.");
            System.out.println("\n------------------------------------\n");
        } else {
            System.out.println("------------------------------------\n");
            for (int i = 0; i < ArrayUtil.size(arr); i++) {
                System.out.printf("%d. %s\n", i + 1, ArrayUtil.get(arr, i).name);
            }

            System.out.println("\n------------------------------------\n");
            String message = ".";
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, ArrayUtil.size(arr)) - 1;

            if (userChoice != -1) {
                printOne(userChoice);
            }
        }
    }

    // printOne()
    public static void printOne(int index) {
    	// 학생을 받아옴
        Student s = ArrayUtil.get(arr, index);
        
        // 학생의 점수의 합과 평균
        int sum = s.korean + s.english + s.math;
        double average = (double) sum / SUBJECT_SIZE;

        System.out.println("------------------------------------\n");
        System.out.println(s.name + "의 성적은");
        System.out.println("\n------------------------------------\n");

        System.out.printf("학생: %d의 이름: %s\n", s.id, s.name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s.korean, s.english, s.math);
        System.out.printf("합계: %03d점 평균: %06.2f점\n", sum, average);

        String message = "1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        if (userChoice == 1) {
            // 수정
            update(index);
        } else if (userChoice == 2) {
            // 삭제
            delete(index);
        } else if (userChoice == 3) {
            // 학생들 출력
            printAll();
        }
    }

    // update()
    public static void update(int index) {
    	// 학생의 정보를 받아옴
        Student s = ArrayUtil.get(arr, index);

        String message;

        message = "국어점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "영어점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "수학점수를 입력해주세요..";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        //수정된 결과 보여주기
        printOne(index);
    }

    // 삭제 delete()
    public static void delete(int index) {
        String message = "정말 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);

        if (yesNo.equalsIgnoreCase("Y")) {
            arr = ArrayUtil.remove(arr, index);
            printAll();
        } else {
            printOne(index);
        }
    }
}
