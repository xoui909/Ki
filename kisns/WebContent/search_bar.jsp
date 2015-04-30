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
<script type="text/javascript">
	function sel_1() {
		var sel = document.getElementById("search_sel").value;
		if(sel == "3"){
			document.getElementById("text_f").style.display = "none";
			document.getElementById("sel_f").style.display = "inline-block";
		}else{
			document.getElementById("text_f").style.display = "inline-block";
			document.getElementById("sel_f").style.display = "none";
		}	
	}
</script>
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
#sel_f{
	display: none;
}

</style>
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar-fixed-top navbar-custom">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="">SITENAME</a>
		</div>

		<!-- Menu -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	
			<!-- Search Form -->
			 <form class="navbar-form navbar-right" role="search" method="post" action="">
				<select class="form-control" name="sel" id="search_sel" onchange="sel_1()">
						<option value="1">글 내용</option>
						<option value="2">친구 찾기</option>
						<option value="3">기 카테고리</option>
				</select>
				<div class="form-group" id="text_f">
					<input type="text" class="form-control" placeholder="Search" name="search" required="required">
				</div>
				<div class="form-group" id="sel_f">
					<select class="form-control" name="search_sel" id="search_sel">
						<option value="1">취업</option>
						<option value="2">연애</option>
						<option value="3">승진</option>
						<option value="4">기타</option>
				</select>
				</div>
				<input type="submit" class="btn btn-default" value="search" onclick="Search"/>
			</form> 
		</div>
	</div>
	</nav>
</body>
</html>