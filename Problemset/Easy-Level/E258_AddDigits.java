public class E258_AddDigits {
  public static void main(String[] args) {
    int input1Num = 38;
    int output1Num = 2;
    
    int result = solution(input1Num);
    System.err.println("Expected : "+output1Num);
    System.err.println("Result   : "+result);
  }

  /**
   * Step:
   * - 
   * @param num
   * @return
   */
  public static int solution(int num) {
    if(num == 0) {
      return 0;
    }
    return 1 + (num - 1) % 9;
  }
}