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
	
			<!-- Search Form -->
			<!-- <form class="navbar-form navbar-left" role="search" method="post">
				<select class="form-control" name="sel">
						<option value="">글 내용</option>
						<option value="">친구 찾기</option>
						<option value=""></option>
						<option value=""></option>
				</select>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search" name="search">
				</div>
				<input type="button" class="btn btn-default" value="Search" onclick="search_click(this.form)"/>
			</form> -->
	
			<!-- Login Form -->
			<form class="navbar-form navbar-right" role="login" method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="ID" name="">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="Password" name="">
				</div>
				<input type="button" value="Log In" onclick="" class="btn btn-default"/>
				<input type="hidden" name="type" value="login" />
			</form>

		</div>
	</div>
	</nav>
</body>
</html>