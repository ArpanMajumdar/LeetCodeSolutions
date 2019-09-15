package movezeros;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //
    //    int[] arr = {0, 1, 0, 3, 12, 0, 7, 0, 0, 8};
    int[] arr = {0 , 1};
    MoveZeros mz = new MoveZeros();
    mz.moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
  }
}
