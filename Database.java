import java.sql.*;

class Database
{
	public static void main(String[] args) throws Exception
	{
		Connection con=null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/test?useTimezone=true&serverTimezone=UTC", "root", "");
			System.out.println("Connected gaurav");
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("create database vishnu");
			while(rs.next())
			{
				rs.next();
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}