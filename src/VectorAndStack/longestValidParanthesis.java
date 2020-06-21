package VectorAndStack;
import java.util.*;

public class longestValidParanthesis {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	     int t= sc.nextInt();
	     sc.nextLine();
	     while(t-->0){
	         String st= sc.nextLine();
	         Stack<Integer> stack = new Stack<>();
	         Stack<Character> cStack = new Stack<>();
	         
	         for(int i=0; i<st.length(); i++){
	             char ch= st.charAt(i);
	             if(ch== '('){
	                 stack.push(i);
	                 continue;
	             }
	             if(ch ==')' && !stack.isEmpty()){
	                     stack.pop();
	             }
	         }
	         
	         StringBuilder s= new StringBuilder(st);

	         while(!stack.isEmpty()){
	        	 int a= stack.pop();
	        	 s.setCharAt(a, 'x') ;
	         }
	    
	         
	         int max=0;
	         int tempLength =0;
	         for(int i=0 ; i<s.length(); i++){
	             
	             if(s.charAt(i)== 'x'){
	                max= Math.max(max, tempLength);
	                tempLength= 0;
	                continue;
	             }
	             
	             if(s.charAt(i) == '('){
	                 cStack.push(s.charAt(i));
	                 tempLength++;
	             }
	             if(s.charAt(i)==')' && !cStack.isEmpty()){
	                 cStack.pop();
	                 tempLength++;
	             }
	             else if(s.charAt(i)==')' && cStack.isEmpty()){
	                 max= Math.max(max, tempLength);
	                tempLength= 0;
	             }
//	             System.out.println(tempLength);    
	         }
	         
	         max= Math.max(max, tempLength);
	         System.out.println(max);
	         
	     }
	}

}
