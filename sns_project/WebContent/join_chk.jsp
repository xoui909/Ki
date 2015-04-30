<%@page import="mybatis.UsrVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>W I S H</title>
<script type="text/javascript">
// 안씀 149
	if("${chk}"=="success"){
		alert("회원가입을 축하드립니다.");
	}else{
		alert("이미 사용 중인 아이디입니다.");
	}
		location.href="join_chk.do?uvo=${uvo.u_id}";
</script>
</head>
<body>
</body>
</html>