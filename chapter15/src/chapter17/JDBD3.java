package chapter17;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class JDBD3 {

	public static void main(String[] args) {
		
	Connection connection;
	Statement stmt = null;
		
	try {
		
		// MySQL 드라이버 로드
		// 아래 주소로 안될 경우 "com.mysql.jdbc.Driver"로도 시도해볼 것 
		Class.forName("com.mysql.cj.jdbc.Driver");
		// JDBC 연결
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "1234");
		System.out.println("DB 연결 완료");		
		
		 // SQL 쿼리 작성
        String query = "SELECT * FROM student";
        // 쿼리 실행을 위한 Statement 객체 생성
        stmt = connection.createStatement();

        // 쿼리 실행 및 결과 받아오기
        ResultSet rs = stmt.executeQuery(query);
        printData(rs, "name", "id", "dept");

        // 리소스 정리
        rs.close();
        stmt.close();
        connection.close();
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.println("DB 연결 에러");
		
	}
		

	}

	private static void printData(ResultSet rs, String col1, String col2, String col3) throws SQLException {
		
        // 결과 처리
        while (rs.next()) {
//            int userId = rs.getInt("id");
//            String username = rs.getString("name");
//            String dept = rs.getString("dept");
//
//            System.out.println("사용자 ID: " + userId);
//            System.out.println("사용자 이름: " + username);
//            System.out.println("dept: " + dept);
//            System.out.println("-------------------------");
        	System.out.println();
        	if (col1 != "") System.out.print(new String(rs.getString("name")));
        	if (col2 != "") System.out.print("\t|\t" + rs.getString("id"));
        	if (col3 != "") System.out.print("\t|\t" + new String(rs.getString("dept")));
        	else System.out.println();
        }
		
	}
}

// JDBC(Java Database Connectivity)는 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API
// DriverManager는 자바 응용프로그램을 JDBD 드라이버에 연결시켜주는 클래스이다.
// DriverManager.getConnection() 메소드를 호출하여 데이터베이스를 연결하고 Connection 객체를 반환한다.

