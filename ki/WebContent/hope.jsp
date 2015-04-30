<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- for icons -->
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">

<!-- custom css -->
<link href="css/bootstrap.min.css" rel="stylesheet">

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
</style>
<script type="text/javascript">
function get_hope() {
		confirm("정말 등록하시겠습니까??");
}
</script>
</head>
<body>

	<div class="row">
		<div class="col-md-3" >
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
									<img alt="사진" src="images/profile.png">
									<h3>월급이 오르게 해주세요!(61/100)</h3>
									<h3>61%</h3>
									<img alt="사진" src="images/yellow.png"> <img alt="사진"
										src="images/yellow.png"> <img alt="사진"
										src="images/yellow.png"> <img alt="사진"
										src="images/gray.png"> <img alt="사진"
										src="images/gray.png"> <img alt="사진"
										src="images/gray.png"> <img alt="사진"
										src="images/gray.png"> <img alt="사진"
										src="images/gray.png"> <img alt="사진"
										src="images/gray.png"> <img alt="사진"
										src="images/gray.png">
								</div>
							</article>
							<article>
								<div id="sub_title">
									<h3>새 소원 빌기</h3>
								</div>
								<form class="form-inline" method="post">
									<div class="form-group">
										<input type="text" class="form-control" size="80"
											placeholder="소원 내용 (20자 이내)" name="wish_content">
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="소원 크기(최소 30)" name="max_ki">
									</div>
									<button type="submit" class="btn btn-default" onclick="get_hope(this.form)">확인</button>
								</form>
							</article>
							<article>
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
										<tr>
											<td>2015/01/01</td>
											<td>취직할래염</td>
											<td>50</td>
											<td>달성</td>
										</tr>
									</table>
								</div>
							</article>
						</section>
					</div>
		</div>
		<div class="col-md-3"></div>
	</div>

</body>
</html>