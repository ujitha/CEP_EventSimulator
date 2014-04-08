
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Apr 07, 2014 (11:43:34 IST)
 */

        
            package org.wso2.carbon.event.simulator.stub.types;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://admin.simulator.event.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "EventStreamAttributeValuesDto".equals(typeName)){
                   
                            return  org.wso2.carbon.event.simulator.stub.types.EventStreamAttributeValuesDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://admin.simulator.event.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "EventDto".equals(typeName)){
                   
                            return  org.wso2.carbon.event.simulator.stub.types.EventDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://admin.simulator.event.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "EventStreamInfoDto".equals(typeName)){
                   
                            return  org.wso2.carbon.event.simulator.stub.types.EventStreamInfoDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://admin.simulator.event.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "EventStreamAttributeDto".equals(typeName)){
                   
                            return  org.wso2.carbon.event.simulator.stub.types.EventStreamAttributeDto.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    