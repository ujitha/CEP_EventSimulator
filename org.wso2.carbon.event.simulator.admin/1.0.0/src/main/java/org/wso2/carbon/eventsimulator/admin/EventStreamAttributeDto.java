package org.wso2.carbon.eventsimulator.admin;

/**
 * Created by ujitha on 3/11/14.
 */
public class EventStreamAttributeDto {

    /**
     * Name of the attribute
     */
    private String attributeName;

    /**
     * Type of the attribute
     */
    private String attributeType;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }
}
