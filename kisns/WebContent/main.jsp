<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>

<!-- jquery plugin -->
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script>

<style type="text/css">
.back {
	background-color: white;
	height: 100%;
}

body{
	background-color: #E9EAED !important;
}

.post-box {
	list-style: none;
}

.post {
	margin: 10px 0;
	border-radius: 10px;
	height: auto;
}
.post .file{
	width:100%;
	height: 30%;
}

.post-table td{
padding: 10px 20px;
}

.post-table .file-cell{
	padding: 0px;
}

.margin{
	margin: 10px 0;
}

</style>
</head>
<body>
 <jsp:include page="search_bar.jsp" />
 
 <div class="wrap">
		<div class="col-md-3">
			<jsp:include page="menu.jsp" />
			
		</div>
		<div class="col-md-6">
			<div align="right">
				<form action="" method="post">
					<input type="button" value="글쓰기" class="btn btn-default btn-md margin"/>
				</form>
			</div>
		<!-- 전체 글 박스 -->
			<ul class="post-box">
				<!-- 글 하나:  li를 포함하여 forEach문 돌리면 됩니다-->
				<li>
					<div class="post back">
						<table width="100%" align="center" class="post-table">
							<tr>
								<td width="10%"><img src="images/yuno.jpg" class="img-circle" width="50px" height="50px"/></td>
								<td><a href="" style="cursor: pointer;">${uvo.getU_id()}</a></td>
								<td align="right">2015/03/24</td>
							</tr>						
							<tr><td colspan="3" align="right"><input type="button" value="수정" class="btn btn-default btn-sm"/> <input type="button" value="삭제" class="btn btn-default btn-sm"/> </td></tr>					
							<tr>
									<td colspan="3">오늘 원하던 기업 최종 합격 통보를 받았어요.<br/>
									너무 너무 기뻐서 이 기쁨을 취업 준비로 힘들어하는 사람들에게 나누어주고 싶어요! 
									</td>
							</tr>
						<!-- 사진을 첨부했으면 이 행 추가 -->
						<!-- 사진 클릭하면 새창 나오게 해야하는데 지금 작동이 안됨...ㅜㅜ -->
							<tr>
								<td colspan="3" class="file-cell">
									<a class="request-consultation" rel="leanModal" href="#file-popup"><img src="http://40.media.tumblr.com/015a96c40e2f80a56dacfbcbd3b197f0/tumblr_n1gayrieM81sdyj9lo1_1280.jpg" class="file"/></a>								
								</td>
							</tr>
						<!-- 사진 행 끝 -->
							<tr><td colspan="2" align="right"><h4><b>받아라 취업 기! (1/10)</b></h4></td><td align="right" width="10%"><input type="button" value="기 받기" class="btn btn-default btn-sm" /></td></tr>					
						</table>
						<br/>
						
						
						<table class="table">
						
							<!-- 코멘트 리스트 -->
							<tr><td><img src="images/profile_femail.png" class="img-circle" width="30px" height="30px"/></td><td>축하 드려요! 저도 좋은 소식 금방 들렸으면 좋겠어요 ㅜㅜ</td><td>2015/03/24</td><td align="right"><input type="button" value="삭제" class="btn btn-default btn-xs"/></td></tr>
						
						
							<!-- 코멘트 입력 폼 -->
							<tr><td><img src="images/yuno.jpg" class="img-circle" width="30px" height="30px"/></td><td colspan="2" align="center"><textarea rows="1" class="form-control" placeholder="댓글을 입력하세요"></textarea></td><td align="right"><input type="button" value="글쓰기" class="btn btn-default btn-sm"/></td></tr>
						</table>
					</div>
				</li>
				<!-- 글 하나 끝 -->


				<!-- 더보기 버튼: 클릭하면 게시물 5++ -->
				<li><input type="button" class="btn btn-warning btn-lg btn-block" value="더보기▼"></li>
			</ul>
		</div>
	<div class="col-md-3"></div>

 </div>
<!-- footer -->
<jsp:include page="footer.jsp" />
</body>
</html>