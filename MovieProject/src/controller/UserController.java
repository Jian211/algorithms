package controller;

import java.util.ArrayList;

import model.user.ManagerDTO;
import model.user.ReviewerDTO;
import model.user.UserDTO;

public class UserController {
	private static ArrayList<UserDTO> list = new ArrayList<>();
	private int nextId;
	
	public void userControllerConnection() {
		nextId = 10;
		ManagerDTO mg = new ManagerDTO();
		
		mg.setId(1);
		mg.setName("매니저");
		mg.setNickname("이등별");
		mg.setPassword("1");
		list.add(mg);
		
		ReviewerDTO reviewer = new ReviewerDTO();
		reviewer.setId(2);
		reviewer.setName("리뷰어");
		reviewer.setNickname("별이다섯개");
		reviewer.setPassword("2");
		list.add(reviewer);
		
		for (int i = 1; i <= 3; i++) {
			UserDTO temp = new UserDTO();
			
			temp.setName("지명근"+i);
			temp.setPassword("000"+i);
			temp.setNickname("찌맹"+i);
			insert(temp);
		}
	}
	
	
	// auth()  중복아이디 체크, 유저 리스트 중에 같은 이름이 있는지 확인.
	public boolean auth(String userName) {
		System.out.println("[nameDoubleCheck] "+ userName +" 중복체크 중.. ");
		// 유저가 없다면 > 생성가능(false)
		if(list.isEmpty()) {
			System.out.println("[nameDoubleCheck] 중복체크완료 아이디/닉네임 생성가능.");
			return false;
		}

		for(UserDTO user : list) {
			if(user.getName().equalsIgnoreCase(userName)) {
				System.out.println("[nameDoubleCheck] 중복체크완료 아이디/닉네임 생성불가능.");
				return true;
			}
		}
		System.out.println("[nameDoubleCheck] 중복체크완료 아이디/닉네임 생성가능.");
		return false;
	}

	// deepCopy()
	private UserDTO deepCopy(UserDTO user) {
		UserDTO temp = new UserDTO();
		
		temp.setId(user.getId());
		temp.setName(new String(user.getName()));
		temp.setNickname(new String(user.getNickname()));
		temp.setPassword(new String(user.getPassword()));
		return temp;
	}
	
//	public ArrayList<UserDTO> selectAll() {
//		ArrayList<UserDTO> temp = new ArrayList<>();
//		for(UserDTO user : list) {
//			UserDTO tmp = new UserDTO();
//			
//			tmp.setNickname(user.getNickname());
//			tmp.setPassword(user.getPassword());
//			tmp.setName(user.getName());
//			tmp.setId(user.getId());
//			
//			temp.add(tmp);
//		}
//		return temp;
//	}
	public ArrayList<UserDTO> getList (){
		return list;
	}
	
	//insert()  회원 등록 
	public void insert(UserDTO user) {
		user.setId(nextId++);
		list.add(deepCopy(user));
		user.toString();
	}

	// auth() 로그인 시 저장된 아이디와 비밀번호가 맞는지 체크
	public boolean auth(String userName, String password) {
		boolean loging = false;

		for(UserDTO user : list) {
			if(user.getName().equals(userName) && user.getPassword().equals(password)){
				loging = true;
				return loging;
			}	
		}
		
		return false;
	}

	// 유저 정보 복사 
	public UserDTO getUserInfo(String userName, String password) {
		int userId = selectOne(userName, password);
		for(UserDTO user : list) {
			if(user.getId() == userId) {
				int index = list.indexOf(user);
				return list.get(index);
			}
		}
		return null;
	}
	
	// 유저 찾기
	public int selectOne(String userId, String password) {
		for(UserDTO user : list) {
			if(user.getName().equals(userId) && user.getPassword().equals(password)){
				return user.getId();
			}	
		}
		return -1; 
	}
}
