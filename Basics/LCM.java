import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=CalLCM(a,b);
        System.out.println(lcm);
    }
        public static int CalLCM(int a,int b){
            int gcd=CalGCD(a,b);
            return(a*b)/gcd;
        }
        public static int CalGCD(int a,int b){
            if(b==0){
                return a;
            }
            return CalGCD(b,a%b);
        }
}
