package ddit.chap10.sec01;

// ����� ���� Ŭ���� ����
// �������
// ���������� class ����Ŭ������ extends Exception|RuntimeException {
//		����Ŭ������(String message){ // ���ܿ����� ���
//			super(message);
// 		}
// }
// ** ����Ŭ���� ȣ��
// throw ����Ŭ���� ��ü��      (ex) throw new Exception();
public class ExceptionEx04 {
	public static void main(String[] args) throws RuntimeException {
		try {
			exceptionSample("genious");
			exceptionSample("fool");
		} catch(MyException e) {
			e.printStackTrace();
		}
		System.out.println("���α׷�����"); // �� ���� �����ϱ� ���� ����ó��
	}

	public static void exceptionSample(String nickName) throws MyException{
		if ("fool".equals(nickName)) {
			throw new MyException("��������� ����");
		}
		System.out.println("������ " + nickName + "�Դϴ�...");
	}
}

// ����ڰ� ������ Ŭ����
class MyException extends RuntimeException {
	MyException(String msg) {
		super(msg);
	}
}
