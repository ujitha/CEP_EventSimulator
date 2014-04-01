
function showEventProperties()
{

    var eventStreamTable=document.getElementById("inputEventDetailTable");

    var selectedIndex=document.getElementById("EventStreamID").selectedIndex;
    var selected_name=document.getElementById("EventStreamID").options[selectedIndex].value;

    for (i = eventStreamTable.rows.length - 1; i > 0; i--) {
        eventStreamTable.deleteRow(i);
    }

    jQuery.ajax({

        type:"POST",
        url:"../eventsimulator/getProperties_ajaxprocessor.jsp?eventName="+selected_name+"",
        data:{},
        contentType:"application/json; charset=utf-8",
        dataType:"text",
        async:false,

        success:function(msg){


              if(msg!=null)
              {

                  var jsonObject=JSON.parse(msg);
                  var eventName=jsonObject.localStreamName;
                  var eventVersion=jsonObject.localStreamVersion;
                  var eventDef=jsonObject.localStreamDescription;
                  var metaData=new Array();
                  var correlationData=new Array();
                  var payloadData=new Array();

                  metaData=jsonObject.localMetaAttributes;
                  correlationData=jsonObject.localCorrelationAttributes;
                  payloadData=jsonObject.localPayloadAttributes;


                  var tableRow1=eventStreamTable.insertRow(eventStreamTable.rows.length);
                  var tableRow2=eventStreamTable.insertRow(eventStreamTable.rows.length);
                  var tableRow3=eventStreamTable.insertRow(eventStreamTable.rows.length);

                  tableRow1.innerHTML='<tr><td>Event Stream name</td><td id="eventName">'+eventName+":"+eventVersion+'</td></tr>';

                 // if(eventDef!=undefined)
                  {
                    tableRow2.innerHTML='<tr><td>Event Stream definition</td><td id="eventDef">'+eventDef+'</td></tr>';
                  }
//                  else{
//                      tableRow2.innerHTML='<tr><input type="hidden" value="null"> </tr>';
//                  }


                  tableRow3.innerHTML='<tr><td ><h4>Stream Attributes</h4> </td></tr>';

                 var index=0;
                  if(metaData[0]!=null)
                  {
                      var tableRow4=eventStreamTable.insertRow(eventStreamTable.rows.length);

                      tableRow4.innerHTML='<tr><h5>Meta Attributes</h5></tr>';
                  }

                  for(var i=0;i<metaData.length;i++)
                  {
                      if(metaData[i]!=null)
                      {
                          var tableRow=eventStreamTable.insertRow(eventStreamTable.rows.length);
                          var stringNameTyp=metaData[i].localAttributeName+" ("+metaData[i].localAttributeType+")";
                          tableRow.innerHTML='<tr><td>'+stringNameTyp+'</td><td><input type="text" name="'+metaData[i].localAttributeName+'" id="'+index+'" attributeType="'+metaData[i].localAttributeType+'"> </td></tr>';
                          index++;
                      }
                  }

                   if(correlationData[0]!=null)
                   {
                      var tableRow5=eventStreamTable.insertRow(eventStreamTable.rows.length);

                      tableRow5.innerHTML='<tr><h5>Correlation Attributes</h5></tr>';
                   }

                  for(var j=0;j<correlationData.length;j++)
                  {
                      if(correlationData[j]!=null)
                      {
                          var tableRow=eventStreamTable.insertRow(eventStreamTable.rows.length);
                          var stringNameTyp=correlationData[j].localAttributeName+" ("+correlationData[j].localAttributeType+")";
                          tableRow.innerHTML='<tr><td>'+stringNameTyp+'</td><td><input type="text" name="'+correlationData[j].localAttributeName+'" id="'+index+'" attributeType="'+correlationData[j].localAttributeType+'"> </td></tr>';
                           index++;
                      }
                  }

                  if(payloadData[0]!=null)
                  {
                      var tableRow6=eventStreamTable.insertRow(eventStreamTable.rows.length);

                      tableRow6.innerHTML='<tr><h5>Payload Attributes</h5></tr>';
                  }

                  for(var k=0;k<correlationData.length;k++)
                  {
                      if(payloadData[k]!=null)
                      {
                          var tableRow=eventStreamTable.insertRow(eventStreamTable.rows.length);
                          var stringNameTyp=payloadData[k].localAttributeName+" ("+payloadData[k].localAttributeType+")";
                          tableRow.innerHTML='<tr><td>'+stringNameTyp+'</td><td><input type="text" name="'+payloadData[k].localAttributeName+'" id="'+index+'" attributeType="'+payloadData[k].localAttributeType+'"> </td></tr>';
                            index++;
                      }
                  }

                var hiddenRow=eventStreamTable.insertRow(eventStreamTable.rows.length);
                  hiddenRow.innerHTML='<tr><td><input type="hidden" id="formFields" value="'+index+'"> </td></tr>'
              }
        }


    });
}

function sendEvent(form)
{
    var eventStreamName=document.getElementById("eventName").textContent;
    var eventDef=document.getElementById("eventDef").textContent;

    var index=document.getElementById("formFields").value;

//    var EventStream="{\""+eventStreamName+"\":[{";
//
//    var attributes="";
//    for(var i=0;i<index;i++)
//    {
//        var fieldInput=document.getElementById(i);
//        attributes=attributes+"\""+fieldInput.name+"\":"+"\""+fieldInput.value+"\",";
//    }
//
//    EventStream=EventStream+attributes+"}]}"
//
//    alert((EventStream));


   // var eventstream="{\"EventStreamName\":\""+eventStreamName+"\",";

    var jsonString="{\"EventStreamName\":\""+eventStreamName+"\",\"attributes\":[";
    var jsonAttribute="";

   // var attributes="";
    for(var i=0;i<index;i++)
    {
        if(i!=index-1)
        {
            var fieldInput=document.getElementById(i);

           // attributes=attributes+"\""+fieldInput.name+"\":"+"\""+fieldInput.value+"\",";
            jsonAttribute=jsonAttribute+"{\"name\":\""+fieldInput.name+"\",\"value\":\""+fieldInput.value+"\",\"type\":\""+fieldInput.getAttribute("attributeType")+"\"},";
        }
        else{
            var fieldInput=document.getElementById(i);
            //attributes=attributes+"\""+fieldInput.name+"\":"+"\""+fieldInput.value+"\"";
            jsonAttribute=jsonAttribute+"{\"name\":\""+fieldInput.name+"\",\"value\":\""+fieldInput.value+"\",\"type\":\""+fieldInput.getAttribute("attributeType")+"\"}";
        }
    }

    //eventstream=eventstream+attributes+"}"
    jsonString=jsonString+jsonAttribute+"]}"

   // alert((eventstream));

    $.ajax({
        type:"POST",
        url:"../eventsimulator/sendEventstreams_ajaxprocessor.jsp?jsonData="+jsonString+"",
        parameters:{jsonData:jsonString},
        contentType:"application/json; charset=utf-8",
        dataType:'json',
        async:false,

        success:function(msg){

        }

    });


}

function uploadCSV()
{

}