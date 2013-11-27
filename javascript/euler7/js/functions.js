// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	var result = 0,
		num = 2;
		count = 0;

	while(count < 10001){
		if( isPrime(num) ){
			result = num;
			count++;
		}
		num++;
	}

	
	$('#result').html(result);

	function isPrime (num) {
		for(var j = 2; j < num; j++) {
			if( num % j == 0 ){
				return false;
			}
		}
		return true;
	}

});

})(window.jQuery);