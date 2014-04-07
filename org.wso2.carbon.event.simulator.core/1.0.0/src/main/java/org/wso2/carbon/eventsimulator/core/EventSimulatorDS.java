package org.wso2.carbon.eventsimulator.core;

import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.event.stream.manager.core.EventStreamService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.databridge.commons.StreamDefinition;

/**
 * Created by ujitha on 3/11/14.
 */

/**
 * @scr.component name="eventSimulatorService.component" immediate="true"
 * @scr.reference name="stream.carboneventstream.service"
 * interface="org.wso2.carbon.event.stream.manager.core.EventStreamService"
 * cardinality="1..1" bind="setEventStreamService" unbind="unsetEventStreamService"
 */


public class EventSimulatorDS {


    private static final Log log = LogFactory.getLog(EventSimulator.class);

    protected void activate(ComponentContext context) {
        try {
            EventSimulator eventsimulator =  createEventSimulator();

            context.getBundleContext().registerService(EventSimulator.class.getName(), eventsimulator, null);
            if (log.isDebugEnabled()) {
                log.debug("Successfully deployed EventSimulator");
            }
        } catch (RuntimeException e) {
            log.error("Could not create EventSimulator : " + e.getMessage(), e);
        }



     }

    protected void setEventStreamService(EventStreamService eventstreamservice)
    {
        EventSimulatorValueHolder.setEventStreamService(eventstreamservice);
    }

    protected void unsetEventStreamService(EventStreamService eventstreamservice)
    {
        EventSimulatorValueHolder.unsetEventStreamService();
    }

    private CarbonEventSimulator createEventSimulator()
   {
         CarbonEventSimulator carbonEventSimulator = new CarbonEventSimulator();

        return carbonEventSimulator;
    }
}
