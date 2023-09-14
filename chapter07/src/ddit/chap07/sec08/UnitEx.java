package ddit.chap07.sec08;

public class UnitEx {

	public static void main(String[] args) {
		Tank tank = new Tank();
		
		Unit u = new Tank(); // 업캐스팅
		SCV scv = new SCV();
		
		scv.repair(new Tank());
		scv.repair(tank);
		//scv.repair(u); // 오류, 부모라서 역 상속은 절대 안됨
	}

}
