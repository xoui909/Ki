<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MENU & LOGIN</title>

<!-- for icons -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

<!-- google web font -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400;300' rel='stylesheet' type='text/css'>

<!-- jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>

<!-- jquery plugin -->
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>

<!-- custom js -->
<script type="text/javascript" src="js/menu_js.js"></script>

<!-- custom css -->
<link href="css/menu_css.css" rel="stylesheet">

<!--  -->

<script type="text/javascript">
$(function() {
    $('a[rel*=leanModal]').leanModal({ top : 200, closeButton: ".modal_close" });       
});
</script>
</head>
<body>
	<div class="menu">

		<!-- Menu icon -->
		<div class="icon-close">
			<img src="images/close.png">
		</div>

		<!-- Menu -->
		<ul>
			<li><a href="#">내 글 보기</a></li>
			<li><a href="#">친구 글 보기</a></li>
			<li><a href="#">프로필 수정</a></li>
			<li><a href="#">친구 목록</a></li>
			<li><a href="#">소원 빌기</a></li>
			<li><a href="#">로그아웃</a></li>
		</ul>
	</div>

	<!-- Main body -->
	<!-- show menu btn -->
	<div class="icon-menu">
		<i class="fa fa-bars"></i> My Page
	</div>
	<br/>
	
		<div class="user_login" id="user_login">
		    <form>
		        <label>Email / Username</label> <input type="text"><br>
		        <label>Password</label> <input type="password"><br>
		
		        <div class="checkbox">
		            <input id="remember" type="checkbox"> <label for=
		            "remember">Remember me on this computer</label>
		        </div>
		
		        <div class="action_btns">
		            <div class="one_half">
		                <a class="btn back_btn" href="#">Back</a>
		            </div>
		
		            <div class="one_half last">
		                <a class="btn btn_red" href="#">Login</a>
		            </div>
		        </div>
		    </form>
		    
		    <a class="forgot_password" href="#">Forgot password?</a>
		</div>	
		
	<div class="main">
	</div>
</body>
</html>