import java.util.*;
public class CF1368A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int operations = 0;

            while(a <= n && b <= n) {
                if(a < b) {
                    a += b;
                } else {
                    b += a;
                }
                operations++;
            }
            System.out.println(operations);
        }
    }
}