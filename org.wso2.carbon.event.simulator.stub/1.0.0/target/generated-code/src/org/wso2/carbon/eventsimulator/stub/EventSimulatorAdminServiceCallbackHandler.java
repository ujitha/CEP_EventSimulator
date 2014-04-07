
/**
 * EventSimulatorAdminServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Mar 03, 2014 (02:02:42 IST)
 */

    package org.wso2.carbon.eventsimulator.stub;

    /**
     *  EventSimulatorAdminServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class EventSimulatorAdminServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public EventSimulatorAdminServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public EventSimulatorAdminServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getAllEventStreamInfoDto method
            * override this method for handling normal response from getAllEventStreamInfoDto operation
            */
           public void receiveResultgetAllEventStreamInfoDto(
                    org.wso2.carbon.eventsimulator.stub.types.EventStreamInfoDto[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllEventStreamInfoDto operation
           */
            public void receiveErrorgetAllEventStreamInfoDto(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getEventDetails method
            * override this method for handling normal response from getEventDetails operation
            */
           public void receiveResultgetEventDetails(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getEventDetails operation
           */
            public void receiveErrorgetEventDetails(java.lang.Exception e) {
            }
                


    }
    