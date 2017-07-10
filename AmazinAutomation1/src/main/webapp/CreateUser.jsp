<%@page import="com.amz.gen.AmazinUrl"%>
<%@include  file="plantadminnavigation.jsp" %>
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">

                <div class="clearfix"></div>

               
                        
                        <div id="design" style="text-align: center; vertical-align: middle;" class="login_wrapper ">
                         
                          <img src="<c:url value="/resources/images/amazin.png"/>">
                       	  
                          <select class="form-control "id="selectuser">  </select>
                       `` <input type="text" placeholder="Enter UserName" id="username" class="form-control col-md-4">
                         
                         <input type="text" placeholder="Password" id="password" class="form-control">
                         <input type="text" placeholder="Confirm Password " id="Cpassword" class="form-control"><br>
                         <button class="btn btn-lg btn-primary "  onclick="createUser()"> Create User</button>
                         <button class="btn btn-lg btn-danger "  onclick="reset()"> Reset</button>
                         
                        </div>
                        
                      
                   </div>
                </div>
           
        <%@include  file="footer.jsp" %>


<script>
function reset()
{
	$("#username").val("");
	$("#selectPlant").val("");
	$("#password").val("");
	$("#Cpassword").val("");
}
function createUser()
{
	var plant=$("#selectPlant").val();
	var user=$("#selectuser").val();
	var username=$("#username").val();
	var cpassword=$("#Cpassword").val();
	var password=$("#password").val();
	
	
	
		if($("#password").val()!=$("#Cpassword").val())
			{
				alert("Password Do not Match");
			}
		/* if(password==""||cpassword==""||username==""||user=""||plant=="")
			{
				alert("Fill all the Details first")
			} */
		else{
	 var JSONObj=new Object();
    
     JSONObj={
    		 
    			"username":""+$("#username").val(),
    			"userPassword":""+$("#password").val(),
    			"userRoleMasterId":""+$("#selectuser").val(),
    			"plant_id":""+$("#selectPlant").val()
    		 };
     
  		$.ajax({
  	  url:"<%=AmazinUrl.createUser%>",
  	  data: JSON.stringify(JSONObj),
        type: "POST",
        contentType: "application/json",
        success: function (data)
        {
        alert("user Cretaed");
        reset();
        }
  		});
			}
}

    $(document).ready(function () {
       var JSONObj=new Object();
      
       JSONObj={};
    	
    	var result1="<option value=''>Select the User Type   </option>"
    	
    	$.ajax({
      	  url:"<%=AmazinUrl.getUserRoles%>",
      	  data: JSON.stringify(JSONObj),
            type: "POST",
            contentType: "application/json",
            success: function (data)
            {var json=data;
          	  if(json.data.length>0)
          		{
          	  	for(var i=0;i<json.data.length;i++)	
          		{
          	  		if(json.data[i].username == "Plantadmin")
          	  			{}
          					else{result1+="<option value='"+json.data[i].id+"'>"+ json.data[i].username+ "</option>";}
          			
          		}
          	  		$("#selectuser").html(result1);
          	  	
          		}
          	  
          	  
            }
      	   
         });
    	
    });
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