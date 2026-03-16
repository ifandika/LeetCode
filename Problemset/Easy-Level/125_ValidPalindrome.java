
public class ValidPalindrome {

	public boolean solution(String s) {
		Strng lower = s.toLowerCase();
		int left = 0,
			right = s.length() - 1;

		while(left < right) {
			while(left < right && !Character.isLetterOrDigit(lower.charAt(left))) {
				left++;
			}
			while(right > left && !Character.isLetterOrDigit(lower.charAt(right))) {
				right++;
			}
			if(lower.charAt(left) != lower.charAt(right)) {
				return false;
			}
		}
		return true;
	}
}