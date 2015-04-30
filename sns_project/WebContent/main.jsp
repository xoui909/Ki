<%@page import="mybatis.UsrVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>W I S H</title>

<!-- jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>
<script type="text/javascript" src="js/Customer.js" ></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="css/bootstrap-theme.min.css">

<!-- custom css -->
<link rel="stylesheet"
	href="css/list.css">

<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
	function write_to(f) {
		f.action="write.do";
		f.submit();
	}
	
	$(function(){
		$("#glayLayer").click(function(){
			$(this).hide()
			$("#overLayer").fadeOut("500");
		});
		
		$("#overLayer").click(function(){
			$(this).hide()
			$("#glayLayer").fadeOut("500");
		});
		
		$(".openm").click(function(){
			$("#glayLayer").fadeIn("600");
			$("#overLayer").fadeIn("600").html("<img src='"+$(this).attr("href")+"' />");
			return false;
		});
	});
</script>

<script type="text/javascript">
	$(document).ready(function () {
	    size_li = $("#post-box li").size();
	    num=3;
	    $('#post-box li:lt('+num+')').show();
	    if(num >= size_li){
        	$('#load-more').hide();
        }
	    $('#load-more').click(function () {
	        num = (num + 3 <= size_li) ? num+3 : size_li;
	        if(num >= size_li){
	        	$('#load-more').hide();
	        }
	        $('#post-box li:lt('+num+')').fadeIn("400");
	    });
	});

	function ki_up(f) {
		f.action="ki_up.do";
		f.submit();
	}
	
	function ki_modify(f) {
		f.action="ki_modify.do";
		f.submit();
	}
	
	function ki_delete(f) {
		var chk = confirm("삭제하시겠습니까?")
		
		if(chk){
			f.action="ki_delete.do";
			f.submit();
		}
	}

	function send_to(f) {
		var chk = confirm("삭제하시겠습니까?")
		
		if(chk){
			f.action="delete.do";
			f.submit();
		}
	}
</script>


</head>
<body>
 <jsp:include page="search_bar.jsp" />
  <div class="wrap">
 <div class="media_margin_980"></div>
		<div class="col-md-3">
			<jsp:include page="menu.jsp" />
			
		</div>
		<div class="col-md-6">
		<div class="media_margin_650"></div>
			<div align="right">
				<form action="write.do" method="post">
					<input type="button" value="글쓰기" class="btn btn-default btn-md margin" onclick="write_to(this.form)"/>
					<input type="hidden" name="currpage" value="allList.do" />
				</form>
			</div>
		<!-- 전체 글 박스 -->
			<ul class="post-box" id="post-box">
				<!-- 글 하나:  li를 포함하여 forEach문 돌리면 됩니다-->
				<c:if test="${!empty list}">
				<c:forEach items="${list}" var="k">
				<li>
					<div class="post back">
					<form  method="post">
					<input type="hidden" id="ki_u_idx_${k.k_idx}" name="my_idx" value="${uvo.u_idx}">
					<input type="hidden" id="u_idx_${k.k_idx}" name="u_idx" value="${k.u_idx }">
					<input type="hidden" id="k_idx_${k.k_idx}" name="k_idx" value="${k.k_idx }">
					<input type="hidden" name="currpage" value="allList.do" />
						<table width="100%" align="center" class="post-table">
							<tr>
								<td width="10%">
								<img src="/sns_project/${k.u_image}" class="img-circle" width="50px" height="50px"/>
								</td>
								<td><a href="myList.do?u_idx=${k.u_idx}" style="cursor: pointer;">${k.u_name}</a></td>
								<td align="right" width="20%">${k.k_regdate.substring(0,10)}</td>
							</tr>						
							<tr><td colspan="3" align="right">
								<c:if test="${k.u_idx==uvo.u_idx}">
									<input type="button" value="수정" class="btn btn-default btn-sm" onclick="ki_modify(this.form)"/> 
								</c:if>
								<c:if test="${k.u_idx==uvo.u_idx || uvo.u_status==1}">
									<input type="button" value="삭제" class="btn btn-default btn-sm" onclick="ki_delete(this.form)"/> 
								</c:if>
							</td></tr>					
							<tr>
									<td colspan="3">
										${k.k_content } 
									</td>
							</tr>
						<!-- 사진을 첨부했으면 이 행 추가, 사진 클릭하면 새창 나오게 해야하는데 지금 작동이 안됨...ㅜㅜ -->
							<c:if test="${!empty k.k_image }">
								<tr>
									<td colspan="3" class="file-cell">
										<a class="openm" href="/sns_project/${k.k_image}">
										<div class="file_div"><img src="/sns_project/${k.k_image }" class="file"/></div>
										</a>
										<div id='glayLayer'></div><div id='overLayer'></div>		
									</td>
								</tr>
							</c:if>
						<!-- 사진 행 끝 -->
							<tr id="po${k.k_idx}">
							<td colspan="2" align="right"><h4><b>받아라 ${k.k_kind } 기! (${k.k_hit }/${k.k_max })</b></h4></td><td align="right" width="10%">
							<c:if test="${(k.k_hit/k.k_max)<1}">
								<c:if test="${k.u_idx==uvo.u_idx}">
									<input type="button" value="기 받기"  disabled="disabled" class="btn btn-default btn-sm"/>
								</c:if>
								<c:if test="${k.u_idx!=uvo.u_idx}">
									<input type="button" value="기 받기"  class="btn btn-default btn-sm" id="get_ki" name="${k.k_idx}"/>
								</c:if>							
							</c:if>							
							<c:if test="${(k.k_hit/k.k_max)>=1}">
							<input type="button" value="기 받기"  disabled="disabled" class="btn btn-default btn-sm"/>
							</c:if>
							</td></tr>					
						</table>
					</form>
						<br/>
						
						
						<form name="f" method="post">
						<table class="table" id="table_${k.k_idx}">	
						<script type="text/javascript">
							var s = ${uvo.u_status};
							var u = ${uvo.u_idx};
						</script>					
						<tr>
							<td colspan="5" height="1px"></td>
						</tr>						
						</table>
						</form>
						<form name="ki_cmt" method="post" >
						<table class="table">						
							<!-- 코멘트 입력 폼 -->
														
							<tr><td>
							<img src="/sns_project/${uvo.u_image }" class="img-circle" width="30px" height="30px"/></td><td colspan="3" align="center">
							<textarea rows="1" class="form-control" name="r_content" id="r_content_${k.k_idx }" placeholder="댓글을 입력하세요" required="required"></textarea>
							<input type="hidden" name="k_idx" id="k_idx_${k.k_idx}" value="${k.k_idx }"/>
							<input type="hidden" name="r_u_idx" id="r_u_idx_${k.k_idx}" value="${uvo.u_idx }"/>
							</td><td align="right"><input type="button" value="글쓰기"
												class="btn btn-default btn-sm"  id="cmtin" name="${k.k_idx}"/></td></tr>
							
							</table>
						</form>	
					</div>
				</li>
				<!-- 글 하나 끝 -->


				<!-- 더보기 버튼: 클릭하면 게시물 5++ -->
			</c:forEach>				
			</c:if>
			<c:if test="${empty list}">
				<li>작성 글이 없습니다</li>
			</c:if>
			</ul>
			
			<ul class="btnList">
				<li><input type="button" class="btn btn-warning btn-lg btn-block" value="더보기▼" id="load-more"></li>
			</ul>
		</div>
	<div class="col-md-3"></div>

 </div>
<!-- footer -->
<jsp:include page="footer.jsp" />
</body>
</html>