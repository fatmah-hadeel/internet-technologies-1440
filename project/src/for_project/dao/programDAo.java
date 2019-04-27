package for_project.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import project.modle.program;
public class programDAo {
	        private static String URL ="db4free.net:3306/database_project";
			private static String user="fatimah_hadeal";
			private static String password ="12345678";
			private Connection connect = null;
			private ResultSet resultSet = null;
			private ArrayList resList = new ArrayList();
			public ArrayList getProgram1() throws Exception {
				try {
					connect = DriverManager.getConnection("jdbc:mysql://" + URL,user, password);
					Statement statement = connect.createStatement();
					resultSet = statement.executeQuery("select * from program");
					while(resultSet.next()) {
					String day1 = resultSet.getString("day1");
					String day2 = resultSet.getString("day2");
					String day3 = resultSet.getString("day3");
					String day4 = resultSet.getString("day4");
					String day5 = resultSet.getString("day5");
					String day6 = resultSet.getString("day6");
				    resList.add(new program(day1,day2,day3,day4,day5,day6));
										
				}
			 return resList;		
			
			} catch(Exception e) {
				throw e;
			} finally {
				close();
			}
				
			
}
private void close() {
try {
if (resultSet != null) {
resultSet.close();
}
if (connect != null) {
connect.close();
}
} catch (Exception e) {
e.printStackTrace();
}
	}
	  }
