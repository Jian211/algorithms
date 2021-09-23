package day0915;

import java.util.Scanner;

public class Ex02GradeBook01 {

	public static void main(String[] args) {
		 // ���
        final int SUBJECT_SIZE = 3;
        final int STUDENT_SIZE = 5;

        // ����
        Scanner scanner = new Scanner(System.in);
        int[] idArray = new int[STUDENT_SIZE];
        String[] nameArray = new String[STUDENT_SIZE];
        int[][] scoreArray = new int[STUDENT_SIZE][SUBJECT_SIZE];
        int curIndex = 0;

        while (true) {
            // �޴� ��� �� ����� ������ �����ϴ� �޼ҵ� ȣ��
            int userChoice = showMenu(scanner);

            if (userChoice == 1) {
                // �Է� ��� �ڵ� ����
                if (curIndex < STUDENT_SIZE) {
                    // �Է� �����ϹǷ� �Է� �޼ҵ� ����
                    insertInfo(scanner, idArray, nameArray, scoreArray, curIndex);
                    // ���� �Է� ��ġ�� 1 ������Ų��.
                    curIndex++;

                } else {                    
                    // ���̻� �Է��� �� �����Ƿ� ���޽����� ���
                    System.out.println("���̻� �Է��Ͻ� �� �����ϴ�.");
                }
  
            } else if (userChoice == 2) {
                // ��� �ڵ� ����

                if (curIndex == 0) {
                    System.out.println("���� �Էµ� �л��� �������� �ʽ��ϴ�.");
                } else {
                    // ��� �޼ҵ� ����
                    printAll(idArray, nameArray, scoreArray, curIndex, SUBJECT_SIZE);
                }

            } else if (userChoice == 3) {
                // ����
                System.out.println("������ּż� �����մϴ�.");
                break;
            }
        }

        scanner.close();
    }

    public static int showMenu(Scanner scanner) {
        System.out.println("1. �Է� 2. ��� 3. ����");
        System.out.print("> ");
        int userChoice = scanner.nextInt();

        return userChoice;
    }

    public static void insertInfo(Scanner scanner, int[] idArray, String[] nameArray, int[][] scoreArray,int curIndex) {
        System.out.println("��ȣ�� �Է����ּ���.");
        System.out.print("> ");
        idArray[curIndex] = scanner.nextInt();

        System.out.println("�̸��� �Է����ּ���.");
        System.out.print("> ");
        scanner.nextLine();
        nameArray[curIndex] = scanner.nextLine();

        System.out.println("���� ������ �Է����ּ���.");
        System.out.print("> ");
        scoreArray[curIndex][0] = scanner.nextInt();

        System.out.println("���� ������ �Է����ּ���.");
        System.out.print("> ");
        scoreArray[curIndex][1] = scanner.nextInt();

        System.out.println("���� ������ �Է����ּ���.");
        System.out.print("> ");
        scoreArray[curIndex][2] = scanner.nextInt();
    }

    public static void printAll(int[] idArray, String[] nameArray, int[][] scoreArray, int curIndex, int SUBJECT_SIZE) {

        for (int i = 0; i < curIndex; i++) {
            System.out.println("----------------------------");
            System.out.println(nameArray[i] + " �л��� ����");
            System.out.println("----------------------------");
            int id = idArray[i];
            String name = nameArray[i];
            int korean = scoreArray[i][0];
            int english = scoreArray[i][1];
            int math = scoreArray[i][2];

            int sum = korean + english + math;

            double average = (double) sum / SUBJECT_SIZE;

            System.out.printf("��ȣ: %d�� �̸�: %s\n", id, name);
            System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", korean, english, math);
            System.out.printf("����: %03d�� ���: %06.2f��\n", sum, average);

            System.out.println("============================\n");
        }
    }
}
