var main = function(){
    
	var $width=parseInt($(".list li").width()*$(".list li").size());
	var $height=parseInt($(".list li").height());
	var current; //현재의 마진레프트
	var time = 3000; //초기 시간 값
	var change_time;
	$(".list").css({
		width:$width,
		height:$height
	});
	$(".list ul li").clone().prependTo(".list ul");
	$(".list ul").css("marginLeft",-$width);

	//실행
	function play(){
		//현재의 마진레프트
		current = Math.abs(parseInt($(".list ul").css("margin-left")));
		//시간 나누기 값
		percent = current/$width;
		change_time = time*percent;
		$(".list ul").not(":animated").animate({
			marginLeft:0
		},change_time,"linear",function(){
			$(".list ul").css("marginLeft",-$width);
			play();
		});
	};
	play();

	//정지
	function stop(){
		$(".list ul").stop();
	};
	
	//제어
	$("button").click(function(){
		if($(this).attr("id") == "play"){
			play();
		}else if($(this).attr("id") == "stop"){
			stop();
		}else if($(this).attr("id") == "fast"){
			stop();
			play();
			if(time >= 1001)time -= 1000;
		}else if($(this).attr("id") == "slow"){
			stop();
			play();
			if(time <= 9999)time += 1000;
		};
	});

	//hover event
/*	$(".list").hover(function(){
		stop();
	},function(){
		play();
	});*/
	
	//시간 정보
	setInterval(function(){
		current = Math.abs(parseInt($(".list ul").css("margin-left")));
		percent = current/$width;
		change_time = time*percent;
		//$(".time").text("처음 애니메이션 속도 : "+time)
		//$(".change_time").text("적용 애니메이션 속도 : "+change_time);
	},10)
    
	}
$(document).ready(main);