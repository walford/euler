// remap jQuery to $
(function($){


/* trigger when page is ready */
$(document).ready(function (){
	var result = 0,
		matrix = new Object($('#matrix').html().split('<br>'));

	for(var i = 0; i < matrix.length; i++){
		matrix[i] = (matrix[i].replace(/[^0-9]/g, ' '));
		matrix[i] = new Object(matrix[i].replace(/ +(?= )/g,'').split(' '));
	}

	for( var i = 0; i < matrix.length-5; i++ ){	
		for( var j = 1; j < matrix[i].length-4; j++ ){
			if( quadEval(matrix, i, j) > result) {
				result = quadEval(matrix, i, j);
			}
		}
	}

	$('#result').html(result);

	function quadEval (matrix , i , j ) {
		var right = 0,
			down = 0,
			diagRight = 0,
			diagLeft = 0,
			highValue = 0;

		right = matrix[i][j]*matrix[i][j+1]*matrix[i][j+2]*matrix[i][j+3];
		if(right > highValue){
			highValue = right;
		}
		down = matrix[i][j]*matrix[i+1][j]*matrix[i+2][j]*matrix[i+3][j]
		if(down > highValue){
			highValue = down;
		}
		diagRight = matrix[i][j]*matrix[i+1][j+1]*matrix[i+2][j+2]*matrix[i+3][j+3]
		if(diagRight > highValue){
			highValue = diagRight;
		}
		diagLeft = matrix[i][j]*matrix[i+1][j-1]*matrix[i+2][j-2]*matrix[i+3][j-3]
		if(diagLeft > highValue){
			highValue = diagLeft;
		}
		
		return highValue;
	}

});

})(window.jQuery);