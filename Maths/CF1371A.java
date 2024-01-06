import java.util.*;
public class CF1371A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int n = sc.nextInt();
            int ans = (int)(Math.ceil((double)n / 2));
            System.out.println(ans);
            t--;
        }
    }
}



