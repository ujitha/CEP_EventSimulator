
/**
 * EventStreamInfoDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Apr 07, 2014 (11:43:34 IST)
 */

            
                package org.wso2.carbon.eventsimulator.stub.types;
            

            /**
            *  EventStreamInfoDto bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class EventStreamInfoDto
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = EventStreamInfoDto
                Namespace URI = http://admin.eventsimulator.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CorrelationAttributes
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] localCorrelationAttributes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCorrelationAttributesTracker = false ;

                           public boolean isCorrelationAttributesSpecified(){
                               return localCorrelationAttributesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[]
                           */
                           public  org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] getCorrelationAttributes(){
                               return localCorrelationAttributes;
                           }

                           
                        


                               
                              /**
                               * validate the array for CorrelationAttributes
                               */
                              protected void validateCorrelationAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CorrelationAttributes
                              */
                              public void setCorrelationAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] param){
                              
                                   validateCorrelationAttributes(param);

                               localCorrelationAttributesTracker = true;
                                      
                                      this.localCorrelationAttributes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto
                             */
                             public void addCorrelationAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto param){
                                   if (localCorrelationAttributes == null){
                                   localCorrelationAttributes = new org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[]{};
                                   }

                            
                                 //update the setting tracker
                                localCorrelationAttributesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCorrelationAttributes);
                               list.add(param);
                               this.localCorrelationAttributes =
                             (org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[])list.toArray(
                            new org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[list.size()]);

                             }
                             

                        /**
                        * field for MetaAttributes
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] localMetaAttributes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMetaAttributesTracker = false ;

                           public boolean isMetaAttributesSpecified(){
                               return localMetaAttributesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[]
                           */
                           public  org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] getMetaAttributes(){
                               return localMetaAttributes;
                           }

                           
                        


                               
                              /**
                               * validate the array for MetaAttributes
                               */
                              protected void validateMetaAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MetaAttributes
                              */
                              public void setMetaAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] param){
                              
                                   validateMetaAttributes(param);

                               localMetaAttributesTracker = true;
                                      
                                      this.localMetaAttributes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto
                             */
                             public void addMetaAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto param){
                                   if (localMetaAttributes == null){
                                   localMetaAttributes = new org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[]{};
                                   }

                            
                                 //update the setting tracker
                                localMetaAttributesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMetaAttributes);
                               list.add(param);
                               this.localMetaAttributes =
                             (org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[])list.toArray(
                            new org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[list.size()]);

                             }
                             

                        /**
                        * field for PayloadAttributes
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] localPayloadAttributes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadAttributesTracker = false ;

                           public boolean isPayloadAttributesSpecified(){
                               return localPayloadAttributesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[]
                           */
                           public  org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] getPayloadAttributes(){
                               return localPayloadAttributes;
                           }

                           
                        


                               
                              /**
                               * validate the array for PayloadAttributes
                               */
                              protected void validatePayloadAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PayloadAttributes
                              */
                              public void setPayloadAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[] param){
                              
                                   validatePayloadAttributes(param);

                               localPayloadAttributesTracker = true;
                                      
                                      this.localPayloadAttributes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto
                             */
                             public void addPayloadAttributes(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto param){
                                   if (localPayloadAttributes == null){
                                   localPayloadAttributes = new org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[]{};
                                   }

                            
                                 //update the setting tracker
                                localPayloadAttributesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPayloadAttributes);
                               list.add(param);
                               this.localPayloadAttributes =
                             (org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[])list.toArray(
                            new org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[list.size()]);

                             }
                             

                        /**
                        * field for StreamDefinition
                        */

                        
                                    protected java.lang.String localStreamDefinition ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreamDefinitionTracker = false ;

                           public boolean isStreamDefinitionSpecified(){
                               return localStreamDefinitionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreamDefinition(){
                               return localStreamDefinition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreamDefinition
                               */
                               public void setStreamDefinition(java.lang.String param){
                            localStreamDefinitionTracker = true;
                                   
                                            this.localStreamDefinition=param;
                                    

                               }
                            

                        /**
                        * field for StreamDescription
                        */

                        
                                    protected java.lang.String localStreamDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreamDescriptionTracker = false ;

                           public boolean isStreamDescriptionSpecified(){
                               return localStreamDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreamDescription(){
                               return localStreamDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreamDescription
                               */
                               public void setStreamDescription(java.lang.String param){
                            localStreamDescriptionTracker = true;
                                   
                                            this.localStreamDescription=param;
                                    

                               }
                            

                        /**
                        * field for StreamName
                        */

                        
                                    protected java.lang.String localStreamName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreamNameTracker = false ;

                           public boolean isStreamNameSpecified(){
                               return localStreamNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreamName(){
                               return localStreamName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreamName
                               */
                               public void setStreamName(java.lang.String param){
                            localStreamNameTracker = true;
                                   
                                            this.localStreamName=param;
                                    

                               }
                            

                        /**
                        * field for StreamVersion
                        */

                        
                                    protected java.lang.String localStreamVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreamVersionTracker = false ;

                           public boolean isStreamVersionSpecified(){
                               return localStreamVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreamVersion(){
                               return localStreamVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreamVersion
                               */
                               public void setStreamVersion(java.lang.String param){
                            localStreamVersionTracker = true;
                                   
                                            this.localStreamVersion=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://admin.eventsimulator.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":EventStreamInfoDto",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "EventStreamInfoDto",
                           xmlWriter);
                   }

               
                   }
                if (localCorrelationAttributesTracker){
                                       if (localCorrelationAttributes!=null){
                                            for (int i = 0;i < localCorrelationAttributes.length;i++){
                                                if (localCorrelationAttributes[i] != null){
                                                 localCorrelationAttributes[i].serialize(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","correlationAttributes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://admin.eventsimulator.carbon.wso2.org/xsd", "correlationAttributes", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://admin.eventsimulator.carbon.wso2.org/xsd", "correlationAttributes", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localMetaAttributesTracker){
                                       if (localMetaAttributes!=null){
                                            for (int i = 0;i < localMetaAttributes.length;i++){
                                                if (localMetaAttributes[i] != null){
                                                 localMetaAttributes[i].serialize(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","metaAttributes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://admin.eventsimulator.carbon.wso2.org/xsd", "metaAttributes", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://admin.eventsimulator.carbon.wso2.org/xsd", "metaAttributes", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localPayloadAttributesTracker){
                                       if (localPayloadAttributes!=null){
                                            for (int i = 0;i < localPayloadAttributes.length;i++){
                                                if (localPayloadAttributes[i] != null){
                                                 localPayloadAttributes[i].serialize(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","payloadAttributes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://admin.eventsimulator.carbon.wso2.org/xsd", "payloadAttributes", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://admin.eventsimulator.carbon.wso2.org/xsd", "payloadAttributes", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localStreamDefinitionTracker){
                                    namespace = "http://admin.eventsimulator.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "streamDefinition", xmlWriter);
                             

                                          if (localStreamDefinition==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreamDefinition);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStreamDescriptionTracker){
                                    namespace = "http://admin.eventsimulator.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "streamDescription", xmlWriter);
                             

                                          if (localStreamDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreamDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStreamNameTracker){
                                    namespace = "http://admin.eventsimulator.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "streamName", xmlWriter);
                             

                                          if (localStreamName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreamName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStreamVersionTracker){
                                    namespace = "http://admin.eventsimulator.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "streamVersion", xmlWriter);
                             

                                          if (localStreamVersion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreamVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://admin.eventsimulator.carbon.wso2.org/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCorrelationAttributesTracker){
                             if (localCorrelationAttributes!=null) {
                                 for (int i = 0;i < localCorrelationAttributes.length;i++){

                                    if (localCorrelationAttributes[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "correlationAttributes"));
                                         elementList.add(localCorrelationAttributes[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "correlationAttributes"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "correlationAttributes"));
                                        elementList.add(localCorrelationAttributes);
                                    
                             }

                        } if (localMetaAttributesTracker){
                             if (localMetaAttributes!=null) {
                                 for (int i = 0;i < localMetaAttributes.length;i++){

                                    if (localMetaAttributes[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "metaAttributes"));
                                         elementList.add(localMetaAttributes[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "metaAttributes"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "metaAttributes"));
                                        elementList.add(localMetaAttributes);
                                    
                             }

                        } if (localPayloadAttributesTracker){
                             if (localPayloadAttributes!=null) {
                                 for (int i = 0;i < localPayloadAttributes.length;i++){

                                    if (localPayloadAttributes[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "payloadAttributes"));
                                         elementList.add(localPayloadAttributes[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "payloadAttributes"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                          "payloadAttributes"));
                                        elementList.add(localPayloadAttributes);
                                    
                             }

                        } if (localStreamDefinitionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                      "streamDefinition"));
                                 
                                         elementList.add(localStreamDefinition==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreamDefinition));
                                    } if (localStreamDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                      "streamDescription"));
                                 
                                         elementList.add(localStreamDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreamDescription));
                                    } if (localStreamNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                      "streamName"));
                                 
                                         elementList.add(localStreamName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreamName));
                                    } if (localStreamVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd",
                                                                      "streamVersion"));
                                 
                                         elementList.add(localStreamVersion==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreamVersion));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static EventStreamInfoDto parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            EventStreamInfoDto object =
                new EventStreamInfoDto();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"EventStreamInfoDto".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (EventStreamInfoDto)org.wso2.carbon.eventsimulator.stub.types.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","correlationAttributes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","correlationAttributes").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCorrelationAttributes((org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","metaAttributes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(null);
                                                              reader.next();
                                                          } else {
                                                        list2.add(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","metaAttributes").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list2.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list2.add(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMetaAttributes((org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","payloadAttributes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","payloadAttributes").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPayloadAttributes((org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.eventsimulator.stub.types.EventStreamAttributeDto.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","streamDefinition").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreamDefinition(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","streamDescription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreamDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","streamName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreamName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://admin.eventsimulator.carbon.wso2.org/xsd","streamVersion").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreamVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    