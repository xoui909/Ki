<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>W I S H</title>
<link rel="stylesheet"
	href="css/bootstrap.min.css">
<style type="text/css">
tr {
	text-align: center;
	padding: 4px 10px;
	background-color: #F6F6F6;
}

th {
	text-align: center;
	padding: 4px 10px;
}
</style>
<script type="text/javascript">
	function user_delete(f) {
		f.action="admin_user_delete.do";
		f.submit();
	}
</script>
</head>
<body>
	<h3>사용자 목록</h3>
	<table class="table">
		<tr>
			<th>U_IDX</th>
			<th>U_ID</th>
			<th>U_NAME</th>
			<th>U_IMAGE</th>
			<th>U_BIRTH</th>
			<th>U_GENDER</th>
			<th>U_TEL</th>
			<th>U_EMAIL</th>
			<th>DELETE</th>
		</tr>
		<c:forEach items="${list}" var="k">
			<c:if test="${k.u_status != 1 }">
				<form method="post">
					<tr>
						<td>${k.u_idx}</td>				
						<td><a href="myList.do?u_idx=${k.u_idx}" target="_parent"> ${k.u_id}</a></td>				
						<td>${k.u_name}</td>				
						<td><img src="/sns_project/${k.u_image}" class="img-circle" width="30px" height="30px"/></td>				
						<td>${k.u_birth}</td>				
						<td>${k.u_gender}</td>				
						<td>${k.u_tel}</td>				
						<td>${k.u_email}</td>				
						<c:if test="${k.u_status != 2 }">
						<td>
			       			<input type="hidden" name="u_idx" value="${k.u_idx }"> 
			       			<input type="button" value="DELETE" onclick="user_delete(this.form)" class="btn btn-default btn-md"> 
						</td>
						</c:if>				
						<c:if test="${k.u_status == 2 }">
						<td>
			       			<input type="button" value="DELETE" disabled> 
						</td>
						</c:if>				
					</tr>
				</form>
			</c:if>
		</c:forEach>
		<tr>
			<td colspan="9">
							<c:choose>
								<c:when test="${pvo.startPage<6}">
									이전으로
								</c:when>
								<c:otherwise>
									<a href="admin_user.do?cPage=${pre_page}">이전으로</a>
								</c:otherwise>
							</c:choose>
							<c:forEach var="k" begin="${pvo.startPage}" end="${pvo.endPage}">
								<c:choose>
									<c:when test="${k == pvo.nowPage}">
										${k}
									</c:when>
									<c:otherwise>
										<a href="admin_user.do?cPage=${k}">${k}</a>
									</c:otherwise>
								</c:choose>
							</c:forEach>
							<c:choose>
								<c:when test="${pvo.endPage >= pvo.totalPage}">
									다음으로
								</c:when>
								<c:otherwise>
									<a href="admin_user.do?cPage=${next_page}">다음으로</a>
								</c:otherwise>
							</c:choose>
					</td>
				</tr>
				
		</table>
</body>
</html>