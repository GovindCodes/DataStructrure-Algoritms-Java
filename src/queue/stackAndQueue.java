package queue;


import java.util.*;

public class stackAndQueue {
    public static void main(String args[] ) throws Exception {
       
        //Scanner
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        int k = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
           arr[i]= sc.nextInt();
        }
//        int sum = arr[0];
//        
//        int cnt=1;
//        for(int i=1; i<k; i++) {
//        	if(arr[i] >= arr[n-1]) {
//        		sum= sum+arr[i];
//        		cnt++;
//        	}
//        	else
//        		break;
//        	
//        }
//        for(int i= cnt; i<k; i++) {
//        	sum= sum +arr[n-1-(i-cnt)];
//        }
        int sum=0;
        for(int a:arr) {
        	sum= sum+a;
        }
        
        System.out.println(sum);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        for(int a:arr) {
//        	numbers.add(a);
//        }
//        int sum = numbers.removeFirst();
//        int cnt=1;
//        
////        if(!numbers.isEmpty())
//        while(numbers.peekLast() <= numbers.peekFirst()){
//            sum = sum+ numbers.removeFirst();
//            cnt++;
//        }
//        for(int i= cnt; i<k; i++){
//        	if(!numbers.isEmpty())
//            sum += numbers.removeLast();
//        }
//        System.out.println(sum);


    }
}
