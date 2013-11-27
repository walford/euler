// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	var result;

	for(var i = 100000000; i < 1000000000; i++){
		if(i%20 == 0 && i%13 == 0){
			if( modulo(i) == 20 ){
				result = i;
				console.log('Answer = '+i);
				break;
			}
		}
	}
	$('#result').html(result);

	function modulo (variable) {
		var divisable = 0;

		for(var j = 1; j <= 20; j++){
			if(variable%j == 0){
				divisable++;
			}
		}
		return divisable;
	}
});

})(window.jQuery);