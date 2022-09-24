import java.util.*;
public class MissingNo{
   public static void main(String[] args) {
       System.out.println("Hello world!");
       int n = 10;       
       int[] arr = {6,1,2,8,3,4,7,10,5};
       int ans = solve(arr, n-1);
       System.out.println(ans);
   } 

   public static int solve(int[] arr, int n){
    Arrays.sort(arr);
    for(int i=0; i<n; i++){
        if(arr[i]!= i+1){
            return i+1;
        }
    }

    return 0;
   }
    
}
