package ddit.chap07.sec01;

// �θ�
public class Product {
	String prodName; // �������
	int price;

	Product(String prodName, int price) { // ������ �޼ҵ�
		this.prodName = prodName;
		// ���������� �ƴ� ���� ��������� ��Ī�ϱ� ���� this ��� / ������� prodName�� �������� prodName�� �־��ش�
		this.price = price;
	}

	
	@Override // toString �޼ҵ带 ������ �ϰڴ� : �ڽ�Ŭ�������� �޼ҵ带 �ٽ� ���� ���ڴٴ� ��
	public String toString() {
		// return getClass().getName()+'@'+Integer.toHexString(hashCode());
		// hashCode 16������ �ٲ�
// ������ 16������ �ּҰ��� ��ȯ�ϰ� �Ǿ������� toString() �޼ҵ�� ���� ���ڿ��� ����Ѵ�
		return "��ǰ�� : " + prodName + "\n���� : " + price;
	}
}
