
/**
 * ProxyWSTestCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package org.apache.ws.axis2;

    /**
     *  ProxyWSTestCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ProxyWSTestCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ProxyWSTestCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ProxyWSTestCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getIPAddress method
            * override this method for handling normal response from getIPAddress operation
            */
           public void receiveResultgetIPAddress(
                    org.apache.ws.axis2.ProxyWSTestStub.GetIPAddressResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIPAddress operation
           */
            public void receiveErrorgetIPAddress(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPort method
            * override this method for handling normal response from getPort operation
            */
           public void receiveResultgetPort(
                    org.apache.ws.axis2.ProxyWSTestStub.GetPortResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPort operation
           */
            public void receiveErrorgetPort(java.lang.Exception e) {
            }
                


    }
    