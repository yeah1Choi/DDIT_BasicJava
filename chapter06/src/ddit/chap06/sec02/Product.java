package ddit.chap06.sec02;

public class Product { // ����ʵ�
	static int pid; // ��ǰ��ȣ
	static String pName = "��Ŀ��"; // ��ǰ��

	Product() { // �����ڸ޼ҵ� : ����ʵ�(����) �ʱ�ȭ
		pid++;
		pName = "��Ŀ��";
	}

	public static void showProduct() {
		System.out.println("��ǰ��ȣ : " + (pid++));
		System.out.println("��ǰ�� : " + pName);
	}
}
