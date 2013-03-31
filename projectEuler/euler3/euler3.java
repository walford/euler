//gtwalford's solution
import static java.lang.System.out;

public class euler3{

	public static void main(String[] argv){

		long input = 600851475143L;

		for(long i=1L; i<Math.sqrt(input); i++){

			primeFactor(input,i);

		}//END i

	}//END MAIN

	static void primeFactor(long p, long divider){

		long x = 0L;
		long y = 0L;

		for(long j = 2L; j<Math.sqrt(divider); j++){
			if(p%divider == 0){
					x = divider;

					if(y != x){
						y = x;
						if(primeNumber(divider) == true){
							out.println(divider);
						}
					}
				}
			}//END FOR
	}//END PRIMEFACTOR

	static boolean primeNumber(long divider){
			
			if(divider%2 == 0) return false;
			for(long i = 3L; i*i<divider;i+=2){
				if(divider%i == 0) return false;
			}
			return true;

	}//END PRIMENUMBER

}//END CLASS