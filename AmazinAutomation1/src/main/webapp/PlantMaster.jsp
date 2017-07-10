<%@page import="com.amz.gen.AmazinUrl"%>
<%@include  file="superAdminNavigation.jsp" %>
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h4>Plant Master</h4>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                                    </li>

                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content" style="display: block;">
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label">
                                                Plant Code</span>
                                            </label></div>
                                            
                                            <div class="col-sm-3"><label class="control-label">
                                                Plant Name
                                            </label></div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" class="form-control"
                                                                        id="plant_code"></div>
                                            
                                            <div class="col-sm-3"><input type="text" id="plant_name" class="form-control "></div>
                                            <div class="col-sm-3"><button class="btn-primary btn"onclick="addplant()">Add Plant</button>
                                                                         </div>
                                        </div>
                                        
                                        <br>
                                        <br>
                                      <div id="output">
                                      </div>

                        </div>
                        <div class="x_panel">
                            <div class="x_title">
                                <h4>Stage Master</h4>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                                    </li>
                                    </li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content" style="display: block;">
                                <form id="demo-form3" data-parsley-validate="" class="form-group form-label-left"
                                      novalidate="" data-toggle="validator" role="form">

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label">
                                                Stage Name</span>
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">Sequence Number

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">
                                                Status
                                            </label></div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" class="form-control"
                                                                         name="VehcileNumber"></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><select class="form-control">
                                                <option value="">Select Status</option>
                                                <option value="1">Active</option>
                                                <option value="2">Inactive</option>
                                            </select></div>
                                            <div class="col-sm-3"><input type="button" class="btn-primary btn"
                                                                         value="Add"></div>
                                        </div>
                                        <br>
                                        <br>
                                    </div>

                                </form>

                            </div>
                        </div>
                        <div class="x_panel">
                            <div class="x_title">
                                <h4>Shift Master</h4>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>

                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content" style="display: block;">
                                <form id="demo-form4" data-parsley-validate="" class="form-group form-label-left"
                                      novalidate="" data-toggle="validator" role="form">

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-2"><label class="control-label">
                                                Shift Type</span>
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">From Date

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">
                                                To Date
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">
                                                Is Active
                                            </label></div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-2"><input type="text" class="form-control"
                                                                         name="VehcileNumber"></div>

                                            <div class="col-sm-3 xdisplay_inputx form-group has-feedback">
                                                <input type="text" class="form-control has-feedback-left" id="single_cal3" placeholder="First Name" aria-describedby="inputSuccess2Status2">
                                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                                <span id="inputSuccess2Status2" class="sr-only">(success)</span>
                                            </div>
                                            <div class="col-sm-3 xdisplay_inputx form-group has-feedback">
                                                <input type="text" class="form-control has-feedback-left" id="single_cal4" placeholder="First Name" aria-describedby="inputSuccess2Status2">
                                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                                <span id="inputSuccess2Status3" class="sr-only">(success)</span>
                                            </div>
                                            <div class="col-sm-2"><select class="form-control">
                                                <option value="">Select Status</option>
                                                <option value="1">Active</option>
                                                <option value="2">Inactive</option>
                                            </select></div>
                                            <div class="col-sm-2"><input type="button" class="btn-primary btn"
                                                                         value="Add"></div>
                                        </div>
                                        <br>
                                        <br>
                                    </div>

                                </form>
                            </div>

                        </div>
                        <div class="x_panel">
                            <div class="x_title">
                                <h4>Production Master</h4>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>

                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content" style="display: block;">
                                <form id="demo-form5" data-parsley-validate="" class="form-group form-label-left"
                                      novalidate="" data-toggle="validator" role="form">

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label">
                                                Time Duration ID</span>
                                            </label></div>

                                            <div class="col-sm-3"><label class="control-label">
                                                Target Quantity
                                            </label></div>

                                        </div>
                                        <div class="row">
                                            <div class="col-sm-3"><select class="form-control">
                                                <option value="">Select Status</option>
                                                <option value="1">Active</option>
                                                <option value="2">Inactive</option>
                                            </select></div>
                                            <div class="col-sm-3"><input type="text" class="form-control"
                                                                         name="VehcileNumber"></div>




                                            <div class="col-sm-3"><input type="button" class="btn-primary btn"
                                                                         value="Add"></div>
                                        </div>
                                        <br>
                                        <br>
                                    </div>

                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include  file="footer.jsp" %>

<script>
    $(document).ready(function () {
    	getplants();
    });

    function getplants()
    { $("#output").html("");
    	$.ajax({
    		type: "POST",
            contentType: "application/json",
            url:"<%=AmazinUrl.getPlantWiseDeviceList%>",
    		data:JSON.stringify({}),
    		success: function(data)
    		{
    			var json =data;
    			
    			if(json.data.plantMaster.length>0)
    			{	
    					for( var i=0;i<json.data.plantMaster.length;i++)
   						{
    						var Tqty=0;
    						var counter=0;
    						var panel= '<div class="container">'+
    				         ' <div class="panel panel-info">'+
    				          '<div class="panel-heading"> Plant Name: - &nbsp;&nbsp;'+json.data.plantMaster[i].plant_name+'</div>'+
    				          '<div class="panel-body"> '+
    				          '<div class="row">'+
    				          '<h3 class="col-md-5"> Total Number of Devices :- <span class=".integers"><b id="tqty'+i+'"></b></span></h3>'+

    				          '</div>'+
    				          '<div class="row col-md-12 " id="row'+i+'">'+
    				                                          	
    				           '</div>'+
    				           '</div>'+
    				       '</div>'+
    				       '</div>';	
    				       
    				       $("#output").append(panel);
    				       
    				       if(json.data.deviceTypeMaster.length>0)
    		    			{
	    				       for(var j=0;j<json.data.deviceTypeMaster.length;j++)
    				    	   {
	    				    	   
    				    	   	
	    				    	   if(json.data.deviceTypeMaster[j].deviceTypeQtyList.length>0)
	       		    				{
	    				    		   for(var k=0;k<json.data.deviceTypeMaster[j].deviceTypeQtyList.length;k++)
	        				    	   {
	    				    		   		if(json.data.deviceTypeMaster[j].deviceTypeQtyList[k].plant_id==json.data.plantMaster[i].id)
	    				    		   			{++counter;
	    				    		   			 var row= '<div class="col-md-3"  style="padding:5px;">'+
	    				    	       					  '<h4><b>'+counter+'&nbsp;&nbsp;&nbsp;&nbsp;</b>'+json.data.deviceTypeMaster[j].deviceType+' :&nbsp;&nbsp;&nbsp;<span>'+json.data.deviceTypeMaster[j].deviceTypeQtyList[k].total_qty+'<span> </h4>'+
	    				    	       					  '</div>';
	    				    	       					Tqty=	parseFloat(Tqty) + parseFloat(json.data.deviceTypeMaster[j].deviceTypeQtyList[k].total_qty);  
	    				    	       				$("#row"+i).append(row);
	    				    		   			}
	    				    		   }
	       		    				}
	    				    	   
    				    	   }
    				       
    		    			}
    				       else
    				       {
    				    	   $("#output").html("ADD Devices First ");
    				       }
    				       
    				       $("#tqty"+i).html(Tqty);
    				       
   						}
    			}
    			else
    			{		
    					$("#output").html("No Plant Exixt");
    					
    			}
    			
    			$('span').counterUp({
    	    		
    	    		delay: 5, // the delay time in ms
    	    		
    	    		time: 1000// the speed time in ms
    	    		
    	    		});
    			
    		}
    	});
    

       
       
    	
    }
    function addplant()
	{
    	var jsonObject= new Object();
    	jsonObject={
    			"plant_name":$("#plant_name").val(),
    			"plant_code":$("#plant_code").val()
    	};
    	
    	$.ajax({
    		type: "POST",
            contentType: "application/json",
            url:"<%=AmazinUrl.addPlant%>",
    		data:JSON.stringify(jsonObject),
    		success: function(data)
    		{
    			alert("data");
    			getplants();
    		}}
    	);
	}
    
    /*
     $(document).ready(function() {
     $('#example').DataTable( {
     "scrollX": true,
     dom: 'Bfrtip',
     buttons: [
     {
     extend: 'print',
     exportOptions: {
     columns: ':visible'
     }
     },
     'colvis'
     ],
     columnDefs: [ {
     targets: -1,
     visible: false
     } ]
     } );
     } );
     */

</script>
</body>
</html>