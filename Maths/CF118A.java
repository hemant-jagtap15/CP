import java.util.*;
public class CF118A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' || ch == 'Y') {
                continue;
            } else {
                if(Character.isUpperCase(ch)) {
                    sb.append('.');
                    sb.append(Character.toLowerCase(ch));
                } else {
                    sb.append('.');
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
