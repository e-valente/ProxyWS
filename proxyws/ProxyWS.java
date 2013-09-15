/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyws;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanuel
 */
public class ProxyWS {
    
    private List<InetAddress> IPList;
    private List<Integer> PortList;
    
    
    ProxyWS()
    {
        IPList = new ArrayList<>();
        PortList = new ArrayList<>();
        openFile();
        
    }
    

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    * */
    
    private void openFile() 
    {
        Scanner input;
        
        try
        {
            input = new Scanner(new File("proxies.txt"));
            
            //System.out.println("foi");
            
            while(input.hasNext())
            {
                //get IP address
                IPList.add(InetAddress.getByName(input.next().toString()));
                // get the  " : "
                 input.next();
                 //get the ports number
                PortList.add(input.nextInt());
                
                
               // System.out.println("Porta: " + input.next() + "\n");
            }
            
           System.out.println("ip" + IPList);
           System.out.println("portas" + PortList);
            
                
                 
        }
            catch (FileNotFoundException fileNotFoundException)
            {
                System.err.println("Error opening file");
                System.exit(1);
            } catch (UnknownHostException ex) { 
            Logger.getLogger(ProxyWS.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
            }
    
    public String getIPAddress()
    {
        String response;
        InetAddress myip;
        
        myip = IPList.get(0);
        
        response =  myip.toString();
        
        System.out.println("returning ip: " + response);
        
        
        return response;
        
    }
    
     public Integer getPort()
    {
        Integer response;
   
        response = PortList.get(0);
        
        System.out.println("returning port: " + response);
        
        
        return response;
        
    }
        
}


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
		
		responsePort = stub.getPort(reqPort);
		responseIP = stub.getIPAddress(reqIP);
		
		
		System.out.println("Porta... " + responsePort.get_return());
		System.out.println("IP... " + responseIP.get_return());
		

	}

}




public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ProxyWSTest pt;
		pt = new ProxyWSTest();
		
		
		 String current = new java.io.File( "." ).getCanonicalPath();
	        System.out.println("Current dir:"+current);
	        
	        
		System.out.println("Porta: " + pt.getPort());
		System.out.println("IP: " + pt.getIPAddress());
		
		
		

	}

}
