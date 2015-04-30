<%@page import="java.util.Random"%>
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


<script type="text/javascript" src="js/jquery-1.11.2.js"></script>
<script type="text/javascript"
	src="rotate3Di/jquery-css-transform/jquery-css-transform.js"></script>
<script type="text/javascript" src="rotate3Di/rotate3Di.js"></script>

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<style type="text/css">
body {
	background-color: transparent;
}

h2 a {
	display: block;
	padding: 48px 0;
}

p a {
	display: block;
	padding: 36px 24px;
}

#nav-list-example {
	width: 1500px;
	height: 600px;
	margin: 48px 0;
	list-style: none;
}

#nav-list-example li {
	width: 300px;
	height: 600px;
	float: left;
	margin-right: 100px;
	position: relative;
}

#nav-list-example li div {
	overflow: hidden;
	background: white;
	position: absolute;
	top: 0;
	left: 0;
}

#nav-list-example li div.back {
	left: -999em;
}
</style>
<script type="text/javascript">
	
<%Random random = new Random();
			int r = random.nextInt(12) + 1;%>
	$(document).ready(function() {
		$(".filter").fadeIn("400");
		$('#nav-list-example li div.back').hide().css('left', 0);

		function mySideChange(front) {
			if (front) {
				$(this).parent().find('div.front').show();
				$(this).parent().find('div.back').hide();
			} else {
				$(this).parent().find('div.front').hide();
				$(this).parent().find('div.back').show();
			}
		}
		var s = 1;

		function myComplete() {
			$(this).find('div.back').show();

			$('.back').on("click", function() {
				if (s == 2) {
					alert("부적이 추가되었습니다");
					s=3;
					parent.bujuk();
					
				}
			})
		}

		$('.gift').on("click", function() {
			if (s == 1) {
				$(this).find('div').rotate3Di('flip', 250, {
					direction : 'clockwise',
					sideChange : mySideChange,
					complete : myComplete					
				});
				s=2;
				if(<%=r%>>7){				
					
					s=0;
					parent.trap();					
				}					
			}
		}
		/* ,
		function () {
		$(this).find('div').stop().rotate3Di('unflip', 500, {sideChange: mySideChange});
		}  */
		);
	});

	/*$(document).ready(function () {
	 function mySideChange(front) {
	 if (front) {
	 $(this).css('background', '#f0f');
	 } else {
	 $(this).css('background', '#0f0');
	 }
	 }

	 function myComplete() {
	 $('#ex7').css('backgroundColor', '#f00');
	 }

	 $('#ex7').click(function () {
	 $(this).rotate3Di(
	 '360',
	 3000,
	 {
	 sideChange: mySideChange,
	 complete: myComplete
	 }
	 );
	 }); 

	 });*/
</script>
</head>
<body oncontextmenu="return false">
<div id="trap"></div>
	<input type="hidden" id="bujuk" value="<%=r%>">
	<ul id="nav-list-example">
		<li><a class="gift">
				<div class="front">
					<img src="images/wish_back.png" />
				</div>
				<div class="back">
					<img src="collection/<%=r%>.png" />
				</div>
		</a></li>
		<li><a class="gift">
				<div class="front">
					<img src="images/wish_back.png" />
				</div>
				<div class="back">
					<img src="collection/<%=r%>.png" />
				</div>
		</a></li>
		<li><a class="gift">
				<div class="front">
					<img src="images/wish_back.png" />
				</div>
				<div class="back">
					<img src="collection/<%=r%>.png" />
				</div>
		</a>
	</ul>

</body>
</html>