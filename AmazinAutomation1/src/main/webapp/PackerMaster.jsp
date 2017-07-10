<%@page import="com.amz.gen.AmazinUrl"%>

<%@include  file="plantadminnavigation.jsp" %>


        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">

                        <div class="x_panel">
                            <div class="x_title">
                                <h2>Packer Master</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                               </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content" style="display: block;">
                               
                                    
                                    
                                        <div class="row">
                                        	<div class="form-group col-md-3">
                                        		<input type="text" id="packerName" class="form-control"  placeholder="Packer Name">
                                        	</div>
                                        	<div class="form-group col-md-3">
                                        		 <input type="text" placeholder="Target Capacity"id="targetCapacity" class="form-control">
                                        	</div>
                                        	<div class="form-group col-md-3" style="">
                                        	
                                                <input type="button" onclick="addPacker()"  class="btn-primary btn" value="Add">
                                        	
                                               <input type="button"onclick="getPacker()" class="btn-success btn" value="Show Packer  List">
                                        	</div>
                                        	
                                       </div>
                                        <table class="table" id="tablelist">
                                         <thead>
                                          <tr><th>#</th><th>Packer Name </th><th> Target Capacity</th></tr>
                                          </thead>
                                          <tbody id="tablelist">
                                          
                                          </tbody>
                                        </table>
                                        </div>
                                        <br>
                                        <br>
                                    </div>

                               

                            </div>
                        </div>
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>Loader Master</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>


                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content" style="display: block;">
                               

                                    <div class="form-group">
                                        
                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" placeholder="Loader Name"class="form-control"
                                                                         id="LoaderName"></div>
                                             <div class="col-sm-3"><input type="text" placeholder="Loader Code"class="form-control"
                                             id="LoaderCode"></div>
											<div class="col-sm-4"><button class="btn btn-success" onclick="createLoader()" >Add Loader</button>
											<button class="btn btn-success" onclick="getLoader()" >Show Loader List</button> </div>
                                        </div>
                                        <br>
                                        <br>
                                        
                                          <div id="Loaderlist">
                                          
                                          </div>
                                        
                                    </div>

                               

                            </div>
                        </div>
                      </div>
                </div>
            </div>
            
           
            
        </div>
        
      <div id="myModal" class="modal fade" role="dialog">
  				<div class="modal-dialog modal-sm">

        	
				        <div class="modal-content">
								      <div class="modal-header">
								        <button type="button" class="close" data-dismiss="modal">&times;</button>
								        <h4 class="modal-title">Update Packer</h4>
								      </div>
								      <div class="modal-body">
								      			<input type="text" id="modalpackerid" class="form-control"  style="display:none;">
                                        		<input type="text" id="modalpackerName" class="form-control"  placeholder="Packer Name">
                                        	<br>
                                        		 <input type="text" placeholder="Target Capacity"id="modaltargetCapacity" class="form-control">
                                        	<br>
                                        	<button class=" col-md-offset-8 btn-success"onclick="update()">Update</button>
                                        	<br>
								      </div>
				      <div class="modal-footer">
				       				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				      </div>
				    </div>

        	
        </div>
        </div>
        
        
             <div id="LoaderModal" class="modal fade" role="dialog">
  				<div class="modal-dialog modal-sm">

        	
				        <div class="modal-content">
								      <div class="modal-header">
								        <button type="button" class="close" data-dismiss="modal">&times;</button>
								        <h4 class="modal-title">Update Packer</h4>
								      </div>
								      <div class="modal-body">
								      			<input type="text" id="modalloaderId" class="form-control"  style="display:none;">
                                        		<input type="text" id="modalLoaderName" class="form-control"  placeholder="Loader Name">
                                        	
                                        	<br>
                                        	<button class=" col-md-offset-8 btn-success"onclick="updateloader()">Update</button>
                                        	<br>
								      </div>
				      <div class="modal-footer">
				       				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				      </div>
				    </div>

        	
        </div>
        </div>
        
        
<%@include  file="footer.jsp" %>
<script>
var loaderDetails="";
var PackerDetails="";
function update()
{
	
	var jsonObject= new Object();
	jsonObject=
	{
		"packer_no":""+$("#modalpackerName").val(),
		"target_capacity":$("#modaltargetCapacity").val(),
		"id":$("#modalpackerid").val(),
		"plant_master_id":"3"
	};
	$.ajax({
        type: "POST",
        url:"<%=AmazinUrl.updatepacker%>",
        data:JSON.stringify(jsonObject),
        contentType: "application/json",
        success: function(data)
        {
        	$('#myModal').modal('toggle');
        	getPacker();
        	
		 }});
	
	
}


function updateloader()
{
	
	var jsonObject= new Object();
	jsonObject=
	{
		"loader_no":""+$("#modalLoaderName").val(),
		"id":$("#modalloaderId").val()
		
	};
	$.ajax({
        type: "POST",
        url:"<%=AmazinUrl.updateLoader%>",
        data:JSON.stringify(jsonObject),
        contentType: "application/json",
        success: function(data)
        {
        	$('#LoaderModal').modal('toggle');
        	getLoader();
        	
		 }});
	
	
}


	function addPacker()
	{
		
		var jsonObject= new Object();
		jsonObject=
		{
			"packer_no":""+$("#packerName").val(),
			"target_capacity":$("#targetCapacity").val()
		};
		$.ajax({
            type: "POST",
            url:"<%=AmazinUrl.addPacker%>",
            data:JSON.stringify(jsonObject),
            contentType: "application/json",
            success: function(data)
            {
            	getPacker();
            	
			 }});
	}
	
	function createLoader()
	{
		
		var jsonObject= new Object();
		jsonObject=
		{
			"loader_no":""+$("#LoaderName").val(),
			"loader_code":""+$("#LoaderVode").val()
			
		};
		$.ajax({
            type: "POST",
            url:"<%=AmazinUrl.addLoader%>",
            data:JSON.stringify(jsonObject),
            contentType: "application/json",
            success: function(data)
            {
            	getLoader();
            	
			 }});
	}
	
	
	function getLoader()
	{
		var jsonObject= new Object();
		jsonObject=
		{};
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
         			{	++counter;
         					var value='<div class="row" style="padding:5px;"> <div class="col-sm-2"><input type="text" disabled class="form-control" id="loader'+counter+'" value="'+json.data[i].loader_no+'"></div><div class="col-sm-2"> <input type="text" disabled class="form-control col-md-2" id="loaderCode'+counter+'"value="'+json.data[i].loader_code+'"> </div><div class="col-sm-2"> <button class="btn btn-info"  id= "Edit'+counter+'" onclick="change('+counter+')">Edit</button> <button id="Update'+counter+'" class=" btn-success btn" style="display:none;" onclick="editLoader('+json.data[i].id+','+counter+')"> Update </button></div<br><br>';
                    
            			$("#Loaderlist").append(value);
         			}
         			
         			

           		 }
            	
			 }
            });
	}
	function change(counter)
	{	$("#Edit"+counter).hide();
		$("#Update"+counter).show();
		$("#loader"+counter).prop("disabled",false);
		$("#loaderCode"+counter).prop("disabled",false);
	}
	function getPacker()
	{
		var jsonObject= new Object();
		jsonObject=
		{};
		$.ajax({
            type: "POST",
            url:"<%=AmazinUrl.getPacker%>",
            data:JSON.stringify(jsonObject),
            contentType: "application/json",
            success: function(data)
            {
            	
            	var json=data;
            	var counter=0;
            	
            	if(json.data.length>0)
            	{
            		
            		$("#tablelist").html(" ");
            		for(var i=0;i<json.data.length;i++)
         			{	++counter;
         					var value='<tr><td>'+counter+'</td><td id="packer'+counter+'">'+json.data[i].packer_no+'</td><td id="target_capacity'+counter+'">'+json.data[i].target_capacity+'</td><td><button data-toggle="modal" data-target="#myModal" class=" btn-danger btn" onclick="showdialog('+json.data[i].id+','+counter+')"> Edit</button></td></tr>';
                    
            			$("#tablelist").append(value);
         			}
         			
         			

           		 }
            	
			 }
            });
	}
	
	
	function showdialog(id,counter)
	{
		
		$("#modalpackerid").val(id);
		$("#modaltargetCapacity").val($("#target_capacity"+counter).html());
		$("#modalpackerName").val($("#packer"+counter).html());
	
	}	
	function editLoader(id,counter)
	{
		
		var jsonObject= new Object();
		jsonObject=
		{
			"loader_no":""+$("#loader"+counter).val(),
			"loader_code":$("#loaderCode"+counter).val(),
			"id":""+id
			
		};
		$.ajax({
	        type: "POST",
	        url:"<%=AmazinUrl.updateLoader%>",
	        data:JSON.stringify(jsonObject),
	        contentType: "application/json",
	        success: function(data)
	        {
	        	
	        	getLoader();
	        	
			 }});
		
		
		
	
	}	
		
		
		


    $(document).ready(function () {
        $('#example').DataTable({

            dom: 'Bfrtip',
            buttons: [
                'copy', 'csv', 'pdf', 'print'
            ]
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