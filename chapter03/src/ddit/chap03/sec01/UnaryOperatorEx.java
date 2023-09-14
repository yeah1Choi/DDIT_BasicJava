package ddit.chap03.sec01;

// 단항연산자 : ++(--), +(-): 부호, ! :not 

public class UnaryOperatorEx {

	public static void main(String[] args) {
		incrementOperator();
		signOperator();	
}
	public static void incrementOperator() {
		int res = 0;
		int incre = 10;
		int decre = 10;
		
		res = incre ++;
		System.out.println("res = " + res + ", incre = " + incre);
		
		res = 0;
		res = -- decre;
		System.out.println("res = " + res + ", decre = " + decre);

		int[] arr = {10, 20, 30, 40, 50};
		for(int i = 0 ; i < arr.length ; ++i) {
			System.out.println(arr[i++]);
		// 배열은 0부터 시작하는데 배열에 arr[++i]을 하면 배열의 범위를 넘으며 오류가 난다
		// i++은 오류가 없음
		}
	}
	public static void signOperator() {
		// 음수(-)와 양수(+ 또는 생략)
		int sum = 0; // 결과값
		int sign = -1; // 부호비트
		int cnt = 1; // 시작 값(1,2,3,..,10)
		
		while(cnt <= 10) {
			sign = sign * (-1);
			sum = sum + (sign * cnt);
			if (sign > 0 && cnt != 1) {
				System.out.print("+" + cnt);
			} else {
				System.out.print(sign * cnt);
			}
			cnt++;
		}
		System.out.println(" = " + sum);
	}
}
