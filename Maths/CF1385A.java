import java.util.*;
public class CF1385A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            if (x > z) {
                int temp = x;
                x = z;
                z = temp;
            }
            if (y > z) {
                int temp = y;
                y = z;
                z = temp;
            }

            if (y == z) {
                System.out.println("YES");
                System.out.println(x + " " + x + " " + z);
            } else {
                System.out.println("NO");
            }
        }
    }
}
