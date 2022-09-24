import java.util.*;


public class DecToBinary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Decimal to binary no
      Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr= new int[40];   // assume 40 space array
	  int index=0;
	  while(n>0){		 
		  arr[index++]=  n%2;    // getting reminder 0 or 1
		  n/=2;   // updating decimal no
	  }
	 for(int i=index-1; i>=0; i--){   // traversing array in reverse order
		 System.out.print(arr[i]);    // printing without space
	  }
	}
}
