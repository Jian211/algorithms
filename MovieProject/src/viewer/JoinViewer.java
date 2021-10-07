package viewer;

import java.util.Scanner;

import controller.UserController;
import model.user.UserDTO;
import util.ScannerUtil;

public class JoinViewer {
	private UserController userController;
	private Scanner scanner;
	
	public void joinViewerConnection() {
		scanner = new Scanner(System.in);
		userController = new UserController();
		userController.userControllerConnection();
	}
	
	
	public void join() {
		UserDTO temp = new UserDTO();
		String message;
		
		message = new String("아이디를 입력해주세요.");
		String userName = ScannerUtil.nextLine(scanner, message);

		// 아이디 중복 검사 
		boolean nameCheck = userController.auth(userName);
		while(nameCheck) {
			message = new String("아이디가 중복되었습니다. 다른 아이디를 입력해주세요.");
			userName = ScannerUtil.nextLine(scanner, message);
			nameCheck = userController.auth(userName);
		}
		
		message = new String("비밀번호 입력해주세요.");
		String userPassword = ScannerUtil.nextLine(scanner, message);

		message = new String("닉네임을 입력해주세요.");
		String userNickname = ScannerUtil.nextLine(scanner, message);
		
		// 닉네임 중복 검사
		boolean nicknameCheck = userController.auth(userNickname);
		while(nicknameCheck) {
			message = new String("사용중인 닉네임입니다. 다른 닉네임을 입력해주세요.");
			userNickname = ScannerUtil.nextLine(scanner, message);
			nameCheck = userController.auth(userNickname);
		}
		
		temp.setName(userName);
		temp.setPassword(userPassword);
		temp.setNickname(userNickname);
		
		userController.insert(temp);
	}	
}
