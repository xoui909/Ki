<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<!-- for icons -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

<!-- jquery -->
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>

<!-- custom js -->
<script type="text/javascript" src="js/menu_js.js"></script>
<script type="text/javascript" src="js/about.js"></script>

<!-- custom css -->
<link href="css/menu_css.css" rel="stylesheet">
<link href="css/about.css" rel="stylesheet">

<script type="text/javascript">
function chk() {
	
	if("${chk}"=="success"){
		alert("회원가입을 축하드립니다.");
	}else if("${chk}"=="fail"){
		document.join_form.u_name.value="${uvo.u_name}";
		document.join_form.u_email.value="${uvo.u_email}";
		document.join_form.u_tel.value="${uvo.u_tel}";
		
		var birth = "${uvo.u_birth}";
		var r = birth.split("-");
		
		document.join_form.birth_year.value = r[0];
		document.join_form.birth_month.value = r[1];
		document.join_form.birth_day.value = r[2];
		
		document.join_form.u_id.focus();
		alert("이미 사용 중인 아이디입니다.");
		return;
	}
}

function join(f) {
	for (var i = 0; i < f.elements.length; i++) {
		if (f.elements[i].value == "") {
			alert(f.elements[i].placeholder + "를 입력하세요.");
			f.elements[i].focus();
			return;//수행 중단
		}
	}
	if(f.birth_year.value=="0" || f.birth_month.value=="0" || f.birth_day.value=="0"){
		alert("생년월일을 입력하세요.");
		return;
	}
	if(f.u_pw.value!=f.pw_chk.value){
		alert("비밀번호가 다릅니다.");
		return;
	}
	if(f.u_gender.value==""){
		alert("성별을 입력하세요.");
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
<body onload="chk()">
<!-- 상단 메뉴  -->   
   <jsp:include page="nav_bar.jsp" />
   <div class="wrap">
   
   <div class="col-md-5">
   	   <!-- about -->	
   
   <div class="slider">

		<div class="slide active-slide">
			<div class="container">
				<div class="row">
					<div class="slide-copy col-xs-5">
				 		<h1 style="font-family: 'Raleway', sans-serif;">W I S H</h1>
				 		<p>위시에서 전세계 친구들과 기분 좋은 행운을 나눠보세요</p>
				 		<img src="images/dis1.png" height="250px" width="100%"/>
					</div>
				</div>
			</div>
		</div>
		<div class="slide">
			<div class="container">
				<div class="row">
					<div class="slide-copy col-xs-5">
						<h1 style="font-family: 'Raleway', sans-serif;">W I S H</h1>
						<p>위시는 어떻게 이용해야 하나요?</p>
						<table>
						<tr align="center">
							<td width="35%"><img src="images/profile_female.png" class="circle-img"/><br/><br/>
							<span style="font-size: 12px;">좋은 일이 생기면<br/>친구들과 좋은 기를 나누는 <br/>글을 작성합니다</span>
							
							</td><td width="35%"><img src="images/arrow-right.png" width="50%"/><br/><img src="images/arrow-left.png" width="50%"/>
							</td><td><img src="images/profile_male.png" class="circle-img"/>
							<br/><br/><span style="font-size: 12px;">'기 받기' 버튼을 클릭하여<br/> 친구들의 좋은 기를 <br/>나눠받습니다</span>
							</td>
						</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="slide">
			<div class="container">
				<div class="row">
					<div class="slide-copy col-xs-5">
						<h1 style="font-family: 'Raleway', sans-serif;">W I S H</h1>
						<p>친구들에게 받은 기를 모아 소원을 이루세요</p>
						<table width="100%">
						<tr align="center">
							<td><img src="images/profile_male.png" class="circle-img"/>
							<br/><span style="font-size: 15px;">다이어트 성공 기원!</span>
							<br/><br/>
							<img alt="" src="images/progressbar.png">
							</td>
						</tr>
						
						</table>
					</div>
				</div>
			</div>
		</div>
		 <div class="slide">
			<div class="container">
				<div class="row">
				 <div class="slide-copy col-xs-5">
						<h1 style="font-family: 'Raleway', sans-serif;">W I S H</h1>
						<p>기를 모두 모으면 어디에서도 볼 수 없는 특별한 선물이 당신을 찾아갑니다 :D</p>
						<br/>
						<img src="images/gift.png" width="100px"/>&nbsp;&nbsp;
						<img src="images/gift2.png" width="100px"/>&nbsp;&nbsp;
						<img src="images/gift4.png" width="100px"/>&nbsp;&nbsp;
						<img src="images/gift3.png" width="100px"/> 
					</div>
				</div>
			</div>
		</div>

		

	</div>
   
   
<div class="slider-nav">
		<a href="#" class="arrow-prev"><img
			src="images/arrow-prev.png"></a>
		<ul class="slider-dots">
			<li class="dot active-dot">&bull;</li>
			<li class="dot">&bull;</li>
			<li class="dot">&bull;</li>
			<li class="dot">&bull;</li>
		</ul>
		<a href="#" class="arrow-next"><img
			src="images/arrow-next.png"></a>
	</div>
   
   
   
   </div>
   	
   	
   	
   
   </div>
   <div class="col-md-6">
   		<header>
				<hgroup>
					<h1> 가입하기</h1>
					<h3> 아직도 회원이 아닌가요? <br/>
					위시에 가입하고 좋은 기를 모으세요.</h3>
				</hgroup>
			</header>
		    <form name="join_form" action="join.do" method="post" id="join_for">
			<br/>				
		       	<input type="text" placeholder="아이디" name="u_id" class="form-control form-custom"/>
		       	<input type="password" placeholder="비밀번호" name="u_pw" class="form-control form-custom"/>
		      	<input type="password" placeholder="비밀번호 확인" name="pw_chk" class="form-control form-custom">
		      	<input type="text" placeholder="이름" name="u_name" class="form-control form-custom">
		      	
		      	<label>생일</label> &nbsp;&nbsp;
		      	<select name="birth_year" class="sel-custom">
		      		<option	value="0" selected="1">연도</option>
					<option value="2015">2015</option>
					<option value="2014">2014</option>
					<option value="2013">2013</option>
					<option value="2012">2012</option>
					<option value="2011">2011</option>
					<option value="2010">2010</option>
					<option value="2009">2009</option>
					<option value="2008">2008</option>
					<option value="2007">2007</option>
					<option value="2006">2006</option>
					<option value="2005">2005</option>
					<option value="2004">2004</option>
					<option value="2003">2003</option>
					<option value="2002">2002</option>
					<option value="2001">2001</option>
					<option value="2000">2000</option>
					<option value="1999">1999</option>
					<option value="1998">1998</option>
					<option value="1997">1997</option>
					<option value="1996">1996</option>
					<option value="1995">1995</option>
					<option value="1994">1994</option>
					<option value="1993">1993</option>
					<option value="1992">1992</option>
					<option value="1991">1991</option>
					<option value="1990">1990</option>
					<option value="1989">1989</option>
					<option value="1988">1988</option>
					<option value="1987">1987</option>
					<option value="1986">1986</option>
					<option value="1985">1985</option>
					<option value="1984">1984</option>
					<option value="1983">1983</option>
					<option value="1982">1982</option>
					<option value="1981">1981</option>
					<option value="1980">1980</option>
					<option value="1979">1979</option>
					<option value="1978">1978</option>
					<option value="1977">1977</option>
					<option value="1976">1976</option>
					<option value="1975">1975</option>
					<option value="1974">1974</option>
					<option value="1973">1973</option>
					<option value="1972">1972</option>
					<option value="1971">1971</option>
					<option value="1970">1970</option>
					<option value="1969">1969</option>
					<option value="1968">1968</option>
					<option value="1967">1967</option>
					<option value="1966">1966</option>
					<option value="1965">1965</option>
					<option value="1964">1964</option>
					<option value="1963">1963</option>
					<option value="1962">1962</option>
					<option value="1961">1961</option>
					<option value="1960">1960</option>
					<option value="1959">1959</option>
					<option value="1958">1958</option>
					<option value="1957">1957</option>
					<option value="1956">1956</option>
					<option value="1955">1955</option>
					<option value="1954">1954</option>
					<option value="1953">1953</option>
					<option value="1952">1952</option>
					<option value="1951">1951</option>
					<option value="1950">1950</option>
					<option value="1949">1949</option>
					<option value="1948">1948</option>
					<option value="1947">1947</option>
					<option value="1946">1946</option>
					<option value="1945">1945</option>
					<option value="1944">1944</option>
					<option value="1943">1943</option>
					<option value="1942">1942</option>
					<option value="1941">1941</option>
					<option value="1940">1940</option>
					<option value="1939">1939</option>
					<option value="1938">1938</option>
					<option value="1937">1937</option>
					<option value="1936">1936</option>
					<option value="1935">1935</option>
					<option value="1934">1934</option>
					<option value="1933">1933</option>
					<option value="1932">1932</option>
					<option value="1931">1931</option>
					<option value="1930">1930</option>
					<option value="1929">1929</option>
					<option value="1928">1928</option>
					<option value="1927">1927</option>
					<option value="1926">1926</option>
					<option value="1925">1925</option>
					<option value="1924">1924</option>
					<option value="1923">1923</option>
					<option value="1922">1922</option>
					<option value="1921">1921</option>
					<option value="1920">1920</option>
					<option value="1919">1919</option>
					<option value="1918">1918</option>
					<option value="1917">1917</option>
					<option value="1916">1916</option>
					<option value="1915">1915</option>
					<option value="1914">1914</option>
					<option value="1913">1913</option>
					<option value="1912">1912</option>
					<option value="1911">1911</option>
					<option value="1910">1910</option>
					<option value="1909">1909</option>
					<option value="1908">1908</option>
					<option value="1907">1907</option>
					<option value="1906">1906</option>
					<option value="1905">1905</option>
				</select>
				<select name="birth_month" class="sel-custom">
					<option	value="0" selected="1">월</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select>
				<select name="birth_day" class="sel-custom">
					<option value="0" selected="1">일</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
				</select>
		      	<p/>
		      
		      	<label>성별</label> &nbsp;&nbsp;
				<input type="radio" name="u_gender" value="male"> 남		      	
				<input type="radio" name="u_gender" value="female"> 여 <p/> 
		      	<input type="text" placeholder="휴대전화 번호" name="u_tel" class="form-control form-custom">
		      	<input type="text" placeholder="이메일" name="u_email" class="form-control form-custom">
		
		        <div class="action_btns">
		            <div class="one_half" align="right">
		               <input type="button" class="btn btn-default btn-lg" value="가입하기" onclick="join(this.form)">
		            </div>
		        </div>
		    </form>
   </div>
   <div class="col-md-1">
   
   </div>
   </div>
    
<!-- footer -->
<jsp:include page="footer.jsp" />
	
</body>
</html>