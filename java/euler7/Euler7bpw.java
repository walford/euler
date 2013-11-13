// By listing the first six prime numbers: 2, 3, 5, 7, 11, 
// and 13, we can see that the 6th prime is 13. What is the 
// 10 001st prime number?

import static java.lang.System.out;

public class Euler7bpw {

	public static void main(String[] argv) {

		int answer = 0;
		int count = 0;


		for(int i = 2; i < 10000000; i++) {
			if (is_prime(i) == true) {
				if(count == 10001) {
					break;
				}
				out.println(i);
				count += 1;
				answer = i;
			}
		}

		out.println(answer);

	}

	public static boolean is_prime(long num) {

        for (long i = 2L; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}











