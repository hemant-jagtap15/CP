import java.util.*;
public class CF1343B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            n /= 2;
            if ((n & 1) == 1) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");

            for (int i = 1; i <= n; ++i) {
                System.out.print(i * 2 + " ");
            }
            for (int i = 1; i < n; ++i) {
                System.out.print(i * 2 - 1 + " ");
            }
            System.out.println(3 * n - 1);
        }
    }
}





