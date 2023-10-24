import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		System.out.println(climbStair(5));
	}

	public static int climbStair(int n) {
		if(n < 2) {
			return 1;
		}
		else {
			return climbStair(n-1) + climbStair(n-2);
		}
	}
}