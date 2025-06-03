import java.io.*;
import java.util.*;

public class EOF {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int linenumber=1;
        while(sc.hasNext()){
            System.out.println(linenumber+" "+sc.nextLine());
            linenumber++;
        }
        sc.close();
    }
}
