package array;
import java.util.*;
public class largeNumbers {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long arr[] = new long[(int) n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextLong();
        }
        Map<Long, Long> map = new HashMap<>();
        for(int i=0; i<n; i++) {
        	if(!map.containsKey(arr[i]))
                map.put(arr[i], 1L);
                else{
                    map.put(arr[i], map.get(arr[i])+1);
                }
        }
        int q= sc.nextInt();
        while(q-->0){
            int type = sc.nextInt();
            long f= sc.nextLong();
            if(type==0){
                 long ans= 0;
                for(int i=0 ;i<n; i++){
                    if(map.get(arr[i])>=f){
                        ans= arr[i];
                        break;
                    }
                }
                System.out.println(ans);
            }
            else{
                 long ans= 0;
                for(int i=0 ;i<n; i++){
                    if(map.get(arr[i])==f){
                        ans= arr[i];
                        break;
                    }
                }
                System.out.println(ans);
            }
           
        }
    }
}

