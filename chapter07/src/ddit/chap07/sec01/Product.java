package ddit.chap07.sec01;

// 부모
public class Product {
	String prodName; // 멤버변수
	int price;

	Product(String prodName, int price) { // 생성자 메소드
		this.prodName = prodName;
		// 지역변수가 아닌 위의 멤버변수를 지칭하기 위해 this 사용 / 멤버변수 prodName에 지역변수 prodName를 넣어준다
		this.price = price;
	}

	
	@Override // toString 메소드를 재정의 하겠다 : 자식클래스에서 메소드를 다시 고쳐 쓰겠다는 말
	public String toString() {
		// return getClass().getName()+'@'+Integer.toHexString(hashCode());
		// hashCode 16진수로 바꾼
// 원래는 16진수로 주소값을 반환하게 되어있지만 toString() 메소드로 값을 문자열로 출력한다
		return "제품명 : " + prodName + "\n가격 : " + price;
	}
}
