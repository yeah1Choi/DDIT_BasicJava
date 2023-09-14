package ddit.chap07.sec09;

public interface View {
	// 변수의 모양새지만 앞에 public static final이 생략, 무조건 상수만 온다는 말
	// 인터페이스는 정적상수와 추상메소드 두가지만 존재할 수 있음! 변수 절대 없음
	
	int HOME = 1;
	int HOME_MAIN = 11;

	int MEMBER = 2;
	int MEMBER_SIGNUP = 21;
	int MEMBER_LOGIN = 22;
	int MEMBER_UPDATE = 23;
	int MEMBER_LOGOUT = 24;

	int ADMIN = 3;
	int ADMIN_LOGIN = 31;
	int ADMIN_LOGOUT = 32;
}
