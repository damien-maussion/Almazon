
/**
 * SupplierServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */

    package fr.univnantes.shop.ShopService.SupplierStub;

    /**
     *  SupplierServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SupplierServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SupplierServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SupplierServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getStock method
            * override this method for handling normal response from getStock operation
            */
           public void receiveResultgetStock(
                    fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.GetStockResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStock operation
           */
            public void receiveErrorgetStock(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buy method
            * override this method for handling normal response from buy operation
            */
           public void receiveResultbuy(
                    fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.BuyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buy operation
           */
            public void receiveErrorbuy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getItemList method
            * override this method for handling normal response from getItemList operation
            */
           public void receiveResultgetItemList(
                    fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.GetItemListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getItemList operation
           */
            public void receiveErrorgetItemList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPrice method
            * override this method for handling normal response from getPrice operation
            */
           public void receiveResultgetPrice(
                    fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.GetPriceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPrice operation
           */
            public void receiveErrorgetPrice(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    