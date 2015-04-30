<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
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

<style type="text/css">
body{
	background-color: #E9EAED;
}

.form-custom{
	margin-bottom: 10px;
}
.sel-custom{
	height: 34px;
}

.custom_btn{
/* 	height: 120px; */
/* 	background-color: #fff; */
/* 	color: #323232 !important; */
/* 	vertical-align: middle !important; */
/* 	margin-bottom: 10px; */
/*  	border-radius:10px; */
/* 	border-style: double; */
/* 	border-width: medium; */
}
</style>

<title>W I S H</title>
</head>
<body>
<!-- 상단 메뉴  -->   
   <jsp:include page="search_bar.jsp" />
   <div class="wrap">
   
   <div class="col-md-3">
   	<jsp:include page="menu.jsp" />
   
   </div>
   <div class="col-md-6">
   		<header>
				<hgroup>
				</hgroup>
			</header>
			
			<a href="pw_again.do?type=profile"><div class="col-sm-5 custom_btn" style="margin-right: 10px">
<!-- 			<h3>프로필 변경하기</h3> -->
			<img alt="프로필 수정" src="images/edit_profile.png">
			</div></a>
			<a href="pw_again.do?type=image"><div class="col-sm-5 custom_btn">
<!-- 			<h3>프로필 이미지 변경하기</h3> -->
			<img alt="프로필 이미지 수정" src="images/edit_image.png">
			</div></a>
			<a href="pw_again.do?type=password"><div class="col-sm-5 custom_btn" style="margin-right: 10px">
<!-- 			<h3>비밀번호 변경하기</h3> -->
			<img alt="비밀번호 변경" src="images/edit_pw.png">
			</div></a>
			<a href="pw_again.do?type=leave"><div class="col-sm-5 custom_btn">
<!-- 			<h3> 회원 탈퇴하기</h3> -->
			<img alt="회원탈퇴" src="images/leave.png">
			</div></a>

   </div>
   <div class="col-md-3">
   
   </div>
   </div>
    
<!-- footer -->
<jsp:include page="footer.jsp" />	
	
</body>
</html>