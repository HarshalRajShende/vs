package array;
import java.util.*;
public class ArrayRot
{
	public static void main(String[] args) {
	    
	    // right circular rotation	    // left to right
	   int[] arr = {5,7,5,8,9,4,2,1,5,3};
	   int n = arr.length;
	   int k = 2; // two rotation  // two elements from back to front
	   
	   System.out.print(Arrays.toString(solve(arr, n, k)));
		
	}
	
	public static int[] solve(int[] arr, int n, int k){
	    int[] temp = new int[n];
	    for(int i=0; i<n; i++){
	       //int index = (i+k)%n;         // right circular rotation	    // left to right       
	       int index = (i+(n-k))%n;     // left circular rotation	    // right to left
	       temp[index]=arr[i];
	    }
	    return temp;
	}
}


// two rotations
//0 1 2 3 4 5  
//2 3 4 5 0 1  // indices change for left to right 
//4 5 0 1 2 3  // indices change for right to left






