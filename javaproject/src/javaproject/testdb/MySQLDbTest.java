package javaproject.testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Statement;

public class MySQLDbTest {

	public static void main(String[] args) throws SQLException {

		
		String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
		String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
		//		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		
//		String user = "scott";
		String user = "root";
//		String password = "TIGER";
		String password = "1234";
//		String sql = "INSERT INTO books (id, title, author, price, qty) values (?, ?, ?, ?, ?)";
//		String sql = "SELECT * FROM books";
//		String sql = "UPDATE books SET id=?, title=?, author=?, price=?, qty=? where id=?";
		String sql = "DELETE from books where id=?";
							
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			
			PreparedStatement st = con.prepareStatement(sql);
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(sql);
			
//			while(rs.next()) {
//				String title = rs.getString("TITLE");
//				String author = rs.getString("AUTHOR");
//				String price = rs.getString("PRICE");
//				System.out.println(title+": "+author+" : "+price);
//			}
			
			st.setInt(1, 3);
//			st.setString(2, "The lord of the rings");
//			st.setString(3, "reloy jenkins");
//			st.setFloat(4, 10000);
//			st.setInt(5, 5500);
//			
//			st.setInt(6, 3);
			
			int result=st.executeUpdate();
			System.out.print(result);
						
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		

	}

}
