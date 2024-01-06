import java.util.*;
public class CF1097A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String check = sc.next();
        boolean flag = false;
        for(int i = 0; i < 5; i++) {
            String card = sc.next();
            if(!flag && (check.charAt(0) == card.charAt(0) || check.charAt(1) == card.charAt(1))) {
                System.out.println("YES");
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("NO");
        } 
    }
}

