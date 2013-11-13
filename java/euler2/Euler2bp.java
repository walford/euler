
import static java.lang.System.out;

public class Euler2bp {

	public static void main(String[] argv) {

		int answer = 2;

		int[] working_num = {1, 2, 3};

		while (working_num[2] < 4000000) {

			if (working_num[2] % 2 == 0) {
				answer += working_num[2];
			}

			working_num[0] = working_num[1];
			working_num[1] = working_num[2];
			working_num[2] = working_num[0] + working_num[1];

		}

		out.println(answer);

	}

}