// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	
	var result = 0,
		i = 0;

	for(i; i<1000; i++){
		if(i%3 === 0 || i%5 === 0){
			result += i;
		}
	}
	
	$('#result').html(result);

});

})(window.jQuery);