//gtwalford's solution

import static java.lang.System.out;

public class euler1{

	public static void main(String[] argc) {

		int x = 0;
		int y = 1;
		int z = 0;

			for(int j = 0; j<4000000; j=x+y){

				x = y;
				y = j;

				// out.println("++ " + x + " // " + y);

				if(j%2==0){
					z+=j;

					out.println("// ++ " + z);
				}


			}
	

	}
}