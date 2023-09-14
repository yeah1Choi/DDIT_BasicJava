package ddit.chap07.sec03;

public class Novel extends Book {
	String genre; // novel�� ���� �Ӽ�

	// �ڽ�Ŭ������ �⺻�����ڰ� �������� �θ𿡼� ���� ������ �⺻ �����ڰ� �־���Ѵ�
	Novel() {
	}

	Novel(String isbn, String title, int price, String genre) {
		super(isbn, title, price); // �θ�����ڸ޼ҵ� ȣ�⹮
		this.genre = genre;
	}

	// �θ�Ŭ�������� ������ �޼ҵ� ��
	// '����' �޼ҵ带 ������ �������Ѵ�
	@Override
	public void printInfo() {
		System.out.println("�帣 : " + genre);
		System.out.println("���� : " + title);
		System.out.println("���� : " + price + "��");
	}

	public void refund() {
		System.out.println("�Ҽ�å�� ��ǰ�մϴ�");
	}

}
