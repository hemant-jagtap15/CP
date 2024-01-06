import java.util.*;
public class CF546A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalVal = k * ((w*(w+1)) / 2);
        if(totalVal <= n) {
            System.out.println(0);
        } else {
            int borrow = totalVal - n;
            System.out.println(borrow);
        }
    }
}