<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>%>
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

.form-custom{
	margin-bottom: 10px;
}
.sel-custom{
	height: 34px;
}
.wrap{
	margin-top: 30px !important; 
	margin-bottom: 30px;
}
</style>
<script type="text/javascript">
function go_index() {
	location.href="index.jsp";
}
</script>

<title>W I S H</title>
</head>
<body onload="setTimeout('go_index()',3000)">
<!-- 상단 메뉴  -->   
   <jsp:include page="search_bar.jsp" />
  	 <div class="wrap">
   <div class="col-md-3">
   	<jsp:include page="menu.jsp" />
   </div>
   <div class="col-md-6">
   		<header>
				<hgroup>
					<h1> 회원 탈퇴가 완료되었습니다.</h1>
					<h3> 이용해주셔서 감사합니다.</h3>
					<h5> 3초 후 첫 화면으로 이동합니다. <a href="javascript:location.href='index.jsp'">여기</a>를 누르시면 바로 이동합니다.</h5>
				</hgroup>
			</header>
   </div>
   <div class="col-md-3">
   
   </div>
   </div>
    
<!-- footer -->
<jsp:include page="footer.jsp" />
	
</body>
</html>