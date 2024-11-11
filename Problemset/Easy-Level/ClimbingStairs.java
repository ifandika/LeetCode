// - Dibutuhkan langkah 'n' untuk menaiki tangga.
// - Setiap kali menaiki 1 atau 2 anak tangga.
// - Banyak cara naik untuk sampai ke puncak.
// Contoh 1:
// Input: 5
// Output:
// 1. 1 + 1 + 1 + 1 + 1
// 2. 1 + 1 + 1 + 2
// 3. 1 + 2 + 2
// 4. 2 + 2 + 1
// 5. 2 + 1 + 1 + 1
// 6. 1 + 2 + 1 + 1
// 7. 2 + 1 + 2
// 8. 1 + 1 + 2 + 1

// Solusi 1: Brute Force
// Bisa menggunakan fibonaci.

// Solusi 2: Dynamic Programming
// Menggunakan 

// Solusi 3:
// Menggunakan matriks eksponen


public class ClimbingStairs {
	public int climbStair(int n) {
		if(n < 2) {
			return 1;
		}
		else {
			return climbStair(n-1) + climbStair(n-2);
		}
	}
}