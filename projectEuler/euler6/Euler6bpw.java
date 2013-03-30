// The sum of the squares of the first ten natural numbers is,
// 1^2 + 2^2 + ... + 102 = 385  (1, 4, 9, )
// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)2 = 552 = 3025
// Hence the difference between the sum of the squares of the 
// first ten natural numbers and the square of the sum is 
// 3025 - 385 = 2640. Find the difference between the sum of the 
// squares of the first one hundred natural numbers and the square 
// of the sum.

import static java.lang.System.out;

public class Euler6bpw {

	public static void main(String[] argv) {

		int sum_of_squares = 0;
		for(int i = 1; i < 101; i++) {
			int adding = (int) Math.pow(i,2);
			sum_of_squares += adding;
		}

		int square_of_sum = 0;
		for(int i = 0; i < 101; i++) {
			square_of_sum += i;
			if(i == 100) {
				square_of_sum = (int) Math.pow(square_of_sum, 2);
			}
		}

		int answer = (sum_of_squares - square_of_sum) * -1; // * -1 to make answer positive

		out.println(answer);

	}

}











