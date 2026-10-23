package jdbcTest1; // st 사용 프로그램

import java.sql.*;
import java.util.*;

public class jdbcTest4 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String ur1="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="1234";
		Connection conn = DriverManager.getConnection(ur1, user, pwd);
		// 비지니스 로직
//		String sql = "insert into book values(?,?,?)";
//		PreparedStatement ps = conn.prepareStatement(sql);
//		ps 방식
		Statement st = conn.createStatement();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("==책정보입력==");
		System.out.print("책제목:");
		String title =sc.nextLine();
		System.out.print("저자:");
		String auth = sc.nextLine();
		System.out.print("가격");
		int price = Integer.parseInt(sc.nextLine());
		
		String sql = "insert into book values('"+title+"','"+auth+"',"+price+")";
		int count = st.executeUpdate(sql);
		
//		ps.setString(1, title);
//		ps.setString(2, auth);
//		ps.setInt(3, price);
		
	//	int count = ps.executeUpdate();
		
	//	ps.close();
		st.close();
		conn.close();
		
	}

}
