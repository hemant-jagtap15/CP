import java.util.*;
public class CF1352A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int j = 0;
            while(n > 0) {
                int val = n % 10;
                if(val > 0) {
                    int ans = (int)Math.pow(10, j);
                    ans *= val;
                    list.add(ans);
                }
                n = n / 10;
                j++;
            }
            int len = list.size();
            System.out.println(len);

            for(int i = 0; i < len; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            t--;
        }
    }
}
