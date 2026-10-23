package jdbcTest1;

//1. import하기
import java.sql.*;

public class jdbcTest1 {

	public static void main(String[] args) {
		//2.드라이버를 메모리 로딩하기
		try {
			System.out.println("오라클 드라이버 로딩시작!");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			//3.db와 연결
			String url="jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin: 여기는고정
			String user="scott";
			String pwd="1234";
			Connection conn = DriverManager.getConnection(url, user, pwd); // 다리를 만듬
			System.out.println("데이터베이스 연동성공!!");
			///비즈니스 로직
			//////////////////////////////////////////////////////////////
//			Statement st=conn.createStatement();  // 트럭을 만듬  용달차 어떤짐도가능  
//			String sql="insert into student values('도우너',25,'안산','010-1212-2323')"; // sql하듯이 작성
//			int count = st.executeUpdate(sql); //
//			System.out.println(count+"행이 수행되었습니다.");
//			st.close();
// 			statment 방식
			
			String sql = "insert into student values(?,?,?,?)"; // 모든 사람이 앉아야만 출발가능 의자 4개 다채워야함
			PreparedStatement ps=conn.prepareStatement(sql);    
			ps.setString(1, "메가");
			ps.setInt(2, 22);
			ps.setString(3, "서울");
			ps.setString(4, "02-3456-2345");
			int count=ps.executeUpdate(); // 목표는 위와같이 sql에 전달
			System.out.println(count+"행이 수행되었습니다");
			ps.close();
			//////////////////////////////////////////////////////////////
			//4.자원 반납
			conn.close();
		}catch (ClassNotFoundException e) {
			System.out.println("드라이브 경로 오타남");
		}catch (SQLException e) {
			System.out.println("주소 계정 비번 틀렸음");
		}
	}

}
