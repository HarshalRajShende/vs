import java.util.*;
public class Median {
    public static void main(String[] args) {
        System.out.println("Hello world!");     
        int[] arr1 = {4,6};
        int[] arr2 = {1,2,3};
        int m = arr1.length;
        int n = arr2.length;    
        float ans = ((m+n)%2!=0) ?  median1(arr1, arr2, m, n) : median2(arr1, arr2, m, n);    
        System.out.println(ans);       
         
    }

    public static float median1(int[] arr1, int[] arr2, int m, int n){
        int[] arr = merge(arr1, arr2, m, n);    
        return arr[(m+n)/2];  // odd        
    }

    //0 1 2 3 4 5  index
    //1 2 3 4 5 6

    public static float median2(int[] arr1, int[] arr2, int m, int n){
        int[] arr = merge(arr1, arr2, m, n);  
        float v=arr[(m+n-1)/2]+arr[((m+n-1)/2)+1]; // even 
        return v/2;
    }

    public static int[] merge(int[] arr1, int[] arr2, int m, int n) {
        int[] temp = new int[n+m];
        for(int i=0; i<m+n; i++){            
            if(i<m)
                temp[i] = arr1[i];
            else
                temp[i] = arr2[i-m];
        }
        Arrays.sort(temp);        
        return temp;
    }      
  
}
