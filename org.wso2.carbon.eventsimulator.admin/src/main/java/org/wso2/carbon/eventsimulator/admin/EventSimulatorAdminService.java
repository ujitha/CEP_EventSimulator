package org.wso2.carbon.eventsimulator.admin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.core.AbstractAdmin;
import org.wso2.carbon.databridge.commons.StreamDefinition;
import org.wso2.carbon.eventsimulator.core.EventDetailsValue;
import org.wso2.carbon.eventsimulator.core.EventSimulator;
import org.wso2.carbon.databridge.commons.Attribute;
import org.wso2.carbon.eventsimulator.core.EventsDetail;


//import org.wso2.carbon.eventsimulator.core.EventSimulator;

import java.util.Collection;
import java.util.List;

/**
 * Created by ujitha on 3/11/14.
 */
public class EventSimulatorAdminService extends AbstractAdmin {

    private static Log log = LogFactory.getLog(EventSimulatorAdminService.class);

    public EventStreamInfoDto[] getAllEventStreamInfoDto(){



        EventSimulator eventSimulator=EventSimulatorAdminvalueHolder.getEventSimulator();

        try{
            Collection<StreamDefinition> eventStreamDefinitionList=eventSimulator.getAllEventStreamDefinitions();

            if(eventStreamDefinitionList!=null){

                EventStreamInfoDto[] eventStreamInfoDtos = new EventStreamInfoDto[eventStreamDefinitionList.size()];
                int index = 0;
                for (StreamDefinition streamDefinition : eventStreamDefinitionList) {
                    eventStreamInfoDtos[index] = new EventStreamInfoDto();
                    eventStreamInfoDtos[index].setStreamName(streamDefinition.getName());
                    eventStreamInfoDtos[index].setStreamVersion(streamDefinition.getVersion());
                    eventStreamInfoDtos[index].setStreamDefinition(streamDefinition.toString());
                    eventStreamInfoDtos[index].setStreamDescription(streamDefinition.getDescription());

                    // Set Meta attributes to EventStreamInfoDtos
                    List<Attribute> meataDataAttributeList=streamDefinition.getMetaData();


                    if(meataDataAttributeList!=null)
                    {
                        EventStreamAttributeDto[]  metaDataAttributeArray=new EventStreamAttributeDto[meataDataAttributeList.size()];
                         for(int i=0;i<metaDataAttributeArray.length;i++)
                        {

                            metaDataAttributeArray[i] = new EventStreamAttributeDto();
                            metaDataAttributeArray[i].setAttributeName(meataDataAttributeList.get(i).getName());
                            metaDataAttributeArray[i].setAttributeType(meataDataAttributeList.get(i).getType().toString());

                        }

                        eventStreamInfoDtos[index].setMetaAttributes(metaDataAttributeArray);
                    }
                    //Set correlation attributes to EventStreamInfoDtos
                    List<Attribute> correlationDataAttributeList=streamDefinition.getCorrelationData();


                    if(correlationDataAttributeList!=null)
                    {
                        EventStreamAttributeDto[]  correlationDataAttributeArray=new EventStreamAttributeDto[correlationDataAttributeList.size()];

                        for(int j=0;j<correlationDataAttributeArray.length;j++)
                        {
                            correlationDataAttributeArray[j]=new EventStreamAttributeDto();
                            correlationDataAttributeArray[j].setAttributeName(correlationDataAttributeList.get(j).getName());
                            correlationDataAttributeArray[j].setAttributeType(correlationDataAttributeList.get(j).getType().toString());
                        }

                        eventStreamInfoDtos[index].setCorrelationAttributes(correlationDataAttributeArray);
                    }
                    //Set payload data attributes to EventStreamInfoDtos

                    List<Attribute> payloadDataAttributeList=streamDefinition.getPayloadData();


                    if(payloadDataAttributeList!=null)
                    {
                        EventStreamAttributeDto[] payloadDataAttributesArray =new EventStreamAttributeDto[payloadDataAttributeList.size()];
                        for(int k=0;k<payloadDataAttributesArray.length;k++)
                        {
                            payloadDataAttributesArray[k]=new EventStreamAttributeDto();
                            payloadDataAttributesArray[k].setAttributeName(payloadDataAttributeList.get(k).getName());
                            payloadDataAttributesArray[k].setAttributeType(payloadDataAttributeList.get(k).getType().toString());
                        }

                        eventStreamInfoDtos[index].setPayloadAttributes(payloadDataAttributesArray);
                    }
                    index++;
                }
                return eventStreamInfoDtos;

            }else{
                return new EventStreamInfoDto[0];
            }

        }catch(Exception e)
        {
            e.fillInStackTrace();
        }

        return new EventStreamInfoDto[0];
    }


    public void getEventDetails(EventDto eventdetails)
    {
        EventDto eventDetails=new EventDto();
        eventDetails=eventdetails;

        System.out.println(eventDetails.getEventStreamName());
        EventStreamAttributeValuesDto[] eventAttributeArray=eventDetails.getAttributes();

//        for(int i=0;i<eventAttributeArray.length;i++)
//        {
//            System.out.println("Attribute name : "+eventAttributeArray[i].getAttributeName()+" ,Attribute value : "+eventAttributeArray[i].getValue());
//        }

        EventSimulator eventSimulator=EventSimulatorAdminvalueHolder.getEventSimulator();

        EventDetailsValue[] eventDetailsvalueArray=new EventDetailsValue[eventAttributeArray.length];

        for(int i=0;i<eventAttributeArray.length;i++)
        {
            eventDetailsvalueArray[i]=new EventDetailsValue();

            eventDetailsvalueArray[i].setAttributeName(eventAttributeArray[i].getAttributeName());
            eventDetailsvalueArray[i].setType(eventAttributeArray[i].getType());
            eventDetailsvalueArray[i].setValue(eventAttributeArray[i].getValue());
        }

        EventsDetail eventDetailObject=new EventsDetail();

        eventDetailObject.setEventStreamName(eventDetails.getEventStreamName());
        eventDetailObject.setAttributes(eventDetailsvalueArray);
        System.out.println("name"+eventDetailObject.getEventStreamName());
        eventSimulator.sendEventDetails(eventDetailObject);
    }
}
