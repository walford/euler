// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

// What is the sum of the digits of the number 2^1000?

import static java.lang.System.out;
import java.math.BigInteger;

public class Euler16bpw {

	public static void main(String[] argv) {

		int answer = 0;

		BigInteger num = BigInteger.valueOf(2);
		BigInteger initial_num = num.pow(1000);
		String num_to_string = initial_num.toString();
		char[] string_to_chars = num_to_string.toCharArray();

		for(char i : string_to_chars) {
			answer += Character.getNumericValue(i);
		}
		out.println(answer);

	}

}