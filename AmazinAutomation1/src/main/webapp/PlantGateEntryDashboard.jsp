<%@include  file="plantadminnavigation.jsp" %>
<!-- page content -->
        <div class="right_col" role="main">
            <div class="">

                <div class="clearfix"></div>

                <div class="row">


                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">

                            <div class="x_title">
                                <h2>Plant Gate Entry Dashboard</h2>

                                <div class="clearfix"></div>

                            </div>
                            <div class="x_content">
                                <div class="row">
                                    <div class="col-md-8 col-xs-12">
                                        <div class="x_panel">
                                            <div class="x_title">
                                                <h2>Vehicle Details</h2>

                                                <div class="clearfix"></div>
                                            </div>
                                            <div class="x_content">
                                                <div class="col-lg-3"><h4>Vehicle Number</h4></div>
                                                <div class="col-lg-1"><h2>-</h2></div>
                                                <div class="col-lg-4"><h2><b>DL-120254</b></h2></div>
                                                <div class="clearfix"></div>
                                                <div class="col-lg-3"><h4>Trip ID</h4></div>
                                                <div class="col-lg-1"><h2>-</h2></div>
                                                <div class="col-lg-4"><h2><b>120254</b></h2></div>
                                                <div class="clearfix"></div>
                                                <div class="col-lg-3"><h4>Movement</h4></div>
                                                <div class="col-lg-1"><h2>-</h2></div>
                                                <div class="col-lg-4"><h2><b>Out Bound</b></h2></div>
                                                <div class="clearfix"></div>
                                                <div class="col-lg-3"><h4>Current Status</h4></div>
                                                <div class="col-lg-1"><h2>-</h2></div>
                                                <div class="col-lg-4"><h2><b>Active</b></h2></div>
                                                <div class="clearfix"></div>
                                                <div class="col-lg-3"><h4>Loader Number</h4></div>
                                                <div class="col-lg-1"><h2>-</h2></div>
                                                <div class="col-lg-4"><h2><b>DL-120254</b></h2></div>
                                                <div class="clearfix"></div>

                                                <div class="col-lg-3"><h4>Product Code</h4></div>
                                                <div class="col-lg-1"><h2>-</h2></div>
                                                <div class="col-lg-4"><h2><b>20254</b></h2></div>
                                                <div class="clearfix"></div>
                                                <hr>
                                                <div class="col-lg-4">
                                                    <input type="button" class="btn btn-primary" value="Allow" />

                                                </div>
                                                <div class="col-lg-4">
                                                    <input type="button" class="btn btn-danger" value="Reject" />

                                                </div>
                                            </div>

                                        </div>


                                    </div>

                                    <div class="col-md-4 col-xs-12">
                                        <div class="x_panel">
                                            <div class="x_title">
                                                <h2>Total Vehicle Inside Plant</h2>

                                                <div class="clearfix"></div>
                                            </div>
                                            <div class="x_content">
                                                <h1>60</h1>

                                            </div>
                                        </div>


                                    </div>
                                    <div class="col-md-4 col-xs-12">
                                        <div class="x_panel">
                                            <div class="x_title">
                                                <h2>Gross Weight Reject List</h2>

                                                <div class="clearfix"></div>
                                            </div>
                                            <div class="x_content">
                                                <p>Currently no vehicle are in Gross Weight Reject list</p>

                                            </div>
                                        </div>


                                    </div>
                                    <div class="col-md-8 col-xs-12">
                                        <div class="x_panel">
                                            <div class="x_title">
                                                <h2>Sequenced Queue</h2>

                                                <div class="clearfix"></div>
                                            </div>
                                            <div class="x_content">
                                                <p>Currently No vehicle in Sequenced Queue</p>

                                            </div>
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
        $('#example').DataTable({
            "scrollX": true,
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