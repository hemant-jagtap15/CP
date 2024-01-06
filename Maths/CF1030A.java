import java.util.*;
public class CF1030A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            int opinion = sc.nextInt();
            if(opinion == 1) flag = false;
        }
        if(flag) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }
        
    }
}