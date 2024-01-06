import java.util.*;
public class CF1367B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int even = 0;
            int odd = 0;
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0) even++;
                else odd++;
            }
            if((n % 2 == 0 && even == odd) || (n % 2 == 1 && even == odd + 1)) {
                int cnt = 0;
                for(int i = 0; i < n; i++) {
                    if(i % 2 == 0 && arr[i] % 2 != 0) cnt++;
                    if(i % 2 == 1 && arr[i] % 2 == 0) cnt++;
                }
                if(cnt % 2 == 0) {
                    System.out.println(cnt / 2);
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(-1);
            }
            
            t--;
        }
    }
}





