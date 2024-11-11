/**
 * 
 * 
 */
public class UniquePaths {

	public static void main(String[] args) {
		// 3 -> jumlah baris ke bawah
		// 2 -> jumlah kolom ke kanan
		System.out.println(uniquePaths(3, 2));
	}

	static int uniquePaths(int m, int n) {
		// int[][] map = new int[d + 1][r + 1];
        // for (int i = 1; i <= d; i++) {
        //     map[i][1] = 1;
        // }
		// //show(map);
		// for (int i = 1; i <= r; i++) {
        //     map[1][i] = 1;
        // }
        // for (int i = 2; i <= d; i++) {
        //     for (int j = 2; j <= r; j++) {
        //         map[i][j] = map[i - 1][j] + map[i][j - 1];
        //     }
        // }
        // show(map);
		// return map[d][r];

		int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            dp[1][i] = 1;
        }
        
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        show(dp);
        return dp[m][n];
	}

	static void show(int[][] x) {
		for (int i = 0; i < x[0].length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}