package set;
import java.util.*;

public class gfg {

 public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
        String str = sc.nextLine();
        Map< Character , Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!map.containsKey(c))
            map.put(c, 1);
            else
            map.put(c, map.get(c)+1);
        }
        boolean valIsPrime= true;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
        	
            int i= entry.getValue();
 
            if(!isPrime(i)){
                valIsPrime = false;
                break;
            }
        }
        System.out.println(isPrime(map.size()));
    
        if(valIsPrime && isPrime(map.size())){
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }

}
public static boolean isPrime(int num){
    for(int i=2;  i<= Math.sqrt(num); i++){
        if(num%i ==0){
            return false;
           
        }
    }
    if(num == 1)
    	return false;
    return true;
}
}
