package VectorAndStack;


import java.util.*;

public class uniqueCotinuousPairs {
    public static void main(String args[] ) throws Exception {
       
        //Scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

//        Stack<pair> stack = new Stack<>();
        Set<pair> set = new HashSet<>();
        
        for(int i=0; i<=n-2; i++) {
        	pair p = new pair(arr[i], arr[i+1]);
        	set.add(p);
        }
        System.out.println(set);

    }

}
class pair{
    int a,b;
    pair(int a, int b){
        this.a=a;
        this.b= b;
    }

    public int hashcode(){
        return (a*b)+(a+b);
    }

    public boolean equals(Object obj){
        pair that = (pair) obj;
        boolean isEqual= (this.a == that.a && that.b == this.b) || (this.a== that.b
        && this.b == that.a);
        return isEqual;
    }

}
