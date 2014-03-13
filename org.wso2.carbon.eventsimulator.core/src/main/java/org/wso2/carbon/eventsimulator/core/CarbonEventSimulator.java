package org.wso2.carbon.eventsimulator.core;

import org.wso2.carbon.databridge.commons.StreamDefinition;

import java.util.Collection;
import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.event.stream.manager.core.EventStreamService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.databridge.commons.StreamDefinition;


/**
 * Created by ujitha on 3/11/14.
 */


public class CarbonEventSimulator implements EventSimulator {

    private static final Log log = LogFactory.getLog(CarbonEventSimulator.class);

    public Collection<StreamDefinition> getAllEventStreamDefinitions() {
        try{
            EventStreamService Eventstreamservice=EventSimulatorValueHolder.getEventStreamService();
            int tenantId = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
            return Eventstreamservice.getAllStreamDefinitionsFromStore(tenantId);

        }
        catch(Exception e)
        {

        }
        return null;
    }



}
