package VectorAndStack;



import java.util.*;

public class NextGreaterElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i= 0; i<arr.length; i++){
            int cnt1 =0;
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int cnt=0;
                    cnt1 =1;
                    System.out.println(arr[j]);
                    for(int k=j+1; k<arr.length; k++){
                        if(arr[j] > arr[k]){
                            cnt =1;
//                            System.out.print(arr[k]+" ");
                            break;
                        }
                    }
                    if(cnt == 0){
                        System.out.print("-1 ");
                    }
                    break;
                }

            }
            if(cnt1== 0){
                System.out.print("-1 ");
            }
        }

    }
}