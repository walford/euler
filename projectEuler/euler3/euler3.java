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

		for(long j = 2L; j<divider; j++){
			if(p%divider == 0){
					if(primeNumber(j, divider) == true){
						out.println(divider);
					}

				}
			}//END FOR
	}//END PRIMEFACTOR

	static boolean primeNumber(long j, long divider){
			if(divider%j ==0){
				return false;
			}else{
				return true;
			}
	}//END PRIMENUMBER
}//END CLASS