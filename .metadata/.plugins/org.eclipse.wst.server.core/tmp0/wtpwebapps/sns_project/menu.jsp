<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String u_idx = request.getParameter("u_idx");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>W I S H</title>

<!-- for icons -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

<!-- google web font -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400;300' rel='stylesheet' type='text/css'>

<!-- jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>

<!-- custom js -->
<script type="text/javascript" src="js/menu_js.js"></script>

<!-- custom css -->
<link href="css/menu_css.css" rel="stylesheet">

</head>
<body>
	<div class="menu">

		<!-- Menu icon -->
		<div class="icon-close">
			<img src="images/close.png">
		</div>

		<!-- Menu -->
		<ul>
		<c:if test="${uvo.u_status==1}">
			<li><a href="admin.do">관리자 페이지</a></li>
		</c:if>
			<li><a href="myList.do?u_idx=${uvo.u_idx}">내 글 보기</a></li>
			<li><a href="f_writing.do?u_idx=${uvo.u_idx}">친구 글 보기</a></li>
			<li><a href="member_info.do">회원 정보</a></li>
			<li><a href="friend.do?u_idx=${uvo.u_idx}">친구 목록</a></li>
			<li><a href="wish.do?u_idx=${uvo.u_idx}">소원 빌기</a></li>
			<li><a href="collection.do?u_idx=${uvo.u_idx}">내 부적 보기</a></li>
			<li><a href="logout.do">로그아웃</a></li>
		</ul>
	</div>

	<!-- Main body -->
	<!-- show menu btn -->
	<div class="icon-menu">
		<i class="fa fa-bars"></i> My Page
	</div>
</body>
</html>