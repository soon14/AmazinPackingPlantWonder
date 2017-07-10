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
                                    <h4>Product Master</h4>
                                </div>
                               <!-- <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                                   
                                </ul>-->
                                <!--<div class="col-lg-6">
                                    <input type="button" class="btn btn-primary pull-right" value="Add">
                                </div>-->
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <form id="demo-form3" data-parsley-validate="" class="form-group form-label-left"
                                      novalidate="" data-toggle="validator" role="form">

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label">
                                                Plant Master Code</span>
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">Product Code

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">
                                                Product Name
                                            </label></div>

                                        </div>
                                        <div class="row">
                                            <div class="col-sm-3"><select class="form-control">
                                                <option value="">Select Status</option>
                                                <option value="1">Active</option>
                                                <option value="2">Inactive</option>
                                            </select></div>
                                            <div class="col-sm-3"><input type="text" class="form-control"
                                                                         name="VehcileNumber"></div>


                                            <div class="col-sm-3"><input type="text" class="form-control"
                                                                         name="VehcileNumber"></div>

                                            <div class="col-sm-3"><input type="button" class="btn-primary btn"
                                                                         value="Add"></div>
                                        </div>
                                        <br>
                                        <br>
                                    </div>

                                </form>

                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </div>
      <%@include file="footer.jsp" %>

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