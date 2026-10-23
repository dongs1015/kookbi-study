package jdbcTest1;

import java.sql.*;

public class jdbcTest3 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="1234";
		Connection conn=DriverManager.getConnection(url, user, pwd); // 다리만듬
		//////////////////////////// 비지니스로직
		
//		Statement st=conn.createStatement(); // 트럭
//		String sql="select * from student";
//		ResultSet rs=st.executeQuery(sql);  // 자봐와 sql이 응답을하는 
		
		String sql = "select * from student";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery(); // 기존이랑 별로 다를게 없음 불러올땐 속도가 달라지진않음
		// 반환받는 속도는 다를게없고 세팅하는속도는 미리 준비되있는 프리페어드스테잍트먼트가 더빠름
		
		while(rs.next()) {
			String name=rs.getString("name");
			int age = rs.getInt("age");
			String addr = rs.getString("address"); // 순서상 3
			String tel = rs.getString("tel"); // 순서를 써도가능 4
			
			System.out.println(name +"\t"+age+"\t"+addr+"\t"+tel);
		}
		// resultset도 자원이기에 역순으로 반납해야하니 
		rs.close();
		ps.close();
		//st.close(); statement할때 사용
		conn.close();
	}

}
