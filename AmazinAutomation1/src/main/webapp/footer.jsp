
</div>
</div>
    <footer>
        <div class="pull-right">
            JK Vehicle Tracking System | Power By Amazin Automation pvt ltd <a href="https://www.amzbizsol.in"><b>Amazin
            Automation</b></a>
        </div>
        <div class="clearfix"></div>
    </footer>
</div>
</div>
    <!-- jQuery -->
   
    <!-- FastClick -->
    <script src="<c:url value="/resources/vendors/fastclick/lib/fastclick.js" />"></script>
    <!-- NProgs -->
    <script src="<c:url value="/resources/vendors/nprogress/nprogress.js" />"></script>
    <!-- jQuery custom content scroller -->
    <script src="<c:url value="/resources/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js" />"></script>

    <!-- Custom Theme Scripts -->
    <script src="<c:url value="/resources/build/js/custom.min.js" />"></script>
    <script src="<c:url value="/resources/build/js/wizard.js" />"></script>
      <script src="<c:url value="/resources/build/js/jquery-ui.js" />"></script>

     <!-- Datatables -->
    <script src="<c:url value="/resources/vendors/datatables.net/js/jquery.dataTables.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-buttons/js/dataTables.buttons.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-buttons/js/buttons.flash.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-buttons/js/buttons.html5.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-buttons/js/buttons.print.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-responsive/js/dataTables.responsive.min.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js" />"></script>
    <script src="<c:url value="/resources/vendors/datatables.net-scroller/js/dataTables.scroller.min.js" />"></script>
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
  
     
  </body>
</html>
