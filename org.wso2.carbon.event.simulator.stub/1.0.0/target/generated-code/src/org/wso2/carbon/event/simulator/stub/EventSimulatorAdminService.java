

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
                    * @param sendEventsViaFile8
                
         */

         
                     public void sendEventsViaFile(

                        java.lang.String fileName9)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sendEventsViaFile8
            
          */
        public void startsendEventsViaFile(

            java.lang.String fileName9,

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllCSVFileInfo11
                
         */

         
                     public org.wso2.carbon.event.simulator.stub.types.CSVFileInfoDto[] getAllCSVFileInfo(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllCSVFileInfo11
            
          */
        public void startgetAllCSVFileInfo(

            

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param sendEvent14
                
         */

         
                     public void sendEvent(

                        org.wso2.carbon.event.simulator.stub.types.EventDto eventDto15)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sendEvent14
            
          */
        public void startsendEvent(

            org.wso2.carbon.event.simulator.stub.types.EventDto eventDto15,

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteFile17
                
         */

         
                     public void deleteFile(

                        java.lang.String fileName18)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteFile17
            
          */
        public void startdeleteFile(

            java.lang.String fileName18,

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param uploadService20
                
         */

         
                     public void uploadService(

                        org.wso2.carbon.event.simulator.stub.types.UploadedFileItemDto[] fileItems21)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param uploadService20
            
          */
        public void startuploadService(

            org.wso2.carbon.event.simulator.stub.types.UploadedFileItemDto[] fileItems21,

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param sendConfigDetails23
                
         */

         
                     public void sendConfigDetails(

                        java.lang.String fileName24,java.lang.String streamId25,java.lang.String separateChar26)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sendConfigDetails23
            
          */
        public void startsendConfigDetails(

            java.lang.String fileName24,java.lang.String streamId25,java.lang.String separateChar26,

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllEventStreamInfoDto28
                
         */

         
                     public org.wso2.carbon.event.simulator.stub.types.StreamDefinitionInfoDto[] getAllEventStreamInfoDto(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllEventStreamInfoDto28
            
          */
        public void startgetAllEventStreamInfoDto(

            

            final org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    