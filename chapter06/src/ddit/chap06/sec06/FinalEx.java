package ddit.chap06.sec06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FinalEx {

	public static void main(String[] args) {
		Final f1 = new Final("�б��ֺ�");
		System.out.println(f1.loc + "���� ���� �ӵ� : " + f1);

		Final f2 = new Final("�ó�");
		System.out.println(f1.loc + "���� ���� �ӵ� : " + f2);

		Final f3 = new Final("�ÿ�");
		System.out.println(f1.loc + "���� ���� �ӵ� : " + f3);

		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		// �����޼ҵ�� class�̸�.�޼ҵ� / ofPattern()�� �����޼ҵ� : �����������ڿ����
		String formatNow = now.format(formatter);
		System.out.println(now);
		System.out.println(formatNow);
	}

}

class Final {
	final int SCHOOL_ZONE_SPEED = 30;
	final int DOWN_TOWN_SPEED = 50;
	final int COUNTRY_SIDE_SPEED = 70;
	// ������� ���� �ٸ� �Ǽ��� ���ڸ� �����ϱ� ���� �빮�ڿ� _�� ���
	// ����� �ʱ�ȭ�߱⿡ ���� �����ʿ��� �� �� �ִ�
	String loc;

	Final(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		int speed = 0;
		if (loc.equals("�б��ֺ�")) {
			speed = SCHOOL_ZONE_SPEED;
		} else if (loc.equals("�ó�")) {
			speed = DOWN_TOWN_SPEED;
		} else if (loc.equals("�ÿ�")) {
			speed = COUNTRY_SIDE_SPEED;
		}
		return speed + "km/h"; // return �� ���ڿ� ��ȯ
	}

}