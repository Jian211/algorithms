package day0923;

public class NoteBook {
	private String title;
	private String body;
	private String writer;
	private int no = 0;
	static int cnt = 0;
	
	NoteBook(){
		title = "제목을 입력해주세요.";
		body  = "내용을 입력해주세요.";
		writer= "-미정-";
		no = ++cnt;
	}
	
	NoteBook(String title, String body, String writer){
		this.title = title;
		this.body = body;
		this.writer = writer;
		no = ++cnt;
	}
	
	public void sendAll(){
		System.out.printf("[NO%s] writer : %s\n ",no,writer);
		System.out.printf("     title  : %s\n ",title);
		System.out.printf("     body   : %s\n ",body);
		System.out.println();
	}
	public boolean eaquals(Object o) {
		if(o instanceof NoteBook) {
			NoteBook b = (NoteBook)o;
			if(no == b.no) {
				return true;
			}
		}
		return false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		NoteBook.cnt = cnt;
	}

	
}
