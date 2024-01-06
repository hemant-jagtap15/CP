import java.util.*;
public class CF263A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int r = -1;
        int c = -1;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(mat[i][j] == 1) {
                    r = i;
                    c = j;
                    break;
                }
            }
        }
        int ans = Math.abs(r - 2) + Math.abs((c - 2));
        System.out.println(ans);
    } 
}