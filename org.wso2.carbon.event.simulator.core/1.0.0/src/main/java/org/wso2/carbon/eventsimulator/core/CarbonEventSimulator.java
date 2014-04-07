package org.wso2.carbon.eventsimulator.core;

import org.wso2.carbon.databridge.commons.StreamDefinition;

import java.util.Collection;
import java.util.HashMap;

import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.event.stream.manager.core.EventStreamService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.databridge.commons.StreamDefinition;
import org.wso2.carbon.event.stream.manager.core.exception.EventStreamConfigurationException;


/**
 * Created by ujitha on 3/11/14.
 */


public class CarbonEventSimulator implements EventSimulator {

    private static final Log log = LogFactory.getLog(CarbonEventSimulator.class);
    private HashMap<String,EventStreamProducer> eventProducerMap=new HashMap<String, EventStreamProducer>();


    public Collection<StreamDefinition> getAllEventStreamDefinitions() {
        try{
            EventStreamService Eventstreamservice=EventSimulatorValueHolder.getEventStreamService();
            //int tenantId = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
            return Eventstreamservice.getAllStreamDefinitions();

        }
        catch(Exception e)
        {

        }
        return null;
    }

    @Override
    public void sendEventDetails(EventsDetail eventDetail) {

        System.out.println(eventDetail.getEventStreamName());

        EventDetailsValue[] attributesValues=eventDetail.getAttributes();

        EventStreamService Eventstreamservice=EventSimulatorValueHolder.getEventStreamService();


        Object[] dataObjects=new Object[attributesValues.length];

        for(int i=0;i<dataObjects.length;i++) {

            dataObjects[i]=new Object();

            if(attributesValues[i].getType().equals("STRING")){

                dataObjects[i]=attributesValues[i].getValue();
            }
            else if(attributesValues[i].getType().equals("INT")){

                int val=Integer.parseInt(attributesValues[i].getValue());
                dataObjects[i]=val;
            }
            else if(attributesValues[i].getType().equals("LONG")){

                long val=Long.parseLong(attributesValues[i].getValue());
                dataObjects[i]=val;
            }
            else if(attributesValues[i].getType().equals("DOUBLE")){

                double val=Double.parseDouble(attributesValues[i].getValue());
                dataObjects[i]=val;
            }
            else if(attributesValues[i].getType().equals("FLOAT")){

                float val=Float.parseFloat(attributesValues[i].getValue());
                dataObjects[i]=val;
            }
            else if(attributesValues[i].getType().equals("BOOLEAN")){

                boolean val=Boolean.parseBoolean(attributesValues[i].getValue());
                dataObjects[i]=val;
            }
        }

        if(eventProducerMap.get(eventDetail.getEventStreamName())!=null){

            EventStreamProducer eventProducer=eventProducerMap.get(eventDetail.getEventStreamName());
            eventProducer.sendDatas(dataObjects);

        }
        else{
            EventStreamProducer eventStreamProducer=new EventStreamProducer();

            eventStreamProducer.setStreamID(eventDetail.getEventStreamName());

            int tenantId = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();

            try {
                Eventstreamservice.subscribe(eventStreamProducer,tenantId);

            } catch (EventStreamConfigurationException e) {
                e.printStackTrace();
            }

            eventProducerMap.put(eventDetail.getEventStreamName(),eventStreamProducer);
            eventStreamProducer.sendDatas(dataObjects);

        }

    }


}
