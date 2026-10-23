package jdbcTest1;

import java.io.*;
//1. import
import java.sql.*; 


public class jdbcTest2 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(
		        new InputStreamReader(System.in));
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //2.드라이버를 메모리 로딩
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //3.db와 연결
			String user= "scott";
			String pwd="1234";
			Connection conn = DriverManager.getConnection(url, user, pwd); // 다리 만듬
			
			
			//비지니스 로직
			Statement st=conn.createStatement(); // 트럭을만듬
			System.out.println("Sql문장을 입력 [insert/update/delete문만]");
			String str = br.readLine();
			System.out.println(str);
			int count= st.executeUpdate(str);
			
			System.out.println(count+"행이 수행되었습니다.");
			
			st.close();
			
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브경로 오타");
		}catch (SQLException e) {
			System.out.println("주소 계정 비번 틀림, 로직 오타");
		}
		
	}

}
