<%@ page import="org.wso2.carbon.event.simulator.stub.EventSimulatorAdminService" %>
<%@ page import="org.wso2.carbon.event.simulator.ui.EventSimulatorUIUtils" %>
<%@ page import="org.wso2.carbon.event.simulator.stub.EventSimulatorAdminServiceStub" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="org.wso2.carbon.event.simulator.stub.types.EventDto" %>
<%@ page import="org.wso2.carbon.event.simulator.stub.types.EventStreamAttributeValuesDto" %>
<%

    String msg = null;
    try {
        EventSimulatorAdminServiceStub stub = EventSimulatorUIUtils.getEventSimulatorAdminService(config, session, request);

        String jsonData = request.getParameter("jsonData");
        //System.out.println("JSON data: " + jsonData);

        JSONObject eventDetail = new JSONObject(jsonData);
        String eventName = eventDetail.getString("EventStreamName");

        JSONArray attributes = eventDetail.getJSONArray("attributes");

        //System.out.println("Array element 0, name: " + attributes.getJSONObject(0).getString("name"));
        //System.out.println("Array element 0, value: " + attributes.getJSONObject(0).getString("value"));

        EventDto event = new EventDto();
        EventStreamAttributeValuesDto[] attributesArray = new EventStreamAttributeValuesDto[attributes.length()];


        for (int i = 0; i < attributes.length(); i++) {
            //System.out.println("attribute :"+i+" :"+attributes.getJSONObject(i).getString("name")+" : "+attributes.getJSONObject(i).getString("value"));
            attributesArray[i] = new EventStreamAttributeValuesDto();
            attributesArray[i].setAttributeName(attributes.getJSONObject(i).getString("name"));
            attributesArray[i].setValue(attributes.getJSONObject(i).getString("value"));
            attributesArray[i].setType(attributes.getJSONObject(i).getString("type"));
            //System.out.println(attributesArray[i].getAttributeName()+" "+attributesArray[i].getValue());
        }


        event.setEventStreamName(eventName);

        event.setAttributes(attributesArray);

        stub.getEventDetails(event);

        msg = "Success";


    } catch (Exception e) {
        System.out.println("Error in sending event detail :" + e.getMessage());
        msg = e.getMessage();
    }

%>
<%=msg%>