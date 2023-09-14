package ddit.chap07.sec03;

public class BookEx {

	public static void main(String[] args) {
		Book b1 = new Book("4848-71", "�����̰� ��ƿø� ��", 15000);
		// �θ� Ŭ���� ��ü�� ������ ������� ��� ����� �ȵ� b1�� �������
		Novel n1 = new Novel("1111-22", "�Ƴ����� �ִ� ����", 5000, "��ȭ");
		n1.printInfo();
		n1.setSalePrice(0.2);
		n1.printInfo();

		Textbook t1 = new Textbook("3535-12", "ȥ�ڰ����ϴ��ڹ�", 18000, "Java");
		t1.printInfo();
		t1.setSalePrice(0.1);
		t1.printInfo();
		
		Book b2 = new Novel("1111-22", "�Ƴ����� �ִ� ����", 5000, "��ȭ");
		Book b3 = new Textbook("3535-12", "ȥ�ڰ����ϴ��ڹ�", 18000, "Java");
		// �ڽ� Ŭ�������� ������ ������ �θ𿡼� ����� �� ���� - genre,major...
		
		b2.printInfo(); // ����� �θ��� title, price �� �ƴ϶� �ڽ��� genre���� �����
		// �ڽ�Ŭ�������� �������� �޼ҵ�� �θ�Ŭ�������� ȣ���ص� �����ǵ� �ڽ� Ŭ������ �޼ҵ带 ȣ��
		//b3.major = "Computer-Language"; // ���� - �ڽ�Ŭ�������� �Ѱ���, �θ� ��ü�� ���� ������ ���� ����
		
		// Textbook Ŭ������ supplyBook() ȣ���� �䱸�ɶ� - downcasting �ؾ���
		// => ������ �ν��Ͻ� ��ü - instanceof ������ ���
		if(b3 instanceof Textbook) {
			Textbook tb1 = (Textbook)b2;
			tb1.supplyBook("�ѱ����б�");
		}
	}

}
