// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	var num = 600851475143,
		result,
		temp;

	for(var i = 1; i < Math.sqrt(num); i++) {
		if( num % i == 0 && i % 1 == 0 ){
			if( isPrime(i) ) {
				result = i;
			}
		}
	}

	$('#result').html(result);

	function isPrime (num) {
		for(var j = 2; j < Math.sqrt(num); j++) {
			if( num % j == 0 ){
				return false;
			}
		}
		return true;
	}

});

})(window.jQuery);