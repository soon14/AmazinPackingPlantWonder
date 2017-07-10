<%@include  file="plantadminnavigation.jsp" %>

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">

                <div class="clearfix"></div>

                <div class="row">


                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">

                            <div class="x_title">
                                <h2>Vehicle Master</h2>
                                <div class="col-sm-4 col-sm-offset-4"><input type="text" class="form-control col-md-4">
                                </div>
                                <input type="button" class="btn-primary btn" value="Search">
                                <div class="clearfix"></div>

                            </div>
                            <div class="x_content">

                                <form id="demo-form2" data-parsley-validate="" class="form-group form-label-left"
                                      novalidate="" data-toggle="validator" role="form">
                                    <h4><b>Vehicle Details</b></h4>
                                    <hr>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label">Vehicle
                                                number</span>
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">Manufacturer

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Model
                                                number
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Manufactured
                                                Date
                                            </label></div>

                                        </div>
                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" class="form-control"
                                                                         name="VehcileNumber"></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                        </div>
                                        <br>

                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label ">Vehicle
                                                Type

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">No of
                                                Wheels
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Transporter
                                                Name

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Transporter
                                                Number
                                            </label></div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>Truck</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>4</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option value="">Select Transporter</option>
                                                <option value="1">Bhandari Transporter</option>
                                            </select>
                                            </div>
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>54654</option>
                                            </select>

                                            </div>
                                        </div>
                                        <br>
                                    </div>
                                    <hr>
                                    <h4><b>Permit Detail</b></h4>
                                    <hr>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label">PVC
                                                Issue Date
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">PVC
                                                Valid Date</label></div>
                                            <div class="col-sm-3"><label class="control-label" >PUC Issue Date
                                            </label></div>
                                            <div class=" col-sm-3">
                                                <label class="control-label">PUC
                                                    Valid Date
                                                </label></div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                        </div>
                                        <br>

                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label ">Certified
                                                Capacity

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">Road
                                                Tax renewal Date
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Fitness
                                                Renewal Date

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">RCB
                                                Number
                                            </label></div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>Truck</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>4</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                        </div>
                                        <br>
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label ">Movement
                                                Type

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">Dedication
                                            </label></div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>4</option>
                                            </select>

                                            </div>
                                        </div>
                                        <br>
                                    </div>
                                    <hr>
                                    <h4><b>Vehicle Health Detail</b></h4>
                                    <hr>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label ">Vehicle
                                                Number
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">Vehicle
                                                Type</label></div>
                                            <div class="col-sm-3"><label class="control-label">Number
                                                of Wheels
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Transporter
                                            </label></div>

                                        </div>
                                        <div class="row">
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                        </div>
                                        <br>

                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label ">Transporter
                                                mobile number

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label ">Capacity
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Movement
                                                Type

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Insurance
                                                Policy Details
                                            </label></div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>Truck</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>4</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                        </div>

                                        <br>
                                        <div class="row">
                                            <div class="col-sm-3"><label class="control-label">Model
                                                Detail

                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Year of
                                                manufacturing
                                            </label></div>
                                            <div class="col-sm-3"><label class="control-label">Fitness
                                                Validity

                                            </label></div>

                                        </div>

                                        <div class="row">
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>Truck</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><select class="form-control ">
                                                <option>4</option>
                                            </select>

                                            </div>
                                            <div class="col-sm-3"><input type="text" class="form-control "></div>
                                        </div>
                                        <br>
                                        <hr>
                                        <h4><b>Transporter and Insurance Detail</b></h4>
                                        <hr>

                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-3"><label class="control-label">Owner
                                                    name
                                                </label></div>
                                                <div class="col-sm-3"><label class="control-label">Insurance
                                                    Number

                                                </label></div>
                                                <div class="col-sm-3"><label class="control-label">Company
                                                    number
                                                </label></div>
                                                <div class="col-sm-3"><label class="control-label">Valid
                                                    Till
                                                </label></div>
                                            </div>
                                            <div class="row">
                                                <div class="col-sm-3"><input type="text" class="form-control "></div>
                                                <div class="col-sm-3"><input type="text" class="form-control "></div>
                                                <div class="col-sm-3"><input type="text" class="form-control "></div>
                                                <div class="col-sm-3"><input type="text" class="form-control "></div>
                                            </div>
                                            <br>
                                        </div>

                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-6 col-sm-6 col-xs-12 ">
                                            <button class="btn btn-primary" type="button">Register</button>
                                        </div>
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