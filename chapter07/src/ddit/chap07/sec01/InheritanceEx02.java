package ddit.chap07.sec01;

public class InheritanceEx02 {

	public static void main(String[] args) {
		Tv t1 = new Tv("�Ｚ��Ʈ��Ƽ��", 1000000, 0.15);
		System.out.println(t1);
		System.out.println("������ : " + (t1.discountRate * 100) + "%");

		Computer c1 = new Computer("MS�繫������", 2000000, 0.05);
		System.out.println(c1);
		System.out.println("������ : " + (c1.discountRate * 100) + "%");

		Audio a1 = new Audio("������", 800000, 0.03);
		System.out.println(a1);
		System.out.println("������ : " + (a1.discountRate * 100) + "%");

	}

}
