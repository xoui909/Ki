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

	function edit_pw(f) {
// 		if("${uvo.u_pw}"==f.u_pw.value){
			if(f.new_pw.value==f.new_pw_chk.value){
					f.submit();
				}
			else{
				alert("새 비밀번호가 일치하지 않습니다.");
			}
// 		}else{
// 			alert("현재 비밀번호가 맞지 않습니다.");
// 		}
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
<body>
<!-- 상단 메뉴  -->   
   <jsp:include page="search_bar.jsp" />
  	 <div class="wrap">
   <div class="col-md-3">
   	<jsp:include page="menu.jsp" />
   </div>
   <div class="col-md-6">
   		<header>
				<hgroup>
					<h1> 비밀번호 변경하기</h1>
				</hgroup>
			</header>
		    <form name="edit_form" action="edit_password.do" method="post" > 
			<br/>
				<input type="hidden" value="${uvo.u_idx }" name="u_idx"/>
<%-- 		       	<input type="text" value="${uvo.u_id }" name="u_id" class="form-control form-custom" disabled /> --%>
<!-- 		      	<input type="password" placeholder="현재 비밀번호" name="u_pw" class="form-control form-custom"/> -->
		      	<input type="password" placeholder="새 비밀번호" name="new_pw" class="form-control form-custom"/>
		      	<input type="password" placeholder="새 비밀번호 확인" name="new_pw_chk" class="form-control form-custom">
<%-- 		      	<input type="text" value="${uvo.u_name }" placeholder="이름" name="u_name" class="form-control form-custom"> --%>
<%-- 		      	<input type="text" value="${uvo.u_tel }" placeholder="전화번호" name="u_tel" class="form-control form-custom"> --%>
<%-- 		      	<input type="text" value="${uvo.u_email }" placeholder="이메일 주소" name="u_email" class="form-control form-custom"> --%>
<!-- 				<label>프로필 이미지 (png, jpg, jpeg, gif만 가능)</label><input type="file" class="form-control form-custom" name="real_image" id="image" onchange="inputImage()"/> -->
<!-- 				<div id="imagePreview" style="height: 150px; width: 150px; border: 1px gray dashed; border-radius:100%;"></div> -->
		        <div class="action_btns">
		            <div class="one_half" align="right">
		               <input type="button" class="btn btn-default btn-lg" value="수정" onclick="edit_pw(this.form)">
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