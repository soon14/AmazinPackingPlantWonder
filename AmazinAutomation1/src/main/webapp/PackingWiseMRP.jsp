<%@include  file="plantadminnavigation.jsp" %>
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">

                <div class="clearfix"></div>

                <div class="row">


                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">

                            <div class="x_title">
                                <h2>Packing Wise MRP Report</h2>
                                <div class="col-md-6">
                                    <div id="reportrange" class="pull-right"
                                         style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                                        <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                                        <span>October 15, 2015 - October 26, 2015</span> <b class="caret"></b>
                                    </div>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">

                                <table id="example" class="table table-striped table-bordered table-responsive">
                                    <thead>
                                    <tr>
                                        <th>S.No</th>
                                        <th>Type</th>
                                        <th>Quantity</th>
                                        <th>Bags</th>




                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>

                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                       

                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include  file="footer.jsp" %>
<script>
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