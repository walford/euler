// 2520 is the smallest number that can be divided by each of the numbers 
// from 1 to 10 without any remainder. What is the smallest positive number 
// that is evenly divisible by all of the numbers from 1 to 20?

#include "euler5bpw.h"

int main() {

	int answer = 0;

	int num = 0;
	bool divided = false;
	while(divided == false) {
		num++;
		divided = is_divisible(num);
		answer = num;
	}

	cout << answer << endl;

}

bool is_divisible(int num) {

	for(int i=1; i<=20; i++) {
		if(num % i != 0) {
			return false;
		}
	}

	return true;

}