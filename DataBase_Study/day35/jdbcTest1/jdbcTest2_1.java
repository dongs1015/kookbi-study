package jdbcTest1; //교수님 버전

import java.util.*;
import java.sql.*;

import java.io.IOException;

public class jdbcTest2_1 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //2.드라이버를 메모리 로딩
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //3.db와 연결
		String user= "scott";
		String pwd="1234";
		Connection conn = DriverManager.getConnection(url, user, pwd); // 다리 만듬
		///////////////////////////////////////
		Scanner sc =new Scanner (System.in);
		System.out.println("Sql문장을 입력 [insert/update/delete문만]");
		System.out.print("sql>");
		
		String sql=sc.nextLine();
		
		Statement st=conn.createStatement();
		int count= st.executeUpdate(sql);
		System.out.println(count+"행이 수행되었습니다."); // 바로 디스크에 작성되는게 아닌
		// 논리계층에 저장이 되있는 상태가됨 transtion 작업구간 데이터 보관상태
		// db에서 commit을 사용하여 물리계층인 disk에 저장한다

	}

}
