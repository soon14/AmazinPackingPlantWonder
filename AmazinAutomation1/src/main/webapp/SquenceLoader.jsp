<!DOCTYPE html>
<html lang="en">
<%@include  file="plantadminnavigation.jsp" %>
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">

                <div class="clearfix"></div>

                <div class="row">

                    <div class="x_panel">

                        <div class="x_title">
                            <div class="col-lg-4">
                                <h4>Sequence Loader</h4>
                            </div>
                            <div class="col-lg-4">
                                <h2>Total Number Vehicle - <b>20</b></h2>
                            </div>
                            <div class="col-lg-4">
                                <ul class="list-inline prod_color">
                                    <li>
                                        <div class="color bg-green" style="text-align: center;">1</div>

                                    </li>
                                    <li>
                                        <div class="color bg-green" style="text-align: center;">2</div>

                                    </li>
                                    <li>
                                        <div class="color bg-green" style="text-align: center;">3</div>

                                    </li>
                                    <li>
                                        <div class="color bg-red" style="text-align: center;">4</div>

                                    </li>
                                    <li>
                                        <div class="color bg-red" style="text-align: center;">5</div>

                                    </li>
                                    <li>
                                        <div class="color bg-orange" style="text-align: center;">6</div>

                                    </li>
                                    <li>
                                        <div class="color bg-orange" style="text-align: center;">7</div>
                                </ul>
                            </div>
                            <!--<ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                            </ul>-->
                            <!--<div class="col-lg-6">
                                <input type="button" class="btn btn-primary pull-right" value="Add">
                            </div>-->
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <form id="demo-form7" data-parsley-validate="" class="form-group form-label-left"
                                  novalidate="" data-toggle="validator" role="form">

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-sm-2"><label class="control-label">
                                            Product</span>
                                        </label></div>
                                        <div class="col-sm-2"><label class="control-label">
                                            Vehicle Number</span>
                                        </label></div>
                                        <div class="col-sm-2"><label class="control-label">
                                            Number of Wheels  </span>
                                        </label></div>
                                        <div class="col-sm-2"><label class="control-label">
                                            Transporter Name</span>
                                        </label></div>

                                    </div>
                                    <div class="row">
                                        <div class="col-sm-2"><input type="text" class="form-control"
                                                                     name="VehcileNumber"></div>

                                        <div class="col-sm-2"><input type="text" class="form-control"
                                                                     name="VehcileNumber"></div>
                                        <div class="col-sm-2"><select class="form-control">
                                            <option value="">Select</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                        </select></div>
                                        <div class="col-sm-2"><select class="form-control">
                                            <option value="">Select</option>
                                            <option value="1">Bhandari</option>
                                            <option value="2">Dev</option>
                                        </select></div>
                                        <div class="col-sm-2" style="width: auto;"><input type="button"
                                                                                          class="btn-primary btn"
                                                                                          value="Filter"></div>
                                        <div class="col-sm-2"><input type="button" class="btn-success btn"
                                                                     value="Show Loader Status" data-toggle="modal"
                                                                     data-target=".bs-example-modal-lg"></div>

                                    </div>
                                    <br>
                                    <br>
                                </div>

                            </form>
                            <input type="button" class="btn-success btn"
                                   value="Show in PopUp" data-toggle="modal" id="clc"
                                   data-target=".bs-example-modal-lg2">
                            <div id="app">

                                <table id="lol" cellspacing="0" width="100%"
                                       class="display lolz nowrap table table-striped jambo_table bulk_action table-bordered">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Truck Number</th>
                                        <th>Product Code</th>
                                        <th>DO Number</th>
                                        <th>Aging
                                            D:H:M
                                        </th>
                                        <th>Loader</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>1</th>
                                        <td>WB-54652</td>
                                        <td>PPC502</td>
                                        <td>45648523</td>
                                        <td>34:22:56</td>
                                        <td><label>
                                            <input type="radio" checked="checked" value="option1" id="optionsRadios1"
                                                   name="optionsRadios">None
                                        </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option2" id="optionsRadios2"
                                                       name="optionsRadios">1
                                            </label>

                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option3" id="optionsRadios3"
                                                       name="optionsRadios">2
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option4" id="optionsRadios4"
                                                       name="optionsRadios">3
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option5" id="optionsRadios5"
                                                       name="optionsRadios">4
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option6" id="optionsRadios6"
                                                       name="optionsRadios">5
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option7" id="optionsRadios7"
                                                       name="optionsRadios">6
                                            </label> <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option8" id="optionsRadios8"
                                                       name="optionsRadios">7
                                            </label>
                                            <label style="margin-left: 10px;">
                                                <input type="radio" checked="" value="option9" id="optionsRadios9"
                                                       name="optionsRadios">8
                                            </label>
                                        </td>
                                    </tr>

                                    </tbody>
                                </table>
                            </div>
                            <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true"
                                 style="display: none;">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content ">

                                        <div class="modal-header">

                                            <h4 class="modal-title" id="myModalLabel">Loader Vehicles</h4>
                                        </div>
                                        <div class="modal-body">
                                            <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                                <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                                    <li role="presentation" class="active"><a href="#tab_content1"
                                                                                              id="home-tab" role="tab"
                                                                                              data-toggle="tab"
                                                                                              aria-expanded="true">Loader
                                                        1</a>
                                                    </li>
                                                    <li role="presentation" class=""><a href="#tab_content2" role="tab"
                                                                                        id="profile-tab1"
                                                                                        data-toggle="tab"
                                                                                        aria-expanded="false">Loader
                                                        2</a>
                                                    </li>
                                                    <li role="presentation" class=""><a href="#tab_content3" role="tab"
                                                                                        id="profile-tab2"
                                                                                        data-toggle="tab"
                                                                                        aria-expanded="false">Loader
                                                        3</a>
                                                    </li>
                                                    <li role="presentation" class=""><a href="#tab_content4" role="tab"
                                                                                        id="profile-tab3"
                                                                                        data-toggle="tab"
                                                                                        aria-expanded="false">Loader
                                                        4</a>
                                                    </li>
                                                    <li role="presentation" class=""><a href="#tab_content5" role="tab"
                                                                                        id="profile-tab4"
                                                                                        data-toggle="tab"
                                                                                        aria-expanded="false">Loader
                                                        5</a>
                                                    </li>
                                                    <li role="presentation" class=""><a href="#tab_content6" role="tab"
                                                                                        id="profile-tab5"
                                                                                        data-toggle="tab"
                                                                                        aria-expanded="false">Loader
                                                        6</a>
                                                    </li>
                                                    <li role="presentation" class=""><a href="#tab_content7" role="tab"
                                                                                        id="profile-tab6"
                                                                                        data-toggle="tab"
                                                                                        aria-expanded="false">Loader
                                                        7</a>
                                                    </li>
                                                    <li role="presentation" class=""><a href="#tab_content8" role="tab"
                                                                                        id="profile-tab7"
                                                                                        data-toggle="tab"
                                                                                        aria-expanded="false">Loader
                                                        8</a>
                                                    </li>

                                                </ul>
                                                <div id="myTabContent" class="tab-content">
                                                    <div role="tabpanel" class="tab-pane fade active in"
                                                         id="tab_content1" aria-labelledby="home-tab">
                                                        <h2>Vehicle Number - RJ 458145</h2>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="tab_content2"
                                                         aria-labelledby="profile-tab">
                                                        <h2>Vehicle Number - DL 458145</h2>

                                                    </div>
                                                    <div role="tabpane2" class="tab-pane fade" id="tab_content3"
                                                         aria-labelledby="profile-tab">
                                                        <h2>Vehicle Number - TL 3</h2>

                                                    </div>
                                                    <div role="tabpane3" class="tab-pane fade" id="tab_content4"
                                                         aria-labelledby="profile-tab">
                                                        <h2>Vehicle Number - TL 4</h2>

                                                    </div>
                                                    <div role="tabpane4" class="tab-pane fade" id="tab_content5"
                                                         aria-labelledby="profile-tab">
                                                        <h2>Vehicle Number - TL 5</h2>

                                                    </div>
                                                    <div role="tabpane5" class="tab-pane fade" id="tab_content6"
                                                         aria-labelledby="profile-tab">
                                                        <h2>Vehicle Number - TL 6</h2>

                                                    </div>
                                                    <div role="tabpane6" class="tab-pane fade" id="tab_content7"
                                                         aria-labelledby="profile-tab">
                                                        <h2>Vehicle Number - TL 7</h2>

                                                    </div>
                                                    <div role="tabpane6" class="tab-pane fade" id="tab_content8"
                                                         aria-labelledby="profile-tab">
                                                        <h2>Vehicle Number - TL 8</h2>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-danger" data-dismiss="modal">Close
                                            </button>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div id="EnSureModal" class="modal fade bs-example-modal-12" tabindex="-2" role="dialog"
                                 aria-hidden="true">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content gg">

                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span
                                                    aria-hidden="true">×</span>
                                            </button>
                                            <h4 class="modal-title" id="myModalLabe2">Vehicle Table data</h4>
                                        </div>
                                        <div class="modal-body" id="apd">

                                        </div>
                                        <div class="modal-footer">

                                        </div>

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
    $(document).ready(function () {
        $('#lol').DataTable({
            "scrollX": true,
            "scrollY": 300,
            searching: false,
            "bPaginate": false
        });
    })
</script>
</body>
</html>