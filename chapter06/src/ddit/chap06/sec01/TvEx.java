package ddit.chap06.sec01;

public class TvEx {

	public static void main(String[] args) {
		Tv t1 = new Tv("필립스", 2020, 55.0);
		System.out.println("제조사 : "+t1.company);
		System.out.println("생산년도 : " + t1.year);
		System.out.println("크기 : " + t1.size + "인치");
	}

}
