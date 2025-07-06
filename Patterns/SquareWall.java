import java.util.*;
public class SquareWall{
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int j=1;
            while(j<n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}