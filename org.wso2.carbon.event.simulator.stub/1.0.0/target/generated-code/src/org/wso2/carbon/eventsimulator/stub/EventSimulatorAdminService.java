

/**
 * EventSimulatorAdminService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Mar 03, 2014 (02:02:42 IST)
 */

    package org.wso2.carbon.eventsimulator.stub;

    /*
     *  EventSimulatorAdminService java interface
     */

    public interface EventSimulatorAdminService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getAllEventStreamInfoDto1
                
         */

         
                     public org.wso2.carbon.eventsimulator.stub.types.EventStreamInfoDto[] getAllEventStreamInfoDto(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllEventStreamInfoDto1
            
          */
        public void startgetAllEventStreamInfoDto(

            

            final org.wso2.carbon.eventsimulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getEventDetails4
                
         */

         
                     public void getEventDetails(

                        org.wso2.carbon.eventsimulator.stub.types.EventDto eventdetails5)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getEventDetails4
            
          */
        public void startgetEventDetails(

            org.wso2.carbon.eventsimulator.stub.types.EventDto eventdetails5,

            final org.wso2.carbon.eventsimulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    