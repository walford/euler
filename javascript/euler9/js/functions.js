// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	var result = 0,
		a = 3,
		b = 4,
		c = 0;
	
	while( a+b+c < 10000){
		for(b = 2; b < 500; b++){
			c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
			if(c%1 == 0 && (a+b+c) == 1000){
				result = a*b*c;
				break;
			}
		}
		a++;
	}

	$('#result').html(result);

});

})(window.jQuery);