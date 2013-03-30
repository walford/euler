// The prime factors of 13195 are 5, 7, 13 and 29. What 
// is the largest prime factor of the number 600851475143 ?
// 6857

import static java.lang.System.out;

public class Euler3bp {

    public static void main(String[] argv) {

        long num = 600851475143L;
        long answer = 0;

        for (long i = 1L; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (is_prime(i) == true) {
                    answer = i;
                }
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













