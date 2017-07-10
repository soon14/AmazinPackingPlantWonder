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
	                                <div class="col-lg-6">
	                                    <h4>Verify Bags</h4>
	                                </div>
	                               
	                                <div class="clearfix">
	                                
	                                </div>
	                          </div>
                        <div class="x_content output" >
                        </div>
					</div>

                    </div>

                    </div>
                </div>
            </div>
        </div>
        
         
        
      <%@include file="footer.jsp" %>

<script>
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
                        '<div class="col-sm-2"><label class="control-label">Verified Bags </label><input type="text" class="form-control"id="VerifiedBags'+i+'" ></div>'+
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
	             }});  	
   }
   

</script>
</body>
</html>