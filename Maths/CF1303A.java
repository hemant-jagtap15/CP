import java.util.*;
public class CF1303A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            String str = sc.next();
            int start = 0;
            int end = 0;
            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch == '1') {
                    start = j;
                    break;
                }
            }
            for(int j = str.length()-1; j >= 0; j--) {
                char ch = str.charAt(j);
                if(ch == '1') {
                    end = j;
                    break;
                }
            }

            int cnt = 0;
            for(int j = start; j < end; j++) {
                char ch = str.charAt(j);
                if(ch == '0') cnt++;
            }
            System.out.println(cnt);
        }
    }
}


