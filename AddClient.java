import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class AddClient
{
	public static void main(String [] ards)
	{
		String host="localhost";
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter first num");
		//String a=sc.nextLine();
		//System.out.println("Enter second num");
		//int b=sc.nextInt();
		try
		{
			AddRem remobj=(AddRem)Naming.lookup("rmi://"+host+"/AddRem");
			System.out.println(remobj.validateSt("12345"));
		}

		catch(Exception re)
		{
			System.out.println(re.getMessage());
		}
	}
}
