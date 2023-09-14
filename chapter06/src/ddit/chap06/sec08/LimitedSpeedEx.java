package ddit.chap06.sec08;

import java.util.Scanner;

public class LimitedSpeedEx {

	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("1. ������");
		System.out.println("2. �ó�����");
		System.out.println("3. �ÿ�����");
		System.out.println("----------------------");

		System.out.print("��ȣ�� �Է� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			str = "SchoolZone";
			break;
		case 2:
			str = "DownTown";
			break;
		case 3:
			str = "CountrySide";
			break;
		default:
			System.out.println("�۾���ȣ ����");
			System.exit(0);
		}

		// ���������� ���Ǵ� �޼ҵ� : valueOf(), ordinal(), values() �޼ҵ尡 ���� ���� ���
		// valueOf(String arg) : arg�� enum ��ü���� �����´� ������ �����߻�
		// values() : enum ��ҵ��� ������� enum Ÿ���� �迭�� ��ȯ
		// ����Ÿ�Ժ�����.ordinal() : �ش纯���� ���� enum�� ����� ����(�迭index) ��ȯ
		LimitedSpeed lSpeed = LimitedSpeed.valueOf(str);

		switch (lSpeed) {
		case SchoolZone:
			System.out.println(lSpeed.SchoolZone + "������" + lSpeed.getValues() + "km/h �̸��� �ӵ��� �����ؾ� �մϴ�");
			break;
		// getValues() �޼ҵ�� ����� �ε��� ���� ������
		case DownTown:
			System.out.println(lSpeed.DownTown + "������" + lSpeed.getValues() + "km/h �̸��� �ӵ��� �����ؾ� �մϴ�");
			break;
		case CountrySide:
			System.out.println(lSpeed.CountrySide + "������" + lSpeed.getValues() + "km/h �̸��� �ӵ��� �����ؾ� �մϴ�");
			break;
		}

		// ������ ��� �ε����� ȣ��
		for (LimitedSpeed var : lSpeed.values()) {
			System.out.println(var + "=>" + var.ordinal());
		}
	}

}
