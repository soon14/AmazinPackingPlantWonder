	
	<%@page import="com.amz.gen.AmazinUrl"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title></title>

<!-- Bootstrap -->
<link href="<c:url value="/resources/vendors/bootstrap/dist/css/bootstrap.min.css"/>" rel="stylesheet">
<!-- Font Awesome -->
<link href="<c:url value="/resources/vendors/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet">
<!-- NProgress -->
<link href="<c:url value="/resources/vendors/nprogress/nprogress.css"/>" rel="stylesheet">
<!-- Animate.css -->
<link href="<c:url value="/resources/vendors/animate.css/animate.min.css"/>" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="<c:url value="/resources/build/css/custom.min.css"/>" rel="stylesheet">
</head>

<body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
    
         
                <script src="<c:url value="/resources/vendors/jquery/dist/jquery.min.js" />"></script>
                   <script src="<c:url value="/resources/build/js/jquery-ui.js"/>"></script>
                <script src="<c:url value="/resources/build/js/jquery.session.js"/>"></script>
                
            <img src="<c:url value="/resources/images/wonderLogo.png"/>">
            <br><br>
              
            
              <div>
                <input type="text" id="user" name="user" class="form-control" placeholder="Username" required="" />
              </div>
            <div><br>
                <input type="password" id="pass" name="pass" class="form-control" placeholder="Password" required="" />
              </div>
              <div> <br>
              <button type="submit" name="LogIn" class="btn btn-default submit" onclick="login()">LogIn</button>
             </div>

              <div class="clearfix"></div>

              <div class="separator">
              <br>
                 <div>
                   <a href="http://amzbizsol.in/"><img src="resources/images/amazin.png"></a>
                  <p> © 2017 Amazin Automation. All Rights Reserved.</p>
                  <p>Amazin Automation Solution India Private Limited </p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
    <!-- Dialog box for information -->
  
		  <div id="dialog" title="Information Message">
		  <p>
		    <span class="ui-icon ui-icon-circle-check" style="float:left; margin:0 7px 50px 0;"></span>
		   <div id="msg"></div>
		  </p>
		 
		</div>
  
  
  <!-- Dialog box for information  ends here -->
  
    <script>
    
    bootstrap_alert = function () {}
    bootstrap_alert.warning = function (message, alert, timeout) {
        $('<div id="floating_alert" class="alert alert-' + alert + '  col-md-4 fade in"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><b>' + message + '</b>&nbsp;&nbsp;</div>').appendTo('body');


       /*  setTimeout(function () {
        	$(".alert").alert('close');
        }, timeout); */

        $("#floating_alert").fadeTo(2000, 500).slideUp(500, function(){
            $("#floating_alert").slideUp(500);
             });
       
    }
  		function alertbox(message,type)
  		{
  			 $("#floating_alert").remove();
  			bootstrap_alert.warning(message,type);
 		   
  		
  		}
  </script>
    
    <script>
        
   <%--  function login()
    {
    	<% AmazinUrl amazinUrl= new AmazinUrl();%>
    	
    	
        var user =$("#user").val();
        var pass=$("#pass").val();
        var JSONObj = new Object();
     
        
        JSONObj =
                {
                    "username": "" + user,
                    "userPassword": "" + pass
                  };

        $.ajax({
            url:"<%=amazinUrl.login%>",
            data: JSON.stringify(JSONObj),
            type: "POST",
            contentType: "application/json",
            success: function (data)
            {
            		
            
           		var json=data;
           		
                if(json.status="success"&& json.data.length>0)
                
                {	
                	$.session.set('username',json.data[0].username);
                	alertbox("login Successful","success");
                	 setTimeout(function () {
                		 
                		 if(json.data[0].username=="superadmin"){
                		 window.location.href="<%=amazinUrl.plant%>";
                		 }
                	 
                	 else{
                		 window.location.href="<%=amazinUrl.packerDashboard%>";
                	 }//will redirect to your blog page (an ex: blog.html)
                	    }, 2000);
                   
                }
                else
                	{
                		alertbox("Enter the correct credential","danger",1000);
                	                	}
               
            }
        }
        );
    }
    </script> --%>
    
    
    
    
    
  </body>

</html>