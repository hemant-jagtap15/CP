import java.util.*;
public class CF1095A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String t = sc.next();

        int i = 0;
        int jumps = 1;
        StringBuilder sb = new StringBuilder("");
        while(i < n) {
            jumps++;
            sb.append(t.charAt(i));
            i += jumps;
        }
        System.out.println(sb.toString());
    }
}


