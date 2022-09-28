import java.util.*;
public class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{	     
      Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();	
	  int[] arr=new int[n];
	  for(int i=0; i<n; i++){
		  arr[i]=sc.nextInt();
	  }      
      int ans=0, k=1;      
      for(int i=0; i<n; i++){  
          ans+=k*arr[i];
          k*=2;   // power function     
          System.out.println(ans);
      }      
	}
}