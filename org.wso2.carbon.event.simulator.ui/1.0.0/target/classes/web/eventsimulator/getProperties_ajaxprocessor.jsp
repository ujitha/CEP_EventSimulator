<%@ page import="org.wso2.carbon.eventsimulator.ui.EventSimulatorUIUtils" %>
<%@ page import="org.wso2.carbon.eventsimulator.stub.EventSimulatorAdminServiceStub" %>
<%@ page import="org.wso2.carbon.eventsimulator.admin.EventStreamInfoDto" %>
<%@ page import="com.google.gson.Gson" %>
<%

    EventSimulatorAdminServiceStub stub =EventSimulatorUIUtils.getEventSimulatorAdminService(config,session,request);
    org.wso2.carbon.eventsimulator.stub.types.EventStreamInfoDto[] eventInfoArray=stub.getAllEventStreamInfoDto();

    String eventName=request.getParameter("eventName");
    org.wso2.carbon.eventsimulator.stub.types.EventStreamInfoDto selctedEvent=new org.wso2.carbon.eventsimulator.stub.types.EventStreamInfoDto();

    for(int i=0;i<eventInfoArray.length;i++)
    {
        if(eventInfoArray[i].getStreamName().equals(eventName))
        {
            selctedEvent=eventInfoArray[i];
            break;
        }

    }


    String eventPropertyString="";

    if(selctedEvent!=null)
    {
       eventPropertyString=new Gson().toJson(selctedEvent);


%>

<%=eventPropertyString%>
<%
    }
%>