<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- custom css -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<style type="text/css">
body{
	background-color: #E9EAED !important;
}
.wrap {
	height: 100%;
}
#friend_face {
	text-align: center;
}

ul {
	list-style: none;
}

ul li {
	
}
</style>
</head>
<body>
	<div>
		<jsp:include page="search_bar.jsp" />
	</div>
	<div class="wrap">
		<div class="row">
			<div class="col-md-3">
				<jsp:include page="menu.jsp" />
			</div>
			<div class="col-md-6">
				<h3>친구목록</h3>
				<div id="friend_face">
					<img alt="얼굴" src="images/profile.png">
					&nbsp;&nbsp;&nbsp;&nbsp; <img alt="얼굴" src="images/profile.png">
					&nbsp;&nbsp;&nbsp;&nbsp; <img alt="얼굴" src="images/profile.png">
					&nbsp;&nbsp;&nbsp;&nbsp; <img alt="얼굴" src="images/profile.png">
					&nbsp;&nbsp;&nbsp;&nbsp; <img alt="얼굴" src="images/profile.png">
					<br />
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>