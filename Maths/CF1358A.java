import java.util.*;
public class CF1358A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            double n = sc.nextInt();
            double m = sc.nextInt();
            
            System.out.println((int)(Math.ceil((n*m) / 2)));
            t--;
        }
    }
}


