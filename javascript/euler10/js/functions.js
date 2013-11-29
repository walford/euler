// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	var result = 0;
	
	for(var i = 2; i < 2000000; i++) {
		if( isPrime(i) ){
			result += i;
		}
	}

	$('#result').html(result);

	function isPrime (num) {
		for(var j = 2; j <= Math.sqrt(num); j++) {
			if( num % j == 0 ){
				return false;
			}
		}
		return true;
	}

});

})(window.jQuery);