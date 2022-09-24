 import java.util.*;
 public class FavBottle{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 5;
        int k = 23;
        int[] arr = {19, 23, 13, 29, 27};
        int ans = solve2(arr, n, k);
        System.out.println(ans);
    }

    public static int solve2(int[] arr, int n, int k){
        Arrays.sort(arr);
        int ans=0;
        int diff=0;
        int minDiff = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            if(arr[i]!= k){
                diff = Math.abs(arr[i]-k);                
                minDiff = Math.min(minDiff,diff);
                    ans = arr[i];               
            }

        }
        return ans;

    }



    public static int solve(int[] arr, int n, int k){
        int diff = 0;
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!= k){
                diff = Math.abs(arr[i]-k);
                if(diff<minDiff){
                    minDiff=diff;
                    ans = arr[i];
                }
                else if(diff==minDiff && arr[i]>ans){
                    ans = arr[i];
                }
            }
        }

        return ans;
    }
 }