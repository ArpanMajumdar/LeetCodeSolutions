package singlenumber;

public class SingleNumber {

  public int singleNumber(int[] nums) {
    int acc = nums[0];
    for (int i = 1; i < nums.length; i++) {
      acc ^= nums[i];
    }
    return acc;
  }
}
