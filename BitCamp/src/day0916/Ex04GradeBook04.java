package day0916;

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class Ex04GradeBook04 {
    static final int MAX_STUDENT = 5;
    static final int SUBJECT_SIZE = 3;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    static Scanner scanner = new Scanner(System.in);
    static int[] idArray = new int[0];
    static String[] nameArray = new String[0];
    static int[] koreanArray = new int[0];
    static int[] englishArray = new int[0];
    static int[] mathArray = new int[0];

    public static void insert() {
        if (ArrayUtil.size(idArray) < MAX_STUDENT) {
            String message;

            message = "踰덊샇瑜� �엯�젰�빐二쇱꽭�슂.";
            int id = ScannerUtil.nextInt(scanner, message);
            idArray = ArrayUtil.add(idArray, id);

            message = "�씠由꾩쓣 �엯�젰�빐二쇱꽭�슂.";
            String name = ScannerUtil.nextLine(scanner, message);
            nameArray = ArrayUtil.add(nameArray, name);

            message = "援��뼱 �젏�닔瑜� �엯�젰�빐二쇱꽭�슂.";
            int korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            koreanArray = ArrayUtil.add(koreanArray, korean);

            message = "�쁺�뼱 �젏�닔瑜� �엯�젰�빐二쇱꽭�슂.";
            int english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            englishArray = ArrayUtil.add(englishArray, english);

            message = "�닔�븰 �젏�닔瑜� �엯�젰�빐二쇱꽭�슂.";
            int math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            mathArray = ArrayUtil.add(mathArray, math);
        } else {
            System.out.println("==============================\n");
            System.out.println("�뜑�씠�긽 �엯�젰�븯�떎 �닔 �뾾�뒿�땲�떎.");
            System.out.println("\n==============================\n");
        }

    }

    // 2. 紐⑸줉 異쒕젰�쓣 �떞�떦�븯�뒗 printAll() 硫붿냼�뱶
    public static void printAll() {
        if (ArrayUtil.isEmpty(idArray)) {
            System.out.println("--------------------------------\n");
            System.out.println("�븘吏� �엯�젰�맂 �븰�깮�씠 議댁옱�븯吏� �븡�뒿�땲�떎.");
            System.out.println("\n--------------------------------");
        } else {
            System.out.println("-----------------------------\n");
            for (int i = 0; i < ArrayUtil.size(idArray); i++) {
                System.out.printf("%d. [%s] \n", i + 1, ArrayUtil.get(nameArray, i));
            }
            System.out.println("\n-----------------------------");
            String message = "媛쒕퀎 蹂닿린�븷 �븰�깮�쓽 踰덊샇瑜� �엯�젰�빐二쇱꽭�슂.";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, ArrayUtil.size(idArray)) - 1;

            printOne(userChoice);
        }
    }

    // 3. 媛쒕퀎 �젙蹂� 異쒕젰�쓣 �떞�떦�븯�뒗 printOne() 硫붿냼�뱶
    public static void printOne(int index) {
        int id = ArrayUtil.get(idArray, index);
        String name = ArrayUtil.get(nameArray, index);
        int korean = ArrayUtil.get(koreanArray, index);
        int english = ArrayUtil.get(englishArray, index);
        int math = ArrayUtil.get(mathArray, index);

        int sum = korean + english + math;
        double average = (double) sum / SUBJECT_SIZE;

        System.out.printf("踰덊샇: %d踰� �씠由�: %s\n", id, name);
        System.out.printf("援��뼱: %03d�젏 �쁺�뼱: %03d�젏 �닔�븰: %03d�젏\n", korean, english, math);
        System.out.printf("珥앹젏: %03d�젏 �룊洹�: %06.2f�젏\n", sum, average);

        System.out.println("-----------------------------------\n");
        String message = "1. �닔�젙 2. �궘�젣 3. �뮘濡쒓�湲�";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

        if (userChoice == 1) {
            // �닔�젙 硫붿냼�뱶 �샇異�
            update(index);

        } else if (userChoice == 2) {
            // �궘�젣 硫붿냼�뱶 �샇異�
            delete(index);

        } else if (userChoice == 3) {
            printAll();
        }
    }

    // 4. 硫붾돱 異쒕젰�쓣 �떞�떦�븯�뒗 showMenu() 硫붿냼�뱶
    public static void showMenu() {
        while (true) {
            String message = "1. �엯�젰 2. 異쒕젰 3. 醫낅즺";
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if (userChoice == 1) {
                // �엯�젰�쓣 �떞�떦�븯�뒗 硫붿냼�뱶 �샇異�
                insert();
            } else if (userChoice == 2) {
                // 紐⑸줉 異쒕젰�쓣 �떞�떦�븯�뒗 硫붿냼�뱶 �샇異�
                printAll();
            } else if (userChoice == 3) {
                // 醫낅즺 肄붾뱶 �떎�뻾
                System.out.println("�궗�슜�빐二쇱뀛�꽌 媛먯궗�빀�땲�떎.");
                break;
            }
        }
    }

    // 5. 硫붿씤 硫붿냼�뱶
    public static void main(String[] args) {
        // 硫붾돱 硫붿냼�뱶 �샇異�
        showMenu();

        // 硫붾돱 硫붿냼�뱶 醫낅즺 �떆, Scanner �겢�옒�뒪 蹂��닔瑜� �떕�븘以��떎.
        scanner.close();
    }

    // 6. �븰�깮�쓽 �젙蹂� �닔�젙�쓣 �떞�떦�븯�뒗 update() 硫붿냼�뱶
    public static void update(int index) {
        String message;

        message = "�깉濡쒖슫 援��뼱 �젏�닔瑜� �엯�젰�빐二쇱꽭�슂.";
        int korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        ArrayUtil.set(koreanArray, index, korean);

        message = "�깉濡쒖슫 �쁺�뼱 �젏�닔瑜� �엯�젰�빐二쇱꽭�슂.";
        int english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        ArrayUtil.set(englishArray, index, english);

        message = "�깉濡쒖슫 �닔�븰 �젏�닔瑜� �엯�젰�빐二쇱꽭�슂.";
        int math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        ArrayUtil.set(mathArray, index, math);

        printOne(index);
    }

    // 7. �븰�깮�쓽 �젙蹂� �궘�젣瑜� �떞�떦�븯�뒗 delete() 硫붿냼�뱶
    public static void delete(int index) {
        String message = "�젙留먮줈 �궘�젣�븯�떆寃좎뒿�땲源�? y/n";
        String yesNo = ScannerUtil.nextLine(scanner, message);

        if (yesNo.equalsIgnoreCase("y")) {
            idArray = ArrayUtil.removeByIndex(idArray, index);
            nameArray = ArrayUtil.remove(nameArray, index);
            koreanArray = ArrayUtil.removeByIndex(koreanArray, index);
            englishArray = ArrayUtil.removeByIndex(englishArray, index);
            mathArray = ArrayUtil.removeByIndex(mathArray, index);

            printAll();
        } else {
            printOne(index);
        }
    }
}
