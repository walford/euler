// The prime factors of 13195 are 5, 7, 13 and 29. What is the 
// largest prime factor of the number 600851475143 ?

#include "euler3.h"

int main() {

	long num = 600851475143;
	int answer = 0;
	answer = largest_prime_factor(num);
	cout << answer << endl;

}

int largest_prime_factor(long num) {

	int answer = 0;

	for(int i=2; i<sqrt(num); i++) {
		if(num % i == 0) {
			if(get_prime(i) == true) {
				answer = i;
			}
		}
	}

	return answer;

}

bool get_prime(int num) {

	for(int i=2; i<sqrt(num); i++) {
		if(num % i == 0) {
			return false;
		}
	}

	return true;

}





