
$(document).ready(function (){
	
	var x = 1,
		y = 2,
		evenSum = 0,
		sum = 0;

	while ( y <= 4000000 ) {
		
		sum = x + y;

		if( y%2==0 ){
			evenSum+= y;
			console.log( y +' === '+evenSum);
		}
		x = y;
		y = sum;
	}

	$('#result').html(evenSum);

});
