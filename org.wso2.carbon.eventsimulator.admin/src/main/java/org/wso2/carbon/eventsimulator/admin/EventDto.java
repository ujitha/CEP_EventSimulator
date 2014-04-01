package org.wso2.carbon.eventsimulator.admin;

/**
 * Created by ujitha on 3/28/14.
 */
public class EventDto {

    private String EventStreamName;
    private EventStreamAttributeValuesDto[] attributes;


    public String getEventStreamName() {
        return EventStreamName;
    }

    public void setEventStreamName(String eventStreamName) {
        EventStreamName = eventStreamName;
    }

    public EventStreamAttributeValuesDto[] getAttributes() {
        return attributes;
    }

    public void setAttributes(EventStreamAttributeValuesDto[] attributes) {
        this.attributes = attributes;
    }
}
