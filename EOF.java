import java.io.*;
import java.util.*;

public class EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int linenumber=1;
        while(sc.hasNext()){
            System.out.println(linenumber+" "+sc.nextLine());
            linenumber++;
        }
        sc.close();
    }
}
