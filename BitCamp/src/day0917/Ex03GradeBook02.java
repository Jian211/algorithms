package day0917;

import java.util.Scanner;

import classEx.Student;
import util.ScannerUtil;
import util.ArrayUtil;

public class Ex03GradeBook02 {
	// 전역 상수 
	final static int STUDENT_MAX = 5;
    final static int SCORE_MIN = 0;
    final static int SCORE_MAX = 100;

    static Scanner scanner = new Scanner(System.in);
    static Student[] arr = new Student[0];
    static int nextId = 1;

    public static void main(String[] args) {
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
    	// 만약 arr의 배열 사이즈가 초과하지 않았을 때
    	if (ArrayUtil.size(arr) < STUDENT_MAX) {
            Student s = new Student();

            String message;

            s.id = nextId++;

            message = "이름을 입력해주세요.";
            s.name = ScannerUtil.nextLine(scanner, message);

            // 점수 입력
            message = "국어 점수를 입력해주세요.";
            s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            message = "영어 점수를 입력해주세요.";
            s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            message = "수학 점수를 입력해주세요.";
            s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 배열에 추가
            arr = ArrayUtil.add(arr, s);
        } else {
            System.out.println("------------------------------------\n");
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
            System.out.println("\n------------------------------------\n");
        }

    }

    // printAll()
    public static void printAll() {
        if (ArrayUtil.isEmpty(arr)) {
            System.out.println("------------------------------------\n");
            System.out.println("학생정보가 없습니다.");
            System.out.println("\n------------------------------------\n");
        } else {
            System.out.println("------------------------------------\n");
            for (int i = 0; i < ArrayUtil.size(arr); i++) {
                System.out.printf("%d. %s\n", i + 1, ArrayUtil.get(arr, i).name);
            }

            System.out.println("\n------------------------------------\n");
            String message = "보고싶은 학생 정보를 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, ArrayUtil.size(arr)) - 1;

            if (userChoice != -1) {
                printOne(userChoice);
            }
        }
    }

    // printOne()
    public static void printOne(int index) {
        Student s = ArrayUtil.get(arr, index);

        System.out.println("------------------------------------\n");
        System.out.println(s.name + " 정보입니다.");
        System.out.println("\n------------------------------------\n");

        s.printInfo();

        String message = "1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        if (userChoice == 1) {
            update(index);
        } else if (userChoice == 2) {
            delete(index);
        } else if (userChoice == 3) {
            printAll();
        }
    }

    // update()
    public static void update(int index) {
        Student s = ArrayUtil.get(arr, index);

        String message;

        message = "새로운 국어점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "새로운 영어점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "새로운 수학점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        printOne(index);
    }

    // delete()
    public static void delete(int index) {
        String message = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);

        if (yesNo.equalsIgnoreCase("Y")) {
            arr = ArrayUtil.remove(arr, index);
            printAll();
        } else {
            printOne(index);
        }
    }
}
