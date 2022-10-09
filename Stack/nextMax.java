package Stack;
import java.util.*;
public class nextMax {

    public static int[] nextGreaterEle(int[] arr, int n){
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        // <element>
              
            for(int i=n-1; i>=0; i--){
               
                 while(!st.empty() && arr[i]>=st.peek()){
                          st.pop();                        
                 }
                if(st.empty()){
                        ans[i] = -1;                                                        
                }else // if(arr[i]<st.peek())
                        ans[i] = st.peek();    
                
                st.push(arr[i]);  // pushing elements
            }
        return ans;

    }

    public static int[] nextGreaterEleDistance(int[] arr, int n){
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        // <Index>
           
            for(int i=n-1; i>=0; i--){
               
                 while(!st.empty() && arr[i]>=arr[st.peek()]){
                          st.pop();                        
                 }
                if(st.empty()){
                        ans[i] = -1;                                                        
                }else // if(arr[i]<arr[st.peek()])
                        ans[i] = st.peek()-i;    // distance
                
                st.push(i);  // pushing indices
            }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        // int[] ans = nextGreaterEle(arr,n);
        int[] ans = nextGreaterEleDistance(arr,n);
        
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
       
        

    }
}
