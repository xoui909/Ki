<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<style type="text/css">
.back {
	background-color: white;
	height: 100%;
}

body{
	background-color: #E9EAED !important;
}
.wrap {
	height: 100%;
}

.post-box {
	list-style: none;
}

.post-box li {
	
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

</style>


</head>
<body>
 <jsp:include page="search_bar.jsp" />
 
 <div class="wrap">
	<div class="row">
		<div class="col-md-3">
			<jsp:include page="menu.jsp" />
		</div>
		
		
		<div class="col-md-6">
		<!-- 전체 글 박스 -->
			<ul class="post-box">
				<!-- 글 하나  li를 포함하여 forEach문 돌리면 됩니다-->
				<li>
					<div class="post back">
						<table width="100%" align="center">
							<tr>
								<td style="padding: 20px;"><img src="images/yuno.jpg" class="img-circle" width="50px" height="50px"/></td><td>YUNO</td><td>2015/03/24</td>
							</tr>						
							<tr>
									<td colspan="3">오늘 원하던 기업 최종 합격 통보를 받았어요.<br/>
									너무 너무 기뻐서 이 기쁨을 취업 준비로 힘들어하는 사람들에게 나누어주고 싶어요! 
									</td>
							</tr>
							
						<!-- 사진을 첨부했으면 이 행 추가 -->
							<tr>
								<td colspan="3" class="file-cell">
									<img src="http://40.media.tumblr.com/015a96c40e2f80a56dacfbcbd3b197f0/tumblr_n1gayrieM81sdyj9lo1_1280.jpg" class="file"/>
								</td>
							</tr>
						<!-- 사진 행 끝 -->

							<tr><td colspan="2"><h4>받아라 취업 기!</h4></td><td><input type="button" value="기 받기" class="btn btn-default btn-xs" /></td></tr>					
							<tr><td colspan="3"><input type="button" value="수정" class="btn btn-default btn-sm"/> <input type="button" value="삭제" class="btn btn-default btn-sm"/> </td></tr>					
						</table>
						<hr/>
						<table class="table">
						
							<!-- 코멘트 리스트 -->
							<tr><td>사진</td><td>축하 드려요! 저도 좋은 소식 금방 들렸으면 좋겠어요 ㅜㅜ</td><td>2015/03/24</td><td><input type="button" value="삭제" class="btn btn-default btn-xs"/></td></tr>
						
						
							<!-- 코멘트 입력 폼 -->
							<tr><td>사진</td><td colspan="2"><textarea rows="1" class="form-control" placeholder="댓글을 입력하세요"></textarea></td><td><input type="button" value="글쓰기" class="btn btn-default btn-sm"/></td></tr>
						</table>
					</div>
				</li>
			<!-- 글 하나 끝 -->

			</ul>
		</div>
		<div class="col-md-3"></div>
	</div>
	

 </div>
<!-- footer -->
<jsp:include page="footer.jsp" />
</body>
</html>