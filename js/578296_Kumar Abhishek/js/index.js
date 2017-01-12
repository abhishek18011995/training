$(document).ready(function()
	{
	 	$("#sidePanel").hide();
	});


$(document).ready(function()
	{
		$('#button').click(function()
			{	
				$('#sidePanel').show();
				$('#sidePanel').animate({width:'500px'},2000);

	});
});