import java.util.*;
public class Square {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();
        int col = 1;
        while (col <= n) {
            int rows = 1;
            while (rows <= n) {
                if (col == 1 || rows == 1 || col == n || rows == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                rows++;
            }
            System.out.println();
            col++;
        }
        sc.close();
    }
    public static void main(String[] args) {
        solve();
    }
}