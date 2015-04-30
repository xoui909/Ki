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
.item1{
display: none;
}
.item2{
display: none;
}
</style>

<script type="text/javascript">
 $(document).ready(function () {
    size_li = $(".item1").size();
    num=3;
    $('.item1:lt('+num+')').show();
    if(num >= size_li){
    	$('#load-more').hide();
    }
    $('#load-more').click(function () {
        num = (num + 3 <= size_li) ? num+3 : size_li;
        if(num >= size_li){
        	$('#load-more').hide();
        }
        $('.item1:lt('+num+')').fadeIn("400");
    });
}); 
 $(document).ready(function () {
    size_li2 = $(".item2").size();
    num2=3;
    $('.item2:lt('+num2+')').show();
    if(num2 >= size_li2){
    	$('#load-more2').hide();
    }
    $('#load-more2').click(function () {
        num2 = (num2 + 3 <= size_li2) ? num2+3 : size_li2;
        if(num2 >= size_li2){
        	$('#load-more2').hide();
        }
        $('.item2:lt('+num2+')').fadeIn("400");
    });
});

</script>
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
					<h3>내가 등록한 친구</h3>
					<div id="friend_face">
					<c:if test="${!empty friends_list}">
					<c:forEach items="${friends_list}" var="k">
						<div class="col-md-4 item1">
						<a href="myList.do?u_idx=${k.u_idx}"><img src="${k.u_image }" class="img-circle" width="150px" height="150px"/></a>
						<h4><a href="myList.do?u_idx=${k.u_idx}">${k.u_name}</a></h4>
						</div>
					</c:forEach>
					</c:if>
					<c:if test="${empty friends_list}">
					친구 목록이 없습니다
					</c:if>
					</div>
					<input type="button" class="btn btn-warning btn-lg btn-block" value="더보기▼" id="load-more">
				</div>
			<br/>
			<hr/>
				<div style="clear: both;">
					<br />
					<h3>나를 등록한 친구</h3>
					<div id="friend_face">
					<c:if test="${!empty f_list}">
					<c:forEach items="${f_list}" var="j">
						<div class="col-md-4 item2">
						<a href="myList.do?u_idx=${j.u_idx}"><img src="${j.u_image }" class="img-circle" width="150px" height="150px"/></a>
						<h4><a href="myList.do?u_idx=${j.u_idx}">${j.u_name}</a></h4>
						</div>
					
						
					
					</c:forEach>
					</c:if>
					<c:if test="${empty f_list}">
					친구 목록이 없습니다
					</c:if>
					
					</div>
					<input type="button" class="btn btn-warning btn-lg btn-block" value="더보기▼" id="load-more2">
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>
	<jsp:include page="footer.jsp" />
</body>
</html>