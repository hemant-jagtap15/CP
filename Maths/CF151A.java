import java.util.Scanner;
public class CF151A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int toasts = (k * l) / nl;
        int slices = c * d;
        int salt = p / np;
        
        int total = Math.min(toasts, Math.min(slices, salt)) / n;

        System.out.println(total);
    }
}
