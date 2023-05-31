import java.util.*;
public class Array6
{
  public static boolean
    checkDuplicatesWithinK(int[] arr, int n, int k)
  {
    for (int i = 0; i < n; i++) {
      int j = i + 1;
      int range = k;
      while (range > 0 && j < n) {
        if (arr[i] == arr[j]) {
          return true;
        }
        j++;
        range--;
      }
    }
    return false;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size:");
    int a = sc.nextInt();
    System.out.println("enter the array elements:");
    int arr[] = new int[a];
    for(int i=0;i<a;i++){
     arr[i] = sc.nextInt();
    }
    int n = arr.length;
    if (checkDuplicatesWithinK(arr, n, 3)) {
      System.out.print("true");
    }
    else {
      System.out.print("false");
    }
  }
}