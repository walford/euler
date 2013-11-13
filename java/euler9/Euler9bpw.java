// A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

// a2 + b2 = c2
// For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

import static java.lang.System.out;

public class Euler9bpw {

	public static void main(String[] argv) {

		int answer = 0;

		int py_a = 0;
		int py_b = 0;
		int py_c = 0;

		for (int a=1; a<1000; a++) {
			for (int b=1; b<1000; b++) {
				for (int c=1; c<1000; c++) {
					if(a+b+c == 1000) {
						if((Math.pow(a,2))+(Math.pow(b,2)) == (Math.pow(c,2))) {
							py_a = a;
							py_b = b;
							py_c = c;
						}
					}
				}
			}
		}

		answer = py_a * py_b * py_c;
		out.println(answer);

	}

}










