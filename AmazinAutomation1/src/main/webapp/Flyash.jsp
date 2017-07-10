<%@page import="com.amz.gen.AmazinUrl"%>
<%@include  file="plantadminnavigation.jsp" %>
        <!-- page content -->
        <div class="right_col" role="main">
           
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
	                            <div class="x_title">
	                                <h4>Enter The Flyash  % </h4>
	                                <ul class="nav navbar-right panel_toolbox">
	                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
	                                    </li>
	
	                                </ul>
	                                <div class="clearfix"></div>
	                            </div>
	                            <div class="x_content" style="display: block;">
	                                    <div class="form-group">
	                                        <div class="row">
	                                            <div class="col-sm-3"><label class="control-label"> Flyash Value</label><input type="text" class="form-control"id="flyashValue"></div>
	                                        	<div class="col-sm-3"><button class="btn-primary btn"onclick="AddFlyashValue()">Submit Value</button></div>
											</div>
	                                        
	                                      </div>
								</div>
                                        
                                 <div>
                                 <table class="table">
                                <tbody id="flashList">
                                </tbody>
                                 </table>
                                 </div>       
                          </div>
                     </div>
                   </div>
             
        </div>
        <%@include  file="footer.jsp" %>

<script>
var jsondata="";
function getFlyashValue()
{
	var counter =0;
var url= "<%=AmazinUrl.getFlyash%>";
	var rows="<tr><th>#</th><th>Value</th><th></th></tr>";
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
        	 jsondata=data;
         var json=data;
         if(json.data.length>0)
       	 {
        	 var temp=0;
	        for(var i=0;i<json.data.length;i++)
	      	 {
	        	++counter;
	      	 	if(json.data[i].isActive=="D")
	      	 		{
	      	 			rows+='<tr><td>'+counter+'</td> <td>'+json.data[i].value+'</td><td><button class="btn btn-info deactivated" disabled onclick="Activate('+json.data[i].id+')"> Activate</button></td></tr>'	;
	      	 		}
	      	 	else{
	      	 		temp++;
	      	 		rows+='<tr ><td>'+counter+'</td> <td>'+json.data[i].value+'</td><td><button class="btn btn-success "onclick="deactivate('+json.data[i].id+')" > Deactivate</button></td></tr>';
	      	 	}
	      	 }
	        $("#flashList").html(rows); 
	        if(temp<1)
	        	{
	        		
	        		$(".deactivated").prop('disabled', false);
	        	}
	      
	        }
		 }
         		
         	
	 
	 });
}

function deactivate(id)
{
	var json=jsondata;
	var jsonObject= new Object();
	var url="<%=AmazinUrl.submitFlyash%>";
	jsonObject={};
		for(var i=0;i<json.data.length;i++)
		{
			if(json.data[i].id==id)
				{
					jsonObject=
					{
						"id":""+id,
						"value":""+json.data[i].value,
						"isActive":"D"
					};
				}
		}
		$.ajax
		({
	         type: "POST",
	         url:url,
	         data:JSON.stringify(jsonObject),
	         contentType: "application/json",
	         success: function(data)
	         {	var counter =0;
	         var url= "<%=AmazinUrl.getFlyash%>";
	     	var rows="<tr><th>#</th><th>Value</th><th></th></tr>";
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
	             	 jsondata=data;
	              var json=data;
	              if(json.data.length>0)
	            	 {
	     	        for(var i=0;i<json.data.length;i++)
	     	      	 {
	     	        	++counter;
	     	      	 	if(json.data[i].isActive=="D")
	     	      	 		{
	     	      	 			rows+='<tr><td>'+counter+'</td> <td>'+json.data[i].value+'</td><td><button class="btn btn-info btn deactivated" disabled onclick="Activate('+json.data[i].id+')"> Activate It!</button></td></tr>'	;
	     	      	 		}
	     	      	 	else{
	     	      	 		rows+='<tr style="background-color:#c8e6c9 "><td>'+counter+'</td> <td>'+json.data[i].value+'</td><td><button class="btn btn-success btn"onclick="deactivate('+json.data[i].id+')" > Deactivate It! </button></td></tr>';
	     	      	 	}
	     	      	 }
	     	        $("#flashList").html(rows); 
	     	       $(".deactivated").prop('disabled', false);
	     	        }
	     		 }
	              		
	              	
	     	 
	     	 });
	        	
	         }
		});
		
		
		
		
}
function Activate(id)
{var json=jsondata;
	var jsonObject= new Object();
	var url="<%=AmazinUrl.submitFlyash%>";
	jsonObject={};
		for(var i=0;i<json.data.length;i++)
		{
			if(json.data[i].id==id)
				{
					jsonObject=
					{
						"id":""+id,
						"value":""+json.data[i].value,
						"isActive":"A"
					};
				}
		}
		$.ajax
		({
	         type: "POST",
	         url:url,
	         data:JSON.stringify(jsonObject),
	         contentType: "application/json",
	         success: function(data)
	         {	getFlyashValue();
	        	
	         }
		});
		
		
		
		
}
function AddFlyashValue()
{
	var jsonObject= new Object();
	var url="<%=AmazinUrl.submitFlyash%>";
	jsonObject={};
	jsonObject=
	{
		
		"value":""+$("#flyashValue").val(),
		"isActive":"A"
	};
	var rows="<tr><th>#</th><th>Value</th><th></th></tr>";
	var counter=0;
	$.ajax
		({
	         type: "POST",
	         url:url,
	         data:JSON.stringify(jsonObject),
	         contentType: "application/json",
	         success: function(data)
	         {
	        	 
	       		/* var json=data;
               if(json.data.length>0)
        	 {
 	        for(var i=0;i<json.data.length;i++)
 	      	 {
 	        	++counter;
 	        	if(json.data[i].isActive=="D")
      	 		{
      	 			rows+='<tr><td>'+counter+'</td> <td>'+json.data[i].value+'</td><td><button class="btn btn-info deactivated" disabled onclick="Activate('+json.data[i].id+')"> Activate</button></td></tr>'	;
      	 		}
      	 	else{
      	 		
      	 		rows+='<tr ><td>'+counter+'</td> <td>'+json.data[i].value+'</td><td><button class="btn btn-success "onclick="deactivate('+json.data[i].id+')" > Deactivate</button></td></tr>';
      	 	}
 	      	 }
 	        $("#flashList").html(rows); 
 	       $(".deactivated").prop('disabled', true);
 	        } */
	        	 getFlyashValue();
	        	
	         }
		});
		
		
		
		
}
    $(document).ready(function () {
    	getFlyashValue();
    });

    
</script>
</body>
</html>