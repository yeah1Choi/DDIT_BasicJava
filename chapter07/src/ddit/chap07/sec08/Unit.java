package ddit.chap07.sec08;

interface Repairable {
}

public class Unit {
	int hitPoint; // 남은 파워량
	final int MAX_HP;
	// 상수는 딱 한번, 초기값을 받을 때까지만 변수의 역할을 함(변수는 유일히 =의 왼쪽에 사용될 수 있음)

	Unit(int hp) {
		MAX_HP = hp; // 그래서 여기에서 아직까지 변수로써 초기화를 받음
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
// 객체 Unit에게 상속받는 GroundUnit,AirUnit 클래스

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150); //
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "탱크";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);
		hitPoint = MAX_HP;
		// 리터럴 상수 : 데이터, 변수에 넣는 변치 않는 데이터
	}

	@Override
	public String toString() {
		return "수송선";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(50);
		hitPoint = MAX_HP;
	}

	public void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u + "의 수리 완료");
		}
	}

	@Override
	public String toString() {
		return "수리공장";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(30);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "해병";
	}
}