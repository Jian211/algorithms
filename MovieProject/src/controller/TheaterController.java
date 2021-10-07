package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.MovieDTO;
import model.TheaterDTO;
import util.ScannerUtil;

public class TheaterController {
    private static ArrayList<TheaterDTO> theaterList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private MovieController movieController;
	private int nextId;
    
	public void theaterControllerConnection() {
		movieController = new MovieController();
		nextId = 1;
		
		for (int i = 1; i <= 7; i++) {
			TheaterDTO temp = new TheaterDTO();
			
			temp.setLocation("��õ"+i);
			temp.setName("��ȭ���̸�"+i);
			temp.setPhoneNumber("032-3333-333"+i);
			temp.setTheaterId(nextId++);
			
			// random���� ��ȭ�� �̾Ƽ� ����.(��ȭ������ �󿵵� ��ȭ��) �ߺ� o
			int [] randomId = new int[6];
			for(int j = 0 ; j < 6 ; j++ ) {
				Random random = new Random();
				randomId[j] = random.nextInt(5)+1;
			}
			temp.setTheaterMovies(randomId);
			
			theaterList.add(temp);
		}
	}
    
    public TheaterDTO selectOne(int theaterId) {
    	for(TheaterDTO temp : theaterList) {
    		if(temp.getTheaterId() == theaterId) {
    			return temp;
    		}
    	}
    	return null;
    }
    
    public void printOne(TheaterDTO temp) {
    	System.out.printf("[%s] %s�� ��ġ�� %s \n",temp.getTheaterId(),temp.getLocation(),temp.getName());
    	System.out.println(" 	��ȣ : " + temp.getPhoneNumber());
    }
    	
	public void printAll() {
		System.out.println("============= ��ȭ�� ��� =============");
		for(TheaterDTO temp : theaterList) {
			printOne(temp);
		}
		System.out.println("====================================");
	}

	public void printTheaterInfo(int theaterId) {
		TheaterDTO temp = selectOne(theaterId);
		if(temp.getTheaterMovies() == null) {
			System.out.println("�ش� ���忡�� ������ �󿵿�ȭ�� �������� �ʽ��ϴ�.");
		}else {
			ArrayList<MovieDTO> list = new ArrayList<>();
			int [] movies = temp.getTheaterMovies();
			for (int i = 0; i < movies.length; i++) {
				int movieId = movies[i];
				if(movieId == -1) {
					// �ش�ð��� �������
					MovieDTO temp2 = new MovieDTO();
					list.add(temp2);
				}else {
					MovieDTO temp2 = movieController.selectOne(movieId);
					list.add(temp2);
				}
			}
			System.out.println("==========================================");
			printOne(temp);
			System.out.println("	09~11�� "+ list.get(0).getTitle());
			System.out.println("	11~13�� "+ list.get(1).getTitle());
			System.out.println("	13~15�� "+ list.get(2).getTitle());
			System.out.println("	15~17�� "+ list.get(3).getTitle());
			System.out.println("	17~19�� "+ list.get(4).getTitle());
			System.out.println("	19~21�� "+ list.get(5).getTitle());
			System.out.println("==========================================\n");
		}
			
	}
	public void editTheater(int theaterId) {
		TheaterDTO temp = selectOne(theaterId);
		int index = theaterList.indexOf(temp);
		
		String message = "������ �����̼��� ������ �Է����ּ���";
		String location = ScannerUtil.nextLine(scanner, message);
		
		message = "������ ��ȭ���� �̸������� �Է����ּ���";
		String name = ScannerUtil.nextLine(scanner, message);

		message = "������ phone Number ������ �Է����ּ���";
		String phone = ScannerUtil.nextLine(scanner, message);
		
		temp.setLocation(location);
		temp.setName(name);
		temp.setPhoneNumber(phone);
		
		theaterList.set(index, temp);
		System.out.println("���� �Ϸ�Ǿ����ϴ�.");
	}

	public void removeTheater(int theaterId) {
		TheaterDTO temp = selectOne(theaterId);
		int index = theaterList.indexOf(temp);
		
		String message = "������ �����Ͻðڽ��ϱ�? y/n";
		String yesNo = ScannerUtil.nextLine(scanner, message);
		if(yesNo.equalsIgnoreCase("y")) {
			theaterList.remove(index);
			System.out.println("�����Ǿ����ϴ�.");
		}else {
			System.out.println("������ ��ҵǾ����ϴ�.");
		}
	}
	
	// ���� ������ ���λ���
	public void removeAllTheaterMovies(int theaterId) {
		TheaterDTO temp = selectOne(theaterId);
		int index = theaterList.indexOf(temp);
		temp.setTheaterMovies(null);
		theaterList.set(index, temp);
	}
	// ���� ������ �κл���
	public void removeTheaterMovie(int theaterId) {
		TheaterDTO temp = selectOne(theaterId);
		int max = temp.getTheaterMovies().length;
		int index = theaterList.indexOf(temp);
		ArrayList<Integer> deleteList = new ArrayList<>();
		
		while(true) {
			String message = "�����ϰ��� �ϴ� ��ȣ�� �ϳ��� �Է����ּ���. �����ø� 0�� �Է����ּ���.";
			int userChoice = ScannerUtil.nextInt(scanner, message,0,max);
			if(userChoice != 0) {
				deleteList.add(userChoice-1);
			}else if(userChoice == 0){
				break;
			}
		}
		
		int [] arr = temp.getTheaterMovies();
		
		for (int i = 0; i < deleteList.size(); i++) {
			int remove = deleteList.get(i);
			arr[remove] = -1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		temp.setTheaterMovies(arr);
		theaterList.set(index, temp);
	}

	public void addTheaterMovie(int theaterId, int movieId, int time) {
		TheaterDTO temp = selectOne(theaterId);
		int index = theaterList.indexOf(temp);
		temp.getTheaterMovies()[time] = movieId;
		theaterList.set(index, temp);
	}
}
