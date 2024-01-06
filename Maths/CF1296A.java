import java.util.*;
public class CF1296A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int evenSum = 0;
            int oddSum = 0;
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0) evenSum += arr[i];
                else {
                    oddSum += arr[i];
                }
            }

            if((oddSum > 0 && evenSum > 0) || (oddSum & 1) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }     
    }
}

