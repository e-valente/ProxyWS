
/**
 * ProxyWSTestExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package org.apache.ws.axis2;

public class ProxyWSTestExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1379284921870L;
    
    private org.apache.ws.axis2.ProxyWSTestStub.ProxyWSTestException faultMessage;

    
        public ProxyWSTestExceptionException() {
            super("ProxyWSTestExceptionException");
        }

        public ProxyWSTestExceptionException(java.lang.String s) {
           super(s);
        }

        public ProxyWSTestExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProxyWSTestExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.apache.ws.axis2.ProxyWSTestStub.ProxyWSTestException msg){
       faultMessage = msg;
    }
    
    public org.apache.ws.axis2.ProxyWSTestStub.ProxyWSTestException getFaultMessage(){
       return faultMessage;
    }
}
    