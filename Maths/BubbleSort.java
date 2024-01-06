import java.util.*;

public class BubbleSort {
  public static int ascend(int array[]) {
    int cnt = 0;
    int temp = 0;
    int n = array.length;
    
    for (int i = 0; i < ( n - 1 ); i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j+1]) {
           temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
          cnt++;
        }
      }
    }
    return cnt;
  }
  
  public static int descend(int array[]) {
    int cnt = 0;
    int temp = 0;
    int n = array.length;
    for (int i = 0; i < ( n - 1 ); i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] < array[j+1]) {
           temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
          cnt++;
        }
      }
    }
    return cnt;
  }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 
    int arr[] = new int[n];
 
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int temp1[] = arr.clone();
    int temp2[] = arr.clone();
    int asc = ascend(temp1);
    int des = descend(temp2);
    
 
    System.out.println(Math.min(asc, des) + "");
  }
}