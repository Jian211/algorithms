package board;

import java.util.ArrayList;

import day0923.NoteBook;
import util.ScannerUtil;

public class MainBorder {

	public static void main(String[] args) {
		// 기본셋팅 및 가상의 데이타
		ArrayList<NoteBook> borderLists = new ArrayList<NoteBook>();
		NoteBook ex01 =  new NoteBook("시간은","흐른다~~ 무얗호","클롹");
		NoteBook ex02 =  new NoteBook("손흥민 슛","ㄲㄹㄹㄹㄹㄹㄹㄹㄹ","스포티비");
		NoteBook ex03 =  new NoteBook("레모나무","에서 토마토가 자랍니다!","레마토");
		borderLists.add(ex01);
		borderLists.add(ex02);
		borderLists.add(ex03);
		
		//
		String message;
		String userId = null;
		
		System.out.println("#### 게시게시판~ 환영합니다. ####\n");
		
		while(true) {
			
			message = "1. 게시판 보기 2. 게시물 만들기  3. 가입  4. 종료";
			int userNum = chk(ScannerUtil.nextInt(message));
			
			// 현재의 게시판 출력
			if(userNum == 1) {
				borderLists.forEach( list -> list.sendAll());
			}
			// 게시물 만들기
			else if(userNum == 2) {
				if(usdr)
				// 유저 아이디 생성
				userId = existId(userId);
				
			}else if(userNum == 3) {
				
			}else if(userNum == 4) {
				
			}
			
			// 아이디가 있어야 글쓰기 가능.
			
			break;
		}
		
	}
	
	static int chk (int a) {
		while(0 > a || a > 4 ) {
			a = ScannerUtil.nextInt("1~4까지의 정확한 숫자를 적어주시기 바랍니다.");
		}
		return a;
	}
	
	static String existId(String id) {
		while(id == null) {
			String message = "아이디가 있어야 글을 작성 할 수 있습니다. 아이디를 생성해주세요.";
			id = ScannerUtil.nextLine(message);
		}
		return id;
	}
	
}
