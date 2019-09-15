package singlenumber;

public class Main {
  public static void main(String[] args) {
    SingleNumber s = new SingleNumber();
    int[] arr1 = {2, 2, 1};
    int[] arr2 = {4, 1, 2, 1, 2};
    System.out.println(s.singleNumber(arr1));
    System.out.println(s.singleNumber(arr2));
  }
}
