package org.wso2.carbon.eventsimulator.admin;

/**
 * Created by ujitha on 3/11/14.
 */


import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.eventsimulator.core.EventSimulator;

/**
 * This class is used to get the Event Simulator service.
 *
 * @scr.component name="eventSimulatorAdmin.component" immediate="true"
 * @scr.reference name="eventSimulatorService.component"
 * interface="org.wso2.carbon.eventsimulator.core.EventSimulator" cardinality="1..1"
 * policy="dynamic" bind="setEventSimulatorService" unbind="unsetEventSimulatorService"
 */

public class EventSimulatorAdminDS {

    protected void activate(ComponentContext context) {
        System.out.println("Event Simulator Admin **************");

    }

    protected void setEventSimulatorService(EventSimulator eventSimulatorService) {
        EventSimulatorAdminvalueHolder.registerEventSimulator(eventSimulatorService);
    }

    protected void unsetEventSimulatorService(
            EventSimulator eventSimulatorService) {

    }
}
