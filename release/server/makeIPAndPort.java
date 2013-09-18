import java.io.File;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class makeIPAndPort {

	private static List<InetAddress> IPList;
	private static List<Integer> PortList;
	private static int totalProxies;
	private static int myIndex;

	


	public static void openFile() 
	{
		Scanner input;
		
		PortList = new ArrayList<Integer>();
		IPList = new ArrayList<InetAddress>();
		
		totalProxies = 0;
		

		try
		{
			input = new Scanner(new File("/tmp/proxies.txt"));

			//System.out.println("foi");

			while(input.hasNext())
			{
				//get IP address
				IPList.add(InetAddress.getByName(input.next().toString()));
				// get the  " : "
				input.next();
				//get the ports number
				PortList.add(input.nextInt());
				totalProxies++;


			}


		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error opening file");
			System.exit(1);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 

	}
	
	public static String getIP()
	{
		String response;
		InetAddress myip;
		Random randomNumber;
		
		randomNumber = new Random();
		
		myIndex = randomNumber.nextInt(totalProxies);
		
		

		myip = IPList.get(myIndex);

		
		response = myip.toString();
		
	

		return response;	

		
	}

	public static String getPort()
	{
		String response;
				
		response = PortList.get(myIndex).toString();
		
		

		return response;	

		
	}
}
