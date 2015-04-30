<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<!-- for icons -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

<!-- google web font -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400;300' rel='stylesheet' type='text/css'>

<!-- jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>

<!-- jquery plugin -->
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>

<!-- custom js -->
<script type="text/javascript" src="js/menu_js.js"></script>

<!-- custom css -->
<link href="css/menu_css.css" rel="stylesheet">


<script type="text/javascript">

	function msg() {
		if("${msg}" == "비밀번호가 맞지 않습니다." ){
			alert("${msg}");
		}
	}
	
	function leave(f) {
		if(confirm('정말 탈퇴하시겠습니까?')){
// 			if("${uvo.u_pw}"==f.u_pw.value){
// 				alert("탈퇴되었습니다. 이용해주셔서 감사합니다.");
				f.submit();
// 			}else{
// 				alert("비밀번호가 맞지 않습니다.");
// 			}
		}
	}
	
</script>


<style type="text/css">

.form-custom{
	margin-bottom: 10px;
}
.sel-custom{
	height: 34px;
}
.wrap{
	margin-top: 30px !important; 
	margin-bottom: 30px;
}
</style>

<title>W I S H</title>
</head>
<body onload="msg()">
<!-- 상단 메뉴  -->   
   <jsp:include page="search_bar.jsp" />
  	 <div class="wrap">
   <div class="col-md-3">
   	<jsp:include page="menu.jsp" />
   </div>
   <div class="col-md-6">
   		<header>
				<hgroup>
					<h1>회원 탈퇴하기</h1>
					<p>회원탈퇴를 신청하기 전에 안내 사항을 꼭 확인해주세요.</p> <br><br>
					<p><span style="font-weight: bold;">사용하고 계신 아이디(<span style="color: green;">${uvo.u_id}</span>)는 탈퇴할 경우 재사용 및 복구가 불가능합니다. </span></p>
					<p><span style="color: orange;">탈퇴한 아이디는 본인과 타인 모두 재사용 및 복구가 불가</span>하오니 신중하게 선택하시기 바랍니다.</p><br><br>
					<p><span style="font-weight: bold;">탈퇴 후 회원정보 및 서비스 이용기록은 모두 삭제됩니다.</span></p>
					<p>회원정보 및 게시물, 덧글 등의 서비스 이용기록은 모두 삭제되며, 삭제된 데이터는 복구되지 않습니다.</p>
				</hgroup>
			</header>
		    <form name="edit_form" action="leave.do" method="post" > 
			<br/>
				<input type="hidden" value="${uvo.u_idx }" name="u_idx"/>
				<input type="hidden" value="${uvo.u_id }" name="u_id"/>
		       	<input type="text" value="${uvo.u_id }"  class="form-control form-custom" disabled />
		      	<input type="password" placeholder="비밀번호 입력" name="u_pw" class="form-control form-custom"/>
<!-- 		      	<input type="password" placeholder="새 비밀번호" name="new_pw" class="form-control form-custom"/> -->
<!-- 		      	<input type="password" placeholder="새 비밀번호 확인" name="new_pw_chk" class="form-control form-custom"> -->
<%-- 		      	<input type="text" value="${uvo.u_name }" placeholder="이름" name="u_name" class="form-control form-custom"> --%>
<%-- 		      	<input type="text" value="${uvo.u_tel }" placeholder="전화번호" name="u_tel" class="form-control form-custom"> --%>
<%-- 		      	<input type="text" value="${uvo.u_email }" placeholder="이메일 주소" name="u_email" class="form-control form-custom"> --%>
<!-- 				<label>프로필 이미지 (png, jpg, jpeg, gif만 가능)</label><input type="file" class="form-control form-custom" name="real_image" id="image" onchange="inputImage()"/> -->
<!-- 				<div id="imagePreview" style="height: 150px; width: 150px; border: 1px gray dashed; border-radius:100%;"></div> -->
		        <div class="action_btns">
		            <div class="one_half" align="right">
		               <input type="button" class="btn btn-default btn-lg" value="탈퇴하기" onclick="leave(this.form)">
		            </div>
		        </div>
		    </form>
   </div>
   <div class="col-md-3">
   
   </div>
   </div>
    
<!-- footer -->
<jsp:include page="footer.jsp" />
	
</body>
</html>