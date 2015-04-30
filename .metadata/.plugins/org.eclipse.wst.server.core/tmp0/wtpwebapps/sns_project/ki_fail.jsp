<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String type = request.getParameter("type");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>W I S H</title>
<script type="text/javascript">
var type = "<%=type%>";
if(type=="no"){
	alert("소원이 없습니다. 소원을 등록하세요.");
	location.href="wish.do?u_idx=${uvo.u_idx}";
}else if(type=="wish"){
	alert("이미 소원을 달성하셨습니다. 새로운 소원을 등록하세요.");
	location.href="wish.do?u_idx=${uvo.u_idx}";
}else if(type=="success"){
	alert("달성! 새 소원을 등록하세요.");
	location.href="wish.do?u_idx=${uvo.u_idx}";
}else if(type=="ki"){
	alert("이미 기를 받으셨습니다.");
	location.href="allList.do";
}
	
</script>
</head>
<body>

</body>
</html>