import java.util.*;
public class CF236A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        int letters = set.size();
        if(letters % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}