<%@ page language="java" contentType="text/html; charset=GB18030"
         pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=GB18030">
        <title>home</title>
        <link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <script type="text/javascript">

            function evalJson(data){
                var tmp = eval("(" + data + ")");
                return eval("(" + tmp + ")");
            }

            function callGet(){
                var data = {};
                data.id = $("#search_id").val();
                data.INTERFACE = "10000";
                callInterface(data, function(data){
                    var result = evalJson(data);
                    var code = result.CODE;
                    if("D000" == code){
                        loadForm(result.DATA);
                    } else {
                        alert(result.DESC);
                        clearForm();
                    }
                }, function(data){});
            }

            function clearForm(){
                $("#show_cust_id").attr("value", "");
                $("#show_id_no").attr("value", "");
                $("#show_id_type").attr("value", "");
                $("#show_name").attr("value", "");
                $("#show_gender").attr("value", "");
                $("#show_setup_date").attr("value", "");
            }

            function loadForm(result){
                $("#show_cust_id").attr("value", result.custId);
                $("#show_id_no").attr("value", result.idNo);
                $("#show_id_type").attr("value", result.idType);
                $("#show_name").attr("value", result.name);
                $("#show_gender").attr("value", result.gender);
                $("#show_setup_date").attr("value", result.setupDate);
            }

            function callInterface(data, succProc, failProc){
                $.ajax({
                    type: 'POST',
                    url: "interface.html?t=" + new Date().getTime(),
                    dataType: 'text',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify(data),
                    success: succProc,
                    error: failProc
                });
            }
        </script>
    </head>
    <body>
        <div class="container" style="padding-top: 5px;">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <h2>
                        <b>
                            客户信息查询
                        </b>
                    </h2>
                </div>
                <div class="col-md-12 column">
                    <nav class="navbar navbar-default" role="navigation" style="border: 0px">
                        <div class="navbar-header" >
                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    客户ID：
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" id="search_id" />
                                </div>
                                <button type="button" class="btn btn-default" onclick="callGet()">查询</button>
                            </form>
                        </div>
                    </nav>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="show_cust_id" class="col-sm-2 control-label">客户ID：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="show_cust_id" readonly="readonly" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="show_id_no" class="col-sm-2 control-label">证件号：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="show_id_no" readonly="readonly" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="show_id_type" class="col-sm-2 control-label">证件类型：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="show_id_type" readonly="readonly" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="show_name" class="col-sm-2 control-label">姓名：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="show_name" readonly="readonly" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="show_gender" class="col-sm-2 control-label">性别：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="show_gender" readonly="readonly" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="show_setup_date" class="col-sm-2 control-label">开户日期：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="show_setup_date" readonly="readonly" />
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>