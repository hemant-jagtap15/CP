import java.util.*;
public class CF116A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minCap = 0;
        int currCap = 0;
        for(int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            currCap -= exit;
            currCap += enter;
            minCap = Math.max(minCap, currCap);
        }
        System.out.println(minCap);
    }
}