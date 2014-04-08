package org.wso2.carbon.event.simulator.core;

/**
 * Created by ujitha on 3/10/14.
 */


import org.wso2.carbon.databridge.commons.StreamDefinition;

import java.util.Collection;


public interface EventSimulator {


    public Collection<StreamDefinition> getAllEventStreamDefinitions();

    public void sendEventDetails(EventsDetail eventDetail);




}
