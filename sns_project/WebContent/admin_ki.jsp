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
	function ki_delete(f) {
		f.action="admin_ki_delete.do";
		f.submit();
	}
</script>
</head>
<body>
	<h3>게시물 목록</h3>
	<table class="table">
		<tr>
			<th>K_IDX</th>
			<th>U_IDX</th>
			<th>K_KIND</th>
			<th>K_HIT</th>
			<th>K_MAX</th>
			<th>K_REGDATE</th>
			<th>DELETE</th>
		</tr>
		<c:forEach items="${list}" var="k">
		<form method="post">
		<tr>
			<td>${k.k_idx}</td>				
			<td>${k.u_idx}</td>				
			<td>${k.k_kind}</td>				
			<td>${k.k_hit}</td>				
			<td>${k.k_max}</td>				
			<td>${k.k_regdate.substring(0,10)}</td>				
			<td>
       			<input type="hidden" name="k_idx" value="${k.k_idx }"> 
       			<input type="button" value="DELETE" onclick="ki_delete(this.form)" class="btn btn-default btn-md"> 
			</td>				
		</tr>
		</form>
		</c:forEach>
		<tr>
			<td colspan="7">
							<c:choose>
								<c:when test="${pvo.startPage<6}">
									이전으로
								</c:when>
								<c:otherwise>
									<a href="admin_ki.do?cPage=${pre_page}">이전으로</a>
								</c:otherwise>
							</c:choose>
							<c:forEach var="k" begin="${pvo.startPage}" end="${pvo.endPage}">
								<c:choose>
									<c:when test="${k == pvo.nowPage}">
										${k}
									</c:when>
									<c:otherwise>
										<a href="admin_ki.do?cPage=${k}">${k}</a>
									</c:otherwise>
								</c:choose>
							</c:forEach>
							<c:choose>
								<c:when test="${pvo.endPage >= pvo.totalPage}">
									다음으로
								</c:when>
								<c:otherwise>
									<a href="admin_ki.do?cPage=${next_page}">다음으로</a>
								</c:otherwise>
							</c:choose>
					</td>
				</tr>
				
				</table>
</body>
</html>