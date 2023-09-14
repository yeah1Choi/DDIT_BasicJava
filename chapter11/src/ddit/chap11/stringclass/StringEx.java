package ddit.chap11.stringclass;

public class StringEx {

	public static void main(String[] args) {
		// String Ŭ���� : �Һ�(immutable)�� ���ڿ� �ڷ� ���
		// 1. �κй��ڿ� ���� - substring(int startindex, int endindex)
		String str = "����ȭ ���� �Ǿ����ϴ�.";
		System.out.println(str.substring(0, str.length() - 1)); // R: ����ȭ ���� �Ǿ����ϴ�
		System.out.println(str.substring(0, 5)); // R: ����ȭ ��
		System.out.println(str.substring(0, 6)); // R: ����ȭ ����

		// �⺻Ÿ�� => ���ڿ�
		// 1) String.valueOf(�⺻ Ÿ�� ������);
		// 2) �⺻ Ÿ�� ������ + ""
		int num = 1001;
		String numStr = String.valueOf(num);
		System.out.println(numStr + 99);
		// ���� �������ٸ� ������ �Ǿ������� numStr�� ���ڿ��� ��ȯ�߱⿡ R: 100199
		System.out.println(num + "" + 99); // ����Ÿ���� ������ 99���� ���ڿ��� ��ȯ

		// ���ڿ� => �⺻Ÿ��
		// Wrapper.parse �⺻Ÿ��(���ڿ�)
		String flag1 = "true";
		boolean flag = Boolean.parseBoolean(flag1);
		System.out.println(!flag);
	}

}
