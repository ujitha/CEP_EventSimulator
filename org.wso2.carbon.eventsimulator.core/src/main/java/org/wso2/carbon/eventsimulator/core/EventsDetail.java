package org.wso2.carbon.eventsimulator.core;

/**
 * Created by ujitha on 4/1/14.
 */
public class EventsDetail {

    private String EventStreamName;
    private EventDetailsValue[] attributes;


    public String getEventStreamName() {
        return EventStreamName;
    }

    public void setEventStreamName(String eventStreamName) {
        EventStreamName = eventStreamName;
    }

    public EventDetailsValue[] getAttributes() {
        return attributes;
    }

    public void setAttributes(EventDetailsValue[] attributes) {
        this.attributes = attributes;
    }
}
