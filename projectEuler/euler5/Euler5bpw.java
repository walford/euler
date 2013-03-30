// 2520 is the smallest number that can be divided 
// by each of the numbers from 1 to 10 without any 
// remainder. What is the smallest positive number 
// that is evenly divisible by all of the numbers 
// from 1 to 20?

import static java.lang.System.out;


public class Euler5bpw {

	public static void main(String[] argv) {

		int answer = 1;
		boolean status = false;

		// sorter answer but it takes longer???
		while(status == false) {
			answer++;
			for (int i = 1; i < 21; i++) {
				if(answer % i != 0) {
					break;
				} 
				if(i == 20) {
					status = true;
				}
			}
		}	

		out.println(answer);
		
		// longer answer but more efficient
		// status = false;
		// answer = 1;
		// while (status == false) {
		// 	if(answer % 1 == 0) {
		// 		if(answer % 2 == 0) {
		// 			if(answer % 3 == 0) {
		// 				if(answer % 4 == 0) {
		// 					if(answer % 5 == 0) {
		// 						if(answer % 6 == 0) {
		// 							if(answer % 7 == 0) {
		// 								if(answer % 8 == 0) {
		// 									if(answer % 9 == 0) {
		// 										if(answer % 10 == 0) {
		// 											if(answer % 11 == 0) {
		// 												if(answer % 12 == 0) {
		// 													if(answer % 13 == 0) {
		// 														if(answer % 14 == 0) {
		// 															if(answer % 15 == 0) {
		// 																if(answer % 16 == 0) {
		// 																	if(answer % 17 == 0) {
		// 																		if(answer % 18 == 0) {
		// 																			if(answer % 19 == 0) {
		// 																				if(answer % 20 == 0) {
		// 																					break;
		// 																				}
		// 																			}
		// 																		}
		// 																	}
		// 																}
		// 															}
		// 														}
		// 													}
		// 												}
		// 											}
		// 										}
		// 									}
		// 								}
		// 							}
		// 						}
		// 					}
		// 				}
		// 			}
		// 		}
		// 	}
		// 	answer++;
		// }

		// out.println(answer);

	}

}













