<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	function pw_chk(f) {
			f.submit();
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
	margin-top: 50px !important; 
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
					<h1>비밀번호 재확인</h1>
					<h3>안전한 정보 수정을 위해 비밀번호를 다시 한 번 입력해주세요.</h3>
				</hgroup>
			</header>
		    <form name="edit_form" action="go_modify.do" method="post" > 
			<br/>
				<input type="hidden" value="${uvo.u_idx }" name="u_idx"/>
				<input type="hidden" value="${uvo.u_id }" name="u_id"/>
				<input type="hidden" value="${type }" name="type"/>
<%-- 		       	<input type="hidden" value="${uvo.u_id }" name="u_id" /> --%>
		       	<input type="text" value="${uvo.u_id }" name="u_id" class="form-control form-custom" disabled />
		      	<input type="password" placeholder="비밀번호" name="u_pw" class="form-control form-custom"/>
<!-- 		      	<input type="password" placeholder="새 비밀번호" name="new_u_pw" class="form-control form-custom"/> -->
<!-- 		      	<input type="password" placeholder="새 비밀번호 확인" name="new_pw_chk" class="form-control form-custom"> -->
<%-- 		      	<input type="text" value="${uvo.u_name }" placeholder="이름" name="u_name" class="form-control form-custom"> --%>
<%-- 		      	<input type="text" value="${uvo.u_tel }" placeholder="전화번호" name="u_tel" class="form-control form-custom"> --%>
<%-- 		      	<input type="text" value="${uvo.u_email }" placeholder="이메일 주소" name="u_email" class="form-control form-custom"> --%>
<!-- 				<label>프로필 이미지 (png, jpg, jpeg, gif만 가능)</label><input type="file" class="form-control form-custom" name="real_image" id="image" onchange="inputImage()"/> -->
<!-- 				<div id="imagePreview" style="height: 150px; width: 150px; border: 1px gray dashed; border-radius:100%;"></div> -->
		        <div class="action_btns">
		            <div class="one_half" align="right">
		               <input type="button" class="btn btn-default btn-lg" value="확인" onclick="pw_chk(this.form)">
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