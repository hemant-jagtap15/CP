import java.util.*;
public class Bitplusplus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n > 0) {
            String str = sc.next();
            char ch[] = str.toCharArray();
            if(ch[0] == '+' && ch[2] == 'X') {
                x++;
            } else if(ch[0] == 'X' && ch[2] == '+') {
                x++;
            } else if(ch[0] == 'X' && ch[2] == '-') {
                x--;
            } else if(ch[0] == '-' && ch[2] == 'X') {
                x--;
            }
            n--;
        }
        System.out.println(x);
    } 
}