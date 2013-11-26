// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	var result = 0;

	for (var i = 100; i < 1000; i++) {
		for(var j = i; j<1000; j++){
			
			var x = i*j;
			x.toString();
			var y = x.toString().split("").reverse().join("");

			if(x == y && x > result){
				result = x;
			}
		}
	};

	$('#result').html(result);

});

})(window.jQuery);