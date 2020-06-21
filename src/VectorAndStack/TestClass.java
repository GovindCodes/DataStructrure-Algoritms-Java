package VectorAndStack;


import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }
         
         Queue<Integer> s1 = new ArrayDeque<>();
         Deque<Integer> s2= new ArrayDeque<>();
             for(int a: arr){
             s2.push(a);
             s1.add(a);
         }
//             System.out.println(s1.peek());
//             System.out.println(s2.peek());

         ArrayList<Integer> al = new ArrayList<>();
         while(!s1.isEmpty() && !s2.isEmpty()){
             if(s1.peek()> s2.peek()){
            
//                 System.out.print("1 ");
            	 al.add(1);
                 s2.pop();
             }
            
             else if(s1.peek()< s2.peek()){
            	
//                 System.out.print("2 ");
            	 al.add(2);
                 s1.remove();
             }
             
             else {
//                 System.out.print("0 ");
            	 al.add(0);
                 s1.remove();
                 s2.pop();
             }

         }

         ArrayList<Integer> out_ = al;
         System.out.print(out_.get(0));
         for(int i_out_=1; i_out_<out_.size(); i_out_++)
         {
         	System.out.print(" " + out_.get(i_out_));
         }

         wr.close();
         br.close();
    }
//    static ArrayList<Integer> funGame(int[] arr){
//        
//        Queue<Integer> s1 = new ArrayDeque<>();
//        Stack<Integer> s2= new Stack<>();
//            for(int a: arr){
//            s2.push(a);
//            s1.add(a);
//        }
//        ArrayList<Integer> al = new ArrayList<>();
//        while(!s1.isEmpty() && !s2.isEmpty()){
//            if(s1.peek()> s2.peek()){
//                al.add(1);
//                s2.pop();
//            }
//           
//            else if(s1.peek()< s2.peek()){
//                al.add(2);
//                s1.poll();
//            }
//            
//            else if(s1.peek()== s2.peek()){
//                al.add(0);
//                s1.poll();
//                s2.pop();
//            }
//        }
//       
//        return al;
//    }
}