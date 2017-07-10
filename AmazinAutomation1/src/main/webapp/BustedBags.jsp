<%@page import="javax.tools.DocumentationTool.Location"%>
<%@page import="com.amz.gen.AmazinUrl"%>
<%@include file="plantadminnavigation.jsp" %>
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">

                            <div class="x_title">
                                <div class="col-lg-6">
                                    <h4>Busted Details</h4>
                                </div>
                                <!--<ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                                </ul>-->
                                <!--<div class="col-lg-6">
                                    <input type="button" class="btn btn-primary pull-right" value="Add">
                                </div>-->
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                

						<% 
						System.out.println(AmazinUrl.usertype);
						 if(AmazinUrl.usertype.equals("operator"))
						 		{ %>  
						 		
                                    <div class="form-group">
                                        
                                        <div class="row">
                                            <div class="col-sm-2"><select class="form-control" id="vehicleList" onchange="getdinumber()">
                                                <option value="">Select Vehicle Number</option>
                                                
                                            </select></div>
                                            <div class="col-sm-2"><select class="form-control" id="diNumberList">
                                                <option value="">Select DI Number</option>
                                                
                                            </select></div>
                                             <div class="col-sm-2"><select class="form-control" id="Loaderlist">
                                                <option value="">Select Loader </option>
                                                
                                            </select></div>

                                            <div class="col-sm-2"><input type="text" placeholder="No. Of Busted Bags"class="form-control"
                                                                         id="bustedBags"></div>
                                            

                                            <div class="col-sm-2"> <button class="btn-primary btn" onclick="submitBags()"> Submit</button>
                                                                         </div>
                                        </div>
                                        <br>
                                        <br>
                                    </div>
                                  
									<% 
						 		}else{
						 			
									%> 
						
									
										<div class="x_content output" >
                        </div>
                           <%} %>

                            </div>

                        </div>
                       
                    </div>
                </div>
            </div>
        </div>
        
        
 <div class="modal fade" id="SelectBagsDispatchType" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Select Dispatch Type</h4>
        </div>
        <div class="modal-body">
          <div class="radio">
			  <label><input type="radio" class="radio" value="counting"name="dispatch" onchange> Via Counting</label>
		 </div>
		<div class="radio">
		  <label><input type="radio" class="radio" value="stock"name="optradio" id ="reusable">From Reusable Bags</label>
		</div>
        </div>
        
      </div>
    </div>
  </div>
        
        
        
        
        alert($.session.get('username'));
    
        <%@include file="footer.jsp" %>
<script>
var butedbagid="";

var allTripInfo="";
var loaderDetails="";
    $(document).ready(function () 
    {
    	alert($.session.get('username'));
    	getLoader();
    	//varify();
    	var url= "<%=AmazinUrl.allTripinfo%>";
    	var result="<option> Select Vehicle Number</option>";
    	var jsonObject= new Object();
    	jsonObject=
    	{		
    	};
    	$.ajax({
             type: "POST",
             url:url,
             data:JSON.stringify(jsonObject),
             contentType: "application/json",
             success: function(data)
             {
             	var json =data;
             	if(json.length>0)
             	{
             			
             		for(var i=0;i<json.length;i++)
         			{	
         				result+="<option value='"+json[i].vehicle_number+"'>"+ json[i].vehicle_number+ "</option>";
         			}
             		$("#vehicleList").html(result);
             	}	
            
             }
    	 });
    	
    	
    
    });
    
    
    var toBeVarified="";
    var loaderList="";
    var productList="";
    var salesList="";

        $(document).ready(function () {
        	 $.ajax({
                 url:"<%=AmazinUrl.getProductLoaderSales%>",
                 data: JSON.stringify({}),
                 type: "POST",
                 contentType: "application/json",
                 success: function (data)
                 {
                	 loaderList=data.data.loaderList;
                	 productList=data.data.productMasterList;
                	 salesList=data.data.salesChannelList;
                	 getBagsData();
                 }});
        	
        	
        	
        });

       function getBagsData()
       {
    	   $(".output").html("");
    	  var url="";
    	  var jsonObject=new Object();
    	  jsonObject={};
    	  $.ajax({
              url:"<%=AmazinUrl.toBeVerifiedBags%>",
              data: JSON.stringify(jsonObject),
              type: "POST",
              contentType: "application/json",
              success: function (data)
              {
            	  toBeVarified=data;
            	  var json=data;
                  if(json.status="Done"&& json.data.length>0)
                  {	
                	  	for(var i=0;i<json.data.length;i++)
                	  	{
                	  		var item= '<div class="row "id="element" >'+
                            '<div class="col-sm-2"><label class="control-label">Loader Number</span></label><input type="text" class="form-control "id="loadernumber'+i+'" name="VehcileNumber" disabled></div>'+
                            '<div class="col-sm-1"><label class="control-label ">Pro. Code</label><input type="text" class="form-control"id="productCode'+i+'" disabled></div>'+
                            '<div class="col-sm-2"><label class="control-label">Sales Channel</label><input type="text" class="form-control"id="SalesChannel'+i+'" disabled></div>'+
                            '<div class="col-sm-2"><label class="control-label">Bust. Bags </label><input type="text" class="form-control"id="BustedBags'+i+'"disabled></div>'+
                            '<div class="col-sm-2"><label class="control-label">No. of Verified Bags </label><input type="text" class="form-control"id="VerifiedBags'+i+'" ></div>'+
                            '<div class="col-sm-2"><label class="control-label">Reusable Bags </label><input type="text" class="form-control"id="ReusableBags'+i+'"></div>'+
                            '<div class="col-sm-1"><br><button style="vertical-align:middle;" class="btn btn-success"id="submitBags'+i+'" onclick="submit('+i+')">Submit </button></div>'+
                      		'</div><br>';
                      		$(".output").append(item);
                      		for(var j=0;j<loaderList.length;j++)
                   			{
                      			if(loaderList[j].id==json.data[i].loader_master_id)
                      			{
                      				$("#loadernumber"+i).val(loaderList[j].loader_no);
                      				break;
                      			}
                      			
                   			}
                      		for(var j=0;j<productList.length;j++)
                   			{
                      			if(productList[j].id==json.data[i].product_id)
                      			{
                      				$("#productCode"+i).val(productList[j].product_code);
                      				break;
                      			}
                      			
                   			}
                      		for(var j=0;j<productList.length;j++)
                   			{
                      			if(salesList[j].id==json.data[i].sales_channel)
                      			{
                      				$("#SalesChannel"+i).val(salesList[j].sales_channel);
                      				break;
                      			}
                      			
                   			}                  	
                	  		$("#BustedBags"+i).val(json.data[i].busted_bags);
                	  	}
                  }
                  else
                  {
                	  $(".output").html("<h2> <b><i>No Data is Present</i></b> </h2>");
              	  }
          }
    	  });
    	  
    	  
    	  
       
       
       }
       function submit(id)
       {
    	   	var jsondata=toBeVarified;
    	   	var jsonObject= new Object();
    	   	jsonObject=jsondata.data[id];
    	   	delete jsonObject['id'];
    	   	jsonObject['verified_busted_bags'] = $("#VerifiedBags"+id).val();
    	   	jsonObject['total_reusable_bag'] = $("#ReusableBags"+id).val();
    	   	alert(JSON.stringify(jsonObject));
    		$.ajax({
    			   url:"<%=AmazinUrl.submitVerifiedBags%>",
    	             data: JSON.stringify(jsonObject),
    	             type: "POST",
    	             contentType: "application/json",
    	             success: function (data)
    	             {
    	            	 alert("submitted")
    	            	 getBagsData();
    	             }});  	
       }
       
    
    
    function varify()
    {
    	var url= "<%=AmazinUrl.allTripinfo%>";
    	var result="<option> Select Di Number</option>";
    	var jsonObject= new Object();
    	jsonObject=
    	{		
    	};
    	$.ajax({
             type: "POST",
             url:url,
             data:JSON.stringify(jsonObject),
             contentType: "application/json",
             success: function(data)
             {
             	var json =data;
             	if(json.length>0)
             	{
             		for(var i=0;i<json.length;i++)
             		{
             			
             			for(var j=0;j<json[i].diMaster.length;j++)
             			{
			             	
             				if(json[i].diMaster[j].bustedDetail.length>0)
             					{
             							if(json[i].diMaster[j].bustedDetail[0].isActive=="A"){
		             					var row= '<div class="row">'+
					                   '<div class="col-sm-2"><label>Vehicle Number </label><input type="text" placeholder=""class="form-control"id="vehicleNumber'+json[i].diMaster[j].id+'" disabled></div>'+
					                   '<div class="col-md-2 col-sm-3"><label>No.of Busted Bags </label><input type="text" placeholder=""class="form-control"id="bustedBags'+json[i].diMaster[j].id+'" disabled></div>'+
					                    '<div class="col-sm-2"><label>Varified Bags </label><input type="text" placeholder="Varified Bags" value="0"onchange="calculate('+json[i].diMaster[j].id+')"class="form-control"id="varifiedBags'+json[i].diMaster[j].id+'"></div>'+
					                    '<div class="col-sm-2"><label>Reuseable bags </label><input type="text" placeholder="Reusable Bags"  value="0" class="form-control"id="reusable'+json[i].diMaster[j].id+'"></div>'+
										' <div class="col-sm-2"><br> <button class="btn-success btn btn-sm pull-left" style="vertically-allign:middle;" onclick="submitvarifyBags('+json[i].diMaster[j].id+')"><img src="resources/images/tick.png" style="width :15%;height:auto;white-space:nowrap;display:inline;"> Approve</button>'+
		                                 '</div></div>	';
		                                 $("#append").append(row);
             					
             				console.log(json[i].diMaster[j].bustedDetail[0].bustedBag);
             				
             					$("#vehicleNumber"+json[i].diMaster[j].id).val(json[i].vehicle_number);
             					$("#bustedBags"+json[i].diMaster[j].id).val(json[i].diMaster[j].bustedDetail[0].bustedBag);
             					}}
             			}}
             }}
    	});
    }
function getdinumber()
{
	var url= "<%=AmazinUrl.allTripinfo%>";
	var result="<option> Select Di Number</option>";
	var jsonObject= new Object();
	jsonObject=
	{		
	};
	$.ajax({
         type: "POST",
         url:url,
         data:JSON.stringify(jsonObject),
         contentType: "application/json",
         success: function(data)
         {
        	allTripInfo=data;
         	var json =data;
         	if(json.length>0)
         	{
         		for(var i=0;i<json.length;i++)
 				{	
 					if(json[i].vehicle_number==$("#vehicleList").val())
 					{
	 					if(json[i].diMaster.length>0)
	 					{
		 					for(var j=0;j<json[i].diMaster.length;j++)
		 					{
		 						
		 						if(json[i].diMaster[j].bustedDetail.length<1)
		 						{
		 							result+="<option value='"+json[i].diMaster[j].id+"'>"+ json[i].diMaster[j].di_number+ "</option>";
		 						}
		 					}
	 					}
 					}
				}
         		$("#diNumberList").html(result);
         	}	
         }
	 
	 });
	
}

function getLoader()
{
	
	
	
	var jsonObject= new Object();
	jsonObject=
	{};
	var result="<option> Select Loader Number</option>";
	$.ajax({
        type: "POST",
        url:"<%=AmazinUrl.getLoader%>",
        data:JSON.stringify(jsonObject),
        contentType: "application/json",
        success: function(data)
        {
        	loaderDetails=data;
        	var json=data;
        	var counter=0;
        	
        	if(json.data.length>0)
        	{
        		
        		$("#Loaderlist").html(" ");
        		for(var i=0;i<json.data.length;i++)
     			{	
     					
        			result+="<option value='"+json.data[i].id+"'>"+ json.data[i].loader_no+ "</option>";
        			}
        			$("#Loaderlist").html(result);
     			}
     			
     			

       		 }
        	
		 }
       );
	
	
	
	
	
	
}

function getReusableBags()
{
	


			var json=allTripInfo;
			var productId ="";
			var salesChannel="";
				if(json.length>0)
				{
					for(var i=0;i<json.length;i++)
					{	
						if(json[i].vehicle_number==$("#vehicleList").val())
						{
							if(json[i].diMaster.length>0)
							{					
								for( var j=0;j<=diMaster.length;j++)
								{
									if(json[i].diMaster[j].id==$("").val())
										{
											productId=json[i].diMaster[j].product_id;
											salesChannel=json[i].diMaster[j].sales_channel;
											
										}
								}
							}
						}
					}
				}
				
			
				var jsonObject= new Object();
				jsonObject=
				{		
						
						"loader_master_id":""+$("#Loaderlist").val()
						"product_master_id":""+productId,
						"sales_channel_master_id":""+salesChannel
				};
				$.ajax({
			         type: "POST",
			         url:"<%=AmazinUrl.getreusableBags%>",
			         data:JSON.stringify(jsonObject),
			         contentType: "application/json",
			         success: function(data)
			         {
			        	 $("#SelectBagsDispatchType").modal('toggle');
			        	 if(data.data.length>0)
			       		 {
			        		 butedbagid=data.data.id;
			       		 	if(data.data[0].reusable_bags>=$("#bustedBags"))
			       		 	{
			       		 		
			       		 	}
			       		 	else
			   		 		{
			   		 			$("#reusable").hide();
			   		 		}
			       		 	
			       		 }
			        	 else
			       		 {
			       		 	$("#reusable").hide();
			       		 }
			         }
			         		
			         	
				 
				 });
}





function submitBags()
{
	var url= "<%=AmazinUrl.submitBags%>";
	
	var jsonObject= new Object();
	jsonObject=
	{		
			"di_master_id":""+$("#diNumberList").val(),
			"bustedBag":""+$("#bustedBags").val(),
			"loader_master_id":""+$("#Loaderlist").val()
			
	};
	$.ajax({
         type: "POST",
         url:url,
         data:JSON.stringify(jsonObject),
         contentType: "application/json",
         success: function(data)
         {
        	 getdinumber();
        	 	$("#bustedBags").val();
         		alert("Data Submitted");
		 }
         		
         	
	 
	 });
}

function submitvarifyBags(id)
{
		var jsonobject= new Object();
		jsonobject={};
		var json="";
		var url= "<%=AmazinUrl.getsubmitActiveBags%>";
	$.ajax({
	        type: "POST",
	        url:url,
	        data:JSON.stringify(jsonobject),
	        contentType: "application/json",
	        success: function(data)
	        {
	       	 			json=data;
						for(var i=0;i<json.data.length;i++)
						{
								if(json.data[i].di_master_id==id)
								{
									jsonobject=
									{
											"id":""+json.data[i].id,
					                        "di_master_id":""+id,
					                        "bustedBag":""+json.data[i].bustedBag,
					                        "bustedBagTime":""+json.data[i].bustedBagTime,
					                        "isActive":"V",
					                        "reusable_bags":""+$("#reusable"+id).val(),
					                        "verifiedQty":""+$("#varifiedBags"+id).val()
									};
								}
						}
						
						alert(JSON.stringify(jsonobject));
						url= "<%=AmazinUrl.getBagsVarified%>";
						$.ajax({
					        type: "POST",
					        url:url,
					        data:JSON.stringify(jsonobject),
					        contentType: "application/json",
					        success: function(data)
					        {
					        	alert("varified")
					        	location.reload();
					        }});
	
	        }});
}



$(".radio").click(function(){

	var value=$("optradio").val()
	if(value=="counting")
	{
		//Call the Service
	}
	else
		{
			$.ajax({
	        type: "POST",
	        url:url,
	        data:JSON.stringify(jsonobject),
	        contentType: "application/json",
	        success: function(data)
	        {
	        	alert("varified")
	        	location.reload();
	        }});
		
		}

});



</script>
</body>
</html>