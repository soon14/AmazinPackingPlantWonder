<%@page import="com.amz.gen.AmazinUrl"%>
<% AmazinUrl amazinUrl= new AmazinUrl();%>
<%@include  file="plantadminnavigation.jsp"%>
        <!-- page content -->
        <div class="right_col" role="main">
	
      	
      	
      
      <br>
      <br>
      <br>
      	
      	
     			 	<div class="row">
                            
                                        
                           

                            <div class="form-group col-sm-4">
                               <!--  <label  >Select Value Type </label> -->
                                <select class="form-control" id="type">
                                	<option value="select">Select type</option>
                                	<option value="day">Day</option>
							      	<option value="month">Month</option>
							      	<option value="year">Year</option>
							      	<option value="mrp">MRP</option>
							      	<option value="week">Week</option>
							      	<option value="product_code">Product Code </option>
							      	<option value="flyash">Flyash %</option>
                                </select>
                             </div>
                            <div class="form-group col-sm-4">
                                 
                                 <button class="btn btn-primary" value="" onclick="addString()"><span class="glyphicon glyphicon-plus"></span> Add Value</button>
                        	</div>

      	 			</div>
      	 			<div class="row col-md-12">
			      	 			<div class="checkbox col-sm-3">
			  							<label><input type="checkbox" id="prefix" checked onchange="display()"/> Print Prefix</label>
								</div>
      	 						
      	 			
      	 			</div>
      	 			<div >
      	
      						<ul id="sortable"  class="list-inline" slyle="align:center;">
      						
      						</ul>
					</div>
      	 			<br>
      	 			<br>
      	 			<br>
      	 			
      	 			<div class="container  " >
      	 			<div class="panel "  >
      	 			<div class="panel-title" ><h1 style="text-align:center;"> Sample Print Command</h1> 
      	 			</div>
      	 			<div class="panel-body" >
      	 				<h1 style="text-align:center;"><kbd id="samplestring">
      	 				</kbd></h1>
      	 			</div>
      	 			</div>
      	 			</div>
      	 		
      				<br>
      				<br>
      				<button onclick="submit()" >Submit Pattern</button>
      				</div>
      					
      					
      		
      
  
        <%@include  file="footer.jsp" %>

<script>

$( function() {
    $( "#sortable" ).sortable({
      revert: true,
      stop: function(event,ui){display();}
    }
    );
    $( "#draggable" ).draggable({
      connectToSortable: "#sortable",
      helper: "clone",
      revert: "invalid"
    });
    $( "ul, li" ).disableSelection();
  } );
var  day =  '<li class="ui-state-default"> <label style=" text-align: center;" class="label1"><input type="checkbox" class="prefix" checked onchange="display()"/> Prefix</label>'+
'<h2 style="padding:10px; background:#33b5e5; text-align:center;color:white;" class="key">Day</h2>'+
'<h2 style="display:none;" class="prefixvalue"> D</h2>'+
'<h2 style="display:none;" class="onlyvalue"> 16</h2>'+
'</li>';
			
var month='<li class="ui-state-default"><label style=" text-align: center;"class="label1"><input type="checkbox" class="prefix" checked onchange="display()"/> Prefix</label>'+
'<h2 style="padding:10px; background:#ffbb33; text-align:center;color:white;" class="key"  >Month</h2>'+
'<h2 style="display:none;" class="prefixvalue"> M</h2>'+
'<h2 style="display:none;" class="onlyvalue"> 04</h2>'+
'</li>';
var year ='<li class="ui-state-default"><label style=" text-align: center;"class="label1"><input type="checkbox" class="prefix" checked onchange="display()"/> Prefix</label>'+
'<h2 style="padding:10px; background:#ff5252; text-align:center;color:white;" class="key"  >Year</h2>'+
'<h2 style="display:none;" class="prefixvalue"> Y</h2>'+
'<h2 style="display:none;" class="onlyvalue"> 17</h2>'+
'</li>';
var week=	'<li class="ui-state-default"><label style=" text-align: center;"class="label1"><input type="checkbox" class="prefix" checked onchange="display()"/> Prefix</label>'+
'<h2 style="padding:10px; background:#ff5252; text-align:center;color:white;" class="key"  >Week</h2>'+
'<h2 style="display:none;" class="prefixvalue"> W</h2>'+
'<h2 style="display:none;" class="onlyvalue"> 15</h2>'+
'</li>';

var mrp=	'<li class="ui-state-default"><label style=" text-align: center;"class="label1"><input type="checkbox" class="prefix" checked onchange="display()"/> Prefix</label>'+
'<h2 style="padding:10px; background:#aa66cc; text-align:center;color:white;" class="key"  >Mrp</h2>'+
'<h2 style="display:none;" class="prefixvalue"> Mrp</h2>'+
'<h2 style="display:none;" class="onlyvalue"> 400</h2>'+
'</li>';
var productcode = 	'<li class="ui-state-default"><label style=" text-align: center;"class="label1"><input type="checkbox" class="prefix" checked onchange="display()"/> Prefix</label>'+
'<h2 style="padding:10px; background:#00b8d4; text-align:center;color:white;" class="key"  >Product Code</h2>'+
'<h2 style="display:none;" class="prefixvalue"> PC</h2>'+
'<h2 style="display:none;" class="onlyvalue"> ppc</h2>'+
'</li>';
 
var flyash= '<li class="ui-state-default"><label style=" text-align: center;"class="label1"><input type="checkbox" class="prefix" checked onchange="display()"/> Prefix</label>'+
			'<h2 style="padding:10px; background:#ff5252; text-align:center;color:white;" class="key">Flyash %</h2>'+
			'<h2 style="display:none;" class="prefixvalue"> %</h2>'+
			'<h2 style="display:none;" class="onlyvalue"> % .5</h2>'+
			'</li>';
			
			
			
	function addString()
	{
		var value=$("#type").val();
		switch(value)
		{
			case "day":
			$("#sortable").append(day);
				$('#type option[value="day"]').hide();
				$("#type").val("select");
				break;
			case "month":
				$("#sortable").append(month);
				$('#type option[value="month"]').hide();
				$("#type").val("select");
				break;
			case "year":
				$("#sortable").append(year);
				$('#type option[value="year"]').hide();
				$("#type").val("select");
				break;
			case "mrp":
				$("#sortable").append(mrp);
				$('#type option[value="mrp"]').hide();
				$("#type").val("select");
				break;
			case "week":
				$("#sortable").append(week);
				$('#type option[value="week"]').hide();
				$("#type").val("select");
				break;
			case "product_code":
				$("#sortable").append(productcode);
				$('#type option[value="product_code"]').hide();
				$("#type").val("select");
				break;
			
			case "flyash":
				$("#sortable").append(flyash);
				$('#type option[value="flyash"]').hide();
				$("#type").val("select");
				break;
			}
		
		display();
		
		
		
	}
	
	function display()
	{
				var abc="";
				var checkbox=$(".prefix");
				var prefix=$(".prefixvalue");
				var onlyvalue=$(".onlyvalue");
				if($('#prefix').is(':checked'))
				{
					$(".label1").show();
					
					for(var i=0;i<prefix.length;i++)
					{
						if(!checkbox[i].checked)
						{
							abc+=onlyvalue[i].innerHTML;
						}
						else{
						abc+=prefix[i].innerHTML+onlyvalue[i].innerHTML;
						}
					}
					$("#samplestring").html(abc);
				
				}
				else
				{
					$(".label1").hide();
					for(var i=0;i<onlyvalue.length;i++)
					{
						abc+=onlyvalue[i].innerHTML;
					}
					
					$("#samplestring").html(abc);
				}
				
				
	}
	function submit()
	{
		var array= new Array();
		var checkbox=$(".prefix");
		var prefix=$(".prefixvalue");
		var onlyvalue=$(".onlyvalue");
		var key= $(".key");
		var abc="";
		if($('#prefix').is(':checked'))
		{
			
			var counter=0;
			for(var i=0;i<prefix.length;i++)
			{
				
				counter= i+1;
				var jsonObject= new Object();
				if(checkbox[i].checked)
				{
					jsonObject=
					{
						"keyvalue":""+key[i].innerHTML,
						"prefix":""+prefix[i].innerHTML,
						"is_prefix_applied":"Y",
						"sequence_number":""+counter
						
					};
				}
				else
				{
					
					jsonObject=
					{
					"keyvalue":""+key[i].innerHTML,
					"is_prefix_applied":"N",
					"sequence_number":""+counter};
					
				}
				
				array.push(jsonObject);
				
			}
			
		
		}
		else
		{
			$(".label1").hide();
			var onlyvalue=$(".onlyvalue");
			for(var i=0;i<onlyvalue.length;i++)
			{
				var jsonObject= new Object();
				jsonObject={
				"keyvalue":""+key[i].value,
				"is_prefix_applied":"N",
				"sequence_number":""+counter};
				array.push(jsonObject);
			}
			
			
		}
			console.log(JSON.stringify(array))
		var url= "<%=amazinUrl.updateMrp%>";
      
    	$.ajax({
             type: "POST",
             url:url,
             data:JSON.stringify(array),
             contentType: "application/json",
             success: function(data)
             {
             	alert("Data Submitted");}
             	
			 });
			
	}
</script>

</body>
</html>