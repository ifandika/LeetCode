import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] digits = {1, 2, 3};

		int n = 0;
		for(var v : digits) {
			n *= 10;
			n += v;
		}
		n += 1;
		String s = String.valueOf(n);
		int tempRes = Integer.parseInt(s), int result = 0;
		while(true) {
			
		}
		System.out.println(Arrays.toString(result));
	}
}