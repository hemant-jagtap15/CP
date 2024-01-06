import java.util.*;
public class CF1300B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int m = 2 * t;
            int arr[] = new int[m];
            for(int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int diff = arr[t] - arr[t-1];
            System.out.println(diff);
        }
    }
}

