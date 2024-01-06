import java.util.*;
public class CF1360A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = Math.max(2*n, m);
            int y = Math.max(n, 2*m);
            int ans = Math.min(x, y) * Math.min(x, y);
            System.out.println(ans);
            t--;
        }
    }
}




