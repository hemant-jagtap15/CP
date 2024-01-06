import java.util.*;
public class CF1353A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int min = Math.min(2, n-1);
            System.out.println(min * m);
            t--;
        }
    }
}


