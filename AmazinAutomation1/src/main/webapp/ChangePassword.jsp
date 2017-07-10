	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@page import="com.amz.gen.AmazinUrl"%>
	<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Gentelella Alela! | </title>

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
            <img src="<c:url value="/resources/images/wonderLogo.png"/>">
            <br><br>
              
            
              
            <div><br>
                <input type="password" id="pass" name="pass" class="form-control" placeholder="Password" required=true />
              </div>
              <div><br>
                <input type="password" id="cpass" name="cpass" class="form-control" placeholder=" Confirm Password" required=true />
              </div>
              <div><br>
              <button name="LogIn" class="btn btn-default submit" onclick="ChangePassword()">Change Password </button>
             </div>

              <div class="clearfix"></div>

             
           
          </section>
        </div>
      </div>
    </div>
    
    <script>
        
    function ChangePassword()
    {

        var user ='<%= session.getAttribute("user") %>';
        var pass=$("#pass").val();
        var cpass=$("#cpass").val();
        
        if(cpass==pass)
        {
        	
       
		        var JSONObj = new Object();
		    	<% AmazinUrl amazinUrl= new AmazinUrl();%>
		    	var url= "<%=amazinUrl.changePassword%>";
		        
		        JSONObj =
		                {
		                    "username": "" + user,
		                    "userPassword": "" + pass,
		                  
		                };
		
				        $.ajax({
				            url: ""+url,
				            data: JSON.stringify(JSONObj),
				            type: "POST",
				            contentType: "application/json",
				            success: function (data)
				            {			alert(JSON.stringify(data));
				            			var json=data;
				            			 if(json.status="success")
						                {
						                	 window.location.href="<%=amazinUrl.login%>";
						                }
				               
				            }});
        }
        else
        {
        			alert("Password and confirm Password Doesn't match");
        			location.reload();
        }
        
    }
    </script>
    
    
    
    
    
  </body>

</html>