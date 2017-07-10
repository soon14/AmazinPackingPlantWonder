<%@page import="com.amz.gen.AmazinUrl"%>
<%@include  file="superAdminNavigation.jsp" %>
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                      
                            <div class="x_content" style="display: block;">
                            	 <div class="x_panel">
                            <div class="x_title">
                                <h2>Stage Master</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>


                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content" style="display: block;">
                               

                                    <div class="form-group">
                                        
                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" placeholder="Stage  Name"class="form-control"
                                                                         id="stageName"></div>
                                            
											<div class="col-sm-4"><button class="btn btn-success" onclick="addStage()" >Add Loader</button></div>
                                        </div>
                                        <br>
                                        <br>
                                        
                                          <div id="StageList">
                                          
                                          </div>
                                        
                                    </div>

                               

                            </div>
                        </div>
                       
                             </div>
                		 </div>
                		</div>
                 </div>
               </div>
           <%@include  file="footer.jsp" %>

<script>
$(document).ready(function () {
	getStage();
	
		});
function getStage()
	{
		var jsonObject= new Object();
		jsonObject=
		{};
		$.ajax({
            type: "POST",
            async:false,
            url:"<%=AmazinUrl.getStageList%>",
            data:JSON.stringify(jsonObject),
            contentType: "application/json",
            success: function(data)
            {
            	
            	var json=data;
            	var counter=0;
            	
            	if(json.data.length>0)
            	{
            		
            		$("#StageList").html(" ");
            		for(var i=0;i<json.data.length;i++)
         			{	++counter;
         					var value='<div class="row" style="padding:5px;"> <div class="col-sm-2"> <input type="text" disabled class="form-control col-md-2" id="stage_name'+counter+'"value="'+json.data[i].stage_name+'"> </div><div class="col-sm-2"> <button class="btn btn-info"  id= "Edit'+counter+'" onclick="change('+counter+')">Edit</button> <button id="Update'+counter+'" class=" btn-success btn" style="display:none;" onclick="editStage('+json.data[i].id+','+counter+')"> Update </button></div<br><br>';
                    
            			$("#StageList").append(value);
         			}
         			
         			

           		 }
            	
			 }
            });
	}
function change(counter)
{	$("#Edit"+counter).hide();
	$("#Update"+counter).show();
	$("#stage_name"+counter).prop("disabled",false);

}
function addStage()
{
	
	var jsonObject= new Object();
	jsonObject=
	{
		"stage_name":""+$("#stageName").val(),
		
	};
	$.ajax({
        type: "POST",
        async:false,
        url:"<%=AmazinUrl.addStage%>",
        data:JSON.stringify(jsonObject),
        contentType: "application/json",
        success: function(data)
        {
        	getStage()
		 }});
}
function editStage(id,counter)
{
	
	var jsonObject= new Object();
	jsonObject=
	{
		"stage_name":""+$("#stage_name"+counter).val(),
		"id":""+id
		
	};
	$.ajax({
        type: "POST",
        url:"<%=AmazinUrl.updateStage%>",
        data:JSON.stringify(jsonObject),
        contentType: "application/json",
        success: function(data)
        {
        	
        	getStage();
        	
		 }});
	
	
	

}
</script>
</body>
</html>