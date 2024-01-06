import java.util.*;
public class CF1426A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c = 2; 
            int ans = 1;
            while(c < n) {
                c += x;
                ans++;
            }
            System.out.println(ans);
            t--;
        }
    }
}

