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
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public void openFile() 
    {
        Scanner input;
        
        try
        {
            input = new Scanner(new File("proxies.txt"));
            
            System.out.println("foi");
            
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
        
}
