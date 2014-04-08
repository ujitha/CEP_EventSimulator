package org.wso2.carbon.event.simulator.admin.util;


import org.wso2.carbon.event.simulator.core.EventSimulator;

/**
 * Created by ujitha on 3/11/14.
 */
public class EventSimulatorAdminvalueHolder {

    private static EventSimulator eventSimulator;

    public static void registerEventSimulator(EventSimulator eventSimulatorService) {
        EventSimulatorAdminvalueHolder.eventSimulator = eventSimulatorService;
    }

    public static EventSimulator getEventSimulator()
    {
        return EventSimulatorAdminvalueHolder.eventSimulator;
    }
}
