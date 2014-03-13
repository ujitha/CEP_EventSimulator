package org.wso2.carbon.eventsimulator.admin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.core.AbstractAdmin;
import org.wso2.carbon.databridge.commons.StreamDefinition;
import org.wso2.carbon.eventsimulator.core.EventSimulator;



//import org.wso2.carbon.eventsimulator.core.EventSimulator;

import java.util.Collection;

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
}
