$(function(){
	$(".topbar_2_btn_self").mouseover(function() {
		$(this).addClass("topbar_2_btn_self_hover");
	});
	$(".topbar_2_btn_self").mouseout(function() {
		$(this).removeClass("topbar_2_btn_self_hover");
	});

	$(".tab_li").click(function() {
		$(".am-active").removeClass("am-active");
		$(this).addClass("am-active");
		
	});

	$(".hot_lables_btn").click(function() {
		$(this).toggleClass("hot_lables_btn_active");
	});	
	$(".hot_lables_btn_active").click(function() {
		$(this).toggleClass("hot_lables_btn");
	});

})