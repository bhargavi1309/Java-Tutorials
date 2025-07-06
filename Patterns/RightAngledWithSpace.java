import java.util.Scanner;
public class RightAngledWithSpace {
    public void printPattern(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        RightAngledWithSpace pattern = new RightAngledWithSpace();
        pattern.printPattern(n);
        
        scanner.close();
    }
}

