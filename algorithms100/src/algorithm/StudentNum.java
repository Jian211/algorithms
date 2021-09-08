package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNum {

	public static void main(String[] args) {
		Student st1 = new Student("ji","01");
		Student st2 = new Student("him","02");
		Student st3 = new Student("son","03");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
	
		for(Student stu:list) {
			System.out.print(stu.getName());
			System.out.println(stu.getNo());
		}
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		while ( input.equals("y")) {
			
		}
	}
}
