package org.apache.ws.axis2;

import org.apache.ws.axis2.ProxyWSTestStub.GetPortResponse;
import org.apache.ws.axis2.ProxyWSTestStub.GetIPAddressResponse;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ProxyWSTestStub stub = new ProxyWSTestStub();
		
		//req port
		ProxyWSTestStub.GetPort reqPort;
		reqPort = new ProxyWSTestStub.GetPort();
		
		//req ip
		ProxyWSTestStub.GetIPAddress reqIP;
		reqIP = new ProxyWSTestStub.GetIPAddress();
		
		//invoke
		GetPortResponse responsePort;
		GetIPAddressResponse responseIP;
		
		
		//ip deve ser primeiro (fix it!)
		responseIP = stub.getIPAddress(reqIP);
		responsePort = stub.getPort(reqPort);
		
		
		
		System.out.println("IP... " + responseIP.get_return());
		System.out.println("Porta... " + responsePort.get_return());

	}

}

