import java.util.*;
public class CF514A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(i == 0) {
                if(ch >= '5' && ch <= '8') {
                    ch = (char)(9 - Integer.parseInt(ch + "") + '0');
                }
            } else {
                if(ch >= '5' && ch <= '9') {
                    ch = (char)(9 - Integer.parseInt(ch + "") + '0');
                }
            }
            sb.append(ch);
        }
        System.out.println(sb.toString());
    } 
}