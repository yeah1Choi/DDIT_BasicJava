package ddit.chap07.sec06;

public interface Phone {
	int PHONE_NUM_1=1; // 상수는 대문자 띄어쓰기는 언더바 표기
	public static final int PHONE_NUM_2 = 2; // 원래는 이렇게 생김 => 'public static final' 생략
	int PHONE_NUM_3=3;
	int PHONE_NUM_4=4;
	int PHONE_NUM_5=5;
	int PHONE_NUM_6=6;
	int PHONE_NUM_7=7;
	int PHONE_NUM_8=8;
	int PHONE_NUM_9=9;
	int PHONE_NUM_0=0;
	
	public void call(); 
	void turnOn();
	abstract void turnOff(); // 여기 세 식의 접근 지정자 뒤의 abstract 생략
}
