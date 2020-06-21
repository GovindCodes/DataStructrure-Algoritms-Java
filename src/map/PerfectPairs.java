package map;


import java.util.*;


public class PerfectPairs {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                 if(!map.containsKey(a[i]))
                 map.put(a[i],1);
                 else
                 map.put(a[i],map.get(a[i])+1);  
            }
            long sum=0;
            for(Integer i:map.keySet())
            {
                if(check(i+i))
                sum=sum+(long)(map.get(i)*(map.get(i)-1)/2);
                for(Integer j:map.keySet())
                {
                    if(check(i+j)&&i!=j)
                    sum=sum+(long)map.get(i)*map.get(j);
                }
                map.put(i,0);
            }
//            System.out.println(sum);
        }
    }
//    public static boolean check(int a){
//        int x= (int)Math.sqrt(a);
//        int y = (int)Math.cbrt(a);
//        return (a== x*x &&  a== y*y*y);
//    }
    static boolean check(int n)
    {
        int sqrt=(int)Math.sqrt(n);
        int sqrt1=(int)(sqrt*sqrt);
        for(int i=0;i<=14;i++){
        if(i*i*i==n)
        return true;
    }
 
        if(n==sqrt1)
        return true;
        else 
        return false;
    }
   
}

