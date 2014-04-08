package org.wso2.carbon.event.simulator.core;

/**
 * Created by ujitha on 4/1/14.
 */
public class EventDetailsValue {

    private String attributeName;
    private String value;
    private  String type;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
