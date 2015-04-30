<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href='http://fonts.googleapis.com/css?family=Raleway:500' rel='stylesheet' type='text/css'>

<!-- Custom CSS -->
<link href="css/login.css" rel="stylesheet">

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>


<!-- javascript jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>

<title>W I S H</title>
<script type="text/javascript">
function login(f) {
	for (var i = 0; i < f.elements.length; i++) {
		if (f.elements[i].value == "") {
			alert(f.elements[i].placeholder + "를 입력하세요");
			f.elements[i].focus();
			return;//수행 중단
		}
	}	
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

.brand-custom{
	margin-left: 400px;
}
.brand_name{
float: left;
margin-left: 48%;
margin-top: 5px;
font-weight: bold;
font-family: 'Raleway', sans-serif;

}
</style>
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar-fixed-top navbar-custom">
	<div class="container-fluid">
		<div align="center" class="brand_name">
			<a href="index.jsp" style="color: #fff;  text-decoration: none;"><h4>W I S H</h4></a>
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