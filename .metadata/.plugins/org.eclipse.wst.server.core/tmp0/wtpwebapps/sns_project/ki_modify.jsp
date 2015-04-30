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
	function ki_modify(f) {
		f.submit();
	}
	
	function chk() {
		if(document.edit_form.image_chk.checked == true) {
			document.edit_form.mf_image.disabled = false; 
		} else {
			document.edit_form.mf_image.disabled = true;
		}
	}
	
	function modi(){
		document.edit_form.k_kind.value="${kvo.k_kind}";
	}
	
</script>

<style type="text/css">

.form-custom{
	margin-bottom: 10px;
}
.sel-custom{
	height: 34px;
}
</style>

<title>W I S H</title>
</head>
<body onload="modi()">
<!-- 상단 메뉴  -->   
   <jsp:include page="search_bar.jsp" />
   <div class="wrap">
   
   <div class="col-md-3">
   	<jsp:include page="menu.jsp" />
   
   </div>
   <div class="col-md-6">
   		<header>
				<hgroup>
					<h1> 수정하기</h1>
				</hgroup>
			</header>
		    <form action="ki_modify_ok.do" method="post" name="edit_form" enctype="multipart/form-data">
			<br/>
				<input type="hidden" name="u_idx" value="${uvo.u_idx }">
				<input type="hidden" name="k_idx" value="${kvo.k_idx }">
				<input type="hidden" name="currpage" value="${currpage }">
				<input type="hidden" name="search_key1" value="${search_key1 }">
				<input type="hidden" name="search_key2" value="${search_key2 }">
			<label>기 카테고리 선택</label>
			<select class="form-control form-custom" name="k_kind">
					<option value="0" selected="selected">기 카테고리를 선택하세요</option>
					<option value="취업">취업</option>
					<option value="연애">연애</option>
					<option value="출세">출세</option>
					<option value="금전">금전</option>
					<option value="건강">건강</option>
					<option value="합격">합격</option>
					<option value="기타">기타</option>
			</select>
			<label>글 내용</label>
		      	<textarea class="form-control form-custom" name="k_content" rows="10">${kvo.k_content }</textarea>
				
				<input type="checkbox" name="image_chk" value="0" onclick="chk()">
				<label>이미지 수정하기 (png, jpg, jpeg, gif만 가능)</label><input type="file" class="form-control form-custom" name="mf_image" disabled/>
		        <div class="action_btns">
		            <div class="one_half" align="right">
		               <input type="button" class="btn btn-default btn-lg" value="수정하기" onclick="ki_modify(this.form)">
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