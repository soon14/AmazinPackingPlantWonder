<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE jsp>
<jsp lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/jsp; charset=UTF-8">
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
    <!-- jQuery custom content scroller -->
    <link href="<c:url value="/resources/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css"/>" rel="stylesheet"/>

    <!-- Custom Theme Style -->
    <link href="<c:url value="/resources/build/css/custom.min.css"/>" rel="stylesheet">
     <link href="<c:url value="/resources/build/css/wizard.css"/>" rel="stylesheet">
  </head>

  <body class="nav-md">
       <script src="<c:url value="/resources/vendors/jquery/dist/jquery.min.js"/>"></script>
    <!-- Bootstrap -->
    <script src="<c:url value="/resources/vendors/bootstrap/dist/js/bootstrap.min.js"/>"></script>
          <script src="<c:url value="/resources/build/js/jquery.session.js"/>"></script>
          <script src="<c:url value="/resources/build/js/jquery.counterup.min.js"/>"></script>
          <script src="<c:url value="/resources/build/js/waypoints.min.js"/>"></script>
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col menu_fixed">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
                <a href="PackerDashboard.jsp" class="site_title"> <span>Wonder Cements</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
             
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>Admin</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
           <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                                
                  <ul class="nav side-menu">
                    <li><a><i class="fa fa-bar-chart-o"></i>Masters <span
                    class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                    
                   <!--  <li><a href="DeviceConfiguration.jsp">Device Configuration</a></li> -->
                    <li><a href="plantmaster.jsp">Plant Master</a></li>
                    <li><a href="DeviceMaster.jsp">Device master</a></li>
                    <li><a href="CreatePlantAdmin.jsp">Create User</a></li>
                    <li><a href="StageMaster.jsp">Stage Master</a></li>
                    <!-- <li><a href="VehcileMaster.jsp">Vehicle master</a></li> -->
                   <!--  <li><a href="VehcileStatus.jsp">Vehicle Status</a></li> -->
                   <!--  <li><a href="PlantGateEntryDashboard.jsp">Plant Gate Entry Dashboard</a></li>
                    <li><a href="YardDashboard.jsp">Yard Dashboard</a></li> -->
                    </ul>
                    </li>
                    </ul>
                                          
                                         </div>
            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Change Password" href="ChangePassword.jsp">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="Logout.jsp">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

        
            </nav>
          </div>
        </div>
        <!-- /top navigation -->
