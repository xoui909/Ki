<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>W I S H</title>
<!-- custom css -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>


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
			<div class="col-md-3">
				<jsp:include page="menu.jsp" />
			</div>
			<div class="col-md-6">
				<div>
					<h3>부적 꾸러미</h3>
					<c:forEach items="${collection_list}" var="k" varStatus="status">
					<div id="friend_face">					
						<div class="col-md-3 item1">						
						<c:if test="${k>0}">
						<img src="collection/${status.count}.png" width="100%" height="100%">
						</c:if>
						<c:if test="${k==0}">
						<img src="images/wish_back.png" width="100%" height="100%" >
						</c:if>
						<h5>보유 수량 : ${k}</h5>	
						</div>					
					</div>
					</c:forEach>				
					</div>			
			</div>
			<div class="col-md-3"></div>
		</div>
	<jsp:include page="footer.jsp" />
</body>
</html>