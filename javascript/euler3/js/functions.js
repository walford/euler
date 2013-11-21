// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){

	console.log('13105 % 5 = '+ 13105 % 5);
	console.log('13105 % 7 = '+ 13105 % 7);
	console.log('13105 % 13 = '+ 13105 % 13);
	console.log('13105 % 29 = '+ 13105 % 29);

	$('#result').html();

});

})(window.jQuery);