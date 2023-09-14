package ddit.chap07.sec03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtill {
	private static JDBCUtill instance = null;

	// 자기자신의 클래스타입을 갖는 instance 변수에 초기값 null을 넣었다
	private JDBCUtill() {
	}

	// 생성자 메소드 : 객체생성을 막기 위해 private
	public static JDBCUtill getInstance() {
		if (instance == null) // 객체생성전
			instance = new JDBCUtill(); // 객체를 생성한다
		return instance;
	} // 여기부분 외우기..

	// 싱글톤 패턴을 하기 위한 식
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // thin : 파일을 가져와 연동
	private String user = "PC_24_04";
	private String password = "java";

	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public List<Map<String, Object>> selectList(String sql, List<Object> param) {
		List<Map<String, Object>> list = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				pstmt.setObject(i + 1, param.get(i));
			}
			rs = pstmt.executeQuery();
			// db에서 select 결과값은 view 가상의 테이블이 나온다 그것을 변수 rs에서 저장
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();

			while (rs.next()) { // next() 메소드는 가져온 view에서 행별로 한 문장씩 출력한다
				Map<String, Object> row = new HashMap<>();
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i + 1);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
				list.add(row);
//				String mid = rs.getString("MEM_ID"); // 오라클은 문자 타입이 없고(char는 문자열의 길이값) 문자열타입밖에 없다 그래서 String 타입을 썼다
//				String mname = rs.getString("MEM_NAME");
//				String jumin = rs.getString("MEM_REGNO1") + "-" + rs.getString("MEM_REGNO2");
//				String hp = rs.getString("MEM_HP");
//				int mileage = rs.getInt("MEM_MILEAGE");
//
//				System.out.printf("%6s %5s  %13s   %15  %6d\n", mid, mname, jumin, hp, mileage);
			}

		} catch (SQLException e) {
			e.printStackTrace(); // printStackTrace() 오류발생시 호출스택메모리를 찍어준다
		} finally { 
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) { // Exception(예외) 클래스 = 자바의 모든 예외의 조상 클래스
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}

		return list;

	}
}
