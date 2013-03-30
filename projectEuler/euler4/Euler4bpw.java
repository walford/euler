// A palindromic number reads the same both ways. 
// The largest palindrome made from the product of 
// two 2-digit numbers is 9009 = 91 99. Find the 
// largest palindrome made from the product of two 
// 3-digit numbers.

import static java.lang.System.out;
import java.util.Arrays;

public class Euler4bpw {

	public static void main(String[] argv) {

		int answer = 0;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (is_palin(i,j) == true) {
					if (i * j > answer) {
						answer = i * j;
					}
				}
			}
		}

		out.println(answer);

	}

	static boolean is_palin(int i, int j){

		int first_num = i * j;
		char[] original = ("" + first_num).toCharArray();
		char[] switched = new char[original.length];
		int list_spot = switched.length-1;

		for (char k : original) {
			switched[list_spot] = k;
			list_spot--;
		}
        
        if (Arrays.equals(original, switched)) {
        	return true;
        }
        return false;

	}

}













