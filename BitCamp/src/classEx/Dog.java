package classEx;

//�߻�Ŭ���� AnimalA�� ��ӹ޴� Dog Ŭ����
public class Dog extends AnimalA{
	// �߻�Ŭ������ ��ӹ޴� Ŭ������ 
	// �ݵ�� �߻�Ŭ���� ���� �߻� �޼ҵ���� �������̵� ���־���Ѵ�.
	
	@Override
	public void makeSound() {
		System.out.println("�۸�");
	}

	@Override
	public void move() {
		System.out.println("�̰����� ���� ���Ż糳��!");
	}

}
