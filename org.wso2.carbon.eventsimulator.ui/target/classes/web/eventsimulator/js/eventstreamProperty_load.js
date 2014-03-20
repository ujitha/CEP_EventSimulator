
function showEventProperties()
{

    var eventStreamTable=document.getElementById("inputEventDetailTable");

    var selectedIndex=document.getElementById("EventStreamID").selectedIndex;
    var selected_name=document.getElementById("EventStreamID").options[selectedIndex].value;

    for (i = eventStreamTable.rows.length - 1; i > 1; i--) {
        eventStreamTable.deleteRow(i);
    }

    jQuery.ajax({

        type:"POST",
        url:"../eventsimulator/getProperties_ajaxProcessor.jsp?eventName="+selected_name+"",
        data:{},
        contentType:"application/json; charset=utf-8",
        dataType:"text",
        async:false,

        success:function(msg){
              if(msg!=null)
              {
                  var jsonObject=JSON.parse(msg);
                  var eventName=jsonObject.getStreamName();
                  var eventDef=jsonObject.getStreamDefinition();
                    alert(msg);
                  var tableRow1=eventStreamTable.insertRow(eventStreamTable.rows.length);
                  var tableRow2=eventStreamTable.insertRow(eventStreamTable.rows.length);

                  tableRow1.innerHTML='<tr><td>Event Stream name</td><td>'+eventName+'</td></tr>';
                  tableRow2.innerHTML='<tr><td>Event Stream definition</td><td>'+eventDef+'</td></tr>';


              }
        }


    });
}