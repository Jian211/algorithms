package classEx;

public abstract class AnimalA {
	// �߻� �޼ҵ��� ���, �츮�� Ŭ������ �޼ҵ带 ������ �� abstract�� �ٿ��ְ� 
	// ���� �ڵ� ������ ���� �ʴ´�.
	
	public abstract void makeSound();
	public abstract void move();

	// �߻� �޼ҵ�� ���� ǥ�����ڸ�
	// �� Ŭ������ ��� �޴� Ŭ������ �ݵ�� 
	// �ش� �߻� �޼ҵ帣�� ������(�������̵�)�Ͽ� ������ �־���Ѵ�.
	public void printInfo() {
		System.out.println("�����Դϴ�.");
	}
	public void ok() {
		System.out.println("ok");
	}
}
// �߻�Ŭ����
// �������̽�
// ��� 