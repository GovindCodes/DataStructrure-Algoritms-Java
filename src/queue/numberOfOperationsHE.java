package queue;
import java.util.*;

public class numberOfOperationsHE {

	public static void main(String[] args) {
		 //Scanner
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> ideal= new LinkedList<>();
        for(int i=0; i<n; i++){
            q.add(sc.nextInt());
        }
        for(int i= 0; i<n; i++){
            ideal.add(sc.nextInt());
        }
        int cnt=0;
        
        while(q.size()>0) {
        if(q.element() != ideal.element()){
            int r= q.remove();
            q.add(r);
            cnt++;
            
        }
        else {
        	cnt++;
        	q.remove();
        	ideal.remove();
        }
        }
        System.out.println(cnt);
	}

}
