
/**
 * BankServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */

    package fr.univnantes.shop.ShopService.BankStub;

    /**
     *  BankServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BankServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BankServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BankServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for debit method
            * override this method for handling normal response from debit operation
            */
           public void receiveResultdebit(
                    fr.univnantes.shop.ShopService.BankStub.BankServiceStub.DebitResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from debit operation
           */
            public void receiveErrordebit(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getExchangeRate method
            * override this method for handling normal response from getExchangeRate operation
            */
           public void receiveResultgetExchangeRate(
                    fr.univnantes.shop.ShopService.BankStub.BankServiceStub.GetExchangeRateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getExchangeRate operation
           */
            public void receiveErrorgetExchangeRate(java.lang.Exception e) {
            }
                


    }
    