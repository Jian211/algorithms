package board;

import java.util.ArrayList;

import day0923.NoteBook;
import util.ScannerUtil;

public class MainBorder {

	public static void main(String[] args) {
		// �⺻���� �� ������ ����Ÿ
		ArrayList<NoteBook> borderLists = new ArrayList<NoteBook>();
		NoteBook ex01 =  new NoteBook("�ð���","�帥��~~ ����ȣ","Ŭ��");
		NoteBook ex02 =  new NoteBook("����� ��","������������������","����Ƽ��");
		NoteBook ex03 =  new NoteBook("���𳪹�","���� �丶�䰡 �ڶ��ϴ�!","������");
		borderLists.add(ex01);
		borderLists.add(ex02);
		borderLists.add(ex03);
		
		//
		String message;
		String userId = null;
		
		System.out.println("#### �ԽðԽ���~ ȯ���մϴ�. ####\n");
		
		while(true) {
			
			message = "1. �Խ��� ���� 2. �Խù� �����  3. ����  4. ����";
			int userNum = chk(ScannerUtil.nextInt(message));
			
			// ������ �Խ��� ���
			if(userNum == 1) {
				borderLists.forEach( list -> list.sendAll());
			}
			// �Խù� �����
			else if(userNum == 2) {
				if(usdr)
				// ���� ���̵� ����
				userId = existId(userId);
				
			}else if(userNum == 3) {
				
			}else if(userNum == 4) {
				
			}
			
			// ���̵� �־�� �۾��� ����.
			
			break;
		}
		
	}
	
	static int chk (int a) {
		while(0 > a || a > 4 ) {
			a = ScannerUtil.nextInt("1~4������ ��Ȯ�� ���ڸ� �����ֽñ� �ٶ��ϴ�.");
		}
		return a;
	}
	
	static String existId(String id) {
		while(id == null) {
			String message = "���̵� �־�� ���� �ۼ� �� �� �ֽ��ϴ�. ���̵� �������ּ���.";
			id = ScannerUtil.nextLine(message);
		}
		return id;
	}
	
}
