// Starting in the top left corner of a 2x2 grid, and only being able 
// to move to the right and down, there are exactly 6 routes to the 
// bottom right corner.

// How many such routes are there through a 20x20 grid?

import static java.lang.System.out;

public class Euler15bpw {

	public static void main(String[] argv) {

		double answer = 0;

		double v1 = 40;
		double v2_and_v3 = 20;

		for(double i=39; i>0; i--) {
			v1 *= i;
		}
		for(double i=19; i>0; i--) {
			v2_and_v3 *= i;
		}

		answer = v1 / (v2_and_v3 * v2_and_v3);

		out.println(answer);

	}

}






