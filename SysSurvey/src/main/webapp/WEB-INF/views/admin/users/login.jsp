<link href="./resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="./resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="./resources/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="./resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please Register</h3>
                </div>
                <div class="panel-body">
                    <form action="<%=request.getContextPath()%>/loginUser" method="Post">
                        
                        <fieldset>
                            <div class="form-group">
                                <font color="red"><h6 id="valUsersName">${error}</h6></font>
                                <input class="form-control" id="usersname" placeholder="USER NAME" name="usersname" type="text" autofocus required="required">
                            </div>
                            <div class="form-group">
                                <font color="red"><h6 id="valPassword"></h6></font>
                                <input class="form-control" id="password" placeholder="Password" name="password" type="password"  required="required">
                            </div>
                            
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                            <input type="submit" class="btn btn-lg btn-success btn-block" value="Register"/>
                            <!-- Change this to a button or input when using this as a form -->
                            Chưa có tài khoản? đăng kí<a href="<%=request.getContextPath()%>/register">tại đây</a>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="./resources/vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="./resources/vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="./resources/vendor/metisMenu/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="./resources/dist/js/sb-admin-2.js"></script>
