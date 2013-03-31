//Gtwalford's solution to Project Euler Problem 4

import static java.lang.System.out;

public class euler4gtw{

public static void main(String[] argv){
	int x = 0;
	int y = 0;

<<<<<<< HEAD
	for(int i = 1; i<=1000; i++){

		for(int j = 1; j<=1000; j++){
=======
	for(int i = 1; i<10; i++){

		for(int j = 1; j<10; j++){
>>>>>>> 686c1174e59d3cf0c0eaf47ea533bf6b1b62d966
			x = i*j;
			out.println(x);

			String pal = "" + x;
			String lap = new StringBuffer(pal).reverse().toString();

<<<<<<< HEAD
			if(pal.equals(lap)){
				if(x>y){
				y = x;
				out.println(i +" ++ " + j + " == " + pal + " // " + lap);
				
				}
=======
			out.print(pal + " ==> " + lap);

			if(pal.equals(lap)) {
				out.println("YAY!"); 
			} else {
				out.println("No");
>>>>>>> 686c1174e59d3cf0c0eaf47ea533bf6b1b62d966
			}

			// if(pal.equals(lap)){
			// 	out.println(i +" ++ " + j + " == " + pal + " // " + lap);
			// }


		}// END FOR 2

	}//END FOR 1


}//END MAIN


}//END CLASS
