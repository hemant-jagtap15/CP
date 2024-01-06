import java.util.*;
public class CF1294A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int a[] = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            int n = sc.nextInt();
            Arrays.sort(a);
            n -= 2*a[2] - a[1] - a[0];

            if(n < 0 || n % 3 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }            
            t--;
        }
    }
}


