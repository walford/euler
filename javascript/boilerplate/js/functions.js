// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	
	var equation1 = (Math.PI * Math.pow(100, 1));

	$('#result').html(equation1);

});

})(window.jQuery);