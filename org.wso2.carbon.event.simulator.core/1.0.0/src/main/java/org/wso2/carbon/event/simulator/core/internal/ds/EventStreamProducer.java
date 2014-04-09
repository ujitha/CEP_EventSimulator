package org.wso2.carbon.event.simulator.core.internal.ds;


import org.wso2.carbon.databridge.commons.Event;
import org.wso2.carbon.event.stream.manager.core.EventProducer;
import org.wso2.carbon.event.stream.manager.core.EventProducerCallback;

/**
 * Created by ujitha on 3/31/14.
 */
public class EventStreamProducer implements EventProducer {

    private String streamID;
    private EventProducerCallback eventProducerCallback;


    @Override
    public String getStreamId() {
        return streamID;
    }

    @Override
    public void setCallBack(EventProducerCallback eventProducerCallback) {

        this.eventProducerCallback=eventProducerCallback;

    }

    public void setStreamID(String streamID)
    {
        this.streamID=streamID;
    }

    public void sendDatas(Object[] datas)
    {
        eventProducerCallback.sendEventData(datas);
    }



}
