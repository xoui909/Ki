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
	var inputImage = (function loadImageFile() {
	
		if (window.FileReader) {
		var ImagePre;
		var ImgReader = new window.FileReader();
		var fileType = /^(?:image\/bmp|image\/gif|image\/jpeg|image\/png|image\/x\-xwindowdump|image\/x\-portable\-bitmap)$/i;

		ImgReader.onload = function(Event) {
			if (!ImagePre) {
				var newPreview = document.getElementById("imagePreview");
				ImagePre = new Image();
				ImagePre.style.width = "150px";
				ImagePre.style.height = "150px";
				ImagePre.style.borderRadius = "100%";
				newPreview.appendChild(ImagePre);
			}
			ImagePre.src = Event.target.result;

		};

		return function() {

			var img = document.getElementById("image").files;

			if (!fileType.test(img[0].type)) {
				alert("이미지 파일을 업로드 하세요");
				document.getElementById("image").value="";
				return;
			}

			ImgReader.readAsDataURL(img[0]);
		}

	}
	document.getElementById("imagePreview").src = document.getElementById("image").value;
	


})();

	function writee(f) {
		if(f.k_kind.value == 0){
			alert("기 카테고리를 선택해주세요");
			return;
		}
		if(f.k_content.value == ""){
			alert("글 내용을 입력하세요");
			f.k_content.focus();
			return;
		}
		if(f.k_max.value == ""){
			alert("기 개수를 입력하세요");
			f.k_max.focus();
			return;
		}
		if(f.k_max.value != "" && f.k_max.value > 30){
			alert("기 개수는 30을 넘을 수 없습니다");
			f.k_max.focus();
			return;
		}
		if(f.k_max.value != "" && f.k_max.value < 10){
			alert("기 개수는 10을 넘어야 합니다");
			f.k_max.focus();
			return;
		}
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
					<h1> 글쓰기</h1>
				</hgroup>
			</header>
		    <form action="ki_writeok.do" method="post" name="edit_form" enctype="multipart/form-data">
			<br/>
				<input type="hidden" name="u_idx" value="${uvo.u_idx }">
				<input type="hidden" name="currpage" value="${currpage }">
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
		      	<textarea class="form-control form-custom" name="k_content" rows="15" placeholder="글 내용을 입력하세요" id="k_content"></textarea>
		      	<input type="number" min="10" max="30" placeholder="기 개수를 입력하세요 (10~30 숫자만 입력)" name="k_max" class="form-control form-custom"/>
		      	<span style="font-size: 12px;float:right; ">기 크기는 이후 수정이 불가하므로 신중하게 입력해주세요</span><br/>
				<label>이미지 (png, jpg, jpeg, gif만 가능)</label><input type="file" class="form-control form-custom" name="mf_image" id="image"  onchange="inputImage()"/>
		        <div class="action_btns">
		            <div class="one_half" align="right">
		            <span class="counter">0</span>/300&nbsp;
		               <input type="button" class="btn btn-default btn-lg" value="글쓰기" onclick="writee(this.form)">
		            </div>
		        </div>
		    </form>
   </div>
   <div class="col-md-3">
   
   </div>
   </div>
    
<!-- footer -->
<jsp:include page="footer.jsp" />

<script type="text/javascript" src="js/jquery-1.11.2.js"></script>
<script type="text/javascript">
$('.form-custom').keyup(function(){
    var postLength = $("#k_content").val().length;
    $('.counter').text(postLength);


    if(postLength > 300){
        $('.btn').addClass('disabled');
    }else{
        $('.btn').removeClass('disabled');
    }
    
 });
</script>
</body>
</html>