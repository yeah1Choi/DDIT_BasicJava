package ddit.chap11.stringclass;

// �� ���ڿ� ���տ����̳� �ݺ��Ǵ� ���ڿ� ���꿡 ���
// StringBuffer : thread safe, ������ ������ ���ڿ� ���տ��꿡 ������
// StringBuilder : �Ϲ����� ���ڿ� ���տ��꿡 ȿ����
public class StringBuildEx {

	public static void main(String[] args) {
		// 1
		StringBuilder sb = new StringBuilder();
		
		// 2
		sb.append(" select mem_id, mem_name, mem_hp, mem_mileage \n");// �տ� ������ �ִ°� ������
		sb.append("    from member \n");
		sb.append("   where mem_regno1 like '0'% ");
		String sql = sb.toString(); // ���ڿ��� �ٲ�
		System.out.println(sql);
		/* R: select mem_id, mem_name, mem_hp, mem_mileage 
    			from member 
   				where mem_regno1 like '0'%
		 */

		// 3
		StringBuilder str = new StringBuilder("���ѹα�������");
		str.insert(4, "����");
		System.out.println(str.toString()); // R: ���ѹα����������
		
		// 4
		str.replace(4, 9, "�빮"); // ���������� ������ �κ��� -1, 8�ڸ����� -1�� �������� 9
		System.out.println(str.toString()); // R: ���ѹα��빮
	}

}
