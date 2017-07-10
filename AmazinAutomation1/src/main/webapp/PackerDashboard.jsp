<%-- <%
HttpSession sessions = request.getSession(false);
String user = (String) sessions.getAttribute("user");
System.out.println("00000"+ user);
if(!user.equals("admin"))
{
	 response.sendRedirect("/AmazinAutomation1/404.jsp");
}
%> --%>

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
                                <h2>Running Loader Status</h2>

                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <br>
                                <div class="col-md-12 col-sm-12 col-xs-12 profile_details">
                             <div class="row" id="append">
                             
                             							
             
             
                             </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
      <%@include file="footer.jsp" %>
<script>

$( document ).ready(function() 
{
	
	  var JSONObj = new Object();
	     
      
      JSONObj =
              { };
	
		/*   $.ajax
		 (
		 {
	            url: "http://192.168.43.107:8080/AmazinPacking/packing/getCounterLive",
	            data: JSON.stringify(JSONObj),
	            type: "POST",
	            contentType: "application/json",
	            success: function (data)
	            {  */
	            	data=[
	            	    {
	            	        "loaderName": "Loader1",
	            	        "beltStatus": "waiting",
	            	        "bufferedBag": "50",
	            	        "totalBag": "500",
	            	        "currentLoaderBag": "100",
	            	        "currentDischargedBag": "100",
	            	        "vehicleNumber": "HG34JH34532",
	            	        "productCode": "PPC",
	            	        "mrp": "500",
	            	        "printerStatus": "true",
	            	        "counterStatus": "true",
	            	        "printerMsg": "No INk",
	            	        "controllerMsg": "Communication Erro"
	            	    },
	            	    {
	            	        "loaderName": "Loader2",
	            	        "beltStatus": "waiting",
	            	        "bufferedBag": "50",
	            	        "totalBag": "500",
	            	        "currentLoaderBag": "100",
	            	        "currentDischargedBag": "100",
	            	        "vehicleNumber": "HG34JH34532",
	            	        "productCode": "PPC",
	            	        "mrp": "500",
	            	        "printerStatus": "true",
	            	        "counterStatus": "true",
	            	        "printerMsg": "No INk",
	            	        "controllerMsg": "Communication Erro"
	            	    },
	            	    {
	            	        "loaderName": "Loader3",
	            	        "beltStatus": "waiting",
	            	        "bufferedBag": "50",
	            	        "totalBag": "500",
	            	        "currentLoaderBag": "100",
	            	        "currentDischargedBag": "100",
	            	        "vehicleNumber": "HG34JH34532",
	            	        "productCode": "PPC",
	            	        "mrp": "500",
	            	        "printerStatus": "true",
	            	        "counterStatus": "true",
	            	        "printerMsg": "No INk",
	            	        "controllerMsg": "Communication Erro"
	            	    },
	            	    {
	            	        "loaderName": "Loader4",
	            	        "beltStatus": "waiting",
	            	        "bufferedBag": "50",
	            	        "totalBag": "500",
	            	        "currentLoaderBag": "100",
	            	        "currentDischargedBag": "100",
	            	        "vehicleNumber": "HG34JH34532",
	            	        "productCode": "PPC",
	            	        "mrp": "500",
	            	        "printerStatus": "true",
	            	        "counterStatus": "true",
	            	        "printerMsg": "No INk",
	            	        "controllerMsg": "Communication Erro"
	            	    }
	            	];	
	         
	           		var json=data;
	           		
	                if( json.length>0)
	                
	                {
	                	if(json.length>4)
	                		{
	                			
	                		}
	                	
	                	for(var i=0;i<json.length;i++)
	                		{
	                				 if(json[i]!=null)
	                					{ 
	                					
	                					 	if(json.length<=6)
		         	                		{
	                					 		var data ='<div class="col-md-3 col-sm-12 col-xs-12">'+
	    	                					'<div class="well profile_view ">'+
	    	                					'<div class="">'+
	    	                								'<div class="brief x_title col-md-12 col-sm-12 col-xs-12" style="max-height: 40px;"> <div class="col-md-8 col-xs-8 col-sm-8"><h1  style="font-size:20px;"><b>'+json[i].loaderName+'</h1></div><div class="col-md-4 col-xs-4 col-sm-4"> <h4><b> '+json[i].totalBag+'</b> </h4></div></div>'+
	    	                								'<div class="row" style="padding:3px;">'+
	    	                								'<div class="col-md-4 col-xs-4 col-sm-4">'+
	    	                								'	<b>'+json[i].beltStatus+'</b>'+
	    	                								'</div>'+
	    	                								'<div class="col-md-8 col-xs-8 col-sm-8 ">'+
	    	                								'	<p style="color:#2b669a;" class="pull-right">Buffered Bags'+json[i].bufferedBag+'</b></p></div></div>'+
	    	                								'<div class="col-md-12 col-sm-12 col-xs-12 row text-center">'+
	    	                								'	<div class="col-md-6 col-xs-6 col-sm-6"><p> Disch. Count</p><h3>'+json[i].totalBag+'</h3></div><div class="col-md-6 col-xs-6 col-sm-6"><p> Loader Count </p><h3>'+json[i].currentLoaderBag+'</h3></div></div>'+
	    	                								'	<div class="col-md-12 col-sm-12 col-xs-12 row text-center"><h3>'+json[i].vehicleNumber+'</h3></div>'+
	    	                								'</div>'+
	    	                								
	    	                								'<div class="col-md-10 col-xs-10 col-sm-10">  <p class="pull-left"> Printer Status</p> </div>'+
	    	                								'<div class="col-md-2 col-sm-2 col-xs-2" style="padding-top:5px;" id="printercross'+json[i].loaderName+'">  <img alt="Hello" src="<c:url value="/resources/images/cross.png"/>"  style="width:12px; height:15px; " class="pull-right"><br> </div>'+
	    	                								'<div class="col-md-2 col-sm-2 col-xs-2"  style="padding-top:5px;"id="printertick'+json[i].loaderName+'">  <img  alt="Hello"src="<c:url value="/resources/images/tick.png"/>" style="width:12px; height:15px;" class="pull-right"> <br></div>'+
	    	                								'<div class="col-md-12 col-sm-12 col-xs-12"></div>'+
	    	                								'<div class="col-md-10 col-xs-10 col-sm-10">  <p class="pull-left"> Counter Status</p> </div>'+
	    	                								'<div class="col-md-2 col-sm-2 col-xs-2"style="padding-top:5px;" id="countercross'+json[i].loaderName+'">  <img alt="Hello" src="<c:url value="/resources/images/cross.png"/>" style="width:12px;height:15px;" class="pull-right"> <br> </div>'+
	    	                								'<div class="col-md-2 col-sm-2 col-xs-2"style="padding-top:5px;" id="countertick'+json[i].loaderName+'">  <img  alt="Hello" src="<c:url value="/resources/images/tick.png"/>" style="width:12px; height:15px;" class="pull-right"><br>  </div>'+
	    	                					
	    	                					'<div class="col-xs-12 bottom text-center">'+
	    	                					'	<div class="col-md-4 col-xs-4 col-sm-4 emphasis">'+
	    	                					'		<p class="ratings">'+
	    	                					'			<b style="color: #2b669a!important;">'+json[i].productCode+' </b>'+
	    	                					'				</p>'+
	    	                					'</div>'+
	    	                					'<div class=" col-md-8 col-xs-8 col-sm-8 emphasis pull-right">'+
	    	                					
	    	                					'<b style="color: #2b669a!important;">MRP '+json[i].mrp+' </b>'+
	    	                					'</div></div></div></div>';
		         	                		}
		                					 else
		                					 {
		                						 var data ='<div class="col-md-2 col-sm-2 col-xs-2">'+
		 	                					'<div class="well profile_view ">'+
		 	                					'<div class="">'+
		 	                								'<h2 class="brief x_title" style="font-size:20px;"><b>'+json[i].loaderName+'</b></h2>'+
		 	                								'<div class="col-md-4 col-xs-4 col-sm-4">'+
		 	                								'	<b>'+json[i].beltStatus+'</b>'+
		 	                								'</div>'+
		 	                								'<div class="col-md-8 col-xs-8 col-sm-8 ">'+
		 	                								'	<p style="color:#2b669a;" class="pull-right">B. Bags'+json[i].bufferedBag+'</b></p></div>'+
		 	                								'<div class="col-md-12 col-sm-12 col-xs-12 text-center">'+
		 	                								'	<h3>'+json[i].totalBag+'/'+json[i].currentLoaderBag+'</h3></diV>'+
		 	                								'<div class="col-md-12 col-sm-12 col-xs-12 text-center">'+
		 	                								'	<h4>'+json[i].vehicleNumber+'</h5>'+
		 	                								'</div>'+
		 	                								
		 	                								'<div class="col-md-10 col-xs-10 col-sm-10">  <p class="pull-left"> Printer Status</p> </div>'+
		 	                								'<div class="col-md-2 col-sm-2 col-xs-2" style="padding:5px;"id="printercross'+json[i].loaderName+'">  <img src="<c:url value="/resources/images/cross.png"/>" alt="Hello"  style="width:7PX; height:7PX; " class="pull-right"><br> </div>'+
		 	                								'<div class="col-md-2 col-sm-2 col-xs-2 col-sm-2 col-xs-2"style="padding:5px;" id="printertick'+json[i].loaderName+'">  <img src="<c:url value="/resources/images/tick.png"/>" alt="Hello" style="width:7PX; height:7PX;" class="pull-right"> <br></div>'+
		 	                								'<div class="col-md-10 col-xs-10 col-sm-10">  <p class="pull-left"> Counter Status</p> </div>'+
		 	                								'<div class="col-md-2 col-sm-2 col-xs-2" style="padding:5px;"id="countercross'+json[i].loaderName+'">  <img src="<c:url value="/resources/images/cross.png"/>" alt="Hello" style="width:7PX;height:7PX;" class="pull-right"> <br> </div>'+
		 	                								'<div class="col-md-2 col-sm-2 col-xs-2" style="padding:5px;"id="countertick'+json[i].loaderName+'">  <img src="<c:url value="/resources/images/tick.png"/>"  alt="Hello"style="width:7PX; height:7PX;" class="pull-right"><br>  </div>'+
		 	                					'</div>'+
		 	                					'<div class="col-xs-12 bottom text-center">'+
		 	                					'	<div class="col-md-4 col-xs-4 col-sm-4 emphasis">'+
		 	                					'		<p class="ratings">'+
		 	                					'			<b style="color: #2b669a!important;">'+json[i].productCode+' </b>'+
		 	                					'				</p>'+
		 	                					'</div>'+
		 	                					'<div class=" col-md-8 col-xs-8 col-sm-8 emphasis pull-right">'+
		 	                					
		 	                					'<b style="color: #2b669a!important;">MRP '+json[i].mrp+' </b>'+
		 	                					'</div></div></div></div>'; 
		                					 }

	                						$("#append").append(data);
	                						 if(json[i].printerStatus)
	                						 {
	                							 $("#printercross"+json[i].loaderName+"").hide();
	                						 }
	                						 else
	                						 {
	                							 $("#printertick"+json[i].loaderName+"").hide();
	                						 }
	                						 if(json[i].controllerStatus)
	                						 {
	                							 $("#countercross"+json[i].loaderName+"").hide();
	                							 
	                						 }
	                						 else
	                						 {
	                							 $("#countertick"+json[i].loaderName+"").hide();
	                						 }
	                					}
	                		}
	                }
	                	
	                	
	           // }
	       /*  }
	        ); */
		


 


   
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