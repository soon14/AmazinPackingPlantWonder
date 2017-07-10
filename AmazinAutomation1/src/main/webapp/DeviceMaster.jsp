<%@page import="com.amz.gen.AmazinUrl"%>
<% AmazinUrl amazinUrl= new AmazinUrl();%>

    
 <% 
System.out.println(AmazinUrl.usertype);
 if(AmazinUrl.usertype.equals("superadmin"))
 		{ %>  
 		
    <%@include  file="superAdminNavigation.jsp" %>
    <div class="right_col" role="main">
            <div class="">

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">

                            <div class="x_title">
                                <div class="col-lg-6">
                                    <h4>Device Master</h4>
                                </div>
                                <!--<div class="col-lg-6">
                                    <input type="button" class="btn btn-primary pull-right" value="Add">
                                </div>-->
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">

                               
                               
                                 <div class="x_panel">
                            <div class="x_title">
                                <h2>Add a New Device</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                               </ul>
                                <div class="clearfix"></div>
                            </div>
                            		
                            		
                            		<div class="x_content" style="display: block;">
                               			  <div class="form-group" id="addDeviceType">
                                                    <div class="row">
                                                        <div class="col-sm-2"><label class="control-label"> Device Type </label></div>
                                                        <div class="col-sm-2"><label class="control-label ">Vendor </label></div>'

                                                    </div>
                                                    <div class="row">

                                                        <div class="col-sm-2"><input type="text" id="DeviceType" class="form-control" placeholder="Device Type"></div>
                                                        <div class="col-sm-2"><input type="text" id ="Vendor" class="form-control"  placeholder="Vendor"name="VehcileNumber"></div>

                                                        <div class="col-sm-2 ">
                                                            <button class="btn btn-success" value="" onclick="addDevice()"><span class="glyphicon glyphicon-plus"></span> Add  Device Type </button>
                                                        </div>
                                                    </div>
                                                </div>
                                       
                                        </div>
                                        <br>
                                        <br>
                                    </div>

                                 <div class="x_panel">
                            <div class="x_title">
                                <h2>Assign Devices to Plant</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                               </ul>
                                <div class="clearfix"></div>
                            </div>
                            		
                            		
                            		<div class="x_content" style="display: block;">
                               			  <div class="form-group" id="addDeviceTypeqty">
                                                    
                                                    <div class="row">

                                                        <div class="col-sm-3"><select id="plantList" class="form-control" onchange="getdevices()" >
                                                        <option> Select Plant </option>
                                                        </select></div>
                                                        <div class="col-sm-3"><select id="deviceList" style="display:none;"class="form-control" id="deviceList" >
                                                        <option> Select Device Type </option></select></div>
                                                        <div class="col-sm-3"><button id="assignDevice" style="display:none;" onclick="assignDevice()"class="btn btn-success" > Assign Device
                                                     </button></div>

                                                        
                                                    </div>
                                                </div>
                                                <hr>
                                                <div class="x_title"> Assigned Devices</div>
                                       <div class="panel-group" id="accordion" role="tablist"
                                                     aria-multiselectable="true">
                                                </div>
                                        </div>
                                        <br>
                                        <br>
                                    </div>



                               
                                </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
   
        
        <script>
        
        $(document).ready(function () 
       {
        	
        	
        	getPlantList();
        
        	
        	
        	
       });
        function getdevices()
        {
        	GetAllDeviceTypeMaster($("#plantList").val());
        	$("#deviceList").show();
        	$("#assignDevice").show();
        	var jsonObject= new Object();
        	jsonObject=
        	{};
        	var result="<option> Select device </option>";
        	var url= "<%=amazinUrl.getAllDeviceList%>";
            $.ajax({
                            type: "POST",
                            url:url,
                            data:''+jsonObject,
                            contentType: "application/json",
                            success: function(data)
                            {
                            	deviceList=data;
                            	var json =data;
                            	
                            	if(json.length>0)
                            			{
			                            		for(var i=0;i<json.length;i++)
			                       				{
			                            			result+="<option value='"+json[i].id+"'>"+ json[i].deviceType+ "</option>";
			                            		}
			                       				$("#deviceList").html(result);
                            			}
                            }});
        	
        }
        
        function getPlantList()
        {
        	var jsonObject= new Object();
        	jsonObject={};
        	var result="<option> Select Plant </option>";
        	var url= "<%=amazinUrl.getPlantList%>";
            $.ajax({
                            type: "POST",
                            url:url,
                            data:''+jsonObject,
                            contentType: "application/json",
                            success: function(data)
                            {
                            	var json =data;
                            	if(json.data.length>0)
                       			{
                            		for(var i=0;i<json.data.length;i++)
                       				{
                            			result+="<option value='"+json.data[i].id+"'>"+ json.data[i].plant_name+ "</option>";
                            		}
                       				$("#plantList").html(result);
                       			}
                       			else
                   				{
                   					alert("No Data Exist");
                   				}
                          			
                            		
                            }
            });
        	
        	
        }
        function GetAllDeviceTypeMaster(id) 
        {    
        	$("#accordion").html("");
        	var jsonObject= new Object();
        	jsonObject=
        	{};
        	var url= "<%=amazinUrl.getAllDeviceList%>";
            $.ajax({
                            type: "POST",
                            url:url,
                            data:''+jsonObject,
                            contentType: "application/json",
                            success: function(data)
                            {
                            	var json =data;
                            	if(json.length>0)
                            			{
                            				for(var i=0;i<json.length;i++)
                           					{
                            					if(json[i].deviceTypeQtyList.length>0)
                            					{
                            						for(var j=0;j<json[i].deviceTypeQtyList.length;j++)
                            						{
                            							if(json[i].deviceTypeQtyList[j].plant_id==id)
                            							{
                            								addDeviceQuantity("accordion",json[i].id,json[i].deviceType,json[i].vendor,json[j].deviceTypeQtyList[0].total_qty);
                           								}
                        							}
                           						}
                            				
                            				}
                            			}
                            			else
                          				{
                          					alert("No Data Exist");
                          				}
                          			
                            		
                            }
            });
           
           
        }
        
        
        function addDevice()
        {
        	
     
        	
        	var url= "<%=amazinUrl.addDeviceType%>";
            var deviceTypeName = $('#DeviceType').val();
        	var vendorName = $('#Vendor').val();
        	var jsonObject= new Object();
        	jsonObject=
        	{
        			"deviceType":""+deviceTypeName,
        			"vendor":""+vendorName
        			
        	};
        	$.ajax({
                 type: "POST",
                 url:url,
                 data:JSON.stringify(jsonObject),
                 contentType: "application/json",
                 success: function(data)
                 {
                			
                 }
        	
        	});
        }
        
        
        
        function addDeviceQuantity(id,deviceId,deviceType,vendor,qty)
   		 {
   	 
				var deviceQty='<div class="panel panel-info "> <div class="panel-heading">'+deviceType+'</div><div class="panel-body"> <div class="form-group"><div class="form-group">'
		                          +'<label class="control-label col-md-3 col-sm-3 col-xs-12">Device Quantity <span class="required">*</span>'
		                         +'</label>'
		                         +'<div class="col-md-3 col-sm-6 col-xs-12">'
		                         +'<input type="text" id="deviceqty'+deviceId+'" readonly="" name="last-name"  value="'+qty+'"required="required" class="form-control col-md-7 col-xs-12">'
		                         +'</div>'
		   						 +'<div class="col-md-3">'
		   						 +'<button class="btn btn-danger btn-md" id="edit'+deviceId+'"onclick="editDevice('+deviceId+')"> Edit</button>'
		   						+'<button class="btn btn-primary btn-md" id="update'+deviceId+'" onclick="updateDeviceQty('+deviceId+')" style="display:none;"> Update</button>'
		   						 +'</div>'
		   						 +'</div></div></div><br>'
		   			
		   		$("#"+id).append(deviceQty);
   		}
        function editDevice(id)
        {
        	$("#update"+id).show();
        	$("#edit"+id).hide();
        	console.log("deviceqty"+id);
        //	document.getElementById("deviceqty"+id).readonly=false;
        	$("#deviceqty"+id).prop('readonly', false);
        }
        
        
        function addDeviceQty(deviceId)
        {
        	
        	
        	var url= "<%=amazinUrl.addDeviceTypeQty%>";
            var qty = $('#deviceqty'+deviceId).val();
        	var vendorName = $('#Vendor').val();
        	var jsonObject= new Object();
        	jsonObject=
        	{
        			"device_type_master_id":""+deviceId,
        			"total_qty":""+qty,
        			"plant_id":""+$("#plantList").val()
        			
        	};
        	$.ajax({
                 type: "POST",
                 url:url,
                 data:JSON.stringify(jsonObject),
                 contentType: "application/json",
                 success: function(data)
                 {
                 	var json =data;
                 	if(json.status=="success")
                 	{
                 		$("#addDeviceType").show();	
                 		location.reload();
                 	
                 	}	
                 }
        	 
			 });
        	
        
        }
        
        function updateDeviceQty(deviceId)
        {
        	
        	
        	var url= "<%=amazinUrl.updateDeviceTypeQty%>";
            var qty = $('#deviceqty'+deviceId).val();
        	var jsonObject= new Object();
        	jsonObject=
        	{
        			"device_type_master_id":""+deviceId,
        			"total_qty":""+qty,
        			"installed_qty":"0"
        			
        	};
        	$.ajax({
                 type: "POST",
                 url:url,
                 data:JSON.stringify(jsonObject),
                 contentType: "application/json",
                 success: function(data)
                 {
                 	var json =JSON.parse(data);
                 	if(json.status=="success")
                 	{
                 			if(json.data.length>0)
                 			{

                				 $('#deviceqty'+deviceId).val(""+qty);
                				 $("#edit"+deviceId).show();
                				 $("#update"+deviceId).hide();
                				 $("#deviceqty"+id).prop('readonly', true);
                 				
                 			}
                 			else
               				{
               					alert("No Data Exist");
               				}
               			
                 	}	
                 }
        	 
			 });
        	
        
        }

   		function adddeviceDetail(id)
   		{
   			var items = ' <div class="row">'
   							+'  <div class="col-sm-2"><label class="control-label">'
   							+'  Stage</span>'
   							+' </label></div>'
   							+'  <div class="col-sm-2"><label class="control-label ">IP'

   							+'   </label></div>'
   							+'  <div class="col-sm-2"><label class="control-label ">Post'

   							+'   </label></div>'
   							+'  <div class="col-sm-2"><label class="control-label ">Name'

   							+'   </label></div>'
   							+'  <div class="col-sm-2"><label class="control-label ">Connection Type'

   							+'   </label></div>'
   							+'  </div>'
   							+'  <div class="row">'
   							+'  <div class="col-sm-2"><select class="form-control">'
   							+' <option>Choose option</option>'
   							+' <option>Option one</option>'
   							+'  <option>Option two</option>'
   							+'  <option>Option three</option>'
   							+'  <option>Option four</option>'
   							+' </select></div>'
   							+'  <div class="col-sm-2"><input type="text" class="form-control "></div>'
   							+'  <div class="col-sm-2"><input type="text" class="form-control" id ="addf" name="VehcileNumber"></div>'
   							+'  <div class="col-sm-2"><input type="text" class="form-control "></div>'
   							+'  <div class="col-sm-2"><select class="form-control">'
   							+' <option>Choose option</option>'
   							+' <option>Option one</option>'
   							+'  <option>Option two</option>'
   							+'  <option>Option three</option>'
   							+'  <option>Option four</option>'
   							+' </select></div>'
   							+'  <div class="col-sm-2 ">'
   							+'  <button class="btn btn-primary" type="button" id="addadr">Add</button>'
   							+'  </div>'
   							+'  </div>'
   							+'  </div>';

   	 
   						$("#"+id).append(items);
   	 
   		}
   	                
   		function assignDevice()
   		{
   			var value=$('#deviceList option:selected').html()
   			var deviceQty='<div class="panel panel-info "> <div class="panel-heading">'+value+'</div><div class="panel-body"> <div class="form-group"><div class="form-group">'
              +'<label class="control-label col-md-3 col-sm-3 col-xs-12">Device Quantity <span class="required">*</span>'
             +'</label>'
             +'<div class="col-md-3 col-sm-6 col-xs-12">'
             +'<input type="text" id="deviceqty'+$("#deviceList").val()+'" name="last-name"  required="required" class="form-control col-md-7 col-xs-12">'
             +'</div>'
				 +'<div class="col-md-3">'
				 +'<button class="btn btn-success" onclick="addDeviceQty('+$("#deviceList").val()+')"> ADD</button>'
				 +'</div>'
				 +'</div></div></div><br>'

				$("#accordion").append(deviceQty);
   		}
   		
            
        </script>
<%}else{%> 
<%@include  file="plantadminnavigation.jsp" %>
<div class="right_col" role="main">
          
   <div class="clearfix"></div>
       <div class="row">
       <div class="col-md-12 col-sm-12 col-xs-12">
       <div class="x_panel">
        <div class="x_title">
        	<div class="col-lg-6">
             <h4>configure Devices</h4>
            </div>
            
            
            <div class="clearfix"></div>
        </div>
        <div class="x_content">
			  <div  id="mainpanel"></div>
		
                                        
<script>
var counter=0;
$(document).ready(function () 
	       {
	        	
	        	ClientGetAllDeviceTypeMaster();
	        	
	       });
	       
	       
function ClientGetAllDeviceTypeMaster() 
{    
	var jsonObject= new Object();
	jsonObject=
	{};
	var url= "<%=amazinUrl.getAllDeviceList%>";
    $.ajax({
                    type: "POST",
                    url:url,
                    data:''+jsonObject,
                    contentType: "application/json",
                    success: function(data)
                    {
                    	var json =data;
                    	if(json.length>0)
                    			{
                    				for(var i=0;i<json.length;i++)
                   					{
                    					addDeviceQuantity(json[i].id,json[i].deviceType);
                    					var qty= json[i].deviceTypeQtyList[0].total_qty-json[i].deviceTypeQtyList[0].installed_qty
                    					for(var j=0;j<json[i].deviceTypeQtyList[0].installed_qty;j++)
                    						{
                    								showinstalledDeviceDetail(json[i].id);
                    								$("#qtyid"+counter+json[i].id).val(json[i].deviceTypeQtyList[0].id);
                    								$("#id"+counter+json[i].id).val(json[i].deviceTypeQtyList[0].deviceMasterList[j].id);
                    								$("#ipaddress"+counter+json[i].id).val(json[i].deviceTypeQtyList[0].deviceMasterList[j].ipAddress);
                    								$("#ipaddress"+counter+json[i].id).prop('readonly', true);
                    								
                    								$("#port"+counter+json[i].id).val(json[i].deviceTypeQtyList[0].deviceMasterList[j].portNumber);
                    								$("#port"+counter+json[i].id).prop('readonly', true);
                    								
                    								$("#name"+counter+json[i].id).val(json[i].deviceTypeQtyList[0].deviceMasterList[j].deviceName);
                    								$("#name"+counter+json[i].id).prop('readonly', true);
                    								
                    								$("#stage"+counter+json[i].id).val(json[i].deviceTypeQtyList[0].deviceMasterList[j].stageId)
                    								$("#stage"+counter+json[i].id).attr('disabled', 'disabled');
                    								$("#connectionType"+counter+json[i].id).val(json[i].deviceTypeQtyList[0].deviceMasterList[j].connectionType)
                    								$("#connectionType"+counter+json[i].id).attr('disabled', 'disabled');
                    						}
                    					for(var j=0;j<qty;j++)
                						{
                    						showDeviceDetail(json[i].id,json[i].deviceTypeQtyList[0].id);
                						}
                   					}
                    				
                    			}
                    			else
                  				{
                  					alert("No Data Exist");
                  				}
                  			
                    		
                    }
    });
}

function enable(id)
{
	$("#ipaddress"+id).prop('readonly', false);
	$("#port"+id).prop('readonly', false);
	$("#stage"+id).attr('disabled', false);
	$("#connectionType"+id).attr('disabled', false);
	$("#name"+id).prop('readonly', false);
	$("#update"+id).show();
	$("#"+id).hide();
}

		function addDeviceQuantity(deviceId,deviceType)
			 {
		
				var deviceQty='<div class="panel panel-success "> <div class="panel-heading">'+deviceType+'</div><div class="panel-body "id="panelbody'+deviceId+'" style="padding-left:20px;">'+
		                         '</div></div><br>';
		  			
		  		$("#mainpanel").append(deviceQty);
			}

function showDeviceDetail(id,qtyid)
	{
	++counter;
	
	
	var items = ' <div class="row">'
			+'  <div class="row">'
			+'  <div class="col-sm-2"><div class="col-sm-2"><input type="text" placeholder="IP Address" id="id'+counter+id+'" class="form-control" style="display:none;"></div><select class="form-control" id="stage'+counter+id+'">'
			+' <option>Choose Stage</option>'
			+' <option value="7">Packing out</option>'
				+'  <option value="6">Packing in</option>'
			+' </select></div>'
			+'  <div class="col-sm-2"><input type="text" placeholder="IP Address" id="ipaddress'+counter+id+'" class="form-control "></div>'
			+'  <div class="col-sm-1"><input type="text" placeholder="Port" id="port'+counter+id+'"class="form-control" ></div>'
			+'  <div class="col-sm-2"><input type="text" placeholder="Device Name" id="name'+counter+id+'"class="form-control "></div>'
			+'  <div class="col-sm-3"><select class="form-control" id="connectionType'+counter+id+'">'
			+' <option>Choose Connection</option>'
			+' <option value="Client">Client</option>'
			+'  <option value="server">Server</option>'
			+' </select></div>'
			+'  <div class="col-sm-2 ">'
			+'  <button class="btn btn-primary" onclick ="install(this.id,'+qtyid+')"type="button" id="'+counter+id+'">Install</button>'
			+'  </div>'
			+'  </div>'
			+'  </div>';

					$("#panelbody"+id).append(items);

	}
               
function showinstalledDeviceDetail(id)
{
++counter;

var items = ' <div class="row">'
	+'  <div class="row">'
	+'  <div class="col-sm-2"><div class="col-sm-2"><input type="text" placeholder="" id="qtyid'+counter+id+'" class="form-control" style="display:none;"></div><div class="col-sm-2"><input type="text" placeholder="" id="id'+counter+id+'" class="form-control" style="display:none;"></div><select class="form-control" id="stage'+counter+id+'">'
	+' <option>Choose Stage</option>'
	+' <option value="7">Packing out</option>'
		+'  <option value="6">Packing in</option>'
	+' </select></div>'
	+'  <div class="col-sm-2"><input type="text" placeholder="IP Address" id="ipaddress'+counter+id+'" class="form-control "></div>'
	+'  <div class="col-sm-1"><input type="text" placeholder="Port" id="port'+counter+id+'"class="form-control" ></div>'
	+'  <div class="col-sm-2"><input type="text" placeholder="Device Name" id="name'+counter+id+'"class="form-control "></div>'
	+'  <div class="col-sm-3"><select class="form-control" id="connectionType'+counter+id+'">'
	+' <option>Choose Connection</option>'
	+' <option value="Client">Client</option>'
	+'  <option value="server">Server</option>'
	+' </select></div>'
	+'  <div class="col-sm-2 ">'
	+'  <button class="btn btn-danger" type="button" id="'+counter+id+'" onclick="enable(this.id)" >Edit</button>'
	+'  <button class="btn btn-success" type="button" id="update'+counter+id+'" style="display:none;"onclick="update(this.id,'+counter+id+')" >Update</button>'
	
	+'  </div>'
	+'  </div>'
	+'  </div>';

			$("#panelbody"+id).append(items);

}

function update(buttonid,id)
{
	
var url= "<%=amazinUrl.updateDeviceMaster%>";
    
	var jsonObject= new Object();
	jsonObject=
	{
			
			"id":""+$("#id"+id).val(),
			"deviceTypeQtyId":""+$("#qtyid"+id).val(),
			"plantId":"3",
			"stageId":"6",
			"ipAddress":""+$("#ipaddress"+id).val(),
			"portNumber":""+$("#port"+id).val(),
			"deviceName":""+$("#name"+id).val(),
			"connectionType":""+$("#connectionType"+id).val()
			
			
	};
	$.ajax({
         type: "POST",
         url:url,
         data:JSON.stringify(jsonObject),
         contentType: "application/json",
         success: function(data)
         {
         	var json =data;
         	if(json.status=="success")
         	{
         			
         		location.reload();
         	
         	}	
         }
	 
	 });
	
}


function install(id,qtyid)

{
	 
	var url= "<%=amazinUrl.AddDeviceTypeMaster%>";
    
	var jsonObject= new Object();
	jsonObject=
	{
			"deviceTypeQtyId":""+qtyid,
			"plantId":"3",
			"stageId":"6",
			"ipAddress":""+$("#ipaddress"+id).val(),
			"portNumber":""+$("#port"+id).val(),
			"deviceName":""+$("#name"+id).val(),
			"connectionType":""+$("#connectionType"+id).val()
			
			
	};
	$.ajax({
         type: "POST",
         url:url,
         data:JSON.stringify(jsonObject),
         contentType: "application/json",
         success: function(data)
         {
         	var json =data;
         	if(json.status=="success")
         	{
         			
         		location.reload();
         	
         	}	
         }
	 
	 });
	
	
}
   
	       
</script>




<%}%>

<%@include  file="footer.jsp" %>