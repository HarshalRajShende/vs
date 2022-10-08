

public class searching {
    public static int findMinIndex(int[] arr) {
        int l=0, r=arr.length-1;    
        
        // min value wil be in 2nd subarr        
        while(l<r){
            int mid  = l+(r-l)/2;
            if(arr[r]<arr[mid]){    // mid lies in 1st subarr
                l = mid + 1;                
            }else if(arr[r]>arr[mid]){    //  mid lies in 2nd subarr
                r = mid;                  // so mid could be min
            }
        }
        return l;   // l==r==min
    }

    public static int binarySearch(int[] arr,int target,int minIndex){      
        int l=0, r=arr.length-1; 

         // updating l and r to take one of subarr
        if(target>=arr[minIndex] && target<=arr[r])    // in range of 2nd subarr
            l=minIndex;   
        else                         // in range of 1st subarr or value not exist
            r=minIndex-1;  

        while(l<=r){
            int mid  = l+(r-l)/2;
            if(target<arr[mid]){
                r = mid - 1;
            }else if(target>arr[mid]){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int target = 5;
        int minIndex=findMinIndex(arr);
        int ans = binarySearch(arr,target,minIndex);
        
        System.out.println(ans);
    }
}
