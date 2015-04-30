<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
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

<!-- custom js -->
<script type="text/javascript" src="js/menu_js.js"></script>

<!-- custom css -->
<link href="css/menu_css.css" rel="stylesheet">


<script type="text/javascript">
</script>


<style type="text/css">

.form-custom{
	margin-bottom: 10px;
}
.sel-custom{
	height: 34px;
}
.wrap{
	margin-top: 50px !important; 
	margin-bottom: 30px;
}

</style>

<script type="text/javascript">
	
	function user_delete(f) {
		f.action="admin_user_delete.do";
		f.submit();
	}
	
	function ki_delete(f) {
		f.action="admin_ki_delete.do";
		f.submit();
	}
	
</script>

<title>W I S H</title>
</head>
<body>
<!-- 상단 메뉴  -->   
   <jsp:include page="search_bar.jsp" />
  	 <div class="wrap">
   <div class="col-md-2">
   	<jsp:include page="menu.jsp" />
   </div>
   <div class="col-md-8">
   		<header>
				<hgroup>
					<h1>관리자 페이지</h1>
				</hgroup>
			</header>
		    
		    <iframe src="admin_user.do" style="border: none;" width="100%" height="410"></iframe>
			<hr/>	
		    <iframe src="admin_ki.do" style="border: none;" width="100%" height="410"></iframe>
   </div>
   <div class="col-md-2">
   
   </div>
   </div>
    
<!-- footer -->
<jsp:include page="footer.jsp" />
	
</body>
</html>