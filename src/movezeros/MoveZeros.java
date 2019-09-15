package movezeros;

public class MoveZeros {
  public void moveZeroes(int[] nums) {
    int i = 0;
    int j;
    while (i < nums.length) {
      j = i;
      while (j < nums.length - 1 && nums[j] == 0) j++;
      swap(nums, i, j);
      i++;
    }
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
