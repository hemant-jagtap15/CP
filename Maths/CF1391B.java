import java.util.Scanner;

public class CF1391B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] a = new char[101][101];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.next().charAt(0);
                }
            }

            int c = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = m - 1; j < m; j++) {
                    if (a[i][j] == 'R') {
                        c++;
                        a[i][j] = 'D';
                    }
                }
            }

            for (int i = n - 1; i < n; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (a[i][j] == 'D') {
                        c++;
                        a[i][j] = 'R';
                    }
                }
            }

            System.out.println(c);
        }
    }
}
