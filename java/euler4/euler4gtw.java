//Gtwalford's solution to Project Euler Problem 4

import static java.lang.System.out;

public class euler4gtw{

public static void main(String[] argv){
	int x = 0;
	int y = 0;

	for(int i = 1; i<=1000; i++){

		for(int j = 1; j<=1000; j++){
			x = i*j;
			// out.println(x);

			String pal = "" + x;
			String lap = new StringBuffer(pal).reverse().toString();

			if(pal.equals(lap)){
				if(x>y){
				y = x;
				out.println(i +" ++ " + j + " == " + pal + " // " + lap);
				
				}
			}


		}// END FOR 2

	}//END FOR 1


}//END MAIN


}//END CLASS