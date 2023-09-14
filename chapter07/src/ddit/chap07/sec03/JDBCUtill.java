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

	// �ڱ��ڽ��� Ŭ����Ÿ���� ���� instance ������ �ʱⰪ null�� �־���
	private JDBCUtill() {
	}

	// ������ �޼ҵ� : ��ü������ ���� ���� private
	public static JDBCUtill getInstance() {
		if (instance == null) // ��ü������
			instance = new JDBCUtill(); // ��ü�� �����Ѵ�
		return instance;
	} // ����κ� �ܿ��..

	// �̱��� ������ �ϱ� ���� ��
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // thin : ������ ������ ����
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
			// db���� select ������� view ������ ���̺��� ���´� �װ��� ���� rs���� ����
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();

			while (rs.next()) { // next() �޼ҵ�� ������ view���� �ະ�� �� ���徿 ����Ѵ�
				Map<String, Object> row = new HashMap<>();
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i + 1);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
				list.add(row);
//				String mid = rs.getString("MEM_ID"); // ����Ŭ�� ���� Ÿ���� ����(char�� ���ڿ��� ���̰�) ���ڿ�Ÿ�Թۿ� ���� �׷��� String Ÿ���� ���
//				String mname = rs.getString("MEM_NAME");
//				String jumin = rs.getString("MEM_REGNO1") + "-" + rs.getString("MEM_REGNO2");
//				String hp = rs.getString("MEM_HP");
//				int mileage = rs.getInt("MEM_MILEAGE");
//
//				System.out.printf("%6s %5s  %13s   %15  %6d\n", mid, mname, jumin, hp, mileage);
			}

		} catch (SQLException e) {
			e.printStackTrace(); // printStackTrace() �����߻��� ȣ�⽺�ø޸𸮸� ����ش�
		} finally { 
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) { // Exception(����) Ŭ���� = �ڹ��� ��� ������ ���� Ŭ����
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
