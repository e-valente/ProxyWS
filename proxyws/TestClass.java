/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyws;

/**
 *
 * @author emanuel
 */
public class TestClass {
    public static void main(String[] args)
    {
        ProxyWS myproxies = new ProxyWS();
        myproxies.openFile();
        
        myproxies.response();
        
        
        
    }
}
