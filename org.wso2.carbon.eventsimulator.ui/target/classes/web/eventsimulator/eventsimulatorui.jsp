<%@ page import="org.apache.axis2.context.ConfigurationContext" %>
<%@ page import="org.wso2.carbon.CarbonConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIUtil" %>
<%@ page import="org.wso2.carbon.utils.ServerConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIMessage" %>
<%@ page import="org.wso2.carbon.eventsimulator.ui.EventSimulatorUIUtils" %>
<%@ page import="org.wso2.carbon.eventsimulator.stub.EventSimulatorAdminServiceStub" %>
<%@ page import="org.wso2.carbon.eventsimulator.admin.EventStreamInfoDto" %>

<%
   EventSimulatorAdminServiceStub stub =EventSimulatorUIUtils.getEventSimulatorAdminService(config,session,request);

    org.wso2.carbon.eventsimulator.stub.types.EventStreamInfoDto[] eventInfoArray=stub.getAllEventStreamInfoDto();


%>
<div id="middle">
    <h2> <%= eventInfoArray[0].getStreamName()%></h2>

    <%--<%--%>
       <%--//for(int i=0;i<eventInfoArray.length;i++)--%>
       <%--{--%>
     <%--%>--%>
            <%--<tr>--%>
                <%--<td><%= eventInfoArray[0].getStreamName()%></td>--%>
                <%----%>
            <%--</tr>--%>
     <%--<%--%>
       <%--}--%>
    <%--%>--%>

</div>

