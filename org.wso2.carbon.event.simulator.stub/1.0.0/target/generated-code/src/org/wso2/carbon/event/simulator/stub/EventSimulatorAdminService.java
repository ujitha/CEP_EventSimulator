

/**
 * EventSimulatorAdminService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Mar 03, 2014 (02:02:42 IST)
 */

    package org.wso2.carbon.event.simulator.stub;

    /*
     *  EventSimulatorAdminService java interface
     */

    public interface EventSimulatorAdminService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getEventDetails1
                
         */

         
                     public void getEventDetails(

                        org.wso2.carbon.event.simulator.stub.types.EventDto eventdetails2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getEventDetails1
            
          */
        public void startgetEventDetails(

            org.wso2.carbon.event.simulator.stub.types.EventDto eventdetails2,

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllEventStreamInfoDto4
                
         */

         
                     public org.wso2.carbon.event.simulator.stub.types.EventStreamInfoDto[] getAllEventStreamInfoDto(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllEventStreamInfoDto4
            
          */
        public void startgetAllEventStreamInfoDto(

            

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    