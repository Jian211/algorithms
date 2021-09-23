package classEx;

public class Animal {
	private String type;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void makeSound(){
		System.out.println("������ �Ҹ��� ���ϴ�.");
	}
	
	public void move(){
		System.out.println("������ �����Դ�.");
	}
	
	public void showInfo() {
		System.out.println("�� ������ "+ type +" �Դϴ�.");
	}
	
	public Animal() {
		System.out.println("----------------------");
		System.out.println("Animal Ŭ���� ������ ȣ��");
		System.out.println("----------------------\n");
	}
}
