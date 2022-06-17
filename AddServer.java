import java.rmi.*;
import java.net.*;

public class AddServer 
{
	public static void main(String[] args)
	{
		try
		{
			AddRemImpl locoobj=new AddRemImpl();
			Naming.rebind("rmi:///AddRem",locoobj);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
