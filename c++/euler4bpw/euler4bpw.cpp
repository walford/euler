// A palindromic number reads the same both ways. The largest palindrome made 
// from the product of two 2-digit numbers is 9009 = 91 99.

// Find the largest palindrome made from the product of two 3-digit numbers.

#include "euler4bpw.h"

int main() {

	int answer = 0;

	for(int i=100; i<1000; i++) {
		for(int j=100; j<1000; j++) {
			// The product of two three digit numbers is either 5 digits long or 6 digits
			// long. Hence, the following conditional assumes that the correct answer is
			// a 6 digit number. The purpose of filtering out the 5 digit numbers is to 
			// simplify the reverse_int function.  
			if(i * j > 99999) { 
				if(is_palin(i, j) == true) {
					if(i * j > answer) {
						answer = i * j;
					}
				}
			}
		}
	}

	cout << answer << endl;

}

bool is_palin(int num1, int num2) {

	int palin = num1 * num2;
	int nilap = reverse_int(palin);
	if(palin == nilap) {
		return true;
	}
	return false;

}

// only works with a 6 digit number 
int reverse_int(int num) {

	int one   = num % 10;
	num       /= 10;
	int two   = num % 10;
	num       /= 10;
	int three = num % 10;
	num       /= 10;
	int four  = num % 10;
	num       /= 10;
	int five  = num % 10;
	num       /= 10;
	int six   = num;

	one   *= 100000;
	two   *= 10000;
	three *= 1000;
	four  *= 100;
	five  *= 10;

	return (one + two + three + four + five + six);

}










