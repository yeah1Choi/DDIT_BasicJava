package ddit.chap07.sec03;

import java.util.List;
import java.util.ArrayList;

public class DBTestEx {

	public static void main(String[] args) {
		JDBCUtill jdbc = JDBCUtill.getInstance();

		String sql = "select mem_id,mem_name,mem_regno1,mem_regno2,mem_hp ";
		sql = sql + " mem_mileage from member";
		// where mem_id >= 'c001'
		// where mem_regno1 like '0%' => 0으로 시작되는 것과 같은 조건을 찾음

		// jdbc.selectList(sql);
		test();

	}

	public static void test() {
		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(100);
		System.out.println(list);

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			sum = sum + list.get(i);
		}
		System.out.println(sum);
	}
}
