$(document).ready(function(){
	  //여러 ajax에서 동일하게 사용 되는 속성 global로 설정
	   $.ajaxSetup({
		   contentType:'application/x-www-form-urlencoded;charset=UTF-8',
		   type: "post"
       });
	   function getData(s,u){
		   $.ajax({
			  //url은 /프로젝트명/servlet문서에서 정의한 @WebServlet의 urlpattern
	          url: "allAjList.do",
	          dataType: "xml", // 결과데이터 타입
	          success: function (data) { 
	        	  
	        	  
	        	  $(data).find('kire').each(function (index) {
	        		  $("#table_"+$(this).find("no").text()+" tr:gt(0)").remove();	        		
	        	  })	        	  
	        	  var table="";
	        	  var post_table="";
				  $(data).find('kire').each(function (index) {//customer element를 찾아서
					  	table+="<tr>";
	                    table+="<td><img src=/sns_project/"+$(this).find("img").text()+" class='img-circle' width='30px' height='30px' align='center'/></td>";
	                    table+="<td><a href='myList.do?u_idx="+$(this).find("ru_idx").text()+"' style='cursor: pointer;'>"+$(this).find("name").text()+"</a></td>";
	                    table+="<td width='60%'>"+$(this).find("content").text()+"</td><td width='15%'>"+$(this).find("date").text()+"</td>";
	                    
	                    if($(this).find("ru_idx").text()== u || s=="1"){
	                    				  
							table += "<td><input type='button' value='삭제' id='cmtout' class='btn btn-default btn-xs' name='"+$(this).find("r_idx").text()+"'/></td>";
											
	                    }else{
	                   		table += "<td><input type='button' value='삭제'  class='btn btn-default btn-xs' disabled='disabled'/></td>"	
	                    }
					    table+="</tr>";
					    $("#table_"+$(this).find("no").text()+" tr:eq(0)").after(table);
					    table="";
				     })
				     
	                 
				     //테이블의 첫번째 행 뒤에 table 추가한다.
			 },
	         error: function (data) { alert(data+'=> 에러 발생'); }
	       });//ajax끝
		   
	  }//getData()함수끝	   
	   
	   
	   
	   // 코멘트 등록
	   $(".table").on("click",'#cmtin', function(){	
		   
		   $.ajax({ 
			   url: "ki_cmt_aj_add.do",
			   dataType: "text", // 결과데이터 타입 
			   data: {r_u_idx : $("#r_u_idx_"+$(this).attr("name")).val(), k_idx : $("#k_idx_"+$(this).attr("name")).val(),r_content : $("#r_content_"+$(this).attr("name")).val() },
			   success: function (data) { 
				   if(data>0){
					   
					     getData(s,u)
					   //input태그 중 속성 type=text 태그를 찾아서 모두 text value를 지운다.
					   $("input[type=text]").each(function(){
						   $(this).val("");
					   });
					   $("textarea").each(function(){
						   $(this).val("");
					   });
				   }else{
					   	alert("댓글을 입력하세요");   
				   }
			   },
			   error: function (data) { alert(data+'=> 에러 발생'); }
		   }); //ajax끝		
	   })//click끝
	   
	    // 기받기
	   $(".post-table").on("click",'#get_ki', function(){
		   var u_idx = $("#ki_u_idx_"+$(this).attr("name")).val();
		   $.ajax({ 
			   url: "ki_up.do",
			   dataType: "text", // 결과데이터 타입 
			   data: {ki_u_idx : $("#ki_u_idx_"+$(this).attr("name")).val(),k_idx : $("#k_idx_"+$(this).attr("name")).val() },
			   success: function (data) {
				   
				   if($(data).find('status').text()=="no"){
						alert("소원이없습니다. 소원을 등록하세요");
						location.href="wish.do?u_idx="+u_idx;
					}else if($(data).find('status').text()=="wish"){
						alert("이미 소원을 달성하셨습니다!! 새소원을 등록하여 주십시오.");
						location.href="wish.do?u_idx="+u_idx;
					}else if($(data).find('status').text()=="success"){
						alert("달성!! 새소원을 등록해주세요");
						location.href="wish.do?u_idx="+u_idx;
					}else if($(data).find('status').text()=="ki"){
						alert("이미 기를 받으셨습니다.");
					}else{
						alert("성공!");
					}
				   
				   
				   var post_table="";				   
				   $(data).find('ki').each(function (index) {
					   $("#po"+$(this).find("no").text()+" td:lt(1)").remove();	        	
					   post_table +="<td colspan='2' align='right'><h4><b>받아라 "+$(this).find("kind").text()+" 기! ("+$(this).find("hit").text()+"/"+$(this).find("max").text()+")</b></h4></td>";
					   $("#po"+$(this).find("no").text()+" td:eq(0)").before(post_table);
					   post_table="";
		          })
						
			   },
			   error: function (data) { alert(data+'=> 에러 발생'); }
		   }); //ajax끝		
	   })//click끝
	
	   //삭제
	   $(".table").on("click","#cmtout", function(){
		   var t = confirm("삭제하시겠습니까??");
		   if(t==false){
			   return;
		   }
		   $.ajax({ 
			   url: "aj_delete.do",
			   dataType: "text", // 결과데이터 타입 
			   data: "r_idx="+$(this).attr("name"),
			   success: function (data) { 
				   
				   if(data>0){
					   
					     getData(s,u)
					   //input태그 중 속성 type=text 태그를 찾아서 모두 text value를 지운다.
				   }else{
					  
				   }
			   },
			   error: function (data) { alert(data+'=> 에러 발생'); }
		   }); //ajax끝
		;
	   })//click끝
  getData(s,u); //onLoad되면 레코드 가져오기
	   
})//ready끝