<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>W I S H</title>
<!-- bootstrap css -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- custom css -->
<link rel="stylesheet" href="css/list.css">
</head>
<body>
	<div>
		<jsp:include page="search_bar.jsp" />
	</div>
	<div class="wrap">
	<div class="media_margin_980"></div>
		<div class="row">
			<div class="col-md-3">
				<jsp:include page="menu.jsp" />
			</div>
			<div class="col-md-6">
			<div class="media_margin_650"></div>
				<div>
					<h2>친구 찾기 결과 ('${search_key }')</h2>
					<br/>
				</div>
				<c:if test="${!empty search_list}">
					<c:forEach items="${search_list}" var="k">
					<!-- 검색결과 중 나는 제외한다 -->
					<c:if test="${k.u_idx != uvo.u_idx}">
					<c:set var="i" value="true" />
						<c:forEach items="${friends_list}" var="f">
							<!-- 검색 결과 u_idx와 내 친구 리스트의 u_idx가 동일한 것이 있으면 i의 값을 false로 바꾼다 -->
							<c:if test="${k.u_idx == f.u_idx}">
								<c:set var="i" value="false" />
							</c:if>
						</c:forEach>
						<div class="col-sm-4" align="center">
							<a href="myList.do?u_idx=${k.u_idx }"><img src="${k.u_image }" class="img-circle" width="150px" height="150px"/></a>
							<h4><a href="myList.do?u_idx=${k.u_idx }">${k.u_name }</a></h4>
							<c:if test="${i == true}">
								<form action="friend_add.do" method="post">
								<input type="hidden" name="u_idx" value="${uvo.u_idx}">
								<input type="hidden" name="f_u_idx" value="${k.u_idx}">
								<input type="submit" value="친구 추가" class="btn btn-default btn-sm" />
								</form>
							</c:if>
							<c:if test="${i == false}">
								<form action="friend_del.do" method="post">
								<input type="hidden" name="u_idx" value="${uvo.u_idx}">
								<input type="hidden" name="f_u_idx" value="${k.u_idx}">
								<input type="submit" value="친구 삭제" class="btn btn-default btn-sm" />
								</form>
							</c:if>
						<br/>
						<br/>
						</div>
					</c:if>
					</c:forEach>
				</c:if>
				<c:if test="${empty search_list}">
				검색어에 해당하는 친구가 없습니다
				</c:if>
				
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>