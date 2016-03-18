$(document).ready(function () {

	$(".btn_nav").click(function(){
		var id = $(this).attr('id');
		$("."+id).toggle();

	});
}); 