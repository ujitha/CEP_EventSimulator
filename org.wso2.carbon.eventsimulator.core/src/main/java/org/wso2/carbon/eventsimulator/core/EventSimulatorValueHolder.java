package org.wso2.carbon.eventsimulator.core;

import org.wso2.carbon.event.stream.manager.core.EventStreamService;

/**
 * Created by ujitha on 3/10/14.
 */
public class EventSimulatorValueHolder {
private static EventStreamService eventstreamservice;

    private EventSimulatorValueHolder()
    {

    }

    public static void setEventStreamService(EventStreamService eventstreamservice)
    {
        EventSimulatorValueHolder.eventstreamservice=eventstreamservice;
    }

    public static void unsetEventStreamService()
    {
        EventSimulatorValueHolder.eventstreamservice=null;
    }

    public static EventStreamService getEventStreamService()
    {
        return EventSimulatorValueHolder.eventstreamservice;
    }




}
