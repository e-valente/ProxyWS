
public class ProxyWSTest {

	

	public String getPort()
	{
		String response;

		response = makeIPAndPort.getPort();
		return response;	

	}

	public String getIPAddress() throws Exception
	{
		String response;
		
		makeIPAndPort.openFile();
		
		response = makeIPAndPort.getIP();
		

		return response;	

	}

}
