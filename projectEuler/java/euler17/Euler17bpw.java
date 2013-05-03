// If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
// then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

// If all the numbers from 1 to 1000 (one thousand) inclusive were written out 
// in words, how many letters would be used?


// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-
// two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
// The use of "and" when writing out numbers is in compliance with British usage.

import static java.lang.System.out;
import java.util.*;

public class Euler17bpw {

	public static void main(String[] argv) {

		//initalized with value of one thousand
		int answer = 11;

		//ones
		Map<Character, Integer> ones = new HashMap<Character, Integer>();
		ones.put('1', 3);
		ones.put('2', 3);
		ones.put('3', 5);
		ones.put('4', 4);
		ones.put('5', 4);
		ones.put('6', 3);
		ones.put('7', 5);
		ones.put('8', 5);
		ones.put('9', 4);

		//teens
		Map<Character, Integer> teens = new HashMap<Character, Integer>();
		teens.put('1', 6);
		teens.put('2', 6);
		teens.put('3', 8);
		teens.put('4', 8);
		teens.put('5', 7);
		teens.put('6', 7);
		teens.put('7', 9);
		teens.put('8', 8);
		teens.put('9', 8);

		//tens
		Map<Character, Integer> tens = new HashMap<Character, Integer>();
		tens.put('1', 3);
		tens.put('2', 6); 
		tens.put('3', 6);
		tens.put('4', 5);
		tens.put('5', 5);
		tens.put('6', 5);
		tens.put('7', 7);
		tens.put('8', 6);
		tens.put('9', 6);

		//hundreds
		Map<Character, Integer> hundreds = new HashMap<Character, Integer>();
		hundreds.put('1', 10);
		hundreds.put('2', 10);
		hundreds.put('3', 12);
		hundreds.put('4', 11);
		hundreds.put('5', 11);
		hundreds.put('6', 10);
		hundreds.put('7', 12);
		hundreds.put('8', 12);
		hundreds.put('9', 11);


		for(int i=1; i<1000; i++) {

			char[] chars = ("" + i).toCharArray();

			if(chars.length == 1) {
				answer += ones.get(chars[0]);
			}
			if(chars.length == 2) {
				if(chars[1] == '0') {
					answer += tens.get(chars[0]);
				} else if (chars[0] == '1' && chars[1] != '0') {
					answer += teens.get(chars[1]);
				} else {
					answer += tens.get(chars[0]) + ones.get(chars[1]);
				}
			}
			if(chars.length == 3) {
				if(chars[1] == '0' && chars[2] == '0') {
					answer += hundreds.get(chars[0]);
				} else if(chars[1] == '0' && chars[2] != '0') {
					answer += hundreds.get(chars[0]) + ones.get(chars[2]) + 3; //plus 3 for "and"
				} else if(chars[1] != '0' && chars[2] == '0') {
					answer += hundreds.get(chars[0]) + tens.get(chars[1]) + 3;
				} else if(chars[1] == '1' && chars[2] != '0') {
					answer += hundreds.get(chars[0]) + teens.get(chars[2]) + 3;
				} else {
					answer += hundreds.get(chars[0]) + tens.get(chars[1]) + ones.get(chars[2]) + 3;
				}
			}

		}

		out.println(answer);

	}

}














