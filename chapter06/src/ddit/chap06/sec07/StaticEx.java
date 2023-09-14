package ddit.chap06.sec07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StaticEx {

	public static void main(String[] args) {
		Product p1 = new Product("����");
		System.out.println(p1);

		Product p2 = new Product("����");
		System.out.println(p2);

		Product p3 = new Product("����");
		System.out.println(p3);
	}

}

// ��ǰ��ȣ (�ڵ�������: ��¥(8) + 3�ڸ� ������)
// ��ǰ��
class Product {
	String prodName;

	static LocalDate now = LocalDate.now();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	static long prodID = Long.parseLong(now.format(formatter) + "000");
	//format() �޼��� : 

	Product(String prodName) {
		prodID++;
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return "��ǰ��ȣ : " + prodID + "\n��ǰ�� : " + prodName + "\n";
	}
}