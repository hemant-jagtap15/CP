import java.util.*;
public class CF110A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '4' || ch == '7') cnt++;
        }

        if(cnt == 4 || cnt == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}