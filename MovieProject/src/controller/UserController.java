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
		mg.setName("�Ŵ���");
		mg.setNickname("�̵");
		mg.setPassword("1");
		list.add(mg);
		
		ReviewerDTO reviewer = new ReviewerDTO();
		reviewer.setId(2);
		reviewer.setName("�����");
		reviewer.setNickname("���̴ټ���");
		reviewer.setPassword("2");
		list.add(reviewer);
		
		for (int i = 1; i <= 3; i++) {
			UserDTO temp = new UserDTO();
			
			temp.setName("�����"+i);
			temp.setPassword("000"+i);
			temp.setNickname("���"+i);
			insert(temp);
		}
	}
	
	
	// auth()  �ߺ����̵� üũ, ���� ����Ʈ �߿� ���� �̸��� �ִ��� Ȯ��.
	public boolean auth(String userName) {
		System.out.println("[nameDoubleCheck] "+ userName +" �ߺ�üũ ��.. ");
		// ������ ���ٸ� > ��������(false)
		if(list.isEmpty()) {
			System.out.println("[nameDoubleCheck] �ߺ�üũ�Ϸ� ���̵�/�г��� ��������.");
			return false;
		}

		for(UserDTO user : list) {
			if(user.getName().equalsIgnoreCase(userName)) {
				System.out.println("[nameDoubleCheck] �ߺ�üũ�Ϸ� ���̵�/�г��� �����Ұ���.");
				return true;
			}
		}
		System.out.println("[nameDoubleCheck] �ߺ�üũ�Ϸ� ���̵�/�г��� ��������.");
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
	
	//insert()  ȸ�� ��� 
	public void insert(UserDTO user) {
		user.setId(nextId++);
		list.add(deepCopy(user));
		user.toString();
	}

	// auth() �α��� �� ����� ���̵�� ��й�ȣ�� �´��� üũ
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

	// ���� ���� ���� 
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
	
	// ���� ã��
	public int selectOne(String userId, String password) {
		for(UserDTO user : list) {
			if(user.getName().equals(userId) && user.getPassword().equals(password)){
				return user.getId();
			}	
		}
		return -1; 
	}
}
