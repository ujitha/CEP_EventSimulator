package org.wso2.carbon.event.simulator.admin;

/**
 * Created by ujitha on 3/11/14.
 */
public class StreamDefinitionDto {

    private String name;
    private String version;
    private String description;
    private String nickName;
    private String[] metaData;
    private String[] correlationData;
    private String[] payloadData;

    public String[] getMetaData() {
        return metaData;
    }

    public void setMetaData(String[] metaData) {
        this.metaData = metaData;
    }

    public String[] getCorrelationData() {
        return correlationData;
    }

    public void setCorrelationData(String[] correlationData) {
        this.correlationData = correlationData;
    }

    public String[] getPayloadData() {
        return payloadData;
    }

    public void setPayloadData(String[] payloadData) {
        this.payloadData = payloadData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
