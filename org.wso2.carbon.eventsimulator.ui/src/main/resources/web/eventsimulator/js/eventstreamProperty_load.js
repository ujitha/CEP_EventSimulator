
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

                  tableRow1.innerHTML='<tr><td>Event Stream name</td><td>'+eventName+'</td></tr>';
                  tableRow2.innerHTML='<tr><td>Event Stream definition</td><td>'+eventDef+'</td></tr>';
                  tableRow3.innerHTML='<tr><td ><h4>Stream Attributes</h4> </td></tr>';

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
                          tableRow.innerHTML='<tr><td>'+stringNameTyp+'</td><td><input type="text" id="'+metaData[i].localAttributeName+'"> </td></tr>';

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
                          tableRow.innerHTML='<tr><td>'+stringNameTyp+'</td><td><input type="text" id="'+correlationData[j].localAttributeName+'"> </td></tr>';

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
                          tableRow.innerHTML='<tr><td>'+stringNameTyp+'</td><td><input type="text" id="'+payloadData[k].localAttributeName+'"> </td></tr>';

                      }
                  }
              }
        }


    });
}