import java.util.*;

public class PlusOne {
	public int[] solution(int[] digits) {
		int n = 0;
		for(var v : digits) {
			n *= 10;
			n += v;
		}
		n += 1;
		String s = String.valueOf(n);
		int sLength = s.length();
		int[] result = new int[sLength];
		for(int i = 0; i < sLength; i++) {
			result[i] = s.charAt(i);
		}
		return result;
	}
}