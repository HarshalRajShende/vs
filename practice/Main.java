import java.util.*;
public class Main {

    public static long[] nextGreaterEle(long[] arr, int n){
        long ans[] = new long[n];
        Stack<Long> st = new Stack<>();
        for(int i=n-1; i>=0; ){
            if(st.empty()){
                arr[i] = -1;
                st.push(arr[i]);
                i--;        // update
            }else if(st.peek()>arr[i]){   // not empty
                arr[i] = st.peek();
                st.push(arr[i]);
                i--;        // update
            }else{   // not empty and (st.peek()<=arr[i])
                while(st.peek()<=arr[i]){
                    st.pop();
                }
            }   
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        long[] ans = nextGreaterEle(arr,n);
        
        System.out.print(Arrays.toString(ans));
        

    }
}
