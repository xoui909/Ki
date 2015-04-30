<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>W I S H</title>

<!-- for icons -->
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>
<script type="text/javascript"
	src="rotate3Di/jquery-css-transform/jquery-css-transform.js"></script>
<script type="text/javascript" src="rotate3Di/rotate3Di.js"></script>
<!-- custom css -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<style type="text/css">

#top_header {
	background: gray;
	border: 1px solid gray;
	padding: 20px;
	color: white;
	text-align: center;
}

#hope {
	text-align: center;
}

article {
	text-align: center;
}

#sub_title {
	text-align: left;
}

body {
	background-color: #E9EAED !important;

}

.wrap {
	height: 100%;
}

div#glayLayer {
	display: none;
	position: fixed;
	left: 0;
	top: 0;
	height: 100%;
	width: 100%;
	background: black;
	filter: alpha(opacity = 60);
	opacity: 0.60;
}

#overLayer {
	display: none;
	position: fixed;
	left: 33.5%;
	top: 30%;
	margin-top: -10%;
	margin-left: -20%;
}
</style>
<script type="text/javascript">
$(function(){
	
	$("#overLayer").click(function(){
		 $(this).hide()
		 $("#glayLayer").fadeOut("500");
		 location.href="collection_add.do?u_idx=${uvo.u_idx}&bujuk=13";
	 });
	
	 $(".openm").click(function(){
		 $("#glayLayer").fadeIn("600");
		 $("#overLayer").fadeIn("600").html("<iframe id='bujuk' frameBorder='0' height='600px' width='1500px' src='"+ $(this).attr("href")+"' align='center' scrolling='no' allowtransparency='true' ></iframe>");
		
		 return false;	
	});
	
});
function trap() {
	$("#overLayer").fadeIn("600").html("<img src='images/trap.jpg' width='1200' height='600'/><audio src='audio/trap.mp3' loop='1' autoplay></audio>");
	
	
}
function bujuk(){
		var iframe = document.getElementById('bujuk');
		var innerDoc = iframe.contentDocument || iframe.contentWindow.document;
	 	location.href="collection_add.do?u_idx=${uvo.u_idx}&bujuk="+innerDoc.getElementById("bujuk").value;
}

	 function get_wish(f) {
		 var s = f.w_max_ki.value;
	
		 if(s<30){
		 	alert("소원의 크기를 30이상 입력하세요!");
		 }else{
			 var chk=confirm("정말 등록하시겠습니까??");
			 if(chk){
				f.action="wish_add.do";
		 		f.submit();
			}
	 	}	
	 }
</script>
</head>
<body onload="collection()">

	<jsp:include page="search_bar.jsp" />
	<div class="wrap">
		<div class="col-md-3">
			<jsp:include page="menu.jsp" />
		</div>
		<div class="col-md-6">
			<div>
				<section id="hope_section">
					<article>
						<div id="sub_title">
							<h3>현재소원</h3>
						</div>
						<div id="hope">
							<img src="/sns_project/${uvo.u_image}" class="img-circle" width="150px" height="150px" />
							<c:set var="i" value="false" />
							<c:forEach items="${wvo}" var="k" varStatus="status">
								<c:if test="${k.w_status==1}">
									<c:set var="i" value="true" />
									<h4>${k.w_content}</h4>
									<fmt:parseNumber value="${(k.w_cur_ki/k.w_max_ki*100)}" var="s"
										integerOnly="true" />
									<c:if test="${k.w_cur_ki==k.w_max_ki}">
										<a class="openm openimg" href="Bujuk.jsp">
												<div class="file_div">
													<span class="file"><h2 style="font: bold;">달성!</h2></span>
												</div>
										</a>
											<div id='glayLayer'></div>
											<div id='overLayer'></div>
									</c:if>
									<br />
									<div class="progress"
										style="width: 80%; margin-left: auto; margin-right: auto;">
										<div class="progress-bar progress-bar-warning"
											role="progressbar" aria-valuenow="${s}" aria-valuemin="0"
											aria-valuemax="100" style="width: ${s}%;">
											<span style="color: black;">${s}%&nbsp;(${k.w_cur_ki}/${k.w_max_ki})</span>
										</div>
									</div>
									<br />

								</c:if>
							</c:forEach>
							<c:if test="${i == false}">
								<br />
								<br />
								<h4>현재 소원이 없습니다. 새 소원을 입력해주세요.</h4>
							</c:if>

						</div>
						<br />
					</article>
					<article>
						<div id="sub_title">
							<h3>새 소원 빌기</h3>
						</div>
						<form class="form-inline" method="post" name="f">
							<div class="form-group">
								<input type="text" class="form-control" size="60%"
									placeholder="소원 내용 (20자 이내)" name="w_content">
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="소원 크기(최소 30)" name="w_max_ki" size="20%">
							</div>
							<input type="hidden" name="u_idx" value="${uvo.u_idx}">
							<button type="button" class="btn btn-default"
								onclick="get_wish(this.form)">확인</button>
						</form>
					</article>
					<article>
						<br />
						<div id="sub_title">
							<h3>지난 소원 내역 보기</h3>
						</div>
						<div align="center">
							<table id="hope_view" class="table table-bordered">
								<tr>
									<th>날짜</th>
									<th>소원 내용</th>
									<th>소원 크기</th>
									<th>상태</th>
								</tr>
								<c:forEach items="${wvo}" var="k">
									<tr>
										<td>${k.w_regdate.substring(0,19) }</td>
										<td>${k.w_content }</td>
										<td>${k.w_max_ki}</td>
										<c:choose>
											<c:when test="${k.w_status=='0'}">
												<td>포기</td>
											</c:when>
											<c:when test="${k.w_status=='1'}">
												<td>진행중</td>
											</c:when>
											<c:otherwise>
												<td>달성</td>
											</c:otherwise>
										</c:choose>
									</tr>
								</c:forEach>
								<c:if test="${wvo.size()==0}">
									<tr>
										<td colspan="4">소원 내역이 없습니다.</td>
									</tr>
								</c:if>
							</table>
						</div>
					</article>
				</section>
			</div>
		</div>
		<div class="col-md-3"></div>
	</div>

<jsp:include page="footer.jsp" /> 
</body>
</html>