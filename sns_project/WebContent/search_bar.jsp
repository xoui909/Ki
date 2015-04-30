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

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">


<!-- javascript jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>
<script type="text/javascript">
	function sel_1() {
		var sel = document.getElementById("search_sel").value;
		if(sel == "30"){
			document.getElementById("text_f").style.display = "none";
			document.getElementById("sel_f").style.display = "inline-block";
		}else{
			document.getElementById("text_f").style.display = "inline-block";
			document.getElementById("sel_f").style.display = "none";
		}	
	}
	
</script>
<title>W I S H</title>

<style type="text/css">

.navbar-custom{
	background-color: #323232;
	overflow: hidden !important;
	width: 100% !important;
}

#sel_f{
	display: none;
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
			<a href="allList.do" style="color: #fff;  text-decoration: none;"><h4>W I S H</h4></a>
		</div>

		<!-- Menu -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	
			<!-- Search Form -->
			 <form class="navbar-form navbar-right" role="search" method="post" action="search.do">
				<select class="form-control" id="search_sel" onchange="sel_1()" name="search_sel">
						<option value="10">글 내용</option>
						<option value="20">친구 찾기(닉네임)</option>
						<option value="25">친구 찾기(ID)</option>
						<option value="30">기 카테고리</option>
				</select>
				<div class="form-group" id="text_f">
					<input type="text" class="form-control" placeholder="Search" name="search_key">
				</div>
				<div class="form-group" id="sel_f">
					<select class="form-control" name="ki_sel">
						<option value="취업">취업</option>
						<option value="연애">연애</option>
						<option value="출세">출세</option>
						<option value="금전">금전</option>
						<option value="건강">건강</option>
						<option value="합격">합격</option>
						<option value="기타">기타</option>
				</select>
				</div>
				<input type="submit" class="btn btn-default" value="search"/>
				<!-- <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button> -->
			</form>
		</div>
	</div>
	</nav>
</body>
</html>