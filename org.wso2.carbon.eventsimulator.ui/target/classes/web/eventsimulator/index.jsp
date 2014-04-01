<%@ page import="org.apache.axis2.context.ConfigurationContext" %>
<%@ page import="org.wso2.carbon.CarbonConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIUtil" %>
<%@ page import="org.wso2.carbon.utils.ServerConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIMessage" %>
<%@ page import="org.wso2.carbon.eventsimulator.ui.EventSimulatorUIUtils" %>
<%@ page import="org.wso2.carbon.eventsimulator.stub.EventSimulatorAdminServiceStub" %>
<%@ page import="org.wso2.carbon.eventsimulator.admin.EventStreamInfoDto" %>

<script type="text/javascript"
        src="../eventsimulator/js/eventstreamProperty_load.js"></script>

<%
   EventSimulatorAdminServiceStub stub =EventSimulatorUIUtils.getEventSimulatorAdminService(config,session,request);

   org.wso2.carbon.eventsimulator.stub.types.EventStreamInfoDto[] eventInfoArray=stub.getAllEventStreamInfoDto();

%>

<div id="middle">
    <div id="workArea">
    <h2>Event Stream Simulator</h2>
        <br>
    <form name="eventStreams"  id="eventStreams" method="post" >
        <table id="eventStreamtable" class="styledLeft" style="width:100%">
            <thead >
                <tr>
                    <th>Event Stream details</th>

                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="formRow">
                        <table id="inputEventDetailTable" class="normal-nopadding" style="width:100%">
                            <tbody>
                            <tr>
                                <td class="left-Col-med">Select the Event Stream</td>
                                <td>
                                        <select name="EventStreamID" id="EventStreamID" onchange="showEventProperties()">

                                            <%
                                                if(eventInfoArray==null)
                                                {
                                                    %>

                                                    <option value="No Event Stream Definitions" >No Event Stream Definitions</option>
                                            <%
                                            }
                                            else{

                                                    for(int i=0;i<eventInfoArray.length;i++)
                                                    {
                                            %>
                                                    <option value="<%=eventInfoArray[i].getStreamName()%>" ><%=eventInfoArray[i].getStreamName()%>:<%=eventInfoArray[i].getStreamVersion()%></option>


                                            <%
                                                    }
                                                }
                                            %>
                                        </select>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </td>


                </tr>
                <tr>
                    <td class="buttonRow">
                        <input type="button" value="Send" onclick="sendEvent(document.getElementById('eventStreams'))">
                        <input type="button" value="Export" onclick="uploadCSV()">
                    </td>

                </tr>

            </tbody>
        </table>
    </form>

</div>

</div>