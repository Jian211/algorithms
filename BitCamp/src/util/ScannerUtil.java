package util;

import java.util.Scanner;

public class ScannerUtil {
    // printMessage()
	static Scanner scanner = new Scanner(System.in);
	
    private static void printMessage(String message) {
        System.out.println(message);
        System.out.print("> ");
    }

    // 2.  nextInt()
    public static int nextInt(String message) {
        printMessage(message);
//        int errorChecking = errorChk(scanner.nextInt());
//        if(errorChecking == -1) {
//        	System.out.println("유저의 값이 숫자가 아닙니다.");
//        	return -1;
//        };
        return scanner.nextInt();
    }

    // 3. nextInt()
    public static int nextInt(String message, int min, int max) {
        int num = nextInt(message);
        while (!(num >= min && num <= max)) {
            System.out.println("===============================");
            System.out.println("다시 숫자를 입력해주십시오.");
            System.out.println("===============================\n");
            num = nextInt(message);
        }

        return num;
    }

    // nextLine()
    public static String nextLine( String message) {
        printMessage(message);
        String temp = scanner.nextLine();

        if (temp.isEmpty()) {
            temp = scanner.nextLine();
        }

        return temp;
    }
    // error
//    private static int errorChk(Object o) {
//    	if(o instanceof Integer) {
//    		return (int)o;
//    	}
//    	return -1;	
//    }
}
