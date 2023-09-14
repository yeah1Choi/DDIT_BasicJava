package ddit.chap07.sec03;

public class Book {
	String isbn; // å�� ���� ������ȣ : Ű ���� �ο��ϱ� ����
	String title; // ����
	int price; // ����

	Book() {
	} // �⺻������

	Book(String isbn, String title, int price) {
		this.isbn = isbn; 
		// ���� ���� �Ű������� ���� ���� ����ʵ忡 �����ϱ� ���� this �޼ҵ�� ȣ��
		this.title = title;
		this.price = price;
	}

	public void setSalePrice(double discountRate) { 
		// ���ΰ����� �����ϴ� �޼ҵ�
		price = price - (int) (price * discountRate);
		// ���ݿ��� �Ǽ����� ��� int�� Ÿ�Ժ�ȯ
	}

	public void printInfo() {
		// ��¸޼ҵ�
		System.out.println("���� : " + title);
		System.out.println("���� : " + price);
	}
}
