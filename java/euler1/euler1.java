//gtwalford's solution

import static java.lang.System.out;

public class euler1{
	
	public static void main(String[] argv){
	
		int x = 0;
		for(int i = 0; i<1000;i++){
			if(0==i%5||i%3==0){
				x+=i;
			}
			
		}
		
		out.println("// ++ " + x);
		
		
		
		
		
		
	}
}