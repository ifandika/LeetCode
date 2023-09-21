/**
 * - Array dengan nilai urut
 * - Cari nilai target dalam array
 * - Hasil berupa urutan keberapa target di ditemukan
 * - Hasil -1 jika tida ditemukan
 * 
 * Solution step
 * - Bagi array menjadi 2
 * - Perulangan array kiri
 * - Perulangan array kanan
 * - Jika salah satu perulangan target ditemukan return
 * - Jika tidak return -1
 */

public class SearchInRotatedSortedArray {

    public int solution(int[] nums, int target) {
        int mid = nums.length / 2;

        for(int indx = 0; indx <= mid; indx++) {
            if(target == nums[indx]) {
                return indx;
            }
        }

        for(int indx = mid+1; indx < nums.length; indx++) {
            if(target == nums[indx]) {
                return indx;
            }
        }
        return -1;
    }
}