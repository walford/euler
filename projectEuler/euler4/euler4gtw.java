import static java.lang.System.out;

public class euler4gtw{

public static void main(String[] argv){
	int x = 0;

	for(int i = 1; i<10; i++){

		for(int j = 1; j<10; j++){
			x = i*j;
			out.println(x);

			String pal = " " + x;
			String lap = new StringBuilder(pal).reverse().toString();

			out.print(pal + " ==> " + lap);

			if(pal.equals(lap)) {
				out.println("YAY!"); 
			} else {
				out.println("No");
			}

			// if(pal.equals(lap)){
			// 	out.println(i +" ++ " + j + " == " + pal + " // " + lap);
			// }


		}// END FOR 2

	}//END FOR 1


}//END MAIN

// static boolean palindrome(String a, String b){


// } //END PALINDROME


}//END CLASS
