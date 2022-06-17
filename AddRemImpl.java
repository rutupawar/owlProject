import java.rmi.*;
import java.rmi.server.UnicastRemoteObject ;
import java.sql.*;


public class AddRemImpl extends UnicastRemoteObject implements AddRem
{
	public AddRemImpl() throws RemoteException{}
	//public int addNum(int a, int b)
	//{return (a+b);}
	public int validateSt(String toVald)
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//con=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			System.out.println("Connecting");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test?useTimezone=true&serverTimezone=UTC", "root", "");
			System.out.println("Connected gaurav");
			Statement stmt=con.createStatement();  
			Statement stmt1=con.createStatement();
			ResultSet rs=stmt.executeQuery("select exam_id from project"); 
			String pass="0"; 
			ResultSet rs1=stmt1.executeQuery("select Password from project");
			while(rs.next())  
			{
				rs1.next();
				
				pass=rs1.getString(1);
			      String b=rs.getString(1);
				if(toVald.equals(b))	
				{	
					//System.out.println(pass);
					return Integer.valueOf(pass);
					
				}
				//System.out.println(rs.getString(1));
				
			}
			 	con.close(); 
				return 1;
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 2;
		}
	}
}