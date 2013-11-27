// remap jQuery to $
(function($){

/* trigger when page is ready */
$(document).ready(function (){
	var result = 0,
		count = 100;
	
	result = squareOfSum(count) - sumOfAll(count);

	$('#result').html(result);

	function squareOfSum (count) {
		var sum = 0;
		for(var i = 0; i <= 100; i++){
			sum += i;
		}
		return Math.pow(sum, 2);
	}

	function sumOfAll (count) {
		var sum = 0;
		for(var i = 0; i <= 100; i++){
			sum += Math.pow(i,2);
		}
		return sum;
	}
});

})(window.jQuery);