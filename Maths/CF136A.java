import java.util.*;
public class CF136A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gave[] = new int[n];
        for(int i = 0; i < n; i++) {
            gave[i] = sc.nextInt();
        }
        int recieve[] = new int[n];
        for(int i = 0; i < n; i++) {
            recieve[gave[i] - 1] = i + 1;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(recieve[i] + " ");
        } 
    }
}