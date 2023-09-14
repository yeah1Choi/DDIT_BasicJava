package ddit.chap11.stringclass;

// 긴 문자열 결합연산이나 반복되는 문자열 연산에 사용
// StringBuffer : thread safe, 스레드 내에서 문자열 결합연산에 안정적
// StringBuilder : 일반적인 문자열 결합연산에 효율적
public class StringBuildEx {

	public static void main(String[] args) {
		// 1
		StringBuilder sb = new StringBuilder();
		
		// 2
		sb.append(" select mem_id, mem_name, mem_hp, mem_mileage \n");// 앞에 공간을 주는게 안정적
		sb.append("    from member \n");
		sb.append("   where mem_regno1 like '0'% ");
		String sql = sb.toString(); // 문자열로 바꿈
		System.out.println(sql);
		/* R: select mem_id, mem_name, mem_hp, mem_mileage 
    			from member 
   				where mem_regno1 like '0'%
		 */

		// 3
		StringBuilder str = new StringBuilder("대한민국대전시");
		str.insert(4, "오룡");
		System.out.println(str.toString()); // R: 대한민국오룡대전시
		
		// 4
		str.replace(4, 9, "용문"); // 마찬가지로 끝나는 부분은 -1, 8자리지만 -1의 영향으로 9
		System.out.println(str.toString()); // R: 대한민국용문
	}

}
