package loops.gfg;

import java.util.*;

public class pattern1 {
    public static void main(String args[] ) throws Exception {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int q = sc.nextInt();
       sc.nextLine();
       String s = sc.nextLine();
       while(q-->0){
        //    char a[]= s.toCharArray();
           int l= sc.nextInt();
           int r= sc.nextInt();
           int k= sc.nextInt();

            String subs= s.substring(l-1,r);
            char a[] = subs.toCharArray();
            Arrays.sort(a);
            System.out.println(a[k-1]);

       }
       
   }
}
