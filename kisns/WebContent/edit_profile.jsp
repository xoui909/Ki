<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

function edit(f) {
	f.submit();
}
</script>
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
					alert("�̹��� ������ ���ε� �ϼ���");
					return;
				}

				ImgReader.readAsDataURL(img[0]);
			}

		}
		document.getElementById("imagePreview").src = document
				.getElementById("image").value;

	})();
	
</script>


<style type="text/css">

.form-custom{
	margin-bottom: 10px;
}
.sel-custom{
	height: 34px;
}
</style>



<title>Insert title here</title>
</head>
<body>
<!-- ��� �޴�  -->   
   <jsp:include page="search_bar.jsp" />
   <div class="wrap">
   
   <div class="col-md-3">
   	<jsp:include page="menu.jsp" />
   
   </div>
   <div class="col-md-6">
   		<header>
				<hgroup>
					<h1> ������ �����ϱ�</h1>
				</hgroup>
			</header>
		    <form name="edit_form" action="edit_profile.do" method="post">
			<br/>
		       	<input type="text" placeholder="���̵�" name="id" class="form-control form-custom" />
		      	<input type="password" placeholder="��й�ȣ" name="pw" class="form-control form-custom"/>
		      	<input type="password" placeholder="��й�ȣ Ȯ��" name="pw_chk" class="form-control form-custom">
		      	<input type="text" placeholder="�̸�" name="name" class="form-control form-custom">
		      	<input type="text" placeholder="�޴���ȭ ��ȣ" name="tel" class="form-control form-custom">
		      	<input type="text" placeholder="�̸���" name="email" class="form-control form-custom">
				<label>������ �̹��� (png, jpg, jpeg, gif�� ����)</label><input type="file" class="form-control form-custom" name="u_image" id="image" onchange="inputImage()"/>
				<div id="imagePreview" style="height: 150px; width: 150px; border: 1px gray dashed; border-radius:100%;"></div>
		        <div class="action_btns">
		            <div class="one_half" align="right">
		               <input type="button" class="btn btn-default btn-lg" value="����" onclick="edit(this.form)">
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