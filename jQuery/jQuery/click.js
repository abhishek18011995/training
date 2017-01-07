$(document).ready(function(){
	$("p").on({
		mouseenter:function(){
			$(this).css("background-color","#ffcccc");
		},


		mouseleave:function(){
			$(this).css("background-color","#99ff99");

	},
		click:function(){
			$(this).css("background-color","#9999cc");
		}
	});
});