package chapter17;

import java.sql.*;

public class JDBD_Test {

	public static void main(String[] args) {

		Connection connection;
		Statement stmt = null;
		
		try {			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movievoddb",
					"root", "1234");
			System.out.println("DB 연결 완료");		
			
	        String query = "SELECT * FROM movie";
//	        String query2 = "insert into movie (id, year, title, engtitle, director) values "
//	        		+ "('20226411', 2022, '범죄도시3', 'The Roundup No Way Out', '이상용')";
//	        String query3 = "UPDATE movie SET `title` = '범죄도시3(수정)' "
//	        		+ "WHERE `title` = '범죄도시3'";
	        String query4 = "delete from movie where title='범죄도시3(수정)'";
	        stmt = connection.createStatement();
	        
//	        stmt.executeUpdate(query2);
//	        stmt.executeUpdate(query3);
	        stmt.executeUpdate(query4);

	        ResultSet rs = stmt.executeQuery(query);
	        PrintResult(rs);
	        
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 에러");
			
		}
	}

	private static void PrintResult(ResultSet rs) throws SQLException {

        System.out.println("-------------------------------");
        
        while (rs.next()) {
        	String movieId = rs.getString("id");
            int movieYear = rs.getInt("year");
        	String movieTitle = rs.getString("title");
        	String movieTitle_English = rs.getString("engtitle");
        	String movieDirector = rs.getString("director");
        	
        	System.out.print("영화코드: " + movieId);
        	System.out.println(" 제작연도: " + movieYear);
        	System.out.println("제목: " + movieTitle + " - " + movieTitle_English);
        	System.out.print("감독명: " + movieDirector);
        	System.out.println();
        	System.out.println("-------------------------------");
        }
		
	}

}


//
//rs.close();
//stmt.close();
//connection.close();		
