package ddit.chap04.sec01;

public class Sample {
	public static void main(String[] args) {
		// 난수 : Math 
		// lang 패키지에 들어가는 메소드인데 land 패키지 특징은 import시키지 않아도 됨
		
		System.out.println((int)(Math.random()*45)+1);
		
		int dice = (int)(Math.random()*6)+1;
		System.out.println(dice);
	}
}
