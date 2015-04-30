<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- Custom CSS -->
<link href="css/login.css" rel="stylesheet">

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>


<!-- javascript jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>

<title></title>
<script type="text/javascript">
function login(f) {
	f.action="login.do";
	f.submit();
}
</script>
<style type="text/css">

.navbar-custom{
	background-color: #323232;
	overflow: hidden !important;
	width: 100% !important;
}
.navbar-brand{
	color: #fff !important;
}
.brand-custom{
	margin-left: 400px;
}
</style>
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar-fixed-top navbar-custom">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand navbar-center" href="">SITENAME</a>
		</div>

		<!-- Menu -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	
	
			<!-- Login Form -->
			<form class="navbar-form navbar-right" role="login" method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="ID" name="u_id">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="Password" name="u_pw">
				</div>
				<input type="button" value="Log In" onclick="login(this.form)" class="btn btn-default"/>
			</form>

		</div>
	</div>
	</nav>
</body>
</html>